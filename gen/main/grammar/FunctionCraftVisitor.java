// Generated from D:/UNI/Term6/PLC/CAs/ArianVersion/src/main/grammar/FunctionCraft.g4 by ANTLR 4.13.1
package main.grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FunctionCraftParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FunctionCraftVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(FunctionCraftParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(FunctionCraftParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(FunctionCraftParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#bodyFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBodyFunction(FunctionCraftParser.BodyFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(FunctionCraftParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#argInside}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgInside(FunctionCraftParser.ArgInsideContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(FunctionCraftParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#paramInside}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamInside(FunctionCraftParser.ParamInsideContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#paramAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamAssignment(FunctionCraftParser.ParamAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(FunctionCraftParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#lambdaFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaFunction(FunctionCraftParser.LambdaFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#returnInside}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnInside(FunctionCraftParser.ReturnInsideContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#functionReturn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionReturn(FunctionCraftParser.FunctionReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(FunctionCraftParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#labdaCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabdaCall(FunctionCraftParser.LabdaCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#loopLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopLoop(FunctionCraftParser.LoopLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#bodyLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBodyLoop(FunctionCraftParser.BodyLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#ifLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfLoop(FunctionCraftParser.IfLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#elifLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElifLoop(FunctionCraftParser.ElifLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#elseLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseLoop(FunctionCraftParser.ElseLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#forLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoop(FunctionCraftParser.ForLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#forList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForList(FunctionCraftParser.ForListContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#forRange}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForRange(FunctionCraftParser.ForRangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#argumentsCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentsCall(FunctionCraftParser.ArgumentsCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#appendArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAppendArgument(FunctionCraftParser.AppendArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(FunctionCraftParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#elif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElif(FunctionCraftParser.ElifContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse(FunctionCraftParser.ElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#afterIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAfterIf(FunctionCraftParser.AfterIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#ifInside}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfInside(FunctionCraftParser.IfInsideContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#nextIF}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNextIF(FunctionCraftParser.NextIFContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#breakIF}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakIF(FunctionCraftParser.BreakIFContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#listVal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListVal(FunctionCraftParser.ListValContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#listInside}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListInside(FunctionCraftParser.ListInsideContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern(FunctionCraftParser.PatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#patternCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPatternCall(FunctionCraftParser.PatternCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#patternInside}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPatternInside(FunctionCraftParser.PatternInsideContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#builtInsideFuns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuiltInsideFuns(FunctionCraftParser.BuiltInsideFunsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#putPush}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPutPush(FunctionCraftParser.PutPushContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#chopChomp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChopChomp(FunctionCraftParser.ChopChompContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#len}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLen(FunctionCraftParser.LenContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#appendStr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAppendStr(FunctionCraftParser.AppendStrContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#strExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrExpr(FunctionCraftParser.StrExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#assignmentExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpr(FunctionCraftParser.AssignmentExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#appendExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAppendExpr(FunctionCraftParser.AppendExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#appendExprTail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAppendExprTail(FunctionCraftParser.AppendExprTailContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#logicExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicExpr(FunctionCraftParser.LogicExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#logicExpr2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicExpr2(FunctionCraftParser.LogicExpr2Context ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#singleLogic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleLogic(FunctionCraftParser.SingleLogicContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#parLogic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParLogic(FunctionCraftParser.ParLogicContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#eqCompExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqCompExpr(FunctionCraftParser.EqCompExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#eqCompExprTail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqCompExprTail(FunctionCraftParser.EqCompExprTailContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#compExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompExpr(FunctionCraftParser.CompExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#compExprTail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompExprTail(FunctionCraftParser.CompExprTailContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#mathExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathExpr(FunctionCraftParser.MathExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#mathExprTail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathExprTail(FunctionCraftParser.MathExprTailContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#addMinusExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddMinusExpr(FunctionCraftParser.AddMinusExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#addMinusExprTail}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddMinusExprTail(FunctionCraftParser.AddMinusExprTailContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#preSingleMath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreSingleMath(FunctionCraftParser.PreSingleMathContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#postSingleMath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostSingleMath(FunctionCraftParser.PostSingleMathContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#itemAcces}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItemAcces(FunctionCraftParser.ItemAccesContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(FunctionCraftParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVal(FunctionCraftParser.ValContext ctx);
	/**
	 * Visit a parse tree produced by {@link FunctionCraftParser#booolVal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooolVal(FunctionCraftParser.BooolValContext ctx);
}