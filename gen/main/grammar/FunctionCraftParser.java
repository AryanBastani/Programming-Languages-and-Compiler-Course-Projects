// Generated from D:/UNI/Term6/PLC/CAs/ArianVersion/src/main/grammar/FunctionCraft.g4 by ANTLR 4.13.1
package main.grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class FunctionCraftParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MAIN=1, PRINT=2, FUN_STARTER=3, ENDER=4, RETURN=5, IF=6, ELSE=7, ELSEIF=8, 
		TRUE=9, FALSE=10, CHOP=11, CHOMP=12, PUSH=13, METHOD=14, LEN=15, PATTERN_SIGN=16, 
		MATCH=17, LOOP_CONTINUE=18, BREAK=19, LOOP=20, DO=21, FOR=22, IN=23, INDENTIFIER=24, 
		INT=25, FLOAT=26, STRING=27, BOOL=28, LIST=29, FUN_POINTER=30, INT_VAL=31, 
		FLOAT_VAL=32, STRING_VAL=33, FUN_POINTER_VAL=34, LPAR=35, RPAR=36, DOT=37, 
		APPEND_SIGN=38, GEQ=39, LEQ=40, GTR=41, LES=42, EQL=43, NEQ=44, ASSIGN=45, 
		ADD_ASSIGN=46, MINUS_ASSIGN=47, MULT_ASSIGN=48, DIV_ASSGIN=49, MOD_ASSIGN=50, 
		INC=51, DEC=52, PLUS=53, MINUS=54, MULT=55, DIV=56, MOD=57, AND=58, OR=59, 
		LOG_AND=60, LOG_OR=61, NOT=62, LBRACKET=63, RBRACKET=64, LBRACE=65, RBRACE=66, 
		COMMA=67, COLON=68, SEMICOLON=69, LAMBDA_STARTER=70, ONE_COMMENT=71, MULTI_COMMENT=72, 
		TAB=73, WS=74, BOOL_VAL=75;
	public static final int
		RULE_program = 0, RULE_main = 1, RULE_function = 2, RULE_bodyFunction = 3, 
		RULE_arguments = 4, RULE_argInside = 5, RULE_parameter = 6, RULE_paramInside = 7, 
		RULE_paramAssignment = 8, RULE_statement = 9, RULE_lambdaFunction = 10, 
		RULE_returnInside = 11, RULE_functionReturn = 12, RULE_functionCall = 13, 
		RULE_labdaCall = 14, RULE_loopLoop = 15, RULE_bodyLoop = 16, RULE_ifLoop = 17, 
		RULE_elifLoop = 18, RULE_elseLoop = 19, RULE_forLoop = 20, RULE_forList = 21, 
		RULE_forRange = 22, RULE_argumentsCall = 23, RULE_appendArgument = 24, 
		RULE_if = 25, RULE_elif = 26, RULE_else = 27, RULE_afterIf = 28, RULE_ifInside = 29, 
		RULE_nextIF = 30, RULE_breakIF = 31, RULE_listVal = 32, RULE_listInside = 33, 
		RULE_pattern = 34, RULE_patternCall = 35, RULE_patternInside = 36, RULE_builtInsideFuns = 37, 
		RULE_putPush = 38, RULE_chopChomp = 39, RULE_len = 40, RULE_appendStr = 41, 
		RULE_strExpr = 42, RULE_assignmentExpr = 43, RULE_appendExpr = 44, RULE_appendExprTail = 45, 
		RULE_logicExpr = 46, RULE_logicExpr2 = 47, RULE_singleLogic = 48, RULE_parLogic = 49, 
		RULE_eqCompExpr = 50, RULE_eqCompExprTail = 51, RULE_compExpr = 52, RULE_compExprTail = 53, 
		RULE_mathExpr = 54, RULE_mathExprTail = 55, RULE_addMinusExpr = 56, RULE_addMinusExprTail = 57, 
		RULE_preSingleMath = 58, RULE_postSingleMath = 59, RULE_itemAcces = 60, 
		RULE_type = 61, RULE_val = 62, RULE_booolVal = 63;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "main", "function", "bodyFunction", "arguments", "argInside", 
			"parameter", "paramInside", "paramAssignment", "statement", "lambdaFunction", 
			"returnInside", "functionReturn", "functionCall", "labdaCall", "loopLoop", 
			"bodyLoop", "ifLoop", "elifLoop", "elseLoop", "forLoop", "forList", "forRange", 
			"argumentsCall", "appendArgument", "if", "elif", "else", "afterIf", "ifInside", 
			"nextIF", "breakIF", "listVal", "listInside", "pattern", "patternCall", 
			"patternInside", "builtInsideFuns", "putPush", "chopChomp", "len", "appendStr", 
			"strExpr", "assignmentExpr", "appendExpr", "appendExprTail", "logicExpr", 
			"logicExpr2", "singleLogic", "parLogic", "eqCompExpr", "eqCompExprTail", 
			"compExpr", "compExprTail", "mathExpr", "mathExprTail", "addMinusExpr", 
			"addMinusExprTail", "preSingleMath", "postSingleMath", "itemAcces", "type", 
			"val", "booolVal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'main'", "'puts'", "'def'", "'end'", "'return'", "'if'", "'else'", 
			"'elseif'", "'true'", "'false'", "'chop'", "'chomp'", "'push'", "'method'", 
			"'len'", "'pattern'", "'match'", "'next'", "'break'", "'loop'", "'do'", 
			"'for'", "'in'", null, "'int'", "'float'", "'string'", "'bool'", "'list'", 
			"'fptr'", null, null, null, null, "'('", "')'", "'.'", "'<<'", "'>='", 
			"'<='", "'>'", "'<'", "'=='", "'!='", "'='", "'+='", "'-='", "'*='", 
			"'/='", "'%='", "'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'%'", "'&'", 
			"'|'", "'&&'", "'||'", "'!'", "'['", "']'", "'{'", "'}'", "','", "':'", 
			"';'", "'->'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MAIN", "PRINT", "FUN_STARTER", "ENDER", "RETURN", "IF", "ELSE", 
			"ELSEIF", "TRUE", "FALSE", "CHOP", "CHOMP", "PUSH", "METHOD", "LEN", 
			"PATTERN_SIGN", "MATCH", "LOOP_CONTINUE", "BREAK", "LOOP", "DO", "FOR", 
			"IN", "INDENTIFIER", "INT", "FLOAT", "STRING", "BOOL", "LIST", "FUN_POINTER", 
			"INT_VAL", "FLOAT_VAL", "STRING_VAL", "FUN_POINTER_VAL", "LPAR", "RPAR", 
			"DOT", "APPEND_SIGN", "GEQ", "LEQ", "GTR", "LES", "EQL", "NEQ", "ASSIGN", 
			"ADD_ASSIGN", "MINUS_ASSIGN", "MULT_ASSIGN", "DIV_ASSGIN", "MOD_ASSIGN", 
			"INC", "DEC", "PLUS", "MINUS", "MULT", "DIV", "MOD", "AND", "OR", "LOG_AND", 
			"LOG_OR", "NOT", "LBRACKET", "RBRACKET", "LBRACE", "RBRACE", "COMMA", 
			"COLON", "SEMICOLON", "LAMBDA_STARTER", "ONE_COMMENT", "MULTI_COMMENT", 
			"TAB", "WS", "BOOL_VAL"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "FunctionCraft.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FunctionCraftParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public List<PatternContext> pattern() {
			return getRuleContexts(PatternContext.class);
		}
		public PatternContext pattern(int i) {
			return getRuleContext(PatternContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(130);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case FUN_STARTER:
						{
						setState(128);
						function();
						}
						break;
					case PATTERN_SIGN:
						{
						setState(129);
						pattern();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(134);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(135);
			main();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MainContext extends ParserRuleContext {
		public TerminalNode FUN_STARTER() { return getToken(FunctionCraftParser.FUN_STARTER, 0); }
		public TerminalNode MAIN() { return getToken(FunctionCraftParser.MAIN, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public BodyFunctionContext bodyFunction() {
			return getRuleContext(BodyFunctionContext.class,0);
		}
		public TerminalNode ENDER() { return getToken(FunctionCraftParser.ENDER, 0); }
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			System.out.println("MAIN");
			setState(138);
			match(FUN_STARTER);
			setState(139);
			match(MAIN);
			setState(140);
			match(LPAR);
			setState(141);
			match(RPAR);
			setState(142);
			bodyFunction();
			setState(143);
			match(ENDER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionContext extends ParserRuleContext {
		public Token name;
		public TerminalNode FUN_STARTER() { return getToken(FunctionCraftParser.FUN_STARTER, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public BodyFunctionContext bodyFunction() {
			return getRuleContext(BodyFunctionContext.class,0);
		}
		public TerminalNode ENDER() { return getToken(FunctionCraftParser.ENDER, 0); }
		public TerminalNode INDENTIFIER() { return getToken(FunctionCraftParser.INDENTIFIER, 0); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(FUN_STARTER);
			setState(146);
			((FunctionContext)_localctx).name = match(INDENTIFIER);
			System.out.println("FuncDec: " + (((FunctionContext)_localctx).name!=null?((FunctionContext)_localctx).name.getText():null));
			setState(148);
			arguments();
			setState(149);
			bodyFunction();
			setState(150);
			match(ENDER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BodyFunctionContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BodyFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bodyFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterBodyFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitBodyFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitBodyFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyFunctionContext bodyFunction() throws RecognitionException {
		BodyFunctionContext _localctx = new BodyFunctionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_bodyFunction);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(152);
					statement();
					}
					} 
				}
				setState(157);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentsContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public ArgInsideContext argInside() {
			return getRuleContext(ArgInsideContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_arguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(LPAR);
			setState(159);
			argInside();
			setState(160);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgInsideContext extends ParserRuleContext {
		public TerminalNode INDENTIFIER() { return getToken(FunctionCraftParser.INDENTIFIER, 0); }
		public TerminalNode COMMA() { return getToken(FunctionCraftParser.COMMA, 0); }
		public ArgInsideContext argInside() {
			return getRuleContext(ArgInsideContext.class,0);
		}
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public ArgInsideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argInside; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterArgInside(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitArgInside(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitArgInside(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgInsideContext argInside() throws RecognitionException {
		ArgInsideContext _localctx = new ArgInsideContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_argInside);
		try {
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				match(INDENTIFIER);
				setState(163);
				match(COMMA);
				setState(164);
				argInside();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				parameter();
				setState(166);
				match(COMMA);
				setState(167);
				argInside();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(169);
				match(INDENTIFIER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(170);
				parameter();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(FunctionCraftParser.LBRACKET, 0); }
		public ParamInsideContext paramInside() {
			return getRuleContext(ParamInsideContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(FunctionCraftParser.RBRACKET, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(LBRACKET);
			setState(174);
			paramInside();
			setState(175);
			match(RBRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParamInsideContext extends ParserRuleContext {
		public ParamAssignmentContext paramAssignment() {
			return getRuleContext(ParamAssignmentContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(FunctionCraftParser.COMMA, 0); }
		public ParamInsideContext paramInside() {
			return getRuleContext(ParamInsideContext.class,0);
		}
		public ParamInsideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramInside; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterParamInside(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitParamInside(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitParamInside(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamInsideContext paramInside() throws RecognitionException {
		ParamInsideContext _localctx = new ParamInsideContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_paramInside);
		try {
			setState(182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				paramAssignment();
				setState(178);
				match(COMMA);
				setState(179);
				paramInside();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				paramAssignment();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParamAssignmentContext extends ParserRuleContext {
		public List<AppendExprContext> appendExpr() {
			return getRuleContexts(AppendExprContext.class);
		}
		public AppendExprContext appendExpr(int i) {
			return getRuleContext(AppendExprContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(FunctionCraftParser.ASSIGN, 0); }
		public TerminalNode ADD_ASSIGN() { return getToken(FunctionCraftParser.ADD_ASSIGN, 0); }
		public TerminalNode MINUS_ASSIGN() { return getToken(FunctionCraftParser.MINUS_ASSIGN, 0); }
		public TerminalNode MULT_ASSIGN() { return getToken(FunctionCraftParser.MULT_ASSIGN, 0); }
		public TerminalNode DIV_ASSGIN() { return getToken(FunctionCraftParser.DIV_ASSGIN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(FunctionCraftParser.MOD_ASSIGN, 0); }
		public ParamAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterParamAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitParamAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitParamAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamAssignmentContext paramAssignment() throws RecognitionException {
		ParamAssignmentContext _localctx = new ParamAssignmentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_paramAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			appendExpr();
			setState(195);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGN:
				{
				setState(185);
				match(ASSIGN);
				}
				break;
			case ADD_ASSIGN:
				{
				setState(186);
				match(ADD_ASSIGN);
				System.out.println("Operator: +=");
				}
				break;
			case MINUS_ASSIGN:
				{
				setState(188);
				match(MINUS_ASSIGN);
				}
				break;
			case MULT_ASSIGN:
				{
				setState(189);
				match(MULT_ASSIGN);
				System.out.println("Operator: *=");
				}
				break;
			case DIV_ASSGIN:
				{
				setState(191);
				match(DIV_ASSGIN);
				System.out.println("Operator: /=");
				}
				break;
			case MOD_ASSIGN:
				{
				setState(193);
				match(MOD_ASSIGN);
				System.out.println("Operator: %=");
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(197);
			appendExpr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(FunctionCraftParser.SEMICOLON, 0); }
		public FunctionReturnContext functionReturn() {
			return getRuleContext(FunctionReturnContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public BuiltInsideFunsContext builtInsideFuns() {
			return getRuleContext(BuiltInsideFunsContext.class,0);
		}
		public AssignmentExprContext assignmentExpr() {
			return getRuleContext(AssignmentExprContext.class,0);
		}
		public LambdaFunctionContext lambdaFunction() {
			return getRuleContext(LambdaFunctionContext.class,0);
		}
		public LabdaCallContext labdaCall() {
			return getRuleContext(LabdaCallContext.class,0);
		}
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public AppendExprContext appendExpr() {
			return getRuleContext(AppendExprContext.class,0);
		}
		public PatternCallContext patternCall() {
			return getRuleContext(PatternCallContext.class,0);
		}
		public IfContext if_() {
			return getRuleContext(IfContext.class,0);
		}
		public ForLoopContext forLoop() {
			return getRuleContext(ForLoopContext.class,0);
		}
		public LoopLoopContext loopLoop() {
			return getRuleContext(LoopLoopContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_statement);
		try {
			setState(215);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINT:
			case RETURN:
			case TRUE:
			case FALSE:
			case CHOP:
			case CHOMP:
			case PUSH:
			case LEN:
			case PATTERN_SIGN:
			case INDENTIFIER:
			case INT_VAL:
			case FLOAT_VAL:
			case STRING_VAL:
			case FUN_POINTER_VAL:
			case LPAR:
			case APPEND_SIGN:
			case GEQ:
			case LEQ:
			case GTR:
			case LES:
			case EQL:
			case NEQ:
			case ASSIGN:
			case ADD_ASSIGN:
			case MINUS_ASSIGN:
			case MULT_ASSIGN:
			case DIV_ASSGIN:
			case MOD_ASSIGN:
			case PLUS:
			case MINUS:
			case MULT:
			case DIV:
			case MOD:
			case LOG_AND:
			case LOG_OR:
			case NOT:
			case LBRACKET:
			case SEMICOLON:
			case LAMBDA_STARTER:
			case BOOL_VAL:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(208);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(199);
					functionReturn();
					}
					break;
				case 2:
					{
					setState(200);
					functionCall();
					}
					break;
				case 3:
					{
					setState(201);
					builtInsideFuns();
					}
					break;
				case 4:
					{
					setState(202);
					assignmentExpr();
					}
					break;
				case 5:
					{
					setState(203);
					lambdaFunction();
					}
					break;
				case 6:
					{
					setState(204);
					labdaCall();
					}
					break;
				case 7:
					{
					setState(205);
					pattern();
					}
					break;
				case 8:
					{
					setState(206);
					appendExpr();
					}
					break;
				case 9:
					{
					setState(207);
					patternCall();
					}
					break;
				}
				setState(210);
				match(SEMICOLON);
				}
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				if_();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(213);
				forLoop();
				}
				break;
			case LOOP:
				enterOuterAlt(_localctx, 4);
				{
				setState(214);
				loopLoop();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LambdaFunctionContext extends ParserRuleContext {
		public TerminalNode LAMBDA_STARTER() { return getToken(FunctionCraftParser.LAMBDA_STARTER, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(FunctionCraftParser.LBRACE, 0); }
		public BodyFunctionContext bodyFunction() {
			return getRuleContext(BodyFunctionContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(FunctionCraftParser.RBRACE, 0); }
		public LambdaFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterLambdaFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitLambdaFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitLambdaFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LambdaFunctionContext lambdaFunction() throws RecognitionException {
		LambdaFunctionContext _localctx = new LambdaFunctionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_lambdaFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(LAMBDA_STARTER);
			System.out.println("Structure: LAMBDA");
			setState(219);
			arguments();
			setState(220);
			match(LBRACE);
			setState(221);
			bodyFunction();
			setState(222);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnInsideContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public AppendArgumentContext appendArgument() {
			return getRuleContext(AppendArgumentContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public ReturnInsideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnInside; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterReturnInside(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitReturnInside(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitReturnInside(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnInsideContext returnInside() throws RecognitionException {
		ReturnInsideContext _localctx = new ReturnInsideContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_returnInside);
		try {
			setState(229);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(224);
				match(LPAR);
				setState(225);
				appendArgument();
				setState(226);
				match(RPAR);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(228);
				appendArgument();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionReturnContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(FunctionCraftParser.RETURN, 0); }
		public ReturnInsideContext returnInside() {
			return getRuleContext(ReturnInsideContext.class,0);
		}
		public FunctionReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionReturn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterFunctionReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitFunctionReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitFunctionReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionReturnContext functionReturn() throws RecognitionException {
		FunctionReturnContext _localctx = new FunctionReturnContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_functionReturn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(RETURN);
			System.out.println("RETURN");
			setState(234);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(233);
				returnInside();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode INDENTIFIER() { return getToken(FunctionCraftParser.INDENTIFIER, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public ArgumentsCallContext argumentsCall() {
			return getRuleContext(ArgumentsCallContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(INDENTIFIER);
			System.out.println("Function Call");
			setState(238);
			match(LPAR);
			setState(239);
			argumentsCall();
			setState(240);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LabdaCallContext extends ParserRuleContext {
		public LambdaFunctionContext lambdaFunction() {
			return getRuleContext(LambdaFunctionContext.class,0);
		}
		public ArgumentsCallContext argumentsCall() {
			return getRuleContext(ArgumentsCallContext.class,0);
		}
		public LabdaCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labdaCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterLabdaCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitLabdaCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitLabdaCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabdaCallContext labdaCall() throws RecognitionException {
		LabdaCallContext _localctx = new LabdaCallContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_labdaCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			lambdaFunction();
			setState(243);
			argumentsCall();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LoopLoopContext extends ParserRuleContext {
		public TerminalNode LOOP() { return getToken(FunctionCraftParser.LOOP, 0); }
		public TerminalNode DO() { return getToken(FunctionCraftParser.DO, 0); }
		public BodyLoopContext bodyLoop() {
			return getRuleContext(BodyLoopContext.class,0);
		}
		public TerminalNode ENDER() { return getToken(FunctionCraftParser.ENDER, 0); }
		public LoopLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterLoopLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitLoopLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitLoopLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopLoopContext loopLoop() throws RecognitionException {
		LoopLoopContext _localctx = new LoopLoopContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_loopLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			System.out.println("Loop: DO");
			setState(246);
			match(LOOP);
			setState(247);
			match(DO);
			setState(248);
			bodyLoop();
			setState(249);
			match(ENDER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BodyLoopContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> LOOP_CONTINUE() { return getTokens(FunctionCraftParser.LOOP_CONTINUE); }
		public TerminalNode LOOP_CONTINUE(int i) {
			return getToken(FunctionCraftParser.LOOP_CONTINUE, i);
		}
		public List<TerminalNode> BREAK() { return getTokens(FunctionCraftParser.BREAK); }
		public TerminalNode BREAK(int i) {
			return getToken(FunctionCraftParser.BREAK, i);
		}
		public List<NextIFContext> nextIF() {
			return getRuleContexts(NextIFContext.class);
		}
		public NextIFContext nextIF(int i) {
			return getRuleContext(NextIFContext.class,i);
		}
		public List<BreakIFContext> breakIF() {
			return getRuleContexts(BreakIFContext.class);
		}
		public BreakIFContext breakIF(int i) {
			return getRuleContext(BreakIFContext.class,i);
		}
		public List<IfLoopContext> ifLoop() {
			return getRuleContexts(IfLoopContext.class);
		}
		public IfLoopContext ifLoop(int i) {
			return getRuleContext(IfLoopContext.class,i);
		}
		public BodyLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bodyLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterBodyLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitBodyLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitBodyLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyLoopContext bodyLoop() throws RecognitionException {
		BodyLoopContext _localctx = new BodyLoopContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_bodyLoop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -871446736179184028L) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 67L) != 0)) {
				{
				setState(263);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(251);
					statement();
					}
					break;
				case 2:
					{
					setState(252);
					match(LOOP_CONTINUE);
					System.out.println("Control: NEXT");
					}
					break;
				case 3:
					{
					setState(254);
					match(BREAK);
					System.out.println("Control: BREAK");
					}
					break;
				case 4:
					{
					setState(256);
					nextIF();
					System.out.println("Control: NEXT");
					}
					break;
				case 5:
					{
					setState(259);
					breakIF();
					System.out.println("Control: BREAK");
					}
					break;
				case 6:
					{
					setState(262);
					ifLoop();
					}
					break;
				}
				}
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfLoopContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(FunctionCraftParser.IF, 0); }
		public IfInsideContext ifInside() {
			return getRuleContext(IfInsideContext.class,0);
		}
		public TerminalNode ENDER() { return getToken(FunctionCraftParser.ENDER, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<ElifLoopContext> elifLoop() {
			return getRuleContexts(ElifLoopContext.class);
		}
		public ElifLoopContext elifLoop(int i) {
			return getRuleContext(ElifLoopContext.class,i);
		}
		public List<TerminalNode> BREAK() { return getTokens(FunctionCraftParser.BREAK); }
		public TerminalNode BREAK(int i) {
			return getToken(FunctionCraftParser.BREAK, i);
		}
		public List<TerminalNode> LOOP_CONTINUE() { return getTokens(FunctionCraftParser.LOOP_CONTINUE); }
		public TerminalNode LOOP_CONTINUE(int i) {
			return getToken(FunctionCraftParser.LOOP_CONTINUE, i);
		}
		public List<NextIFContext> nextIF() {
			return getRuleContexts(NextIFContext.class);
		}
		public NextIFContext nextIF(int i) {
			return getRuleContext(NextIFContext.class,i);
		}
		public List<BreakIFContext> breakIF() {
			return getRuleContexts(BreakIFContext.class);
		}
		public BreakIFContext breakIF(int i) {
			return getRuleContext(BreakIFContext.class,i);
		}
		public ElseLoopContext elseLoop() {
			return getRuleContext(ElseLoopContext.class,0);
		}
		public IfLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterIfLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitIfLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitIfLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfLoopContext ifLoop() throws RecognitionException {
		IfLoopContext _localctx = new IfLoopContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_ifLoop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(IF);
			System.out.println("Decision: IF");
			setState(270);
			ifInside();
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -871446736179183772L) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 67L) != 0)) {
				{
				setState(277);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(271);
					statement();
					}
					break;
				case 2:
					{
					setState(272);
					elifLoop();
					}
					break;
				case 3:
					{
					setState(273);
					match(BREAK);
					}
					break;
				case 4:
					{
					setState(274);
					match(LOOP_CONTINUE);
					}
					break;
				case 5:
					{
					setState(275);
					nextIF();
					}
					break;
				case 6:
					{
					setState(276);
					breakIF();
					}
					break;
				}
				}
				setState(281);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(282);
				elseLoop();
				}
			}

			setState(285);
			match(ENDER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElifLoopContext extends ParserRuleContext {
		public TerminalNode ELSEIF() { return getToken(FunctionCraftParser.ELSEIF, 0); }
		public IfInsideContext ifInside() {
			return getRuleContext(IfInsideContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> BREAK() { return getTokens(FunctionCraftParser.BREAK); }
		public TerminalNode BREAK(int i) {
			return getToken(FunctionCraftParser.BREAK, i);
		}
		public List<TerminalNode> LOOP_CONTINUE() { return getTokens(FunctionCraftParser.LOOP_CONTINUE); }
		public TerminalNode LOOP_CONTINUE(int i) {
			return getToken(FunctionCraftParser.LOOP_CONTINUE, i);
		}
		public List<NextIFContext> nextIF() {
			return getRuleContexts(NextIFContext.class);
		}
		public NextIFContext nextIF(int i) {
			return getRuleContext(NextIFContext.class,i);
		}
		public List<BreakIFContext> breakIF() {
			return getRuleContexts(BreakIFContext.class);
		}
		public BreakIFContext breakIF(int i) {
			return getRuleContext(BreakIFContext.class,i);
		}
		public ElifLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elifLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterElifLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitElifLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitElifLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElifLoopContext elifLoop() throws RecognitionException {
		ElifLoopContext _localctx = new ElifLoopContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_elifLoop);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(ELSEIF);
			System.out.println("Decision: ELSE IF");
			setState(289);
			ifInside();
			setState(297);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(295);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						setState(290);
						statement();
						}
						break;
					case 2:
						{
						setState(291);
						match(BREAK);
						}
						break;
					case 3:
						{
						setState(292);
						match(LOOP_CONTINUE);
						}
						break;
					case 4:
						{
						setState(293);
						nextIF();
						}
						break;
					case 5:
						{
						setState(294);
						breakIF();
						}
						break;
					}
					} 
				}
				setState(299);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElseLoopContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(FunctionCraftParser.ELSE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> BREAK() { return getTokens(FunctionCraftParser.BREAK); }
		public TerminalNode BREAK(int i) {
			return getToken(FunctionCraftParser.BREAK, i);
		}
		public List<TerminalNode> LOOP_CONTINUE() { return getTokens(FunctionCraftParser.LOOP_CONTINUE); }
		public TerminalNode LOOP_CONTINUE(int i) {
			return getToken(FunctionCraftParser.LOOP_CONTINUE, i);
		}
		public List<NextIFContext> nextIF() {
			return getRuleContexts(NextIFContext.class);
		}
		public NextIFContext nextIF(int i) {
			return getRuleContext(NextIFContext.class,i);
		}
		public List<BreakIFContext> breakIF() {
			return getRuleContexts(BreakIFContext.class);
		}
		public BreakIFContext breakIF(int i) {
			return getRuleContext(BreakIFContext.class,i);
		}
		public ElseLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterElseLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitElseLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitElseLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseLoopContext elseLoop() throws RecognitionException {
		ElseLoopContext _localctx = new ElseLoopContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_elseLoop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(ELSE);
			System.out.println("Decision: ELSE");
			setState(309);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -871446736179184028L) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 67L) != 0)) {
				{
				setState(307);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(302);
					statement();
					}
					break;
				case 2:
					{
					setState(303);
					match(BREAK);
					}
					break;
				case 3:
					{
					setState(304);
					match(LOOP_CONTINUE);
					}
					break;
				case 4:
					{
					setState(305);
					nextIF();
					}
					break;
				case 5:
					{
					setState(306);
					breakIF();
					}
					break;
				}
				}
				setState(311);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForLoopContext extends ParserRuleContext {
		public ForRangeContext forRange() {
			return getRuleContext(ForRangeContext.class,0);
		}
		public ForListContext forList() {
			return getRuleContext(ForListContext.class,0);
		}
		public ForLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterForLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitForLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitForLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForLoopContext forLoop() throws RecognitionException {
		ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_forLoop);
		try {
			setState(315);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				System.out.println("Loop: FOR");
				setState(313);
				forRange();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(314);
				forList();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForListContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(FunctionCraftParser.FOR, 0); }
		public List<TerminalNode> INDENTIFIER() { return getTokens(FunctionCraftParser.INDENTIFIER); }
		public TerminalNode INDENTIFIER(int i) {
			return getToken(FunctionCraftParser.INDENTIFIER, i);
		}
		public TerminalNode IN() { return getToken(FunctionCraftParser.IN, 0); }
		public BodyLoopContext bodyLoop() {
			return getRuleContext(BodyLoopContext.class,0);
		}
		public TerminalNode ENDER() { return getToken(FunctionCraftParser.ENDER, 0); }
		public ForListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterForList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitForList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitForList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForListContext forList() throws RecognitionException {
		ForListContext _localctx = new ForListContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_forList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(FOR);
			setState(318);
			match(INDENTIFIER);
			setState(319);
			match(IN);
			setState(320);
			match(INDENTIFIER);
			setState(321);
			bodyLoop();
			setState(322);
			match(ENDER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForRangeContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(FunctionCraftParser.FOR, 0); }
		public TerminalNode INDENTIFIER() { return getToken(FunctionCraftParser.INDENTIFIER, 0); }
		public TerminalNode IN() { return getToken(FunctionCraftParser.IN, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public List<LogicExprContext> logicExpr() {
			return getRuleContexts(LogicExprContext.class);
		}
		public LogicExprContext logicExpr(int i) {
			return getRuleContext(LogicExprContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(FunctionCraftParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(FunctionCraftParser.DOT, i);
		}
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public BodyLoopContext bodyLoop() {
			return getRuleContext(BodyLoopContext.class,0);
		}
		public TerminalNode ENDER() { return getToken(FunctionCraftParser.ENDER, 0); }
		public ForRangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forRange; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterForRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitForRange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitForRange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForRangeContext forRange() throws RecognitionException {
		ForRangeContext _localctx = new ForRangeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_forRange);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(FOR);
			setState(325);
			match(INDENTIFIER);
			setState(326);
			match(IN);
			setState(327);
			match(LPAR);
			setState(328);
			logicExpr();
			setState(329);
			match(DOT);
			setState(330);
			match(DOT);
			setState(331);
			logicExpr();
			setState(332);
			match(RPAR);
			setState(333);
			bodyLoop();
			setState(334);
			match(ENDER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentsCallContext extends ParserRuleContext {
		public AppendArgumentContext appendArgument() {
			return getRuleContext(AppendArgumentContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(FunctionCraftParser.COMMA, 0); }
		public ArgumentsCallContext argumentsCall() {
			return getRuleContext(ArgumentsCallContext.class,0);
		}
		public ArgumentsCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentsCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterArgumentsCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitArgumentsCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitArgumentsCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsCallContext argumentsCall() throws RecognitionException {
		ArgumentsCallContext _localctx = new ArgumentsCallContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_argumentsCall);
		try {
			setState(341);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(336);
				appendArgument();
				setState(337);
				match(COMMA);
				setState(338);
				argumentsCall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(340);
				appendArgument();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AppendArgumentContext extends ParserRuleContext {
		public AppendExprContext appendExpr() {
			return getRuleContext(AppendExprContext.class,0);
		}
		public ListValContext listVal() {
			return getRuleContext(ListValContext.class,0);
		}
		public AppendArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_appendArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterAppendArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitAppendArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitAppendArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AppendArgumentContext appendArgument() throws RecognitionException {
		AppendArgumentContext _localctx = new AppendArgumentContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_appendArgument);
		try {
			setState(345);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(343);
				appendExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(344);
				listVal();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(FunctionCraftParser.IF, 0); }
		public IfInsideContext ifInside() {
			return getRuleContext(IfInsideContext.class,0);
		}
		public TerminalNode ENDER() { return getToken(FunctionCraftParser.ENDER, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<ElifContext> elif() {
			return getRuleContexts(ElifContext.class);
		}
		public ElifContext elif(int i) {
			return getRuleContext(ElifContext.class,i);
		}
		public ElseContext else_() {
			return getRuleContext(ElseContext.class,0);
		}
		public IfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfContext if_() throws RecognitionException {
		IfContext _localctx = new IfContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			match(IF);
			System.out.println("Decision: IF");
			setState(349);
			ifInside();
			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -871446736179970204L) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 67L) != 0)) {
				{
				setState(352);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PRINT:
				case RETURN:
				case IF:
				case TRUE:
				case FALSE:
				case CHOP:
				case CHOMP:
				case PUSH:
				case LEN:
				case PATTERN_SIGN:
				case LOOP:
				case FOR:
				case INDENTIFIER:
				case INT_VAL:
				case FLOAT_VAL:
				case STRING_VAL:
				case FUN_POINTER_VAL:
				case LPAR:
				case APPEND_SIGN:
				case GEQ:
				case LEQ:
				case GTR:
				case LES:
				case EQL:
				case NEQ:
				case ASSIGN:
				case ADD_ASSIGN:
				case MINUS_ASSIGN:
				case MULT_ASSIGN:
				case DIV_ASSGIN:
				case MOD_ASSIGN:
				case PLUS:
				case MINUS:
				case MULT:
				case DIV:
				case MOD:
				case LOG_AND:
				case LOG_OR:
				case NOT:
				case LBRACKET:
				case SEMICOLON:
				case LAMBDA_STARTER:
				case BOOL_VAL:
					{
					setState(350);
					statement();
					}
					break;
				case ELSEIF:
					{
					setState(351);
					elif();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(356);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(357);
				else_();
				}
			}

			setState(360);
			match(ENDER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElifContext extends ParserRuleContext {
		public TerminalNode ELSEIF() { return getToken(FunctionCraftParser.ELSEIF, 0); }
		public IfInsideContext ifInside() {
			return getRuleContext(IfInsideContext.class,0);
		}
		public BodyFunctionContext bodyFunction() {
			return getRuleContext(BodyFunctionContext.class,0);
		}
		public ElifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterElif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitElif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitElif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElifContext elif() throws RecognitionException {
		ElifContext _localctx = new ElifContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_elif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			match(ELSEIF);
			System.out.println("Decision: ELSE IF");
			setState(364);
			ifInside();
			setState(365);
			bodyFunction();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElseContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(FunctionCraftParser.ELSE, 0); }
		public BodyFunctionContext bodyFunction() {
			return getRuleContext(BodyFunctionContext.class,0);
		}
		public ElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseContext else_() throws RecognitionException {
		ElseContext _localctx = new ElseContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_else);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			match(ELSE);
			System.out.println("Decision: ELSE");
			setState(369);
			bodyFunction();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AfterIfContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(FunctionCraftParser.IF, 0); }
		public IfInsideContext ifInside() {
			return getRuleContext(IfInsideContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(FunctionCraftParser.SEMICOLON, 0); }
		public AfterIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_afterIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterAfterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitAfterIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitAfterIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AfterIfContext afterIf() throws RecognitionException {
		AfterIfContext _localctx = new AfterIfContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_afterIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			match(IF);
			setState(372);
			ifInside();
			setState(373);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfInsideContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public LogicExprContext logicExpr() {
			return getRuleContext(LogicExprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public IfInsideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifInside; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterIfInside(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitIfInside(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitIfInside(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfInsideContext ifInside() throws RecognitionException {
		IfInsideContext _localctx = new IfInsideContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_ifInside);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			match(LPAR);
			setState(376);
			logicExpr();
			setState(377);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NextIFContext extends ParserRuleContext {
		public TerminalNode LOOP_CONTINUE() { return getToken(FunctionCraftParser.LOOP_CONTINUE, 0); }
		public AfterIfContext afterIf() {
			return getRuleContext(AfterIfContext.class,0);
		}
		public NextIFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nextIF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterNextIF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitNextIF(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitNextIF(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NextIFContext nextIF() throws RecognitionException {
		NextIFContext _localctx = new NextIFContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_nextIF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			match(LOOP_CONTINUE);
			setState(380);
			afterIf();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BreakIFContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(FunctionCraftParser.BREAK, 0); }
		public AfterIfContext afterIf() {
			return getRuleContext(AfterIfContext.class,0);
		}
		public BreakIFContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakIF; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterBreakIF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitBreakIF(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitBreakIF(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakIFContext breakIF() throws RecognitionException {
		BreakIFContext _localctx = new BreakIFContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_breakIF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			match(BREAK);
			setState(383);
			afterIf();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListValContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(FunctionCraftParser.LBRACKET, 0); }
		public ListInsideContext listInside() {
			return getRuleContext(ListInsideContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(FunctionCraftParser.RBRACKET, 0); }
		public ListValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listVal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterListVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitListVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitListVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListValContext listVal() throws RecognitionException {
		ListValContext _localctx = new ListValContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_listVal);
		try {
			setState(390);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACKET:
				enterOuterAlt(_localctx, 1);
				{
				setState(385);
				match(LBRACKET);
				setState(386);
				listInside();
				setState(387);
				match(RBRACKET);
				}
				break;
			case RPAR:
			case DOT:
			case APPEND_SIGN:
			case GEQ:
			case LEQ:
			case GTR:
			case LES:
			case EQL:
			case NEQ:
			case ASSIGN:
			case ADD_ASSIGN:
			case MINUS_ASSIGN:
			case MULT_ASSIGN:
			case DIV_ASSGIN:
			case MOD_ASSIGN:
			case PLUS:
			case MINUS:
			case MULT:
			case DIV:
			case MOD:
			case LOG_AND:
			case LOG_OR:
			case RBRACKET:
			case COMMA:
			case SEMICOLON:
			case TAB:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListInsideContext extends ParserRuleContext {
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(FunctionCraftParser.COMMA, 0); }
		public ListInsideContext listInside() {
			return getRuleContext(ListInsideContext.class,0);
		}
		public ListInsideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listInside; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterListInside(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitListInside(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitListInside(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListInsideContext listInside() throws RecognitionException {
		ListInsideContext _localctx = new ListInsideContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_listInside);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			val();
			setState(395);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(393);
				match(COMMA);
				setState(394);
				listInside();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PatternContext extends ParserRuleContext {
		public Token name;
		public TerminalNode PATTERN_SIGN() { return getToken(FunctionCraftParser.PATTERN_SIGN, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public PatternInsideContext patternInside() {
			return getRuleContext(PatternInsideContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(FunctionCraftParser.SEMICOLON, 0); }
		public TerminalNode INDENTIFIER() { return getToken(FunctionCraftParser.INDENTIFIER, 0); }
		public PatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternContext pattern() throws RecognitionException {
		PatternContext _localctx = new PatternContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			match(PATTERN_SIGN);
			setState(398);
			((PatternContext)_localctx).name = match(INDENTIFIER);
			System.out.println("PatternDec: " + (((PatternContext)_localctx).name!=null?((PatternContext)_localctx).name.getText():null));
			setState(400);
			arguments();
			setState(401);
			patternInside();
			setState(402);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PatternCallContext extends ParserRuleContext {
		public TerminalNode INDENTIFIER() { return getToken(FunctionCraftParser.INDENTIFIER, 0); }
		public TerminalNode DOT() { return getToken(FunctionCraftParser.DOT, 0); }
		public TerminalNode MATCH() { return getToken(FunctionCraftParser.MATCH, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public ArgumentsCallContext argumentsCall() {
			return getRuleContext(ArgumentsCallContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public PatternCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patternCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterPatternCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitPatternCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitPatternCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternCallContext patternCall() throws RecognitionException {
		PatternCallContext _localctx = new PatternCallContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_patternCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			match(INDENTIFIER);
			System.out.println("Built-In: MATCH");
			setState(406);
			match(DOT);
			setState(407);
			match(MATCH);
			setState(408);
			match(LPAR);
			setState(409);
			argumentsCall();
			setState(410);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PatternInsideContext extends ParserRuleContext {
		public List<TerminalNode> TAB() { return getTokens(FunctionCraftParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(FunctionCraftParser.TAB, i);
		}
		public List<ParamAssignmentContext> paramAssignment() {
			return getRuleContexts(ParamAssignmentContext.class);
		}
		public ParamAssignmentContext paramAssignment(int i) {
			return getRuleContext(ParamAssignmentContext.class,i);
		}
		public PatternInsideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patternInside; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterPatternInside(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitPatternInside(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitPatternInside(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternInsideContext patternInside() throws RecognitionException {
		PatternInsideContext _localctx = new PatternInsideContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_patternInside);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TAB) {
				{
				{
				setState(412);
				match(TAB);
				setState(413);
				paramAssignment();
				}
				}
				setState(418);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BuiltInsideFunsContext extends ParserRuleContext {
		public PutPushContext putPush() {
			return getRuleContext(PutPushContext.class,0);
		}
		public ChopChompContext chopChomp() {
			return getRuleContext(ChopChompContext.class,0);
		}
		public LenContext len() {
			return getRuleContext(LenContext.class,0);
		}
		public BuiltInsideFunsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_builtInsideFuns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterBuiltInsideFuns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitBuiltInsideFuns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitBuiltInsideFuns(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BuiltInsideFunsContext builtInsideFuns() throws RecognitionException {
		BuiltInsideFunsContext _localctx = new BuiltInsideFunsContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_builtInsideFuns);
		try {
			setState(422);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINT:
			case PUSH:
				enterOuterAlt(_localctx, 1);
				{
				setState(419);
				putPush();
				}
				break;
			case CHOP:
			case CHOMP:
				enterOuterAlt(_localctx, 2);
				{
				setState(420);
				chopChomp();
				}
				break;
			case LEN:
				enterOuterAlt(_localctx, 3);
				{
				setState(421);
				len();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PutPushContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public AppendExprContext appendExpr() {
			return getRuleContext(AppendExprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public TerminalNode PRINT() { return getToken(FunctionCraftParser.PRINT, 0); }
		public TerminalNode PUSH() { return getToken(FunctionCraftParser.PUSH, 0); }
		public PutPushContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_putPush; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterPutPush(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitPutPush(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitPutPush(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PutPushContext putPush() throws RecognitionException {
		PutPushContext _localctx = new PutPushContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_putPush);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINT:
				{
				setState(424);
				match(PRINT);
				System.out.println("Built-In: PUTS");
				}
				break;
			case PUSH:
				{
				setState(426);
				match(PUSH);
				System.out.println("Built-In: PUSH");
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(430);
			match(LPAR);
			setState(431);
			appendExpr();
			setState(432);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ChopChompContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public AppendExprContext appendExpr() {
			return getRuleContext(AppendExprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public TerminalNode CHOP() { return getToken(FunctionCraftParser.CHOP, 0); }
		public TerminalNode CHOMP() { return getToken(FunctionCraftParser.CHOMP, 0); }
		public ChopChompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chopChomp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterChopChomp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitChopChomp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitChopChomp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChopChompContext chopChomp() throws RecognitionException {
		ChopChompContext _localctx = new ChopChompContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_chopChomp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHOP:
				{
				setState(434);
				match(CHOP);
				System.out.println("Built-In: CHOP");
				}
				break;
			case CHOMP:
				{
				setState(436);
				match(CHOMP);
				System.out.println("Built-In: CHOMP");
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(440);
			match(LPAR);
			setState(441);
			appendExpr();
			setState(442);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LenContext extends ParserRuleContext {
		public TerminalNode LEN() { return getToken(FunctionCraftParser.LEN, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public AppendExprContext appendExpr() {
			return getRuleContext(AppendExprContext.class,0);
		}
		public StrExprContext strExpr() {
			return getRuleContext(StrExprContext.class,0);
		}
		public LenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_len; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterLen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitLen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitLen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LenContext len() throws RecognitionException {
		LenContext _localctx = new LenContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_len);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			match(LEN);
			System.out.println("Built-In: LEN");
			setState(446);
			match(LPAR);
			setState(449);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(447);
				appendExpr();
				}
				break;
			case 2:
				{
				setState(448);
				strExpr();
				}
				break;
			}
			setState(451);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AppendStrContext extends ParserRuleContext {
		public TerminalNode APPEND_SIGN() { return getToken(FunctionCraftParser.APPEND_SIGN, 0); }
		public AppendStrContext appendStr() {
			return getRuleContext(AppendStrContext.class,0);
		}
		public TerminalNode INDENTIFIER() { return getToken(FunctionCraftParser.INDENTIFIER, 0); }
		public TerminalNode STRING_VAL() { return getToken(FunctionCraftParser.STRING_VAL, 0); }
		public AppendStrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_appendStr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterAppendStr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitAppendStr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitAppendStr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AppendStrContext appendStr() throws RecognitionException {
		AppendStrContext _localctx = new AppendStrContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_appendStr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			match(APPEND_SIGN);
			System.out.println("Operator: <<");
			setState(458);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case APPEND_SIGN:
				{
				setState(455);
				appendStr();
				}
				break;
			case INDENTIFIER:
				{
				setState(456);
				match(INDENTIFIER);
				}
				break;
			case STRING_VAL:
				{
				setState(457);
				match(STRING_VAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StrExprContext extends ParserRuleContext {
		public TerminalNode INDENTIFIER() { return getToken(FunctionCraftParser.INDENTIFIER, 0); }
		public TerminalNode STRING_VAL() { return getToken(FunctionCraftParser.STRING_VAL, 0); }
		public AppendStrContext appendStr() {
			return getRuleContext(AppendStrContext.class,0);
		}
		public StrExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterStrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitStrExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitStrExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrExprContext strExpr() throws RecognitionException {
		StrExprContext _localctx = new StrExprContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_strExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			_la = _input.LA(1);
			if ( !(_la==INDENTIFIER || _la==STRING_VAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(462);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==APPEND_SIGN) {
				{
				setState(461);
				appendStr();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentExprContext extends ParserRuleContext {
		public AppendExprContext name;
		public List<AppendExprContext> appendExpr() {
			return getRuleContexts(AppendExprContext.class);
		}
		public AppendExprContext appendExpr(int i) {
			return getRuleContext(AppendExprContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(FunctionCraftParser.ASSIGN, 0); }
		public TerminalNode ADD_ASSIGN() { return getToken(FunctionCraftParser.ADD_ASSIGN, 0); }
		public TerminalNode MINUS_ASSIGN() { return getToken(FunctionCraftParser.MINUS_ASSIGN, 0); }
		public TerminalNode MULT_ASSIGN() { return getToken(FunctionCraftParser.MULT_ASSIGN, 0); }
		public TerminalNode DIV_ASSGIN() { return getToken(FunctionCraftParser.DIV_ASSGIN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(FunctionCraftParser.MOD_ASSIGN, 0); }
		public AssignmentExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterAssignmentExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitAssignmentExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitAssignmentExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentExprContext assignmentExpr() throws RecognitionException {
		AssignmentExprContext _localctx = new AssignmentExprContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_assignmentExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			((AssignmentExprContext)_localctx).name = appendExpr();
			setState(476);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGN:
				{
				setState(465);
				match(ASSIGN);
				}
				break;
			case ADD_ASSIGN:
				{
				setState(466);
				match(ADD_ASSIGN);
				System.out.println("Operator: +=");
				}
				break;
			case MINUS_ASSIGN:
				{
				setState(468);
				match(MINUS_ASSIGN);
				System.out.println("Operator: -=");
				}
				break;
			case MULT_ASSIGN:
				{
				setState(470);
				match(MULT_ASSIGN);
				System.out.println("Operator: *=");
				}
				break;
			case DIV_ASSGIN:
				{
				setState(472);
				match(DIV_ASSGIN);
				System.out.println("Operator: /=");
				}
				break;
			case MOD_ASSIGN:
				{
				setState(474);
				match(MOD_ASSIGN);
				System.out.println("Operator: %=");
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(478);
			appendExpr();
			System.out.println("Assignment: " + (((AssignmentExprContext)_localctx).name!=null?_input.getText(((AssignmentExprContext)_localctx).name.start,((AssignmentExprContext)_localctx).name.stop):null));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AppendExprContext extends ParserRuleContext {
		public LogicExprContext logicExpr() {
			return getRuleContext(LogicExprContext.class,0);
		}
		public AppendExprTailContext appendExprTail() {
			return getRuleContext(AppendExprTailContext.class,0);
		}
		public AppendExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_appendExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterAppendExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitAppendExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitAppendExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AppendExprContext appendExpr() throws RecognitionException {
		AppendExprContext _localctx = new AppendExprContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_appendExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			logicExpr();
			setState(482);
			appendExprTail();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AppendExprTailContext extends ParserRuleContext {
		public TerminalNode APPEND_SIGN() { return getToken(FunctionCraftParser.APPEND_SIGN, 0); }
		public LogicExprContext logicExpr() {
			return getRuleContext(LogicExprContext.class,0);
		}
		public AppendExprTailContext appendExprTail() {
			return getRuleContext(AppendExprTailContext.class,0);
		}
		public AppendExprTailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_appendExprTail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterAppendExprTail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitAppendExprTail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitAppendExprTail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AppendExprTailContext appendExprTail() throws RecognitionException {
		AppendExprTailContext _localctx = new AppendExprTailContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_appendExprTail);
		try {
			setState(490);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case APPEND_SIGN:
				enterOuterAlt(_localctx, 1);
				{
				setState(484);
				match(APPEND_SIGN);
				setState(485);
				logicExpr();
				System.out.println("Operator: <<");
				setState(487);
				appendExprTail();
				}
				break;
			case RPAR:
			case ASSIGN:
			case ADD_ASSIGN:
			case MINUS_ASSIGN:
			case MULT_ASSIGN:
			case DIV_ASSGIN:
			case MOD_ASSIGN:
			case RBRACKET:
			case COMMA:
			case SEMICOLON:
			case TAB:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LogicExprContext extends ParserRuleContext {
		public List<LogicExpr2Context> logicExpr2() {
			return getRuleContexts(LogicExpr2Context.class);
		}
		public LogicExpr2Context logicExpr2(int i) {
			return getRuleContext(LogicExpr2Context.class,i);
		}
		public TerminalNode LOG_AND() { return getToken(FunctionCraftParser.LOG_AND, 0); }
		public TerminalNode LOG_OR() { return getToken(FunctionCraftParser.LOG_OR, 0); }
		public SingleLogicContext singleLogic() {
			return getRuleContext(SingleLogicContext.class,0);
		}
		public LogicExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterLogicExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitLogicExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitLogicExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicExprContext logicExpr() throws RecognitionException {
		LogicExprContext _localctx = new LogicExprContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_logicExpr);
		try {
			setState(502);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(492);
				logicExpr2();
				setState(497);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LOG_AND:
					{
					setState(493);
					match(LOG_AND);
					System.out.println("Operator: &&");
					}
					break;
				case LOG_OR:
					{
					setState(495);
					match(LOG_OR);
					System.out.println("Operator: ||");
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(499);
				logicExpr2();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(501);
				singleLogic();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LogicExpr2Context extends ParserRuleContext {
		public List<ParLogicContext> parLogic() {
			return getRuleContexts(ParLogicContext.class);
		}
		public ParLogicContext parLogic(int i) {
			return getRuleContext(ParLogicContext.class,i);
		}
		public TerminalNode LOG_AND() { return getToken(FunctionCraftParser.LOG_AND, 0); }
		public TerminalNode LOG_OR() { return getToken(FunctionCraftParser.LOG_OR, 0); }
		public SingleLogicContext singleLogic() {
			return getRuleContext(SingleLogicContext.class,0);
		}
		public LogicExpr2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicExpr2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterLogicExpr2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitLogicExpr2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitLogicExpr2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicExpr2Context logicExpr2() throws RecognitionException {
		LogicExpr2Context _localctx = new LogicExpr2Context(_ctx, getState());
		enterRule(_localctx, 94, RULE_logicExpr2);
		try {
			setState(514);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(504);
				parLogic();
				setState(509);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LOG_AND:
					{
					setState(505);
					match(LOG_AND);
					System.out.println("Operator: &&");
					}
					break;
				case LOG_OR:
					{
					setState(507);
					match(LOG_OR);
					System.out.println("Operator: ||");
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(511);
				parLogic();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(513);
				singleLogic();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SingleLogicContext extends ParserRuleContext {
		public TerminalNode INT_VAL() { return getToken(FunctionCraftParser.INT_VAL, 0); }
		public TerminalNode BOOL_VAL() { return getToken(FunctionCraftParser.BOOL_VAL, 0); }
		public TerminalNode INDENTIFIER() { return getToken(FunctionCraftParser.INDENTIFIER, 0); }
		public EqCompExprContext eqCompExpr() {
			return getRuleContext(EqCompExprContext.class,0);
		}
		public SingleLogicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleLogic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterSingleLogic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitSingleLogic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitSingleLogic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleLogicContext singleLogic() throws RecognitionException {
		SingleLogicContext _localctx = new SingleLogicContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_singleLogic);
		try {
			setState(520);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(516);
				match(INT_VAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(517);
				match(BOOL_VAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(518);
				match(INDENTIFIER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(519);
				eqCompExpr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParLogicContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public LogicExprContext logicExpr() {
			return getRuleContext(LogicExprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public ParLogicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parLogic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterParLogic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitParLogic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitParLogic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParLogicContext parLogic() throws RecognitionException {
		ParLogicContext _localctx = new ParLogicContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_parLogic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			match(LPAR);
			setState(523);
			logicExpr();
			setState(524);
			match(RPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EqCompExprContext extends ParserRuleContext {
		public CompExprContext compExpr() {
			return getRuleContext(CompExprContext.class,0);
		}
		public EqCompExprTailContext eqCompExprTail() {
			return getRuleContext(EqCompExprTailContext.class,0);
		}
		public EqCompExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eqCompExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterEqCompExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitEqCompExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitEqCompExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqCompExprContext eqCompExpr() throws RecognitionException {
		EqCompExprContext _localctx = new EqCompExprContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_eqCompExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			compExpr();
			setState(527);
			eqCompExprTail();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EqCompExprTailContext extends ParserRuleContext {
		public Token name;
		public CompExprContext compExpr() {
			return getRuleContext(CompExprContext.class,0);
		}
		public EqCompExprTailContext eqCompExprTail() {
			return getRuleContext(EqCompExprTailContext.class,0);
		}
		public TerminalNode EQL() { return getToken(FunctionCraftParser.EQL, 0); }
		public TerminalNode NEQ() { return getToken(FunctionCraftParser.NEQ, 0); }
		public EqCompExprTailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eqCompExprTail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterEqCompExprTail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitEqCompExprTail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitEqCompExprTail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqCompExprTailContext eqCompExprTail() throws RecognitionException {
		EqCompExprTailContext _localctx = new EqCompExprTailContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_eqCompExprTail);
		int _la;
		try {
			setState(535);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQL:
			case NEQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(529);
				((EqCompExprTailContext)_localctx).name = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==EQL || _la==NEQ) ) {
					((EqCompExprTailContext)_localctx).name = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(530);
				compExpr();
				{
				System.out.println("Operator: " + (((EqCompExprTailContext)_localctx).name!=null?((EqCompExprTailContext)_localctx).name.getText():null));
				}
				setState(532);
				eqCompExprTail();
				}
				break;
			case RPAR:
			case DOT:
			case APPEND_SIGN:
			case ASSIGN:
			case ADD_ASSIGN:
			case MINUS_ASSIGN:
			case MULT_ASSIGN:
			case DIV_ASSGIN:
			case MOD_ASSIGN:
			case LOG_AND:
			case LOG_OR:
			case RBRACKET:
			case COMMA:
			case SEMICOLON:
			case TAB:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CompExprContext extends ParserRuleContext {
		public MathExprContext mathExpr() {
			return getRuleContext(MathExprContext.class,0);
		}
		public CompExprTailContext compExprTail() {
			return getRuleContext(CompExprTailContext.class,0);
		}
		public CompExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterCompExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitCompExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitCompExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompExprContext compExpr() throws RecognitionException {
		CompExprContext _localctx = new CompExprContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_compExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(537);
			mathExpr();
			setState(538);
			compExprTail();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CompExprTailContext extends ParserRuleContext {
		public Token name;
		public MathExprContext mathExpr() {
			return getRuleContext(MathExprContext.class,0);
		}
		public CompExprTailContext compExprTail() {
			return getRuleContext(CompExprTailContext.class,0);
		}
		public TerminalNode GEQ() { return getToken(FunctionCraftParser.GEQ, 0); }
		public TerminalNode LEQ() { return getToken(FunctionCraftParser.LEQ, 0); }
		public TerminalNode GTR() { return getToken(FunctionCraftParser.GTR, 0); }
		public TerminalNode LES() { return getToken(FunctionCraftParser.LES, 0); }
		public CompExprTailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compExprTail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterCompExprTail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitCompExprTail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitCompExprTail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompExprTailContext compExprTail() throws RecognitionException {
		CompExprTailContext _localctx = new CompExprTailContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_compExprTail);
		int _la;
		try {
			setState(546);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GEQ:
			case LEQ:
			case GTR:
			case LES:
				enterOuterAlt(_localctx, 1);
				{
				setState(540);
				((CompExprTailContext)_localctx).name = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8246337208320L) != 0)) ) {
					((CompExprTailContext)_localctx).name = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(541);
				mathExpr();
				System.out.println("Operator: " + (((CompExprTailContext)_localctx).name!=null?((CompExprTailContext)_localctx).name.getText():null));
				setState(543);
				compExprTail();
				}
				break;
			case RPAR:
			case DOT:
			case APPEND_SIGN:
			case EQL:
			case NEQ:
			case ASSIGN:
			case ADD_ASSIGN:
			case MINUS_ASSIGN:
			case MULT_ASSIGN:
			case DIV_ASSGIN:
			case MOD_ASSIGN:
			case LOG_AND:
			case LOG_OR:
			case RBRACKET:
			case COMMA:
			case SEMICOLON:
			case TAB:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MathExprContext extends ParserRuleContext {
		public AddMinusExprContext addMinusExpr() {
			return getRuleContext(AddMinusExprContext.class,0);
		}
		public MathExprTailContext mathExprTail() {
			return getRuleContext(MathExprTailContext.class,0);
		}
		public MathExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterMathExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitMathExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitMathExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathExprContext mathExpr() throws RecognitionException {
		MathExprContext _localctx = new MathExprContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_mathExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(548);
			addMinusExpr();
			setState(549);
			mathExprTail();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MathExprTailContext extends ParserRuleContext {
		public Token name;
		public AddMinusExprContext addMinusExpr() {
			return getRuleContext(AddMinusExprContext.class,0);
		}
		public MathExprTailContext mathExprTail() {
			return getRuleContext(MathExprTailContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(FunctionCraftParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(FunctionCraftParser.MINUS, 0); }
		public MathExprTailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathExprTail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterMathExprTail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitMathExprTail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitMathExprTail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathExprTailContext mathExprTail() throws RecognitionException {
		MathExprTailContext _localctx = new MathExprTailContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_mathExprTail);
		int _la;
		try {
			setState(557);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(551);
				((MathExprTailContext)_localctx).name = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((MathExprTailContext)_localctx).name = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(552);
				addMinusExpr();
				System.out.println("Operator: " + (((MathExprTailContext)_localctx).name!=null?((MathExprTailContext)_localctx).name.getText():null));
				setState(554);
				mathExprTail();
				}
				break;
			case RPAR:
			case DOT:
			case APPEND_SIGN:
			case GEQ:
			case LEQ:
			case GTR:
			case LES:
			case EQL:
			case NEQ:
			case ASSIGN:
			case ADD_ASSIGN:
			case MINUS_ASSIGN:
			case MULT_ASSIGN:
			case DIV_ASSGIN:
			case MOD_ASSIGN:
			case LOG_AND:
			case LOG_OR:
			case RBRACKET:
			case COMMA:
			case SEMICOLON:
			case TAB:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AddMinusExprContext extends ParserRuleContext {
		public PreSingleMathContext preSingleMath() {
			return getRuleContext(PreSingleMathContext.class,0);
		}
		public AddMinusExprTailContext addMinusExprTail() {
			return getRuleContext(AddMinusExprTailContext.class,0);
		}
		public AddMinusExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addMinusExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterAddMinusExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitAddMinusExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitAddMinusExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddMinusExprContext addMinusExpr() throws RecognitionException {
		AddMinusExprContext _localctx = new AddMinusExprContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_addMinusExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(559);
			preSingleMath();
			setState(560);
			addMinusExprTail();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AddMinusExprTailContext extends ParserRuleContext {
		public Token name;
		public PreSingleMathContext preSingleMath() {
			return getRuleContext(PreSingleMathContext.class,0);
		}
		public AddMinusExprTailContext addMinusExprTail() {
			return getRuleContext(AddMinusExprTailContext.class,0);
		}
		public TerminalNode MULT() { return getToken(FunctionCraftParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(FunctionCraftParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(FunctionCraftParser.MOD, 0); }
		public AddMinusExprTailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addMinusExprTail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterAddMinusExprTail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitAddMinusExprTail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitAddMinusExprTail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddMinusExprTailContext addMinusExprTail() throws RecognitionException {
		AddMinusExprTailContext _localctx = new AddMinusExprTailContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_addMinusExprTail);
		int _la;
		try {
			setState(568);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULT:
			case DIV:
			case MOD:
				enterOuterAlt(_localctx, 1);
				{
				setState(562);
				((AddMinusExprTailContext)_localctx).name = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 252201579132747776L) != 0)) ) {
					((AddMinusExprTailContext)_localctx).name = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(563);
				preSingleMath();
				System.out.println("Operator: " + (((AddMinusExprTailContext)_localctx).name!=null?((AddMinusExprTailContext)_localctx).name.getText():null));
				setState(565);
				addMinusExprTail();
				}
				break;
			case RPAR:
			case DOT:
			case APPEND_SIGN:
			case GEQ:
			case LEQ:
			case GTR:
			case LES:
			case EQL:
			case NEQ:
			case ASSIGN:
			case ADD_ASSIGN:
			case MINUS_ASSIGN:
			case MULT_ASSIGN:
			case DIV_ASSGIN:
			case MOD_ASSIGN:
			case PLUS:
			case MINUS:
			case LOG_AND:
			case LOG_OR:
			case RBRACKET:
			case COMMA:
			case SEMICOLON:
			case TAB:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PreSingleMathContext extends ParserRuleContext {
		public PostSingleMathContext postSingleMath() {
			return getRuleContext(PostSingleMathContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(FunctionCraftParser.MINUS, 0); }
		public TerminalNode NOT() { return getToken(FunctionCraftParser.NOT, 0); }
		public PreSingleMathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preSingleMath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterPreSingleMath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitPreSingleMath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitPreSingleMath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreSingleMathContext preSingleMath() throws RecognitionException {
		PreSingleMathContext _localctx = new PreSingleMathContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_preSingleMath);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(574);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(570);
				match(MINUS);
				System.out.println("Operator: -");
				}
				break;
			case 2:
				{
				setState(572);
				match(NOT);
				System.out.println("Operator: !");
				}
				break;
			}
			setState(576);
			postSingleMath();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PostSingleMathContext extends ParserRuleContext {
		public TerminalNode INDENTIFIER() { return getToken(FunctionCraftParser.INDENTIFIER, 0); }
		public TerminalNode INC() { return getToken(FunctionCraftParser.INC, 0); }
		public TerminalNode DEC() { return getToken(FunctionCraftParser.DEC, 0); }
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public AppendExprContext appendExpr() {
			return getRuleContext(AppendExprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public ItemAccesContext itemAcces() {
			return getRuleContext(ItemAccesContext.class,0);
		}
		public BuiltInsideFunsContext builtInsideFuns() {
			return getRuleContext(BuiltInsideFunsContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public PatternCallContext patternCall() {
			return getRuleContext(PatternCallContext.class,0);
		}
		public LambdaFunctionContext lambdaFunction() {
			return getRuleContext(LambdaFunctionContext.class,0);
		}
		public PostSingleMathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postSingleMath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterPostSingleMath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitPostSingleMath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitPostSingleMath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostSingleMathContext postSingleMath() throws RecognitionException {
		PostSingleMathContext _localctx = new PostSingleMathContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_postSingleMath);
		try {
			setState(607);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(578);
				match(INDENTIFIER);
				setState(583);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INC:
					{
					setState(579);
					match(INC);
					System.out.println("Operator: ++");
					}
					break;
				case DEC:
					{
					setState(581);
					match(DEC);
					System.out.println("Operator: --");
					}
					break;
				case RPAR:
				case DOT:
				case APPEND_SIGN:
				case GEQ:
				case LEQ:
				case GTR:
				case LES:
				case EQL:
				case NEQ:
				case ASSIGN:
				case ADD_ASSIGN:
				case MINUS_ASSIGN:
				case MULT_ASSIGN:
				case DIV_ASSGIN:
				case MOD_ASSIGN:
				case PLUS:
				case MINUS:
				case MULT:
				case DIV:
				case MOD:
				case LOG_AND:
				case LOG_OR:
				case RBRACKET:
				case COMMA:
				case SEMICOLON:
				case TAB:
					break;
				default:
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(585);
				val();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(586);
				match(LPAR);
				setState(587);
				appendExpr();
				setState(588);
				match(RPAR);
				setState(593);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INC:
					{
					setState(589);
					match(INC);
					System.out.println("Operator: ++");
					}
					break;
				case DEC:
					{
					setState(591);
					match(DEC);
					System.out.println("Operator: --");
					}
					break;
				case RPAR:
				case DOT:
				case APPEND_SIGN:
				case GEQ:
				case LEQ:
				case GTR:
				case LES:
				case EQL:
				case NEQ:
				case ASSIGN:
				case ADD_ASSIGN:
				case MINUS_ASSIGN:
				case MULT_ASSIGN:
				case DIV_ASSGIN:
				case MOD_ASSIGN:
				case PLUS:
				case MINUS:
				case MULT:
				case DIV:
				case MOD:
				case LOG_AND:
				case LOG_OR:
				case RBRACKET:
				case COMMA:
				case SEMICOLON:
				case TAB:
					break;
				default:
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(595);
				match(INDENTIFIER);
				setState(596);
				itemAcces();
				setState(601);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INC:
					{
					setState(597);
					match(INC);
					System.out.println("Operator: ++");
					}
					break;
				case DEC:
					{
					setState(599);
					match(DEC);
					System.out.println("Operator: --");
					}
					break;
				case RPAR:
				case DOT:
				case APPEND_SIGN:
				case GEQ:
				case LEQ:
				case GTR:
				case LES:
				case EQL:
				case NEQ:
				case ASSIGN:
				case ADD_ASSIGN:
				case MINUS_ASSIGN:
				case MULT_ASSIGN:
				case DIV_ASSGIN:
				case MOD_ASSIGN:
				case PLUS:
				case MINUS:
				case MULT:
				case DIV:
				case MOD:
				case LOG_AND:
				case LOG_OR:
				case RBRACKET:
				case COMMA:
				case SEMICOLON:
				case TAB:
					break;
				default:
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(603);
				builtInsideFuns();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(604);
				functionCall();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(605);
				patternCall();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(606);
				lambdaFunction();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ItemAccesContext extends ParserRuleContext {
		public List<TerminalNode> LBRACKET() { return getTokens(FunctionCraftParser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(FunctionCraftParser.LBRACKET, i);
		}
		public List<LogicExprContext> logicExpr() {
			return getRuleContexts(LogicExprContext.class);
		}
		public LogicExprContext logicExpr(int i) {
			return getRuleContext(LogicExprContext.class,i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(FunctionCraftParser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(FunctionCraftParser.RBRACKET, i);
		}
		public ItemAccesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_itemAcces; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterItemAcces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitItemAcces(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitItemAcces(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItemAccesContext itemAcces() throws RecognitionException {
		ItemAccesContext _localctx = new ItemAccesContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_itemAcces);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(615);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACKET) {
				{
				{
				setState(609);
				match(LBRACKET);
				setState(610);
				logicExpr();
				setState(611);
				match(RBRACKET);
				}
				}
				setState(617);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(FunctionCraftParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(FunctionCraftParser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(FunctionCraftParser.STRING, 0); }
		public TerminalNode BOOL() { return getToken(FunctionCraftParser.BOOL, 0); }
		public TerminalNode LIST() { return getToken(FunctionCraftParser.LIST, 0); }
		public TerminalNode FUN_POINTER() { return getToken(FunctionCraftParser.FUN_POINTER, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(618);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2113929216L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValContext extends ParserRuleContext {
		public TerminalNode INT_VAL() { return getToken(FunctionCraftParser.INT_VAL, 0); }
		public TerminalNode FLOAT_VAL() { return getToken(FunctionCraftParser.FLOAT_VAL, 0); }
		public BooolValContext booolVal() {
			return getRuleContext(BooolValContext.class,0);
		}
		public TerminalNode STRING_VAL() { return getToken(FunctionCraftParser.STRING_VAL, 0); }
		public TerminalNode FUN_POINTER_VAL() { return getToken(FunctionCraftParser.FUN_POINTER_VAL, 0); }
		public ListValContext listVal() {
			return getRuleContext(ListValContext.class,0);
		}
		public ValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValContext val() throws RecognitionException {
		ValContext _localctx = new ValContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_val);
		try {
			setState(626);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_VAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(620);
				match(INT_VAL);
				}
				break;
			case FLOAT_VAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(621);
				match(FLOAT_VAL);
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(622);
				booolVal();
				}
				break;
			case STRING_VAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(623);
				match(STRING_VAL);
				}
				break;
			case FUN_POINTER_VAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(624);
				match(FUN_POINTER_VAL);
				}
				break;
			case RPAR:
			case DOT:
			case APPEND_SIGN:
			case GEQ:
			case LEQ:
			case GTR:
			case LES:
			case EQL:
			case NEQ:
			case ASSIGN:
			case ADD_ASSIGN:
			case MINUS_ASSIGN:
			case MULT_ASSIGN:
			case DIV_ASSGIN:
			case MOD_ASSIGN:
			case PLUS:
			case MINUS:
			case MULT:
			case DIV:
			case MOD:
			case LOG_AND:
			case LOG_OR:
			case LBRACKET:
			case RBRACKET:
			case COMMA:
			case SEMICOLON:
			case TAB:
				enterOuterAlt(_localctx, 6);
				{
				setState(625);
				listVal();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BooolValContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(FunctionCraftParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(FunctionCraftParser.FALSE, 0); }
		public BooolValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booolVal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterBooolVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitBooolVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitBooolVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooolValContext booolVal() throws RecognitionException {
		BooolValContext _localctx = new BooolValContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_booolVal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(628);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001K\u0277\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0001\u0000\u0001\u0000"+
		"\u0005\u0000\u0083\b\u0000\n\u0000\f\u0000\u0086\t\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0005\u0003\u009a"+
		"\b\u0003\n\u0003\f\u0003\u009d\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00ac\b\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00b7\b\u0007\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0003\b\u00c4\b\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00d1\b\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0003\t\u00d8\b\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0003\u000b\u00e6\b\u000b\u0001\f\u0001\f\u0001\f\u0003\f"+
		"\u00eb\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0005\u0010\u0108\b\u0010\n\u0010\f\u0010\u010b"+
		"\t\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u0116\b\u0011\n"+
		"\u0011\f\u0011\u0119\t\u0011\u0001\u0011\u0003\u0011\u011c\b\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u0128\b\u0012\n"+
		"\u0012\f\u0012\u012b\t\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u0134\b\u0013\n"+
		"\u0013\f\u0013\u0137\t\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0003"+
		"\u0014\u013c\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0003\u0017\u0156\b\u0017\u0001\u0018\u0001\u0018\u0003"+
		"\u0018\u015a\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0005\u0019\u0161\b\u0019\n\u0019\f\u0019\u0164\t\u0019\u0001\u0019"+
		"\u0003\u0019\u0167\b\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0003 \u0187\b \u0001!\u0001!\u0001!\u0003!\u018c\b!\u0001\"\u0001\""+
		"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001$\u0001$\u0005$\u019f\b$\n$\f$\u01a2\t$\u0001"+
		"%\u0001%\u0001%\u0003%\u01a7\b%\u0001&\u0001&\u0001&\u0001&\u0003&\u01ad"+
		"\b&\u0001&\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001\'\u0003"+
		"\'\u01b7\b\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0003(\u01c2\b(\u0001(\u0001(\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0003)\u01cb\b)\u0001*\u0001*\u0003*\u01cf\b*\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0003+\u01dd"+
		"\b+\u0001+\u0001+\u0001+\u0001,\u0001,\u0001,\u0001-\u0001-\u0001-\u0001"+
		"-\u0001-\u0001-\u0003-\u01eb\b-\u0001.\u0001.\u0001.\u0001.\u0001.\u0003"+
		".\u01f2\b.\u0001.\u0001.\u0001.\u0003.\u01f7\b.\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0003/\u01fe\b/\u0001/\u0001/\u0001/\u0003/\u0203\b/\u00010\u0001"+
		"0\u00010\u00010\u00030\u0209\b0\u00011\u00011\u00011\u00011\u00012\u0001"+
		"2\u00012\u00013\u00013\u00013\u00013\u00013\u00013\u00033\u0218\b3\u0001"+
		"4\u00014\u00014\u00015\u00015\u00015\u00015\u00015\u00015\u00035\u0223"+
		"\b5\u00016\u00016\u00016\u00017\u00017\u00017\u00017\u00017\u00017\u0003"+
		"7\u022e\b7\u00018\u00018\u00018\u00019\u00019\u00019\u00019\u00019\u0001"+
		"9\u00039\u0239\b9\u0001:\u0001:\u0001:\u0001:\u0003:\u023f\b:\u0001:\u0001"+
		":\u0001;\u0001;\u0001;\u0001;\u0001;\u0003;\u0248\b;\u0001;\u0001;\u0001"+
		";\u0001;\u0001;\u0001;\u0001;\u0001;\u0003;\u0252\b;\u0001;\u0001;\u0001"+
		";\u0001;\u0001;\u0001;\u0003;\u025a\b;\u0001;\u0001;\u0001;\u0001;\u0003"+
		";\u0260\b;\u0001<\u0001<\u0001<\u0001<\u0005<\u0266\b<\n<\f<\u0269\t<"+
		"\u0001=\u0001=\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0003>\u0273"+
		"\b>\u0001?\u0001?\u0001?\u0000\u0000@\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDF"+
		"HJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0000\u0007\u0002\u0000\u0018\u0018!!\u0001"+
		"\u0000+,\u0001\u0000\'*\u0001\u000056\u0001\u000079\u0001\u0000\u0019"+
		"\u001e\u0001\u0000\t\n\u029d\u0000\u0084\u0001\u0000\u0000\u0000\u0002"+
		"\u0089\u0001\u0000\u0000\u0000\u0004\u0091\u0001\u0000\u0000\u0000\u0006"+
		"\u009b\u0001\u0000\u0000\u0000\b\u009e\u0001\u0000\u0000\u0000\n\u00ab"+
		"\u0001\u0000\u0000\u0000\f\u00ad\u0001\u0000\u0000\u0000\u000e\u00b6\u0001"+
		"\u0000\u0000\u0000\u0010\u00b8\u0001\u0000\u0000\u0000\u0012\u00d7\u0001"+
		"\u0000\u0000\u0000\u0014\u00d9\u0001\u0000\u0000\u0000\u0016\u00e5\u0001"+
		"\u0000\u0000\u0000\u0018\u00e7\u0001\u0000\u0000\u0000\u001a\u00ec\u0001"+
		"\u0000\u0000\u0000\u001c\u00f2\u0001\u0000\u0000\u0000\u001e\u00f5\u0001"+
		"\u0000\u0000\u0000 \u0109\u0001\u0000\u0000\u0000\"\u010c\u0001\u0000"+
		"\u0000\u0000$\u011f\u0001\u0000\u0000\u0000&\u012c\u0001\u0000\u0000\u0000"+
		"(\u013b\u0001\u0000\u0000\u0000*\u013d\u0001\u0000\u0000\u0000,\u0144"+
		"\u0001\u0000\u0000\u0000.\u0155\u0001\u0000\u0000\u00000\u0159\u0001\u0000"+
		"\u0000\u00002\u015b\u0001\u0000\u0000\u00004\u016a\u0001\u0000\u0000\u0000"+
		"6\u016f\u0001\u0000\u0000\u00008\u0173\u0001\u0000\u0000\u0000:\u0177"+
		"\u0001\u0000\u0000\u0000<\u017b\u0001\u0000\u0000\u0000>\u017e\u0001\u0000"+
		"\u0000\u0000@\u0186\u0001\u0000\u0000\u0000B\u0188\u0001\u0000\u0000\u0000"+
		"D\u018d\u0001\u0000\u0000\u0000F\u0194\u0001\u0000\u0000\u0000H\u01a0"+
		"\u0001\u0000\u0000\u0000J\u01a6\u0001\u0000\u0000\u0000L\u01ac\u0001\u0000"+
		"\u0000\u0000N\u01b6\u0001\u0000\u0000\u0000P\u01bc\u0001\u0000\u0000\u0000"+
		"R\u01c5\u0001\u0000\u0000\u0000T\u01cc\u0001\u0000\u0000\u0000V\u01d0"+
		"\u0001\u0000\u0000\u0000X\u01e1\u0001\u0000\u0000\u0000Z\u01ea\u0001\u0000"+
		"\u0000\u0000\\\u01f6\u0001\u0000\u0000\u0000^\u0202\u0001\u0000\u0000"+
		"\u0000`\u0208\u0001\u0000\u0000\u0000b\u020a\u0001\u0000\u0000\u0000d"+
		"\u020e\u0001\u0000\u0000\u0000f\u0217\u0001\u0000\u0000\u0000h\u0219\u0001"+
		"\u0000\u0000\u0000j\u0222\u0001\u0000\u0000\u0000l\u0224\u0001\u0000\u0000"+
		"\u0000n\u022d\u0001\u0000\u0000\u0000p\u022f\u0001\u0000\u0000\u0000r"+
		"\u0238\u0001\u0000\u0000\u0000t\u023e\u0001\u0000\u0000\u0000v\u025f\u0001"+
		"\u0000\u0000\u0000x\u0267\u0001\u0000\u0000\u0000z\u026a\u0001\u0000\u0000"+
		"\u0000|\u0272\u0001\u0000\u0000\u0000~\u0274\u0001\u0000\u0000\u0000\u0080"+
		"\u0083\u0003\u0004\u0002\u0000\u0081\u0083\u0003D\"\u0000\u0082\u0080"+
		"\u0001\u0000\u0000\u0000\u0082\u0081\u0001\u0000\u0000\u0000\u0083\u0086"+
		"\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0084\u0085"+
		"\u0001\u0000\u0000\u0000\u0085\u0087\u0001\u0000\u0000\u0000\u0086\u0084"+
		"\u0001\u0000\u0000\u0000\u0087\u0088\u0003\u0002\u0001\u0000\u0088\u0001"+
		"\u0001\u0000\u0000\u0000\u0089\u008a\u0006\u0001\uffff\uffff\u0000\u008a"+
		"\u008b\u0005\u0003\u0000\u0000\u008b\u008c\u0005\u0001\u0000\u0000\u008c"+
		"\u008d\u0005#\u0000\u0000\u008d\u008e\u0005$\u0000\u0000\u008e\u008f\u0003"+
		"\u0006\u0003\u0000\u008f\u0090\u0005\u0004\u0000\u0000\u0090\u0003\u0001"+
		"\u0000\u0000\u0000\u0091\u0092\u0005\u0003\u0000\u0000\u0092\u0093\u0005"+
		"\u0018\u0000\u0000\u0093\u0094\u0006\u0002\uffff\uffff\u0000\u0094\u0095"+
		"\u0003\b\u0004\u0000\u0095\u0096\u0003\u0006\u0003\u0000\u0096\u0097\u0005"+
		"\u0004\u0000\u0000\u0097\u0005\u0001\u0000\u0000\u0000\u0098\u009a\u0003"+
		"\u0012\t\u0000\u0099\u0098\u0001\u0000\u0000\u0000\u009a\u009d\u0001\u0000"+
		"\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000"+
		"\u0000\u0000\u009c\u0007\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000"+
		"\u0000\u0000\u009e\u009f\u0005#\u0000\u0000\u009f\u00a0\u0003\n\u0005"+
		"\u0000\u00a0\u00a1\u0005$\u0000\u0000\u00a1\t\u0001\u0000\u0000\u0000"+
		"\u00a2\u00a3\u0005\u0018\u0000\u0000\u00a3\u00a4\u0005C\u0000\u0000\u00a4"+
		"\u00ac\u0003\n\u0005\u0000\u00a5\u00a6\u0003\f\u0006\u0000\u00a6\u00a7"+
		"\u0005C\u0000\u0000\u00a7\u00a8\u0003\n\u0005\u0000\u00a8\u00ac\u0001"+
		"\u0000\u0000\u0000\u00a9\u00ac\u0005\u0018\u0000\u0000\u00aa\u00ac\u0003"+
		"\f\u0006\u0000\u00ab\u00a2\u0001\u0000\u0000\u0000\u00ab\u00a5\u0001\u0000"+
		"\u0000\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ab\u00aa\u0001\u0000"+
		"\u0000\u0000\u00ac\u000b\u0001\u0000\u0000\u0000\u00ad\u00ae\u0005?\u0000"+
		"\u0000\u00ae\u00af\u0003\u000e\u0007\u0000\u00af\u00b0\u0005@\u0000\u0000"+
		"\u00b0\r\u0001\u0000\u0000\u0000\u00b1\u00b2\u0003\u0010\b\u0000\u00b2"+
		"\u00b3\u0005C\u0000\u0000\u00b3\u00b4\u0003\u000e\u0007\u0000\u00b4\u00b7"+
		"\u0001\u0000\u0000\u0000\u00b5\u00b7\u0003\u0010\b\u0000\u00b6\u00b1\u0001"+
		"\u0000\u0000\u0000\u00b6\u00b5\u0001\u0000\u0000\u0000\u00b7\u000f\u0001"+
		"\u0000\u0000\u0000\u00b8\u00c3\u0003X,\u0000\u00b9\u00c4\u0005-\u0000"+
		"\u0000\u00ba\u00bb\u0005.\u0000\u0000\u00bb\u00c4\u0006\b\uffff\uffff"+
		"\u0000\u00bc\u00c4\u0005/\u0000\u0000\u00bd\u00be\u00050\u0000\u0000\u00be"+
		"\u00c4\u0006\b\uffff\uffff\u0000\u00bf\u00c0\u00051\u0000\u0000\u00c0"+
		"\u00c4\u0006\b\uffff\uffff\u0000\u00c1\u00c2\u00052\u0000\u0000\u00c2"+
		"\u00c4\u0006\b\uffff\uffff\u0000\u00c3\u00b9\u0001\u0000\u0000\u0000\u00c3"+
		"\u00ba\u0001\u0000\u0000\u0000\u00c3\u00bc\u0001\u0000\u0000\u0000\u00c3"+
		"\u00bd\u0001\u0000\u0000\u0000\u00c3\u00bf\u0001\u0000\u0000\u0000\u00c3"+
		"\u00c1\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5"+
		"\u00c6\u0003X,\u0000\u00c6\u0011\u0001\u0000\u0000\u0000\u00c7\u00d1\u0003"+
		"\u0018\f\u0000\u00c8\u00d1\u0003\u001a\r\u0000\u00c9\u00d1\u0003J%\u0000"+
		"\u00ca\u00d1\u0003V+\u0000\u00cb\u00d1\u0003\u0014\n\u0000\u00cc\u00d1"+
		"\u0003\u001c\u000e\u0000\u00cd\u00d1\u0003D\"\u0000\u00ce\u00d1\u0003"+
		"X,\u0000\u00cf\u00d1\u0003F#\u0000\u00d0\u00c7\u0001\u0000\u0000\u0000"+
		"\u00d0\u00c8\u0001\u0000\u0000\u0000\u00d0\u00c9\u0001\u0000\u0000\u0000"+
		"\u00d0\u00ca\u0001\u0000\u0000\u0000\u00d0\u00cb\u0001\u0000\u0000\u0000"+
		"\u00d0\u00cc\u0001\u0000\u0000\u0000\u00d0\u00cd\u0001\u0000\u0000\u0000"+
		"\u00d0\u00ce\u0001\u0000\u0000\u0000\u00d0\u00cf\u0001\u0000\u0000\u0000"+
		"\u00d1\u00d2\u0001\u0000\u0000\u0000\u00d2\u00d3\u0005E\u0000\u0000\u00d3"+
		"\u00d8\u0001\u0000\u0000\u0000\u00d4\u00d8\u00032\u0019\u0000\u00d5\u00d8"+
		"\u0003(\u0014\u0000\u00d6\u00d8\u0003\u001e\u000f\u0000\u00d7\u00d0\u0001"+
		"\u0000\u0000\u0000\u00d7\u00d4\u0001\u0000\u0000\u0000\u00d7\u00d5\u0001"+
		"\u0000\u0000\u0000\u00d7\u00d6\u0001\u0000\u0000\u0000\u00d8\u0013\u0001"+
		"\u0000\u0000\u0000\u00d9\u00da\u0005F\u0000\u0000\u00da\u00db\u0006\n"+
		"\uffff\uffff\u0000\u00db\u00dc\u0003\b\u0004\u0000\u00dc\u00dd\u0005A"+
		"\u0000\u0000\u00dd\u00de\u0003\u0006\u0003\u0000\u00de\u00df\u0005B\u0000"+
		"\u0000\u00df\u0015\u0001\u0000\u0000\u0000\u00e0\u00e1\u0005#\u0000\u0000"+
		"\u00e1\u00e2\u00030\u0018\u0000\u00e2\u00e3\u0005$\u0000\u0000\u00e3\u00e6"+
		"\u0001\u0000\u0000\u0000\u00e4\u00e6\u00030\u0018\u0000\u00e5\u00e0\u0001"+
		"\u0000\u0000\u0000\u00e5\u00e4\u0001\u0000\u0000\u0000\u00e6\u0017\u0001"+
		"\u0000\u0000\u0000\u00e7\u00e8\u0005\u0005\u0000\u0000\u00e8\u00ea\u0006"+
		"\f\uffff\uffff\u0000\u00e9\u00eb\u0003\u0016\u000b\u0000\u00ea\u00e9\u0001"+
		"\u0000\u0000\u0000\u00ea\u00eb\u0001\u0000\u0000\u0000\u00eb\u0019\u0001"+
		"\u0000\u0000\u0000\u00ec\u00ed\u0005\u0018\u0000\u0000\u00ed\u00ee\u0006"+
		"\r\uffff\uffff\u0000\u00ee\u00ef\u0005#\u0000\u0000\u00ef\u00f0\u0003"+
		".\u0017\u0000\u00f0\u00f1\u0005$\u0000\u0000\u00f1\u001b\u0001\u0000\u0000"+
		"\u0000\u00f2\u00f3\u0003\u0014\n\u0000\u00f3\u00f4\u0003.\u0017\u0000"+
		"\u00f4\u001d\u0001\u0000\u0000\u0000\u00f5\u00f6\u0006\u000f\uffff\uffff"+
		"\u0000\u00f6\u00f7\u0005\u0014\u0000\u0000\u00f7\u00f8\u0005\u0015\u0000"+
		"\u0000\u00f8\u00f9\u0003 \u0010\u0000\u00f9\u00fa\u0005\u0004\u0000\u0000"+
		"\u00fa\u001f\u0001\u0000\u0000\u0000\u00fb\u0108\u0003\u0012\t\u0000\u00fc"+
		"\u00fd\u0005\u0012\u0000\u0000\u00fd\u0108\u0006\u0010\uffff\uffff\u0000"+
		"\u00fe\u00ff\u0005\u0013\u0000\u0000\u00ff\u0108\u0006\u0010\uffff\uffff"+
		"\u0000\u0100\u0101\u0003<\u001e\u0000\u0101\u0102\u0006\u0010\uffff\uffff"+
		"\u0000\u0102\u0108\u0001\u0000\u0000\u0000\u0103\u0104\u0003>\u001f\u0000"+
		"\u0104\u0105\u0006\u0010\uffff\uffff\u0000\u0105\u0108\u0001\u0000\u0000"+
		"\u0000\u0106\u0108\u0003\"\u0011\u0000\u0107\u00fb\u0001\u0000\u0000\u0000"+
		"\u0107\u00fc\u0001\u0000\u0000\u0000\u0107\u00fe\u0001\u0000\u0000\u0000"+
		"\u0107\u0100\u0001\u0000\u0000\u0000\u0107\u0103\u0001\u0000\u0000\u0000"+
		"\u0107\u0106\u0001\u0000\u0000\u0000\u0108\u010b\u0001\u0000\u0000\u0000"+
		"\u0109\u0107\u0001\u0000\u0000\u0000\u0109\u010a\u0001\u0000\u0000\u0000"+
		"\u010a!\u0001\u0000\u0000\u0000\u010b\u0109\u0001\u0000\u0000\u0000\u010c"+
		"\u010d\u0005\u0006\u0000\u0000\u010d\u010e\u0006\u0011\uffff\uffff\u0000"+
		"\u010e\u0117\u0003:\u001d\u0000\u010f\u0116\u0003\u0012\t\u0000\u0110"+
		"\u0116\u0003$\u0012\u0000\u0111\u0116\u0005\u0013\u0000\u0000\u0112\u0116"+
		"\u0005\u0012\u0000\u0000\u0113\u0116\u0003<\u001e\u0000\u0114\u0116\u0003"+
		">\u001f\u0000\u0115\u010f\u0001\u0000\u0000\u0000\u0115\u0110\u0001\u0000"+
		"\u0000\u0000\u0115\u0111\u0001\u0000\u0000\u0000\u0115\u0112\u0001\u0000"+
		"\u0000\u0000\u0115\u0113\u0001\u0000\u0000\u0000\u0115\u0114\u0001\u0000"+
		"\u0000\u0000\u0116\u0119\u0001\u0000\u0000\u0000\u0117\u0115\u0001\u0000"+
		"\u0000\u0000\u0117\u0118\u0001\u0000\u0000\u0000\u0118\u011b\u0001\u0000"+
		"\u0000\u0000\u0119\u0117\u0001\u0000\u0000\u0000\u011a\u011c\u0003&\u0013"+
		"\u0000\u011b\u011a\u0001\u0000\u0000\u0000\u011b\u011c\u0001\u0000\u0000"+
		"\u0000\u011c\u011d\u0001\u0000\u0000\u0000\u011d\u011e\u0005\u0004\u0000"+
		"\u0000\u011e#\u0001\u0000\u0000\u0000\u011f\u0120\u0005\b\u0000\u0000"+
		"\u0120\u0121\u0006\u0012\uffff\uffff\u0000\u0121\u0129\u0003:\u001d\u0000"+
		"\u0122\u0128\u0003\u0012\t\u0000\u0123\u0128\u0005\u0013\u0000\u0000\u0124"+
		"\u0128\u0005\u0012\u0000\u0000\u0125\u0128\u0003<\u001e\u0000\u0126\u0128"+
		"\u0003>\u001f\u0000\u0127\u0122\u0001\u0000\u0000\u0000\u0127\u0123\u0001"+
		"\u0000\u0000\u0000\u0127\u0124\u0001\u0000\u0000\u0000\u0127\u0125\u0001"+
		"\u0000\u0000\u0000\u0127\u0126\u0001\u0000\u0000\u0000\u0128\u012b\u0001"+
		"\u0000\u0000\u0000\u0129\u0127\u0001\u0000\u0000\u0000\u0129\u012a\u0001"+
		"\u0000\u0000\u0000\u012a%\u0001\u0000\u0000\u0000\u012b\u0129\u0001\u0000"+
		"\u0000\u0000\u012c\u012d\u0005\u0007\u0000\u0000\u012d\u0135\u0006\u0013"+
		"\uffff\uffff\u0000\u012e\u0134\u0003\u0012\t\u0000\u012f\u0134\u0005\u0013"+
		"\u0000\u0000\u0130\u0134\u0005\u0012\u0000\u0000\u0131\u0134\u0003<\u001e"+
		"\u0000\u0132\u0134\u0003>\u001f\u0000\u0133\u012e\u0001\u0000\u0000\u0000"+
		"\u0133\u012f\u0001\u0000\u0000\u0000\u0133\u0130\u0001\u0000\u0000\u0000"+
		"\u0133\u0131\u0001\u0000\u0000\u0000\u0133\u0132\u0001\u0000\u0000\u0000"+
		"\u0134\u0137\u0001\u0000\u0000\u0000\u0135\u0133\u0001\u0000\u0000\u0000"+
		"\u0135\u0136\u0001\u0000\u0000\u0000\u0136\'\u0001\u0000\u0000\u0000\u0137"+
		"\u0135\u0001\u0000\u0000\u0000\u0138\u0139\u0006\u0014\uffff\uffff\u0000"+
		"\u0139\u013c\u0003,\u0016\u0000\u013a\u013c\u0003*\u0015\u0000\u013b\u0138"+
		"\u0001\u0000\u0000\u0000\u013b\u013a\u0001\u0000\u0000\u0000\u013c)\u0001"+
		"\u0000\u0000\u0000\u013d\u013e\u0005\u0016\u0000\u0000\u013e\u013f\u0005"+
		"\u0018\u0000\u0000\u013f\u0140\u0005\u0017\u0000\u0000\u0140\u0141\u0005"+
		"\u0018\u0000\u0000\u0141\u0142\u0003 \u0010\u0000\u0142\u0143\u0005\u0004"+
		"\u0000\u0000\u0143+\u0001\u0000\u0000\u0000\u0144\u0145\u0005\u0016\u0000"+
		"\u0000\u0145\u0146\u0005\u0018\u0000\u0000\u0146\u0147\u0005\u0017\u0000"+
		"\u0000\u0147\u0148\u0005#\u0000\u0000\u0148\u0149\u0003\\.\u0000\u0149"+
		"\u014a\u0005%\u0000\u0000\u014a\u014b\u0005%\u0000\u0000\u014b\u014c\u0003"+
		"\\.\u0000\u014c\u014d\u0005$\u0000\u0000\u014d\u014e\u0003 \u0010\u0000"+
		"\u014e\u014f\u0005\u0004\u0000\u0000\u014f-\u0001\u0000\u0000\u0000\u0150"+
		"\u0151\u00030\u0018\u0000\u0151\u0152\u0005C\u0000\u0000\u0152\u0153\u0003"+
		".\u0017\u0000\u0153\u0156\u0001\u0000\u0000\u0000\u0154\u0156\u00030\u0018"+
		"\u0000\u0155\u0150\u0001\u0000\u0000\u0000\u0155\u0154\u0001\u0000\u0000"+
		"\u0000\u0156/\u0001\u0000\u0000\u0000\u0157\u015a\u0003X,\u0000\u0158"+
		"\u015a\u0003@ \u0000\u0159\u0157\u0001\u0000\u0000\u0000\u0159\u0158\u0001"+
		"\u0000\u0000\u0000\u015a1\u0001\u0000\u0000\u0000\u015b\u015c\u0005\u0006"+
		"\u0000\u0000\u015c\u015d\u0006\u0019\uffff\uffff\u0000\u015d\u0162\u0003"+
		":\u001d\u0000\u015e\u0161\u0003\u0012\t\u0000\u015f\u0161\u00034\u001a"+
		"\u0000\u0160\u015e\u0001\u0000\u0000\u0000\u0160\u015f\u0001\u0000\u0000"+
		"\u0000\u0161\u0164\u0001\u0000\u0000\u0000\u0162\u0160\u0001\u0000\u0000"+
		"\u0000\u0162\u0163\u0001\u0000\u0000\u0000\u0163\u0166\u0001\u0000\u0000"+
		"\u0000\u0164\u0162\u0001\u0000\u0000\u0000\u0165\u0167\u00036\u001b\u0000"+
		"\u0166\u0165\u0001\u0000\u0000\u0000\u0166\u0167\u0001\u0000\u0000\u0000"+
		"\u0167\u0168\u0001\u0000\u0000\u0000\u0168\u0169\u0005\u0004\u0000\u0000"+
		"\u01693\u0001\u0000\u0000\u0000\u016a\u016b\u0005\b\u0000\u0000\u016b"+
		"\u016c\u0006\u001a\uffff\uffff\u0000\u016c\u016d\u0003:\u001d\u0000\u016d"+
		"\u016e\u0003\u0006\u0003\u0000\u016e5\u0001\u0000\u0000\u0000\u016f\u0170"+
		"\u0005\u0007\u0000\u0000\u0170\u0171\u0006\u001b\uffff\uffff\u0000\u0171"+
		"\u0172\u0003\u0006\u0003\u0000\u01727\u0001\u0000\u0000\u0000\u0173\u0174"+
		"\u0005\u0006\u0000\u0000\u0174\u0175\u0003:\u001d\u0000\u0175\u0176\u0005"+
		"E\u0000\u0000\u01769\u0001\u0000\u0000\u0000\u0177\u0178\u0005#\u0000"+
		"\u0000\u0178\u0179\u0003\\.\u0000\u0179\u017a\u0005$\u0000\u0000\u017a"+
		";\u0001\u0000\u0000\u0000\u017b\u017c\u0005\u0012\u0000\u0000\u017c\u017d"+
		"\u00038\u001c\u0000\u017d=\u0001\u0000\u0000\u0000\u017e\u017f\u0005\u0013"+
		"\u0000\u0000\u017f\u0180\u00038\u001c\u0000\u0180?\u0001\u0000\u0000\u0000"+
		"\u0181\u0182\u0005?\u0000\u0000\u0182\u0183\u0003B!\u0000\u0183\u0184"+
		"\u0005@\u0000\u0000\u0184\u0187\u0001\u0000\u0000\u0000\u0185\u0187\u0001"+
		"\u0000\u0000\u0000\u0186\u0181\u0001\u0000\u0000\u0000\u0186\u0185\u0001"+
		"\u0000\u0000\u0000\u0187A\u0001\u0000\u0000\u0000\u0188\u018b\u0003|>"+
		"\u0000\u0189\u018a\u0005C\u0000\u0000\u018a\u018c\u0003B!\u0000\u018b"+
		"\u0189\u0001\u0000\u0000\u0000\u018b\u018c\u0001\u0000\u0000\u0000\u018c"+
		"C\u0001\u0000\u0000\u0000\u018d\u018e\u0005\u0010\u0000\u0000\u018e\u018f"+
		"\u0005\u0018\u0000\u0000\u018f\u0190\u0006\"\uffff\uffff\u0000\u0190\u0191"+
		"\u0003\b\u0004\u0000\u0191\u0192\u0003H$\u0000\u0192\u0193\u0005E\u0000"+
		"\u0000\u0193E\u0001\u0000\u0000\u0000\u0194\u0195\u0005\u0018\u0000\u0000"+
		"\u0195\u0196\u0006#\uffff\uffff\u0000\u0196\u0197\u0005%\u0000\u0000\u0197"+
		"\u0198\u0005\u0011\u0000\u0000\u0198\u0199\u0005#\u0000\u0000\u0199\u019a"+
		"\u0003.\u0017\u0000\u019a\u019b\u0005$\u0000\u0000\u019bG\u0001\u0000"+
		"\u0000\u0000\u019c\u019d\u0005I\u0000\u0000\u019d\u019f\u0003\u0010\b"+
		"\u0000\u019e\u019c\u0001\u0000\u0000\u0000\u019f\u01a2\u0001\u0000\u0000"+
		"\u0000\u01a0\u019e\u0001\u0000\u0000\u0000\u01a0\u01a1\u0001\u0000\u0000"+
		"\u0000\u01a1I\u0001\u0000\u0000\u0000\u01a2\u01a0\u0001\u0000\u0000\u0000"+
		"\u01a3\u01a7\u0003L&\u0000\u01a4\u01a7\u0003N\'\u0000\u01a5\u01a7\u0003"+
		"P(\u0000\u01a6\u01a3\u0001\u0000\u0000\u0000\u01a6\u01a4\u0001\u0000\u0000"+
		"\u0000\u01a6\u01a5\u0001\u0000\u0000\u0000\u01a7K\u0001\u0000\u0000\u0000"+
		"\u01a8\u01a9\u0005\u0002\u0000\u0000\u01a9\u01ad\u0006&\uffff\uffff\u0000"+
		"\u01aa\u01ab\u0005\r\u0000\u0000\u01ab\u01ad\u0006&\uffff\uffff\u0000"+
		"\u01ac\u01a8\u0001\u0000\u0000\u0000\u01ac\u01aa\u0001\u0000\u0000\u0000"+
		"\u01ad\u01ae\u0001\u0000\u0000\u0000\u01ae\u01af\u0005#\u0000\u0000\u01af"+
		"\u01b0\u0003X,\u0000\u01b0\u01b1\u0005$\u0000\u0000\u01b1M\u0001\u0000"+
		"\u0000\u0000\u01b2\u01b3\u0005\u000b\u0000\u0000\u01b3\u01b7\u0006\'\uffff"+
		"\uffff\u0000\u01b4\u01b5\u0005\f\u0000\u0000\u01b5\u01b7\u0006\'\uffff"+
		"\uffff\u0000\u01b6\u01b2\u0001\u0000\u0000\u0000\u01b6\u01b4\u0001\u0000"+
		"\u0000\u0000\u01b7\u01b8\u0001\u0000\u0000\u0000\u01b8\u01b9\u0005#\u0000"+
		"\u0000\u01b9\u01ba\u0003X,\u0000\u01ba\u01bb\u0005$\u0000\u0000\u01bb"+
		"O\u0001\u0000\u0000\u0000\u01bc\u01bd\u0005\u000f\u0000\u0000\u01bd\u01be"+
		"\u0006(\uffff\uffff\u0000\u01be\u01c1\u0005#\u0000\u0000\u01bf\u01c2\u0003"+
		"X,\u0000\u01c0\u01c2\u0003T*\u0000\u01c1\u01bf\u0001\u0000\u0000\u0000"+
		"\u01c1\u01c0\u0001\u0000\u0000\u0000\u01c2\u01c3\u0001\u0000\u0000\u0000"+
		"\u01c3\u01c4\u0005$\u0000\u0000\u01c4Q\u0001\u0000\u0000\u0000\u01c5\u01c6"+
		"\u0005&\u0000\u0000\u01c6\u01ca\u0006)\uffff\uffff\u0000\u01c7\u01cb\u0003"+
		"R)\u0000\u01c8\u01cb\u0005\u0018\u0000\u0000\u01c9\u01cb\u0005!\u0000"+
		"\u0000\u01ca\u01c7\u0001\u0000\u0000\u0000\u01ca\u01c8\u0001\u0000\u0000"+
		"\u0000\u01ca\u01c9\u0001\u0000\u0000\u0000\u01cbS\u0001\u0000\u0000\u0000"+
		"\u01cc\u01ce\u0007\u0000\u0000\u0000\u01cd\u01cf\u0003R)\u0000\u01ce\u01cd"+
		"\u0001\u0000\u0000\u0000\u01ce\u01cf\u0001\u0000\u0000\u0000\u01cfU\u0001"+
		"\u0000\u0000\u0000\u01d0\u01dc\u0003X,\u0000\u01d1\u01dd\u0005-\u0000"+
		"\u0000\u01d2\u01d3\u0005.\u0000\u0000\u01d3\u01dd\u0006+\uffff\uffff\u0000"+
		"\u01d4\u01d5\u0005/\u0000\u0000\u01d5\u01dd\u0006+\uffff\uffff\u0000\u01d6"+
		"\u01d7\u00050\u0000\u0000\u01d7\u01dd\u0006+\uffff\uffff\u0000\u01d8\u01d9"+
		"\u00051\u0000\u0000\u01d9\u01dd\u0006+\uffff\uffff\u0000\u01da\u01db\u0005"+
		"2\u0000\u0000\u01db\u01dd\u0006+\uffff\uffff\u0000\u01dc\u01d1\u0001\u0000"+
		"\u0000\u0000\u01dc\u01d2\u0001\u0000\u0000\u0000\u01dc\u01d4\u0001\u0000"+
		"\u0000\u0000\u01dc\u01d6\u0001\u0000\u0000\u0000\u01dc\u01d8\u0001\u0000"+
		"\u0000\u0000\u01dc\u01da\u0001\u0000\u0000\u0000\u01dd\u01de\u0001\u0000"+
		"\u0000\u0000\u01de\u01df\u0003X,\u0000\u01df\u01e0\u0006+\uffff\uffff"+
		"\u0000\u01e0W\u0001\u0000\u0000\u0000\u01e1\u01e2\u0003\\.\u0000\u01e2"+
		"\u01e3\u0003Z-\u0000\u01e3Y\u0001\u0000\u0000\u0000\u01e4\u01e5\u0005"+
		"&\u0000\u0000\u01e5\u01e6\u0003\\.\u0000\u01e6\u01e7\u0006-\uffff\uffff"+
		"\u0000\u01e7\u01e8\u0003Z-\u0000\u01e8\u01eb\u0001\u0000\u0000\u0000\u01e9"+
		"\u01eb\u0001\u0000\u0000\u0000\u01ea\u01e4\u0001\u0000\u0000\u0000\u01ea"+
		"\u01e9\u0001\u0000\u0000\u0000\u01eb[\u0001\u0000\u0000\u0000\u01ec\u01f1"+
		"\u0003^/\u0000\u01ed\u01ee\u0005<\u0000\u0000\u01ee\u01f2\u0006.\uffff"+
		"\uffff\u0000\u01ef\u01f0\u0005=\u0000\u0000\u01f0\u01f2\u0006.\uffff\uffff"+
		"\u0000\u01f1\u01ed\u0001\u0000\u0000\u0000\u01f1\u01ef\u0001\u0000\u0000"+
		"\u0000\u01f2\u01f3\u0001\u0000\u0000\u0000\u01f3\u01f4\u0003^/\u0000\u01f4"+
		"\u01f7\u0001\u0000\u0000\u0000\u01f5\u01f7\u0003`0\u0000\u01f6\u01ec\u0001"+
		"\u0000\u0000\u0000\u01f6\u01f5\u0001\u0000\u0000\u0000\u01f7]\u0001\u0000"+
		"\u0000\u0000\u01f8\u01fd\u0003b1\u0000\u01f9\u01fa\u0005<\u0000\u0000"+
		"\u01fa\u01fe\u0006/\uffff\uffff\u0000\u01fb\u01fc\u0005=\u0000\u0000\u01fc"+
		"\u01fe\u0006/\uffff\uffff\u0000\u01fd\u01f9\u0001\u0000\u0000\u0000\u01fd"+
		"\u01fb\u0001\u0000\u0000\u0000\u01fe\u01ff\u0001\u0000\u0000\u0000\u01ff"+
		"\u0200\u0003b1\u0000\u0200\u0203\u0001\u0000\u0000\u0000\u0201\u0203\u0003"+
		"`0\u0000\u0202\u01f8\u0001\u0000\u0000\u0000\u0202\u0201\u0001\u0000\u0000"+
		"\u0000\u0203_\u0001\u0000\u0000\u0000\u0204\u0209\u0005\u001f\u0000\u0000"+
		"\u0205\u0209\u0005K\u0000\u0000\u0206\u0209\u0005\u0018\u0000\u0000\u0207"+
		"\u0209\u0003d2\u0000\u0208\u0204\u0001\u0000\u0000\u0000\u0208\u0205\u0001"+
		"\u0000\u0000\u0000\u0208\u0206\u0001\u0000\u0000\u0000\u0208\u0207\u0001"+
		"\u0000\u0000\u0000\u0209a\u0001\u0000\u0000\u0000\u020a\u020b\u0005#\u0000"+
		"\u0000\u020b\u020c\u0003\\.\u0000\u020c\u020d\u0005$\u0000\u0000\u020d"+
		"c\u0001\u0000\u0000\u0000\u020e\u020f\u0003h4\u0000\u020f\u0210\u0003"+
		"f3\u0000\u0210e\u0001\u0000\u0000\u0000\u0211\u0212\u0007\u0001\u0000"+
		"\u0000\u0212\u0213\u0003h4\u0000\u0213\u0214\u00063\uffff\uffff\u0000"+
		"\u0214\u0215\u0003f3\u0000\u0215\u0218\u0001\u0000\u0000\u0000\u0216\u0218"+
		"\u0001\u0000\u0000\u0000\u0217\u0211\u0001\u0000\u0000\u0000\u0217\u0216"+
		"\u0001\u0000\u0000\u0000\u0218g\u0001\u0000\u0000\u0000\u0219\u021a\u0003"+
		"l6\u0000\u021a\u021b\u0003j5\u0000\u021bi\u0001\u0000\u0000\u0000\u021c"+
		"\u021d\u0007\u0002\u0000\u0000\u021d\u021e\u0003l6\u0000\u021e\u021f\u0006"+
		"5\uffff\uffff\u0000\u021f\u0220\u0003j5\u0000\u0220\u0223\u0001\u0000"+
		"\u0000\u0000\u0221\u0223\u0001\u0000\u0000\u0000\u0222\u021c\u0001\u0000"+
		"\u0000\u0000\u0222\u0221\u0001\u0000\u0000\u0000\u0223k\u0001\u0000\u0000"+
		"\u0000\u0224\u0225\u0003p8\u0000\u0225\u0226\u0003n7\u0000\u0226m\u0001"+
		"\u0000\u0000\u0000\u0227\u0228\u0007\u0003\u0000\u0000\u0228\u0229\u0003"+
		"p8\u0000\u0229\u022a\u00067\uffff\uffff\u0000\u022a\u022b\u0003n7\u0000"+
		"\u022b\u022e\u0001\u0000\u0000\u0000\u022c\u022e\u0001\u0000\u0000\u0000"+
		"\u022d\u0227\u0001\u0000\u0000\u0000\u022d\u022c\u0001\u0000\u0000\u0000"+
		"\u022eo\u0001\u0000\u0000\u0000\u022f\u0230\u0003t:\u0000\u0230\u0231"+
		"\u0003r9\u0000\u0231q\u0001\u0000\u0000\u0000\u0232\u0233\u0007\u0004"+
		"\u0000\u0000\u0233\u0234\u0003t:\u0000\u0234\u0235\u00069\uffff\uffff"+
		"\u0000\u0235\u0236\u0003r9\u0000\u0236\u0239\u0001\u0000\u0000\u0000\u0237"+
		"\u0239\u0001\u0000\u0000\u0000\u0238\u0232\u0001\u0000\u0000\u0000\u0238"+
		"\u0237\u0001\u0000\u0000\u0000\u0239s\u0001\u0000\u0000\u0000\u023a\u023b"+
		"\u00056\u0000\u0000\u023b\u023f\u0006:\uffff\uffff\u0000\u023c\u023d\u0005"+
		">\u0000\u0000\u023d\u023f\u0006:\uffff\uffff\u0000\u023e\u023a\u0001\u0000"+
		"\u0000\u0000\u023e\u023c\u0001\u0000\u0000\u0000\u023e\u023f\u0001\u0000"+
		"\u0000\u0000\u023f\u0240\u0001\u0000\u0000\u0000\u0240\u0241\u0003v;\u0000"+
		"\u0241u\u0001\u0000\u0000\u0000\u0242\u0247\u0005\u0018\u0000\u0000\u0243"+
		"\u0244\u00053\u0000\u0000\u0244\u0248\u0006;\uffff\uffff\u0000\u0245\u0246"+
		"\u00054\u0000\u0000\u0246\u0248\u0006;\uffff\uffff\u0000\u0247\u0243\u0001"+
		"\u0000\u0000\u0000\u0247\u0245\u0001\u0000\u0000\u0000\u0247\u0248\u0001"+
		"\u0000\u0000\u0000\u0248\u0260\u0001\u0000\u0000\u0000\u0249\u0260\u0003"+
		"|>\u0000\u024a\u024b\u0005#\u0000\u0000\u024b\u024c\u0003X,\u0000\u024c"+
		"\u0251\u0005$\u0000\u0000\u024d\u024e\u00053\u0000\u0000\u024e\u0252\u0006"+
		";\uffff\uffff\u0000\u024f\u0250\u00054\u0000\u0000\u0250\u0252\u0006;"+
		"\uffff\uffff\u0000\u0251\u024d\u0001\u0000\u0000\u0000\u0251\u024f\u0001"+
		"\u0000\u0000\u0000\u0251\u0252\u0001\u0000\u0000\u0000\u0252\u0260\u0001"+
		"\u0000\u0000\u0000\u0253\u0254\u0005\u0018\u0000\u0000\u0254\u0259\u0003"+
		"x<\u0000\u0255\u0256\u00053\u0000\u0000\u0256\u025a\u0006;\uffff\uffff"+
		"\u0000\u0257\u0258\u00054\u0000\u0000\u0258\u025a\u0006;\uffff\uffff\u0000"+
		"\u0259\u0255\u0001\u0000\u0000\u0000\u0259\u0257\u0001\u0000\u0000\u0000"+
		"\u0259\u025a\u0001\u0000\u0000\u0000\u025a\u0260\u0001\u0000\u0000\u0000"+
		"\u025b\u0260\u0003J%\u0000\u025c\u0260\u0003\u001a\r\u0000\u025d\u0260"+
		"\u0003F#\u0000\u025e\u0260\u0003\u0014\n\u0000\u025f\u0242\u0001\u0000"+
		"\u0000\u0000\u025f\u0249\u0001\u0000\u0000\u0000\u025f\u024a\u0001\u0000"+
		"\u0000\u0000\u025f\u0253\u0001\u0000\u0000\u0000\u025f\u025b\u0001\u0000"+
		"\u0000\u0000\u025f\u025c\u0001\u0000\u0000\u0000\u025f\u025d\u0001\u0000"+
		"\u0000\u0000\u025f\u025e\u0001\u0000\u0000\u0000\u0260w\u0001\u0000\u0000"+
		"\u0000\u0261\u0262\u0005?\u0000\u0000\u0262\u0263\u0003\\.\u0000\u0263"+
		"\u0264\u0005@\u0000\u0000\u0264\u0266\u0001\u0000\u0000\u0000\u0265\u0261"+
		"\u0001\u0000\u0000\u0000\u0266\u0269\u0001\u0000\u0000\u0000\u0267\u0265"+
		"\u0001\u0000\u0000\u0000\u0267\u0268\u0001\u0000\u0000\u0000\u0268y\u0001"+
		"\u0000\u0000\u0000\u0269\u0267\u0001\u0000\u0000\u0000\u026a\u026b\u0007"+
		"\u0005\u0000\u0000\u026b{\u0001\u0000\u0000\u0000\u026c\u0273\u0005\u001f"+
		"\u0000\u0000\u026d\u0273\u0005 \u0000\u0000\u026e\u0273\u0003~?\u0000"+
		"\u026f\u0273\u0005!\u0000\u0000\u0270\u0273\u0005\"\u0000\u0000\u0271"+
		"\u0273\u0003@ \u0000\u0272\u026c\u0001\u0000\u0000\u0000\u0272\u026d\u0001"+
		"\u0000\u0000\u0000\u0272\u026e\u0001\u0000\u0000\u0000\u0272\u026f\u0001"+
		"\u0000\u0000\u0000\u0272\u0270\u0001\u0000\u0000\u0000\u0272\u0271\u0001"+
		"\u0000\u0000\u0000\u0273}\u0001\u0000\u0000\u0000\u0274\u0275\u0007\u0006"+
		"\u0000\u0000\u0275\u007f\u0001\u0000\u0000\u00004\u0082\u0084\u009b\u00ab"+
		"\u00b6\u00c3\u00d0\u00d7\u00e5\u00ea\u0107\u0109\u0115\u0117\u011b\u0127"+
		"\u0129\u0133\u0135\u013b\u0155\u0159\u0160\u0162\u0166\u0186\u018b\u01a0"+
		"\u01a6\u01ac\u01b6\u01c1\u01ca\u01ce\u01dc\u01ea\u01f1\u01f6\u01fd\u0202"+
		"\u0208\u0217\u0222\u022d\u0238\u023e\u0247\u0251\u0259\u025f\u0267\u0272";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}