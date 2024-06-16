package main.visitor.codeGenerator;

import main.ast.nodes.Program;
import main.ast.nodes.declaration.FunctionDeclaration;
import main.ast.nodes.declaration.MainDeclaration;
import main.ast.nodes.expression.*;
import main.ast.nodes.expression.operators.BinaryOperator;
import main.ast.nodes.expression.value.FunctionPointer;
import main.ast.nodes.expression.value.ListValue;
import main.ast.nodes.expression.value.primitive.BoolValue;
import main.ast.nodes.expression.value.primitive.IntValue;
import main.ast.nodes.expression.value.primitive.StringValue;
import main.ast.nodes.statement.*;
import main.ast.type.FptrType;
import main.ast.type.ListType;
import main.ast.type.Type;
import main.ast.type.primitiveType.BoolType;
import main.ast.type.primitiveType.IntType;
import main.ast.type.primitiveType.StringType;
import main.symbolTable.SymbolTable;
import main.symbolTable.exceptions.ItemNotFound;
import main.symbolTable.item.FunctionItem;
import main.visitor.Visitor;
import main.visitor.type.TypeChecker;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class CodeGenerator extends Visitor<String> {
    private final String outputPath;
    private FileWriter mainFile;
    private final TypeChecker typeChecker;
    private final Set<String> visited;
    private FunctionItem curFunction;
    private final HashMap<String, Integer> slots = new HashMap<>();
    private int curLabel = 0;

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
    @Override
    public String visit(FunctionDeclaration functionDeclaration){
        slots.clear();

        String commands = "";
        String args = ""; // TODO and add to the slots
        String returnType = ""; // TODO
        commands += ".method public " + functionDeclaration.getFunctionName().getName();
        commands += args + returnType + "\n";
        // TODO headers, body and return with corresponding type

        addCommand(commands);
        return null;
    }
    @Override
    public String visit(MainDeclaration mainDeclaration){
        slots.clear();

        String commands = "";
        commands += ".method public <init>()V\n";
        commands += ".limit stack 128\n";
        commands += ".limit locals 128\n";
        commands += "aload_0\n";
        commands += "invokespecial java/lang/Object/<init>()V\n";
        for (var statement : mainDeclaration.getBody())
            commands += statement.accept(this);
        commands += "return\n";
        commands += ".end method\n";

        addCommand(commands);
        return null;
    }
    public String visit(AccessExpression accessExpression){
        if (accessExpression.isFunctionCall()) {
            Identifier functionName = (Identifier)accessExpression.getAccessedExpression();
            String args = ""; // TODO
            String returnType = ""; // TODO
            return "invokestatic Main/" + functionName.getName() + args + returnType + "\n";
        }
        else {
            // TODO
        }
        //TODO
        return null;
    }
    @Override
    public String visit(AssignStatement assignStatement){
        //TODO
        return null;
    }
    @Override
    public String visit(IfStatement ifStatement){
        ArrayList<String> commands = new ArrayList<>();
        commands.add(ifStatement.accept(this));

        String thenL =getFreshLabel();
        String elseL = getFreshLabel();;
        String exitL = getFreshLabel();;

        commands.add("ifeq" + " " + elseL);
        commands.add(thenL + ":");
        for (var stmt : ifStatement.getThenBody())
            commands.add(stmt.accept(this));

        commands.add("goto " + exitL);
        commands.add(elseL + ":");
        if (!ifStatement.getElseBody().isEmpty())
            for (var stmt : ifStatement.getElseBody())
                commands.add(stmt.accept(this));

        commands.add(exitL + ":");
        addCommand(String.join("\n",commands));
        return null;
    }
    @Override
    public String visit(PutStatement putStatement){
        addCommand("getstatic java/lang/System/out Ljava/io/PrintStream;");
            Expression arg=putStatement.getExpression();
            addCommand(arg.accept(this));
            Type type = arg.accept(typeChecker);
            if (type instanceof IntType)
                addCommand("invokevirtual java/io/PrintStream/println(I)V");
            else if (type instanceof BoolType)
                addCommand("invokevirtual java/io/PrintStream/println(Z)V");
            else if (type instanceof StringType)
                addCommand("invokevirtual java/io/PrintStream/println(V)V");
            return null;
    }
    @Override
    public String visit(ReturnStatement returnStatement){
        //TODO
        return null;
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
        BinaryOperator op = binaryExpression.getOperator();


        switch (op) {
            case PLUS -> commands.add("iadd");
            case MINUS -> commands.add("isub");
            case MULT -> commands.add("imul");
            case DIVIDE -> commands.add("idiv");
            case EQUAL -> {
                String eqL = getFreshLabel();
                String neqL = getFreshLabel();
                commands.add("if_icmpeq " + eqL);
                commands.add("ldc 0");
                commands.add("goto " + neqL);
                commands.add(eqL + ":");
                commands.add("ldc 1");
                commands.add(neqL + ":");
            }
            case NOT_EQUAL -> {
                String eqL = getFreshLabel();
                String neqL = getFreshLabel();
                commands.add("if_icmpne " + eqL);
                commands.add("ldc 0");
                commands.add("goto " + neqL);
                commands.add(eqL + ":");
                commands.add("ldc 1");
                commands.add(neqL + ":");
            }
            case LESS_EQUAL_THAN -> {
                String ltL = getFreshLabel();
                String geL = getFreshLabel();
                commands.add("if_icmplt " + ltL);
                commands.add("ldc 0");
                commands.add("goto " + geL);
                commands.add(ltL + ":");
                commands.add("ldc 1");
                commands.add(geL + ":");
            }
            case GREATER_THAN -> {
                String gtL = getFreshLabel();
                String leL = getFreshLabel();
                commands.add("if_icmpgt " + gtL);
                commands.add("ldc 0");
                commands.add("goto " + leL);
                commands.add(gtL + ":");
                commands.add("ldc 1");
                commands.add(leL + ":");
            }
            default -> {
            }
        }

        addCommand(String.join("\n", commands));

        return null;
    }
    @Override
    public String visit(UnaryExpression unaryExpression){
        //TODO
        return null;
    }
    @Override
    public String visit(Identifier identifier){
        //TODO
        return null;
    }
    @Override
    public String visit(LoopDoStatement loopDoStatement){
        //TODO
        return null;
    }
    @Override
    public String visit(BreakStatement breakStatement){
        //TODO
        return null;
    }
    @Override
    public String visit(NextStatement nextStatement){
        //TODO
        return null;
    }
    @Override
    public String visit(LenStatement lenStatement){
        //TODO
        return null;
    }
    @Override
    public String visit(ChopStatement chopStatement){
        //TODO
        return null;
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
        //TODO
        return null;
    }
    @Override
    public String visit(IntValue intValue){
        String commands="";
        commands+="invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer\n";
        commands += "ldc " + intValue.getIntVal() + "\n";
        addCommand(commands);
        return null;
    }
    @Override
    public String visit(BoolValue boolValue){
        String commands="";
        commands+="invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean\n";
        if(boolValue.getBool())
            commands += "ldc 1\n";
        else
            commands += "ldc 0\n";
        addCommand(commands);

        return null;
    }
    @Override
    public String visit(StringValue stringValue){
        String commands="";
        commands+="ldc " + "\"" + stringValue.getStr() + "\"\n";
        addCommand(commands);
        return null;
    }
}