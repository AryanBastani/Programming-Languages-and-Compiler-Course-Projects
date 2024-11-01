package main.visitor.type;

import com.sun.jdi.CharType;
import main.ast.nodes.Program;
import main.ast.nodes.declaration.*;
import main.ast.nodes.expression.*;
import main.ast.nodes.expression.operators.*;
import main.ast.nodes.expression.value.*;
import main.ast.nodes.expression.value.primitive.*;
import main.ast.nodes.statement.*;
import main.ast.type.*;
import main.ast.type.primitiveType.*;
import main.compileError.CompileError;
import main.compileError.typeErrors.*;
import main.symbolTable.SymbolTable;
import main.symbolTable.exceptions.*;
import main.symbolTable.item.*;
import main.symbolTable.utils.Stack;
import main.visitor.Visitor;
import org.antlr.v4.runtime.misc.Pair;

import java.util.*;

public class TypeChecker extends Visitor<Type> {
    public ArrayList<CompileError> typeErrors = new ArrayList<>();

    private Stack<Pair<Type, Boolean>> functionsReturnInfo = new Stack<>();
    @Override
    public Type visit(Program program){
        SymbolTable.root = new SymbolTable();
        SymbolTable.top = new SymbolTable();

        for(FunctionDeclaration functionDeclaration : program.getFunctionDeclarations()){
            FunctionItem functionItem = new FunctionItem(functionDeclaration);
            try {
                SymbolTable.root.put(functionItem);
            }catch (ItemAlreadyExists ignored){}
        }
        for(PatternDeclaration patternDeclaration : program.getPatternDeclarations()){
            PatternItem patternItem = new PatternItem(patternDeclaration);
            try{
                SymbolTable.root.put(patternItem);
            }catch (ItemAlreadyExists ignored){}
        }
        program.getMain().accept(this);

        return null;
    }
    @Override
    public Type visit(FunctionDeclaration functionDeclaration){
        SymbolTable.push(new SymbolTable());

        functionsReturnInfo.push(new Pair<>(new NoType(), false));

        try {
            FunctionItem functionItem = (FunctionItem) SymbolTable.root.getItem(FunctionItem.START_KEY +
                    functionDeclaration.getFunctionName().getName());
            ArrayList<Type> currentArgTypes = functionItem.getArgumentTypes();
            for (int i = 0; i < functionDeclaration.getArgs().size(); i++) {
                VarItem argItem = new VarItem(functionDeclaration.getArgs().get(i).getName());
                if(functionDeclaration.getArgs().get(i).getDefaultVal() != null)
                    argItem.setType(functionDeclaration.getArgs().get(i).getDefaultVal().accept(this));
                else
                    argItem.setType(currentArgTypes.get(i));
                try {
                    SymbolTable.top.put(argItem);
                }catch (ItemAlreadyExists ignored){}
            }
        }catch (ItemNotFound ignored){}
        for(Statement statement : functionDeclaration.getBody())
            statement.accept(this);
        Pair<Type, Boolean> retrunInfo = functionsReturnInfo.pop();
        if(retrunInfo.b){
            typeErrors.add(new FunctionIncompatibleReturnTypes(functionDeclaration.getLine(),
                    functionDeclaration.getFunctionName().getName()));
            SymbolTable.pop();
            return new NoType();
        }

        SymbolTable.pop();
        return retrunInfo.a;
    }
    @Override
    public Type visit(PatternDeclaration patternDeclaration){
        SymbolTable.push(new SymbolTable());
        boolean hasError = false;
        try {
            PatternItem patternItem = (PatternItem) SymbolTable.root.getItem(PatternItem.START_KEY +
                    patternDeclaration.getPatternName().getName());
            VarItem varItem = new VarItem(patternDeclaration.getTargetVariable());
            varItem.setType(patternItem.getTargetVarType());

            try {
                SymbolTable.top.put(varItem);
            }catch (ItemAlreadyExists ignored){}
            for(Expression expression : patternDeclaration.getConditions()){
                if(!(expression.accept(this) instanceof BoolType)){
                    typeErrors.add(new ConditionIsNotBool(expression.getLine()));
                    hasError = true;
                }
            }
            if(patternDeclaration.getReturnExp().size() == 0) {
                SymbolTable.pop();
                return new NoType();
            }

            Type firstReturnType = patternDeclaration.getReturnExp().getFirst().accept(this);
            for(int exprId = 1; exprId < patternDeclaration.getReturnExp().size(); exprId++){
                if(!(patternDeclaration.getReturnExp().get(exprId).accept(this).sameType(firstReturnType))){
                    typeErrors.add(new PatternIncompatibleReturnTypes(patternDeclaration.getLine(),
                            patternDeclaration.getPatternName().getName()));
                    hasError = true;
                    break;
                }
            }
            SymbolTable.pop();
            if(hasError)
                return new NoType();
            else
                return firstReturnType;
        }catch (ItemNotFound ignored){return new NoType();}
    }
    @Override
    public Type visit(MainDeclaration mainDeclaration){
        functionsReturnInfo.push(new Pair<>(new NoType(), false));
        for(Statement statement : mainDeclaration.getBody())
            statement.accept(this);
        functionsReturnInfo.pop();
        return null;
    }
    @Override
    public Type visit(AccessExpression accessExpression){
        if(accessExpression.isFunctionCall()){
            FunctionItem functionItem = null;
            try {
                functionItem = (FunctionItem) SymbolTable.root.getItem(FunctionItem.START_KEY +
                        ((Identifier) accessExpression.getAccessedExpression()).getName());
            }catch (ItemNotFound notIgnored){
                try {
                    Type accessedType = accessExpression.getAccessedExpression().accept(this);
                    if(accessedType instanceof FptrType fptrType){
                        functionItem = (FunctionItem) SymbolTable.root.getItem(FunctionItem.START_KEY +
                                fptrType.getFunctionName());
                    }
                }catch (ItemNotFound ignored){}
            }

            ArrayList<Type> argTypes = new ArrayList<>();
            for(Expression currentExpr : accessExpression.getArguments())
                argTypes.add(currentExpr.accept(this));
            functionItem.setArgumentTypes(argTypes);
            return(functionItem.getFunctionDeclaration().accept(this));
        }
        else {
            Type accessedType = accessExpression.getAccessedExpression().accept(this);
            if (!(accessedType instanceof StringType) && !(accessedType instanceof ListType)) {
                typeErrors.add(new IsNotIndexable(accessExpression.getLine()));
                return new NoType();
            }
            for (Expression currentExpr : accessExpression.getDimentionalAccess()) {
                if (!(currentExpr.accept(this) instanceof IntType)) {
                    typeErrors.add(new AccessIndexIsNotInt(accessExpression.getLine()));
                    return new NoType();
                }
            }

            if (accessedType instanceof StringType)
                return new StringType();
            else
                return ((ListType) accessedType).getType();
        }
    }

