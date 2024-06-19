package main.visitor.codeGenerator;

import main.ast.nodes.Program;
import main.ast.nodes.declaration.FunctionDeclaration;
import main.ast.nodes.declaration.MainDeclaration;
import main.ast.nodes.declaration.VarDeclaration;
import main.ast.nodes.expression.*;
import main.ast.nodes.expression.value.FunctionPointer;
import main.ast.nodes.expression.value.ListValue;
import main.ast.nodes.expression.value.primitive.BoolValue;
import main.ast.nodes.expression.value.primitive.IntValue;
import main.ast.nodes.expression.value.primitive.StringValue;
import main.ast.nodes.statement.*;
import main.ast.type.FptrType;
import main.ast.type.ListType;
import main.ast.type.NoType;
import main.ast.type.Type;
import main.ast.type.primitiveType.BoolType;
import main.ast.type.primitiveType.IntType;
import main.ast.type.primitiveType.StringType;
import main.symbolTable.SymbolTable;
import main.symbolTable.exceptions.ItemAlreadyExists;
import main.symbolTable.exceptions.ItemNotFound;
import main.symbolTable.item.FunctionItem;
import main.symbolTable.item.VarItem;
import main.symbolTable.utils.Stack;
import main.visitor.Visitor;
import main.visitor.type.TypeChecker;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class CodeGenerator extends Visitor<String> {
    private final String outputPath;
    private FileWriter mainFile;
    private final TypeChecker typeChecker;
    private final Set<String> visited;
    private FunctionItem curFunction;
    private final HashMap<String, Integer> slots = new HashMap<>();
    private int curLabel = 0;
    private Stack<String> forNextLabels = new Stack<>();
    private Stack<String> forBreakLabls = new Stack<>();

    @Override
    public String visit(FunctionDeclaration funcDecl) {
        resetState();

        SymbolTable.push(new SymbolTable());
        Type retType = extractReturnType();
        String methodArgs = constructMethodArgs(funcDecl);

        StringBuilder cmdBuilder = new StringBuilder();
        String returnTypeDescriptor = getTypeDescriptor(retType);

        cmdBuilder.append(".method public static ").append(funcDecl.getFunctionName().getName());
        cmdBuilder.append(methodArgs).append(returnTypeDescriptor).append("\n");
        appendMethodLimits(cmdBuilder);
        appendMethodBody(cmdBuilder, funcDecl);

        cmdBuilder.append(".end method\n\n\n");
        addCommand(cmdBuilder.toString());

        SymbolTable.pop();
        return null;
    }

    private void resetState() {
        slots.clear();
    }

    private Type extractReturnType() {
        return this.curFunction.getReturnType();
    }

    private String constructMethodArgs(FunctionDeclaration funcDecl) {
        StringBuilder argsBuilder = new StringBuilder("(");
        ArrayList<Type> argTypes = this.curFunction.getArgumentTypes();
        ArrayList<VarDeclaration> argDeclarations = funcDecl.getArgs();

        for (int i = 0; i < argTypes.size(); i++) {
            Type argType = argTypes.get(i);
            VarDeclaration argDecl = argDeclarations.get(i);
            argsBuilder.append(getTypeDescriptor(argType));
            allocateSlot(argDecl.getName().getName());
            defineVariable(funcDecl, i, argDecl);
        }
        argsBuilder.append(")");
        return argsBuilder.toString();
    }

    private void allocateSlot(String varName) {
        slotOf(varName);
    }

    private void defineVariable(FunctionDeclaration funcDecl, int index, VarDeclaration argDecl) {
        VarItem varItem = new VarItem(argDecl.getName());
        varItem.setType(this.curFunction.getArgumentTypes().get(index));

        try {
            SymbolTable.top.put(varItem);
        } catch (ItemAlreadyExists ignored) {
            try {
                VarItem existingItem = (VarItem) SymbolTable.top.getItem(VarItem.START_KEY + varItem.getName());
                existingItem.setType(this.curFunction.getArgumentTypes().get(index));
            } catch (ItemNotFound ignored1) {}
        }
    }

    private void appendMethodLimits(StringBuilder cmdBuilder) {
        cmdBuilder.append(".limit stack 128\n.limit locals 128\n");
    }

    private void appendMethodBody(StringBuilder cmdBuilder, FunctionDeclaration funcDecl) {
        boolean hasReturnStatement = false;
        for (var stmt : funcDecl.getBody()) {
            String bodyCmd = stmt.accept(this);
            if (bodyCmd != null) {
                cmdBuilder.append(bodyCmd);
            }
            if (stmt instanceof ReturnStatement) {
                hasReturnStatement = true;
            }
        }

        if (!hasReturnStatement) {
            cmdBuilder.append("return\n");
        }
    }


    public CodeGenerator(TypeChecker typeChecker){
        this.typeChecker = typeChecker;
        this.visited = typeChecker.visited;
        outputPath = "./codeGenOutput/";
        prepareOutputFolder();
    }
    private int slotOf(String var) {
        if (!slots.containsKey(var)) {
            slots.put(var, slots.size());
            return slots.size() - 1;
        }
        return slots.get(var);
    }
    public String getFreshLabel(){
        String fresh = "Label_" + curLabel;
        curLabel++;
        return fresh;
    }
    public String getType(Type element){
        String type = "";
        switch (element){
            case StringType stringType -> type += "Ljava/lang/String;";
            case IntType intType -> type += "Ljava/lang/Integer;";
            case FptrType fptrType -> type += "LFptr;";
            case ListType listType -> type += "LList;";
            case BoolType boolType -> type += "Ljava/lang/Boolean;";
            case null, default -> {

            }
        }
        return type;
    }
    private void prepareOutputFolder(){
        String jasminPath = "utilities/jarFiles/jasmin.jar";
        String listClassPath = "utilities/codeGenerationUtilityClasses/List.j";
        String fptrClassPath = "utilities/codeGenerationUtilityClasses/Fptr.j";
        try{
            File directory = new File(this.outputPath);
            File[] files = directory.listFiles();
            if(files != null)
                for (File file : files)
                    file.delete();
            directory.mkdir();
        }
        catch(SecurityException e){
            // ignore
        }
        copyFile(jasminPath, this.outputPath + "jasmin.jar");
        copyFile(listClassPath, this.outputPath + "List.j");
        copyFile(fptrClassPath, this.outputPath + "Fptr.j");

        try {
            String path = outputPath + "Main.j";
            File file = new File(path);
            file.createNewFile();
            mainFile = new FileWriter(path);
        } catch (IOException e){
            // ignore
        }
    }
    private void copyFile(String toBeCopied, String toBePasted){
        try {
            File readingFile = new File(toBeCopied);
            File writingFile = new File(toBePasted);
            InputStream readingFileStream = new FileInputStream(readingFile);
            OutputStream writingFileStream = new FileOutputStream(writingFile);
            byte[] buffer = new byte[1024];
            int readLength;
            while ((readLength = readingFileStream.read(buffer)) > 0)
                writingFileStream.write(buffer, 0, readLength);
            readingFileStream.close();
            writingFileStream.close();
        } catch (IOException e){
            // ignore
        }
    }
    private void addCommand(String command){
        try {
            command = String.join("\n\t\t", command.split("\n"));
            if(command.startsWith("Label_"))
                mainFile.write("\t" + command + "\n");
            else if(command.startsWith("."))
                mainFile.write(command + "\n");
            else
                mainFile.write("\t\t" + command + "\n");
            mainFile.flush();
        } catch (IOException e){
            // ignore
        }
    }
    private void handleMainClass(){
        String commands = """
                .method public static main([Ljava/lang/String;)V
                .limit stack 128
                .limit locals 128
                new Main
                invokespecial Main/<init>()V
                return
                .end method
                """;
        addCommand(commands);
    }

    @Override
    public String visit(Program program){
        String commands = """
                .class public Main
                .super java/lang/Object
                """;
        addCommand(commands);
        handleMainClass();

        for(String funcName : this.visited) {
            try {
                this.curFunction = (FunctionItem) SymbolTable.root.getItem(FunctionItem.START_KEY +
                        funcName);
                this.curFunction.getFunctionDeclaration().accept(this);
            } catch(ItemNotFound ignored) {}
        }

        program.getMain().accept(this);
        return null;
    }


    private void resetSlots() {
        slots.clear();
    }




//    private String getReturnType(FunctionDeclaration funcDecl) {
//        Type returnType = getFunctionReturnType(funcDecl);
//
//            String type = "";
//            if(returnType==null){
//                return "V";
//            }
//            switch (returnType) {
//                case StringType stringType -> type += "Ljava/lang/String;";
//                case IntType intType -> type += "I";
//                case BoolType boolType -> type += "Z";
//                case FptrType fptrType -> type += "LFptr;";
//                case ListType listType -> type += "LList;";
//                default -> type += "V";
//            }
//            return type;
//
//
//    }

    private Type getFunctionReturnType(FunctionDeclaration funcDecl) {
        try {
            FunctionItem funcItem = (FunctionItem) SymbolTable.root.getItem(
                    FunctionItem.START_KEY + funcDecl.getFunctionName().getName()
            );
            return funcItem.getReturnType();
        } catch (ItemNotFound e) {
            return new NoType();
        }
    }




    @Override
    public String visit(MainDeclaration mainDeclaration) {
        slots.clear();
        String commands =
                """
                .method public <init>()V
                .limit stack 128
                .limit locals 128
                aload_0
                invokespecial java/lang/Object/<init>()V
                """;

        slotOf("this"); // save slot 0 for this

        for (var statement : mainDeclaration.getBody()) {
            String temp = statement.accept(this);
            if (temp != null) {
                commands += temp;
            }
        }

        commands += "return\n";
        commands += ".end method\n\n"; // few new lines for readability

        addCommand(commands);
        return null;
    }

    @Override
    public String visit(AccessExpression accessExpr) {
        ArrayList<String> cmdList = new ArrayList<>();
        if (accessExpr.isFunctionCall()) {
            handleFunctionCall(accessExpr, cmdList);
        } else {
            handleArrayAccess(accessExpr, cmdList);
        }
        return String.join("\n", cmdList) + "\n";
    }

    private void handleFunctionCall(AccessExpression accessExpr, ArrayList<String> cmdList) {
        Identifier funcName = (Identifier) accessExpr.getAccessedExpression();
        Type funcType = funcName.accept(typeChecker);

        FunctionItem functionItem = resolveFunctionItem(funcName, funcType);
        String methodArgs = buildMethodArgs(accessExpr, cmdList, functionItem);

        String retTypeDesc = getTypeDescriptor(functionItem.getReturnType());
        cmdList.add("invokestatic Main/" + functionItem.getName() + methodArgs + retTypeDesc);
    }

    private FunctionItem resolveFunctionItem(Identifier funcName, Type funcType) {
        String funcNameStr = "";
        if (funcType instanceof FptrType fptr) {
            funcNameStr += fptr.getFunctionName();
        } else {
            funcNameStr += funcName.getName();
        }

        FunctionItem funcItem = null;
        try {
            funcItem = (FunctionItem) SymbolTable.root.getItem(FunctionItem.START_KEY + funcNameStr);
        } catch (ItemNotFound ignored) {}
        return funcItem;
    }

    private String buildMethodArgs(AccessExpression accessExpr, ArrayList<String> cmdList, FunctionItem funcItem) {
        StringBuilder argsBuilder = new StringBuilder("(");
        int argIndex = 0;

        for (Expression arg : accessExpr.getArguments()) {
            cmdList.add(arg.accept(this));
            argsBuilder.append(getTypeDescriptor(arg.accept(typeChecker)));
            argIndex++;
        }

        for (int i = argIndex; i < funcItem.getArgumentTypes().size(); i++) {
            argsBuilder.append(getTypeDescriptor(funcItem.getArgumentTypes().get(i)));
            cmdList.add(funcItem.getFunctionDeclaration().getArgs().get(i).getDefaultVal().accept(this));
        }

        argsBuilder.append(")");
        return argsBuilder.toString();
    }

    private void handleArrayAccess(AccessExpression accessExpr, ArrayList<String> cmdList) {
        cmdList.add(accessExpr.getAccessedExpression().accept(this));
        for (Expression expr : accessExpr.getDimentionalAccess()) {
            cmdList.add(expr.accept(this));
        }

        ListType listType = (ListType) accessExpr.getAccessedExpression().accept(typeChecker);
        cmdList.add("invokevirtual java/util/ArrayList/get(I)Ljava/lang/Object;");
        cmdList.add("checkcast " + getTypeClass(listType.getType()));

        if (listType.getType() instanceof BoolType) {
            cmdList.add("invokevirtual java/lang/Boolean/booleanValue()Z");
        } else if (listType.getType() instanceof IntType) {
            cmdList.add("invokevirtual java/lang/Integer/intValue()I");
        }
    }


    private String getTypeDescriptor(Type type) {

        if (type instanceof IntType) return "I";
        if (type instanceof BoolType) return "Z";
        if (type instanceof StringType) return "Ljava/lang/String;";
        if (type instanceof FptrType) return "LFptr:";
        if(type instanceof ListType) return  "Ljava/util/ArrayList;";



    return "V";
}


    @Override
    public String visit(AssignStatement assignStatement) {
        if (assignStatement.isAccessList()) {
            return handleListAccess(assignStatement);
        }
        else {
            return handleRegularAssign(assignStatement);
        }
    }


    public String handleListAccess(AssignStatement assignStatement) {
        ArrayList<String> commands = new ArrayList<>();
        Expression assignExp = assignStatement.getAssignExpression();
        Type assignValueType = assignExp.accept(typeChecker);

        if (assignStatement.isAccessList()) {
            processAccessList(assignStatement, commands, assignExp, assignValueType);
        } else {
            processSimpleAssign(assignStatement, commands, assignExp, assignValueType);
        }

        return String.join("\n", commands) + "\n";
    }

    private void processAccessList(AssignStatement assignStatement, ArrayList<String> commands, Expression assignExp, Type assignValueType) {
        commands.add(assignStatement.getAssignedId().accept(this));
        commands.add(assignStatement.getAccessListExpression().accept(this));

        switch (assignStatement.getAssignOperator()) {
            case AssignOperator.ASSIGN -> handleAssign(commands, assignExp, assignValueType);
            case AssignOperator.PLUS_ASSIGN -> handleArithmeticAssign(commands, assignStatement, assignExp, "iadd");
            case AssignOperator.MINUS_ASSIGN -> handleArithmeticAssign(commands, assignStatement, assignExp, "isub");
            case AssignOperator.MULT_ASSIGN -> handleArithmeticAssign(commands, assignStatement, assignExp, "imul");
            case AssignOperator.DIVIDE_ASSIGN -> handleArithmeticAssign(commands, assignStatement, assignExp, "idiv");
            case AssignOperator.MOD_ASSIGN -> handleArithmeticAssign(commands, assignStatement, assignExp, "irem");
            default -> {}
        }
    }

    private void handleAssign(ArrayList<String> commands, Expression assignExp, Type assignValueType) {
        commands.add(assignExp.accept(this));
        castValue(commands, assignValueType);
        commands.add("checkcast " + getTypeClass(null));
        commands.add("invokevirtual java/util/ArrayList/set(ILjava/lang/Object;)Ljava/lang/Object;");
    }

    private void handleArithmeticAssign(ArrayList<String> commands, AssignStatement assignStatement, Expression assignExp, String operation) {
        commands.add(assignStatement.getAssignedId().accept(this));
        commands.add(assignStatement.getAccessListExpression().accept(this));
        commands.add("invokevirtual java/util/ArrayList/get(I)Ljava/lang/Object;");
        commands.add("checkcast " + getTypeClass(new IntType()));
        commands.add("invokevirtual java/lang/Integer/intValue()I");
        commands.add(assignExp.accept(this));
        commands.add(operation);
        castValue(commands, new IntType());
        commands.add("checkcast " + getTypeClass(null));
        commands.add("invokevirtual java/util/ArrayList/set(ILjava/lang/Object;)Ljava/lang/Object;");
    }

    private void castValue(ArrayList<String> commands, Type assignValueType) {
        if (assignValueType instanceof IntType) {
            commands.add("invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;");
        } else if (assignValueType instanceof BoolType) {
            commands.add("invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;");
        }
    }

    private void processSimpleAssign(AssignStatement assignStatement, ArrayList<String> commands, Expression assignExp, Type assignValueType) {
        commands.add(assignStatement.getAssignedId().accept(this));
        commands.add(assignExp.accept(this));
        if (assignValueType instanceof IntType) {
            commands.add("istore " + slotOf(assignStatement.getAssignedId().getName()));
        } else if (assignValueType instanceof BoolType) {
            commands.add("istore " + slotOf(assignStatement.getAssignedId().getName()));
        } else {
            commands.add("astore " + slotOf(assignStatement.getAssignedId().getName()));
        }
    }

    private String getTypeClass(Type type) {
        if (type instanceof IntType) {
            return "java/lang/Integer";
        } else if (type instanceof BoolType) {
            return "java/lang/Boolean";
        }
        else if (type instanceof  StringType){
            return "java/lang/String";
        }
        return "java/lang/Object";
    }


    private String handleRegularAssign(AssignStatement assignStatement) {
        List<String> commands = new ArrayList<>();

        Expression assignExp = assignStatement.getAssignExpression();

        Type assignValueType = assignExp.accept(typeChecker);
        commands.add(assignExp.accept(this));
        switch (assignStatement.getAssignOperator()){
            case AssignOperator.ASSIGN -> {
                VarItem newVarItem = new VarItem(assignStatement.getAssignedId());
                newVarItem.setType(assignValueType);
                try {
                    SymbolTable.top.put(newVarItem);
                }catch (ItemAlreadyExists ignored){
                    VarItem item = null;
                    try {
                        item = (VarItem) SymbolTable.top.getItem(VarItem.START_KEY + newVarItem.getName());
                    } catch (ItemNotFound ignored1) {}
                    assert item != null;
                    item.setType(assignValueType);
                }
                commands.add((assignValueType instanceof IntType || assignValueType instanceof BoolType ? "istore " : "astore ")
                        + slotOf(assignStatement.getAssignedId().getName()));

            }
            case AssignOperator.PLUS_ASSIGN -> {
                commands.add("iload " + slotOf(assignStatement.getAssignedId().getName()));
                commands.add("iadd");
                commands.add("istore " + slotOf(assignStatement.getAssignedId().getName()));
            }
            case AssignOperator.MINUS_ASSIGN -> {
                commands.add("iload " + slotOf(assignStatement.getAssignedId().getName()));
                commands.add("isub");
                commands.add("ineg");
                commands.add("istore " + slotOf(assignStatement.getAssignedId().getName()));
            }
            case AssignOperator.MULT_ASSIGN -> {
                commands.add("iload " + slotOf(assignStatement.getAssignedId().getName()));
                commands.add("imul");
                commands.add("istore " + slotOf(assignStatement.getAssignedId().getName()));
            }
            case AssignOperator.DIVIDE_ASSIGN -> {
                commands.add("iload " + slotOf(assignStatement.getAssignedId().getName()));
                commands.add(assignExp.accept(this));
                commands.add("idiv");
                commands.add("istore " + slotOf(assignStatement.getAssignedId().getName()));
            }
            case AssignOperator.MOD_ASSIGN -> {
                commands.add("iload " + slotOf(assignStatement.getAssignedId().getName()));
                commands.add("irem");
                commands.add("istore " + slotOf(assignStatement.getAssignedId().getName()));
            }
            case null, default -> {
            }
        }

        return String.join("\n", commands) + "\n";
    }

    private void appendLoadCommand(StringBuilder cmdBuilder, Type type, int slot) {
        if (type instanceof IntType || type instanceof BoolType) {
            cmdBuilder.append("iload ").append(slot).append("\n");
        } else {
            cmdBuilder.append("aload ").append(slot).append("\n");
        }
    }

    private void appendStoreCommand(StringBuilder cmdBuilder, Type type, int slot) {
        if (type instanceof IntType || type instanceof BoolType) {
            cmdBuilder.append("istore ").append(slot).append("\n");
        } else {
            cmdBuilder.append("astore ").append(slot).append("\n");
        }
    }

    private void appendOperatorCommand(StringBuilder cmdBuilder, AssignOperator op) {
        switch (op) {
            case MOD_ASSIGN    -> cmdBuilder.append("irem\n");
            case MINUS_ASSIGN  -> cmdBuilder.append("isub\n");
            case MULT_ASSIGN   -> cmdBuilder.append("imul\n");
            case DIVIDE_ASSIGN -> cmdBuilder.append("idiv\n");
            case PLUS_ASSIGN   -> cmdBuilder.append("iadd\n");
            default            -> {}
        }
    }

    @Override
    public String visit(IfStatement ifStatement){
        ArrayList<String> commands = new ArrayList<>();
        for (Expression exp:ifStatement.getConditions()){
            commands.add(exp.accept(this));
        }

        String thenL = getFreshLabel();
        String elseL = getFreshLabel();
        String exitL = getFreshLabel();

        commands.add("ifeq " + elseL);

        commands.add(thenL + ":");
        for (var stmt : ifStatement.getThenBody()) {
            commands.add(stmt.accept(this));
        }
        commands.add("goto " + exitL);

        commands.add(elseL + ":");
        if (!ifStatement.getElseBody().isEmpty()) {
            for (var stmt : ifStatement.getElseBody()) {
                commands.add(stmt.accept(this));
            }
        }

        commands.add(exitL + ":");

        return String.join("\n", commands)+"\n";
    }

    @Override
    public String visit(PutStatement putStatement) {
        String commands = "";
        String T="";
        commands += "getstatic java/lang/System/out Ljava/io/PrintStream;\n";
        commands += putStatement.getExpression().accept(this);
        Type type=putStatement.getExpression().accept(typeChecker);
        if (type instanceof StringType) {
            commands += ("invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V\n");
        } else if (type instanceof IntType) {
            commands += ("invokevirtual java/io/PrintStream/println(I)V\n");
        } else if (type instanceof BoolType) {
            commands += ("invokevirtual java/io/PrintStream/println(Z)V\n");
        }
        return commands;
    }

    @Override
    public String visit(ReturnStatement returnStatement){
        Expression returnedExpr = returnStatement.getReturnExp();
        Type type = null;
        if(returnedExpr != null)
            type = returnedExpr.accept(typeChecker);
        ArrayList<String> commands = new ArrayList<>();

        if(type == null || type instanceof NoType) {
            commands.add("return");
        }
        else {
            commands.add(returnedExpr.accept(this));
            if (type instanceof IntType )
                commands.add("ireturn");
            else
                commands.add("areturn");
        }

        return (String.join("\n",commands) + "\n");
    }
    @Override
    public String visit(ExpressionStatement expressionStatement){
        return expressionStatement.getExpression().accept(this);
    }
    @Override
    public String visit(BinaryExpression binaryExpression){
        ArrayList<String> commands = new ArrayList<>();
        commands.add(binaryExpression.getFirstOperand().accept(this));
        commands.add(binaryExpression.getSecondOperand().accept(this));
        switch (binaryExpression.getOperator()) {

            case LESS_EQUAL_THAN -> {
                String ltL = getFreshLabel();
                String endL = getFreshLabel();
                commands.add("if_icmple " + ltL);
                commands.add("ldc 0");
                commands.add("goto " + endL);
                commands.add(ltL + ":");
                commands.add("ldc 1");
                commands.add(endL + ":");
            }
            case GREATER_EQUAL_THAN -> {
                String geL = getFreshLabel();
                String endL = getFreshLabel();
                commands.add("if_icmpge " + geL);
                commands.add("ldc 0");
                commands.add("goto " + endL);
                commands.add(geL + ":");
                commands.add("ldc 1");
                commands.add(endL + ":");
            }
            case GREATER_THAN -> {
                String gtL = getFreshLabel();
                String endL = getFreshLabel();
                commands.add("if_icmpgt " + gtL);
                commands.add("ldc 0");
                commands.add("goto " + endL);
                commands.add(gtL + ":");
                commands.add("ldc 1");
                commands.add(endL + ":");
            }
            case LESS_THAN -> {
                String ltL = getFreshLabel();
                String endL = getFreshLabel();
                commands.add("if_icmplt " + ltL);
                commands.add("ldc 0");
                commands.add("goto " + endL);
                commands.add(ltL + ":");
                commands.add("ldc 1");
                commands.add(endL + ":");
            }
            case EQUAL -> {
                String eqL = getFreshLabel();
                String endL = getFreshLabel();
                commands.add("if_icmpeq " + eqL);
                commands.add("ldc 0");
                commands.add("goto " + endL);
                commands.add(eqL + ":");
                commands.add("ldc 1");
                commands.add(endL + ":");
            }
            case NOT_EQUAL -> {
                String neqL = getFreshLabel();
                String endL = getFreshLabel();
                commands.add("if_icmpne " + neqL);
                commands.add("ldc 0");
                commands.add("goto " + endL);
                commands.add(neqL + ":");
                commands.add("ldc 1");
                commands.add(endL + ":");
            }


            case DIVIDE -> commands.add("idiv");
            case PLUS -> commands.add("iadd");
            case MINUS -> commands.add("isub");
            case MULT -> commands.add("imul");


            default -> {
            }
        }

        return (String.join("\n", commands) + "\n");
    }
    @Override
    public String visit(UnaryExpression unaryExpression) {
        ArrayList<String> commands = new ArrayList<>();
        commands.add(unaryExpression.getExpression().accept(this));
        switch (unaryExpression.getOperator()) {
            case NOT -> {
                String ltL = getFreshLabel();
                String geL = getFreshLabel();
                commands.add("ifeq " + ltL);
                commands.add("ldc 0");
                commands.add("goto " + geL);
                commands.add(ltL + ":");
                commands.add("ldc 1");
                commands.add(geL + ":");
            }
            case DEC -> {
                commands.add("ldc 1");
                commands.add("isub");
            }
            case MINUS -> commands.add("ineg");
            case INC -> {
                commands.add("ldc 1");
                commands.add("iadd");
            }
            default -> {
            }
        }
        return String.join("\n", commands) + "\n";
    }
    @Override
    public String visit(Identifier identifier){
        Type type = identifier.accept(typeChecker);
        String typeSign = "";
        if (type instanceof IntType || type instanceof BoolType)
            typeSign = "i";

        else
            typeSign = "a";


        return typeSign + "load " + slotOf(identifier.getName())+"\n";
    }

    @Override
    public String visit(BreakStatement breakStatement){
        //TODO
        String commands = "goto ";
        commands += forBreakLabls.pop();
        commands += "\n";
        return commands;
    }
    @Override
    public String visit(NextStatement nextStatement){
        //TODO
        String commands = "goto ";
        commands += forNextLabels.pop();
        commands += "\n";
        return commands;
    }
    @Override
    public String visit(LoopDoStatement loopDoStatement) {
//TODO
        String commands = "";
        String startLabel = getFreshLabel();
        String endLabel = getFreshLabel();
        forNextLabels.push(startLabel);
        forBreakLabls.push(endLabel);
        commands += startLabel + ":\n";
        SymbolTable.push(SymbolTable.top.copy());
        for(var statement : loopDoStatement.getLoopBodyStmts()){
            String st = statement.accept(this);
            if(st != null){
                commands += st;
                commands += "\n";
            }
        }
        SymbolTable.pop();
        commands += "goto " + startLabel + "\n";
        commands += endLabel + ":\n";
        forNextLabels.pop();
        forBreakLabls.pop();
        return commands;
    }



    @Override
    public String visit(LenStatement lenStatement) {
        Expression expr = lenStatement.getExpression();
        StringBuilder bytecode = new StringBuilder();

        bytecode.append(expr.accept(this));

        Type exprType = expr.accept(typeChecker);
        if (exprType instanceof ListType) {
            bytecode.append("invokevirtual java/util/ArrayList/size()I\n");
        }
        else if (exprType instanceof StringType) {
            bytecode.append("invokevirtual java/lang/String/length()I\n");
        }

        return(bytecode.toString() + "\n");

    }
    @Override
    public String visit(ChopStatement chopStatement) {
        Expression expr = chopStatement.getChopExpression();
        StringBuilder bytecode = new StringBuilder();
        bytecode.append(expr.accept(this));
        bytecode.append("dup\n");
        bytecode.append("invokevirtual java/lang/String/length()I\n");
        bytecode.append("iconst_1\n");
        bytecode.append("isub\n");
        bytecode.append("iconst_0\n");
        bytecode.append("swap\n");
        bytecode.append("invokevirtual java/lang/String/substring(II)Ljava/lang/String;\n");
        return(bytecode.toString());

    }

    @Override
    public String visit(FunctionPointer functionPointer){
        FptrType fptr = (FptrType) functionPointer.accept(typeChecker);
        String commands = "";
        commands += "new Fptr\n";
        commands += "dup\n";
        commands += "aload_0\n";
        commands += "ldc " + "\"" + fptr.getFunctionName() + "\"\n";
        commands += "invokespecial Fptr/<init>(Ljava/lang/Object;Ljava/lang/String;)V\n";
        return commands;
    }
    @Override
    public String visit(ListValue listValue){
        List<String> commands = new ArrayList<>();
        commands.add("new java/util/ArrayList");
        commands.add("dup");
        commands.add("invokespecial java/util/ArrayList/<init>()V");
        commands.add("astore " + slotOf("array_"));
        for (Expression expression : listValue.getElements()){
            commands.add("aload " + slotOf("array_"));
            commands.add(expression.accept(this));
            Type type = expression.accept(typeChecker);
            if (type instanceof IntType)
                commands.add("invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;");
            else if (type instanceof BoolType){
                commands.add("invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;");
            }
            commands.add("invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z");
            commands.add("pop");
        }
        commands.add("aload " + slotOf("array_"));

        return String.join("\n", commands)+"\n";
    }
    @Override
    public String visit(IntValue intValue){
        String commands="";
        commands += "ldc " + intValue.getIntVal() + "\n";
        return commands;
    }
    @Override
    public String visit(BoolValue boolValue){
        String commands="";
//        commands+="invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean\n";
        if(boolValue.getBool())
            commands += "ldc 1\n";
        else
            commands += "ldc 0\n";

        return commands;
    }
    @Override
    public String visit(StringValue stringValue){
        String commands="";
        commands+="ldc " + stringValue.getStr()+ "\n";
        return commands;
    }
}