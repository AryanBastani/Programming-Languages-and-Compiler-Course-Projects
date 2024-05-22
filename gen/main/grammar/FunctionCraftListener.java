// Generated from D:/UNI/Term6/PLC/CAs/ArianVersion/src/main/grammar/FunctionCraft.g4 by ANTLR 4.13.1
package main.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FunctionCraftParser}.
 */
public interface FunctionCraftListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(FunctionCraftParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(FunctionCraftParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(FunctionCraftParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(FunctionCraftParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(FunctionCraftParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(FunctionCraftParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#bodyFunction}.
	 * @param ctx the parse tree
	 */
	void enterBodyFunction(FunctionCraftParser.BodyFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#bodyFunction}.
	 * @param ctx the parse tree
	 */
	void exitBodyFunction(FunctionCraftParser.BodyFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(FunctionCraftParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(FunctionCraftParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#argInside}.
	 * @param ctx the parse tree
	 */
	void enterArgInside(FunctionCraftParser.ArgInsideContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#argInside}.
	 * @param ctx the parse tree
	 */
	void exitArgInside(FunctionCraftParser.ArgInsideContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(FunctionCraftParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(FunctionCraftParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#paramInside}.
	 * @param ctx the parse tree
	 */
	void enterParamInside(FunctionCraftParser.ParamInsideContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#paramInside}.
	 * @param ctx the parse tree
	 */
	void exitParamInside(FunctionCraftParser.ParamInsideContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#paramAssignment}.
	 * @param ctx the parse tree
	 */
	void enterParamAssignment(FunctionCraftParser.ParamAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#paramAssignment}.
	 * @param ctx the parse tree
	 */
	void exitParamAssignment(FunctionCraftParser.ParamAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(FunctionCraftParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(FunctionCraftParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#lambdaFunction}.
	 * @param ctx the parse tree
	 */
	void enterLambdaFunction(FunctionCraftParser.LambdaFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#lambdaFunction}.
	 * @param ctx the parse tree
	 */
	void exitLambdaFunction(FunctionCraftParser.LambdaFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#returnInside}.
	 * @param ctx the parse tree
	 */
	void enterReturnInside(FunctionCraftParser.ReturnInsideContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#returnInside}.
	 * @param ctx the parse tree
	 */
	void exitReturnInside(FunctionCraftParser.ReturnInsideContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#functionReturn}.
	 * @param ctx the parse tree
	 */
	void enterFunctionReturn(FunctionCraftParser.FunctionReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#functionReturn}.
	 * @param ctx the parse tree
	 */
	void exitFunctionReturn(FunctionCraftParser.FunctionReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(FunctionCraftParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(FunctionCraftParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#labdaCall}.
	 * @param ctx the parse tree
	 */
	void enterLabdaCall(FunctionCraftParser.LabdaCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#labdaCall}.
	 * @param ctx the parse tree
	 */
	void exitLabdaCall(FunctionCraftParser.LabdaCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#loopLoop}.
	 * @param ctx the parse tree
	 */
	void enterLoopLoop(FunctionCraftParser.LoopLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#loopLoop}.
	 * @param ctx the parse tree
	 */
	void exitLoopLoop(FunctionCraftParser.LoopLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#bodyLoop}.
	 * @param ctx the parse tree
	 */
	void enterBodyLoop(FunctionCraftParser.BodyLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#bodyLoop}.
	 * @param ctx the parse tree
	 */
	void exitBodyLoop(FunctionCraftParser.BodyLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#ifLoop}.
	 * @param ctx the parse tree
	 */
	void enterIfLoop(FunctionCraftParser.IfLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#ifLoop}.
	 * @param ctx the parse tree
	 */
	void exitIfLoop(FunctionCraftParser.IfLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#elifLoop}.
	 * @param ctx the parse tree
	 */
	void enterElifLoop(FunctionCraftParser.ElifLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#elifLoop}.
	 * @param ctx the parse tree
	 */
	void exitElifLoop(FunctionCraftParser.ElifLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#elseLoop}.
	 * @param ctx the parse tree
	 */
	void enterElseLoop(FunctionCraftParser.ElseLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#elseLoop}.
	 * @param ctx the parse tree
	 */
	void exitElseLoop(FunctionCraftParser.ElseLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void enterForLoop(FunctionCraftParser.ForLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#forLoop}.
	 * @param ctx the parse tree
	 */
	void exitForLoop(FunctionCraftParser.ForLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#forList}.
	 * @param ctx the parse tree
	 */
	void enterForList(FunctionCraftParser.ForListContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#forList}.
	 * @param ctx the parse tree
	 */
	void exitForList(FunctionCraftParser.ForListContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#forRange}.
	 * @param ctx the parse tree
	 */
	void enterForRange(FunctionCraftParser.ForRangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#forRange}.
	 * @param ctx the parse tree
	 */
	void exitForRange(FunctionCraftParser.ForRangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#argumentsCall}.
	 * @param ctx the parse tree
	 */
	void enterArgumentsCall(FunctionCraftParser.ArgumentsCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#argumentsCall}.
	 * @param ctx the parse tree
	 */
	void exitArgumentsCall(FunctionCraftParser.ArgumentsCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#appendArgument}.
	 * @param ctx the parse tree
	 */
	void enterAppendArgument(FunctionCraftParser.AppendArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#appendArgument}.
	 * @param ctx the parse tree
	 */
	void exitAppendArgument(FunctionCraftParser.AppendArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#if}.
	 * @param ctx the parse tree
	 */
	void enterIf(FunctionCraftParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#if}.
	 * @param ctx the parse tree
	 */
	void exitIf(FunctionCraftParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#elif}.
	 * @param ctx the parse tree
	 */
	void enterElif(FunctionCraftParser.ElifContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#elif}.
	 * @param ctx the parse tree
	 */
	void exitElif(FunctionCraftParser.ElifContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#else}.
	 * @param ctx the parse tree
	 */
	void enterElse(FunctionCraftParser.ElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#else}.
	 * @param ctx the parse tree
	 */
	void exitElse(FunctionCraftParser.ElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#afterIf}.
	 * @param ctx the parse tree
	 */
	void enterAfterIf(FunctionCraftParser.AfterIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#afterIf}.
	 * @param ctx the parse tree
	 */
	void exitAfterIf(FunctionCraftParser.AfterIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#ifInside}.
	 * @param ctx the parse tree
	 */
	void enterIfInside(FunctionCraftParser.IfInsideContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#ifInside}.
	 * @param ctx the parse tree
	 */
	void exitIfInside(FunctionCraftParser.IfInsideContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#nextIF}.
	 * @param ctx the parse tree
	 */
	void enterNextIF(FunctionCraftParser.NextIFContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#nextIF}.
	 * @param ctx the parse tree
	 */
	void exitNextIF(FunctionCraftParser.NextIFContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#breakIF}.
	 * @param ctx the parse tree
	 */
	void enterBreakIF(FunctionCraftParser.BreakIFContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#breakIF}.
	 * @param ctx the parse tree
	 */
	void exitBreakIF(FunctionCraftParser.BreakIFContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#listVal}.
	 * @param ctx the parse tree
	 */
	void enterListVal(FunctionCraftParser.ListValContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#listVal}.
	 * @param ctx the parse tree
	 */
	void exitListVal(FunctionCraftParser.ListValContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#listInside}.
	 * @param ctx the parse tree
	 */
	void enterListInside(FunctionCraftParser.ListInsideContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#listInside}.
	 * @param ctx the parse tree
	 */
	void exitListInside(FunctionCraftParser.ListInsideContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterPattern(FunctionCraftParser.PatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitPattern(FunctionCraftParser.PatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#patternCall}.
	 * @param ctx the parse tree
	 */
	void enterPatternCall(FunctionCraftParser.PatternCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#patternCall}.
	 * @param ctx the parse tree
	 */
	void exitPatternCall(FunctionCraftParser.PatternCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#patternInside}.
	 * @param ctx the parse tree
	 */
	void enterPatternInside(FunctionCraftParser.PatternInsideContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#patternInside}.
	 * @param ctx the parse tree
	 */
	void exitPatternInside(FunctionCraftParser.PatternInsideContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#builtInsideFuns}.
	 * @param ctx the parse tree
	 */
	void enterBuiltInsideFuns(FunctionCraftParser.BuiltInsideFunsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#builtInsideFuns}.
	 * @param ctx the parse tree
	 */
	void exitBuiltInsideFuns(FunctionCraftParser.BuiltInsideFunsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#putPush}.
	 * @param ctx the parse tree
	 */
	void enterPutPush(FunctionCraftParser.PutPushContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#putPush}.
	 * @param ctx the parse tree
	 */
	void exitPutPush(FunctionCraftParser.PutPushContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#chopChomp}.
	 * @param ctx the parse tree
	 */
	void enterChopChomp(FunctionCraftParser.ChopChompContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#chopChomp}.
	 * @param ctx the parse tree
	 */
	void exitChopChomp(FunctionCraftParser.ChopChompContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#len}.
	 * @param ctx the parse tree
	 */
	void enterLen(FunctionCraftParser.LenContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#len}.
	 * @param ctx the parse tree
	 */
	void exitLen(FunctionCraftParser.LenContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#appendStr}.
	 * @param ctx the parse tree
	 */
	void enterAppendStr(FunctionCraftParser.AppendStrContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#appendStr}.
	 * @param ctx the parse tree
	 */
	void exitAppendStr(FunctionCraftParser.AppendStrContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#strExpr}.
	 * @param ctx the parse tree
	 */
	void enterStrExpr(FunctionCraftParser.StrExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#strExpr}.
	 * @param ctx the parse tree
	 */
	void exitStrExpr(FunctionCraftParser.StrExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#assignmentExpr}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpr(FunctionCraftParser.AssignmentExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#assignmentExpr}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpr(FunctionCraftParser.AssignmentExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#appendExpr}.
	 * @param ctx the parse tree
	 */
	void enterAppendExpr(FunctionCraftParser.AppendExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#appendExpr}.
	 * @param ctx the parse tree
	 */
	void exitAppendExpr(FunctionCraftParser.AppendExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#appendExprTail}.
	 * @param ctx the parse tree
	 */
	void enterAppendExprTail(FunctionCraftParser.AppendExprTailContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#appendExprTail}.
	 * @param ctx the parse tree
	 */
	void exitAppendExprTail(FunctionCraftParser.AppendExprTailContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#logicExpr}.
	 * @param ctx the parse tree
	 */
	void enterLogicExpr(FunctionCraftParser.LogicExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#logicExpr}.
	 * @param ctx the parse tree
	 */
	void exitLogicExpr(FunctionCraftParser.LogicExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#logicExpr2}.
	 * @param ctx the parse tree
	 */
	void enterLogicExpr2(FunctionCraftParser.LogicExpr2Context ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#logicExpr2}.
	 * @param ctx the parse tree
	 */
	void exitLogicExpr2(FunctionCraftParser.LogicExpr2Context ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#singleLogic}.
	 * @param ctx the parse tree
	 */
	void enterSingleLogic(FunctionCraftParser.SingleLogicContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#singleLogic}.
	 * @param ctx the parse tree
	 */
	void exitSingleLogic(FunctionCraftParser.SingleLogicContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#parLogic}.
	 * @param ctx the parse tree
	 */
	void enterParLogic(FunctionCraftParser.ParLogicContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#parLogic}.
	 * @param ctx the parse tree
	 */
	void exitParLogic(FunctionCraftParser.ParLogicContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#eqCompExpr}.
	 * @param ctx the parse tree
	 */
	void enterEqCompExpr(FunctionCraftParser.EqCompExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#eqCompExpr}.
	 * @param ctx the parse tree
	 */
	void exitEqCompExpr(FunctionCraftParser.EqCompExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#eqCompExprTail}.
	 * @param ctx the parse tree
	 */
	void enterEqCompExprTail(FunctionCraftParser.EqCompExprTailContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#eqCompExprTail}.
	 * @param ctx the parse tree
	 */
	void exitEqCompExprTail(FunctionCraftParser.EqCompExprTailContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#compExpr}.
	 * @param ctx the parse tree
	 */
	void enterCompExpr(FunctionCraftParser.CompExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#compExpr}.
	 * @param ctx the parse tree
	 */
	void exitCompExpr(FunctionCraftParser.CompExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#compExprTail}.
	 * @param ctx the parse tree
	 */
	void enterCompExprTail(FunctionCraftParser.CompExprTailContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#compExprTail}.
	 * @param ctx the parse tree
	 */
	void exitCompExprTail(FunctionCraftParser.CompExprTailContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#mathExpr}.
	 * @param ctx the parse tree
	 */
	void enterMathExpr(FunctionCraftParser.MathExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#mathExpr}.
	 * @param ctx the parse tree
	 */
	void exitMathExpr(FunctionCraftParser.MathExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#mathExprTail}.
	 * @param ctx the parse tree
	 */
	void enterMathExprTail(FunctionCraftParser.MathExprTailContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#mathExprTail}.
	 * @param ctx the parse tree
	 */
	void exitMathExprTail(FunctionCraftParser.MathExprTailContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#addMinusExpr}.
	 * @param ctx the parse tree
	 */
	void enterAddMinusExpr(FunctionCraftParser.AddMinusExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#addMinusExpr}.
	 * @param ctx the parse tree
	 */
	void exitAddMinusExpr(FunctionCraftParser.AddMinusExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#addMinusExprTail}.
	 * @param ctx the parse tree
	 */
	void enterAddMinusExprTail(FunctionCraftParser.AddMinusExprTailContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#addMinusExprTail}.
	 * @param ctx the parse tree
	 */
	void exitAddMinusExprTail(FunctionCraftParser.AddMinusExprTailContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#preSingleMath}.
	 * @param ctx the parse tree
	 */
	void enterPreSingleMath(FunctionCraftParser.PreSingleMathContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#preSingleMath}.
	 * @param ctx the parse tree
	 */
	void exitPreSingleMath(FunctionCraftParser.PreSingleMathContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#postSingleMath}.
	 * @param ctx the parse tree
	 */
	void enterPostSingleMath(FunctionCraftParser.PostSingleMathContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#postSingleMath}.
	 * @param ctx the parse tree
	 */
	void exitPostSingleMath(FunctionCraftParser.PostSingleMathContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#itemAcces}.
	 * @param ctx the parse tree
	 */
	void enterItemAcces(FunctionCraftParser.ItemAccesContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#itemAcces}.
	 * @param ctx the parse tree
	 */
	void exitItemAcces(FunctionCraftParser.ItemAccesContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(FunctionCraftParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(FunctionCraftParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#val}.
	 * @param ctx the parse tree
	 */
	void enterVal(FunctionCraftParser.ValContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#val}.
	 * @param ctx the parse tree
	 */
	void exitVal(FunctionCraftParser.ValContext ctx);
	/**
	 * Enter a parse tree produced by {@link FunctionCraftParser#booolVal}.
	 * @param ctx the parse tree
	 */
	void enterBooolVal(FunctionCraftParser.BooolValContext ctx);
	/**
	 * Exit a parse tree produced by {@link FunctionCraftParser#booolVal}.
	 * @param ctx the parse tree
	 */
	void exitBooolVal(FunctionCraftParser.BooolValContext ctx);
}