    @Override
    public Type visit(ReturnStatement returnStatement){
        Pair<Type, Boolean> returnInfo = functionsReturnInfo.pop();
        Type returnType = returnStatement.getReturnExp().accept(this);
        if(!returnInfo.b){
            if(returnInfo.a instanceof NoType)
                returnInfo = new Pair<>(returnType, false);
            else if(!returnInfo.a.sameType(returnType))
                returnInfo = new Pair<>(returnType, true);
        }
        functionsReturnInfo.push(returnInfo);
        return returnType;
    }
    @Override
    public Type visit(ExpressionStatement expressionStatement){
        return expressionStatement.getExpression().accept(this);

    }
    @Override
    public Type visit(ForStatement forStatement){
        SymbolTable.push(SymbolTable.top.copy());
        VarItem varItem = new VarItem(forStatement.getIteratorId());
        varItem.setType(forStatement.getRangeExpression().accept(this));
        try{
            SymbolTable.top.put(varItem);
        }catch (ItemAlreadyExists ignored){}

        for(Statement statement : forStatement.getLoopBodyStmts())
            statement.accept(this);
        SymbolTable.pop();
        return null;
    }
    @Override
    public Type visit(IfStatement ifStatement){
        SymbolTable.push(SymbolTable.top.copy());
        for(Expression expression : ifStatement.getConditions())
            if(!(expression.accept(this) instanceof BoolType))
                typeErrors.add(new ConditionIsNotBool(expression.getLine()));
        for(Statement statement : ifStatement.getThenBody())
            statement.accept(this);
        for(Statement statement : ifStatement.getElseBody())
            statement.accept(this);
        SymbolTable.pop();
        return new NoType();
    }
    @Override
    public Type visit(LoopDoStatement loopDoStatement){
        SymbolTable.push(SymbolTable.top.copy());
        for(Statement statement : loopDoStatement.getLoopBodyStmts())
            statement.accept(this);
        SymbolTable.pop();
        return new NoType();
    }
    @Override
    public Type visit(AssignStatement assignStatement){
        if(assignStatement.isAccessList()){
            try {
                VarItem assignedTo= (VarItem) SymbolTable.top.getItem(VarItem.START_KEY + assignStatement.getAssignedId().getName());
                Type assignedToType = assignedTo.getType();
                Type newType = assignStatement.getAssignExpression().accept(this);

                if (!(assignStatement.getAccessListExpression().accept(this) instanceof IntType))
                    typeErrors.add(new AccessIndexIsNotInt(assignStatement.getLine()));
                if (!(assignedToType instanceof StringType) && !(assignedToType instanceof ListType))
                    typeErrors.add(new IsNotIndexable(assignStatement.getLine()));
                if (assignedToType instanceof ListType && !(((ListType)assignedToType).getType().sameType(newType)))
                    typeErrors.add(new ListElementsTypesMisMatch(assignStatement.getLine()));
            }
            catch (ItemNotFound ignored){}
        }
        else{
            VarItem newVarItem = new VarItem(assignStatement.getAssignedId());
            Type newType = assignStatement.getAssignExpression().accept(this);
            newVarItem.setType(newType);
            try {
                SymbolTable.top.put(newVarItem);
            }catch (ItemAlreadyExists notIgnored){
                try {
                    VarItem var = (VarItem)SymbolTable.top.getItem(VarItem.START_KEY + assignStatement.getAssignedId().getName());
                    var.setType(newType);
                }catch (ItemNotFound ignored){}
            }
        }
        return new NoType();
    }
    @Override
    public Type visit(BreakStatement breakStatement){
        for(Expression expression : breakStatement.getConditions())
            if(!((expression.accept(this)) instanceof BoolType))
                typeErrors.add(new ConditionIsNotBool(expression.getLine()));

        return null;
    }
    @Override
    public Type visit(NextStatement nextStatement){
        for(Expression expression : nextStatement.getConditions())
            if(!((expression.accept(this)) instanceof BoolType))
                typeErrors.add(new ConditionIsNotBool(expression.getLine()));

        return null;
    }
    @Override
    public Type visit(PushStatement pushStatement){
        Type initialType = pushStatement.getInitial().accept(this);
        Type toBeAdded = pushStatement.getToBeAdded().accept(this);

        if(!((initialType instanceof StringType) || (initialType instanceof ListType))){
            typeErrors.add(new IsNotPushedable(pushStatement.getLine()));
            return new NoType();
        }

        if(initialType instanceof ListType){
            Type elementsType = ((ListType) initialType).getType();

            if((!(elementsType instanceof  NoType)) && !(elementsType.sameType(toBeAdded))){
                typeErrors.add(new PushArgumentsTypesMisMatch(pushStatement.getLine()));
                return new NoType();
            }

            ((ListType) initialType).setType(toBeAdded);
        }

        else if(initialType instanceof StringType && !initialType.sameType(toBeAdded)){
            typeErrors.add(new PushArgumentsTypesMisMatch(pushStatement.getLine()));
            return new NoType();
        }

        return initialType;
    }
    @Override
    public Type visit(PutStatement putStatement){
        putStatement.getExpression().accept(this);
        return new NoType();
    }
    @Override
    public Type visit(BoolValue boolValue){
        return new BoolType();
    }
    @Override
    public Type visit(IntValue intValue){
        return new IntType();
    }
    @Override
    public Type visit(FloatValue floatValue){return new FloatType();}
    @Override
    public Type visit(StringValue stringValue){
        return new StringType();
    }
    @Override
    public Type visit(ListValue listValue){
        Type prevType = null;
        if(listValue.getElements().size() == 0)
            return new ListType(new NoType());
        prevType = listValue.getElements().get(0).accept(this);
        for(int exprId = 1; exprId < listValue.getElements().size(); exprId++){
            if(!prevType.sameType(listValue.getElements().get(exprId).accept(this))){
                typeErrors.add(new ListElementsTypesMisMatch(listValue.getLine()));
                return(new NoType());
            }
        }

        ListType listType = new ListType(prevType);
        return listType;
    }
    @Override
    public Type visit(FunctionPointer functionPointer){
        return new FptrType(functionPointer.getId().getName());
    }
    @Override
    public Type visit(AppendExpression appendExpression){
        Type appendeeType = appendExpression.getAppendee().accept(this);
        if(!(appendeeType instanceof ListType) && !(appendeeType instanceof StringType)){
            typeErrors.add(new IsNotAppendable(appendExpression.getLine()));
            return new NoType();
        }
        return appendeeType;
    }
    @Override
    public Type visit(BinaryExpression binaryExpression) {
        Type firstType = binaryExpression.getFirstOperand().accept(this);
        Type secondType = binaryExpression.getSecondOperand().accept(this);

        if(!firstType.sameType(secondType)) {
            typeErrors.add(new NonSameOperands(binaryExpression.getLine(), binaryExpression.getOperator()));
            return new NoType();
        }

        if((!(firstType instanceof IntType || firstType instanceof  FloatType)) ||
                (!(secondType instanceof  IntType || secondType instanceof  FloatType))){
            typeErrors.add(new UnsupportedOperandType(binaryExpression.getLine(),
                    binaryExpression.getOperator().toString()));
            return new NoType();
        }

        if(binaryExpression.getOperator() == BinaryOperator.PLUS ||
            binaryExpression.getOperator() == BinaryOperator.DIVIDE ||
            binaryExpression.getOperator() == BinaryOperator.MINUS ||
            binaryExpression.getOperator() == BinaryOperator.MULT)
            return  firstType;
        else
            return new BoolType();
    }
    @Override
    public Type visit(UnaryExpression unaryExpression){
        Type operandType = unaryExpression.getExpression().accept(this);
        UnaryOperator operator = unaryExpression.getOperator();
        boolean unsupported = false;

        if(operator == UnaryOperator.NOT){
            if(!(operandType instanceof BoolType))
                unsupported = true;
        }
        else if(!((operandType instanceof IntType) || (operandType instanceof  FloatType)))
            unsupported = true;

        if(unsupported){
            typeErrors.add(new UnsupportedOperandType(unaryExpression.getLine(),
                    unaryExpression.getOperator().toString()));
            return (new NoType());
        }

        return (operandType);
    }
    @Override
    public Type visit(ChompStatement chompStatement){
        if (!(chompStatement.getChompExpression().accept(this) instanceof StringType)) {
            typeErrors.add(new ChompArgumentTypeMisMatch(chompStatement.getLine()));
            return new NoType();
        }

        return new StringType();
    }
    @Override
    public Type visit(ChopStatement chopStatement){
        return new StringType();
    }
    @Override
    public Type visit(Identifier identifier){
        try {
            VarItem var = (VarItem) SymbolTable.top.getItem(VarItem.START_KEY + identifier.getName());
            return var.getType();
        }catch (ItemNotFound ignored){}

        return new NoType();
    }
    @Override
    public Type visit(LenStatement lenStatement){
        Type exprType = lenStatement.getExpression().accept(this);
        if(!(exprType instanceof StringType) && !(exprType instanceof ListType)){
            typeErrors.add(new LenArgumentTypeMisMatch(lenStatement.getLine()));
            return new NoType();
            }
        return new IntType();
    }
    @Override
    public Type visit(MatchPatternStatement matchPatternStatement){
        try{
            PatternItem patternItem = (PatternItem)SymbolTable.root.getItem(PatternItem.START_KEY +
                    matchPatternStatement.getPatternId().getName());
            patternItem.setTargetVarType(matchPatternStatement.getMatchArgument().accept(this));
            return patternItem.getPatternDeclaration().accept(this);
        }catch (ItemNotFound ignored){}
        return new NoType();
    }
    @Override
    public Type visit(RangeExpression rangeExpression){
        RangeType rangeType = rangeExpression.getRangeType();

        if(rangeType.equals(RangeType.LIST)){
            if(rangeExpression.getRangeExpressions().size() == 0)
                return new NoType();
            Type firstType = rangeExpression.getRangeExpressions().get(0).accept(this);
            for(int exprId = 1; exprId < rangeExpression.getRangeExpressions().size(); exprId++){
                if(!rangeExpression.getRangeExpressions().get(exprId).accept(this).sameType(firstType)){
                    typeErrors.add(new ListElementsTypesMisMatch(rangeExpression.getLine()));
                    return new NoType();
                }
            }
            return firstType;
        }

        else if(rangeType.equals(RangeType.DOUBLE_DOT)){
            for(Expression currentExpr : rangeExpression.getRangeExpressions())
                currentExpr.accept(this);
        }

        else
            return rangeExpression.getRangeExpressions().get(0).accept(this);

        return new IntType();
    }
}
