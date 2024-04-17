// Generated from C:/Users/Aryan/Documents/GitHub/PLC-Course-CAs/CA1/FunctionCraft/src/main/grammar/FunctionCraft.g4 by ANTLR 4.13.1
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
		MATCH=17, LOOP_CONTINUE=18, BREAK=19, LOOP=20, DO=21, FOR=22, IN=23, INT=24, 
		FLOAT=25, STRING=26, BOOL=27, LIST=28, FUN_POINTER=29, INT_VAL=30, FLOAT_VAL=31, 
		STRING_VAL=32, BOOL_VAL=33, FUN_POINTER_VAL=34, LPAR=35, RPAR=36, DOT=37, 
		APPEND_SIGN=38, GEQ=39, LEQ=40, GTR=41, LES=42, EQL=43, NEQ=44, ASSIGN=45, 
		ADD_ASSIGN=46, MINUS_ASSIGN=47, MULT_ASSIGN=48, DIV_ASSGIN=49, MOD_ASSIGN=50, 
		INC=51, DEC=52, PLUS=53, MINUS=54, MULT=55, DIV=56, MOD=57, AND=58, OR=59, 
		LOG_AND=60, LOG_OR=61, NOT=62, LBRACKET=63, RBRACKET=64, LBRACE=65, RBRACE=66, 
		COMMA=67, COLON=68, SEMICOLON=69, LAMBDA_STARTER=70, ONE_COMMENT=71, MULTI_COMMENT=72, 
		INDENTIFIER=73, TAB=74, WS=75;
	public static final int
		RULE_comment = 0, RULE_program = 1, RULE_main = 2, RULE_function = 3, 
		RULE_bodyFunction = 4, RULE_arguments = 5, RULE_argInside = 6, RULE_parameter = 7, 
		RULE_paramInside = 8, RULE_statement = 9, RULE_lambdaFunction = 10, RULE_returnInside = 11, 
		RULE_functionReturn = 12, RULE_functionCall = 13, RULE_labdaCall = 14, 
		RULE_loopLoop = 15, RULE_bodyLoop = 16, RULE_forLoop = 17, RULE_forList = 18, 
		RULE_startEnd = 19, RULE_forRange = 20, RULE_argumentsCall = 21, RULE_appendArgument = 22, 
		RULE_if = 23, RULE_elif = 24, RULE_else = 25, RULE_afterIf = 26, RULE_ifInside = 27, 
		RULE_nextIF = 28, RULE_breakIF = 29, RULE_listVal = 30, RULE_listInside = 31, 
		RULE_pattern = 32, RULE_patternInside = 33, RULE_builtInsideFuns = 34, 
		RULE_putPush = 35, RULE_chopChomp = 36, RULE_len = 37, RULE_appendStr = 38, 
		RULE_strExpr = 39, RULE_assignmentExpr = 40, RULE_appendExpr = 41, RULE_appendInside = 42, 
		RULE_logicExpr = 43, RULE_singleLogic = 44, RULE_parLogic = 45, RULE_perEqComp = 46, 
		RULE_eqCompExpr = 47, RULE_perComp = 48, RULE_compExpr = 49, RULE_mathExpr = 50, 
		RULE_addMinusExpr = 51, RULE_preSingleMath = 52, RULE_postSingleMath = 53, 
		RULE_type = 54, RULE_val = 55;
	private static String[] makeRuleNames() {
		return new String[] {
			"comment", "program", "main", "function", "bodyFunction", "arguments", 
			"argInside", "parameter", "paramInside", "statement", "lambdaFunction", 
			"returnInside", "functionReturn", "functionCall", "labdaCall", "loopLoop", 
			"bodyLoop", "forLoop", "forList", "startEnd", "forRange", "argumentsCall", 
			"appendArgument", "if", "elif", "else", "afterIf", "ifInside", "nextIF", 
			"breakIF", "listVal", "listInside", "pattern", "patternInside", "builtInsideFuns", 
			"putPush", "chopChomp", "len", "appendStr", "strExpr", "assignmentExpr", 
			"appendExpr", "appendInside", "logicExpr", "singleLogic", "parLogic", 
			"perEqComp", "eqCompExpr", "perComp", "compExpr", "mathExpr", "addMinusExpr", 
			"preSingleMath", "postSingleMath", "type", "val"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'main'", "'puts'", "'def'", "'end'", "'return'", "'if'", "'else'", 
			"'elseif'", "'true'", "'false'", "'chop'", "'chomp'", "'push'", "'method'", 
			"'len'", "'pattern'", "'match'", "'next'", "'break'", "'loop'", "'do'", 
			"'for'", "'in'", "'int'", "'float'", "'string'", "'bool'", "'list'", 
			"'fptr'", null, null, null, null, null, "'('", "')'", "'.'", "'<<'", 
			"'>='", "'<='", "'>'", "'<'", "'=='", "'!='", "'='", "'+='", "'-='", 
			"'*='", "'/='", "'%='", "'++'", "'--'", "'+'", "'-'", "'*'", "'/'", "'%'", 
			"'&'", "'|'", "'&&'", "'||'", "'!'", "'['", "']'", "'{'", "'}'", "','", 
			"':'", "';'", "'->'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MAIN", "PRINT", "FUN_STARTER", "ENDER", "RETURN", "IF", "ELSE", 
			"ELSEIF", "TRUE", "FALSE", "CHOP", "CHOMP", "PUSH", "METHOD", "LEN", 
			"PATTERN_SIGN", "MATCH", "LOOP_CONTINUE", "BREAK", "LOOP", "DO", "FOR", 
			"IN", "INT", "FLOAT", "STRING", "BOOL", "LIST", "FUN_POINTER", "INT_VAL", 
			"FLOAT_VAL", "STRING_VAL", "BOOL_VAL", "FUN_POINTER_VAL", "LPAR", "RPAR", 
			"DOT", "APPEND_SIGN", "GEQ", "LEQ", "GTR", "LES", "EQL", "NEQ", "ASSIGN", 
			"ADD_ASSIGN", "MINUS_ASSIGN", "MULT_ASSIGN", "DIV_ASSGIN", "MOD_ASSIGN", 
			"INC", "DEC", "PLUS", "MINUS", "MULT", "DIV", "MOD", "AND", "OR", "LOG_AND", 
			"LOG_OR", "NOT", "LBRACKET", "RBRACKET", "LBRACE", "RBRACE", "COMMA", 
			"COLON", "SEMICOLON", "LAMBDA_STARTER", "ONE_COMMENT", "MULTI_COMMENT", 
			"INDENTIFIER", "TAB", "WS"
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
	public static class CommentContext extends ParserRuleContext {
		public TerminalNode ONE_COMMENT() { return getToken(FunctionCraftParser.ONE_COMMENT, 0); }
		public TerminalNode MULTI_COMMENT() { return getToken(FunctionCraftParser.MULTI_COMMENT, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_comment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			_la = _input.LA(1);
			if ( !(_la==ONE_COMMENT || _la==MULTI_COMMENT) ) {
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
		public List<CommentContext> comment() {
			return getRuleContexts(CommentContext.class);
		}
		public CommentContext comment(int i) {
			return getRuleContext(CommentContext.class,i);
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
		enterRule(_localctx, 2, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(116);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case FUN_STARTER:
						{
						setState(114);
						function();
						}
						break;
					case ONE_COMMENT:
					case MULTI_COMMENT:
						{
						setState(115);
						comment();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(120);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(121);
			main();
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ONE_COMMENT || _la==MULTI_COMMENT) {
				{
				{
				setState(122);
				comment();
				}
				}
				setState(127);
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
		enterRule(_localctx, 4, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(FUN_STARTER);
			setState(129);
			match(MAIN);
			setState(130);
			match(LPAR);
			setState(131);
			match(RPAR);
			setState(132);
			bodyFunction();
			setState(133);
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
		public TerminalNode FUN_STARTER() { return getToken(FunctionCraftParser.FUN_STARTER, 0); }
		public TerminalNode INDENTIFIER() { return getToken(FunctionCraftParser.INDENTIFIER, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public BodyFunctionContext bodyFunction() {
			return getRuleContext(BodyFunctionContext.class,0);
		}
		public TerminalNode ENDER() { return getToken(FunctionCraftParser.ENDER, 0); }
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
		enterRule(_localctx, 6, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(FUN_STARTER);
			setState(136);
			match(INDENTIFIER);
			setState(137);
			arguments();
			setState(138);
			bodyFunction();
			setState(139);
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
		enterRule(_localctx, 8, RULE_bodyFunction);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(141);
					statement();
					}
					} 
				}
				setState(146);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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
		enterRule(_localctx, 10, RULE_arguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(LPAR);
			setState(148);
			argInside();
			setState(149);
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
		enterRule(_localctx, 12, RULE_argInside);
		try {
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				match(INDENTIFIER);
				setState(152);
				match(COMMA);
				setState(153);
				argInside();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				parameter();
				setState(155);
				match(COMMA);
				setState(156);
				argInside();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(158);
				match(INDENTIFIER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(159);
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
		enterRule(_localctx, 14, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(LBRACKET);
			setState(163);
			paramInside();
			setState(164);
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
		public AssignmentExprContext assignmentExpr() {
			return getRuleContext(AssignmentExprContext.class,0);
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
		enterRule(_localctx, 16, RULE_paramInside);
		try {
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				assignmentExpr();
				setState(167);
				match(COMMA);
				setState(168);
				paramInside();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				assignmentExpr();
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
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
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
			setState(188);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINT:
			case RETURN:
			case CHOP:
			case CHOMP:
			case PUSH:
			case LEN:
			case PATTERN_SIGN:
			case INT:
			case FLOAT:
			case STRING:
			case BOOL:
			case LIST:
			case FUN_POINTER:
			case LPAR:
			case INDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(180);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(173);
					functionReturn();
					}
					break;
				case 2:
					{
					setState(174);
					functionCall();
					}
					break;
				case 3:
					{
					setState(175);
					builtInsideFuns();
					}
					break;
				case 4:
					{
					setState(176);
					assignmentExpr();
					}
					break;
				case 5:
					{
					setState(177);
					lambdaFunction();
					}
					break;
				case 6:
					{
					setState(178);
					labdaCall();
					}
					break;
				case 7:
					{
					setState(179);
					pattern();
					}
					break;
				}
				setState(182);
				match(SEMICOLON);
				}
				}
				break;
			case ONE_COMMENT:
			case MULTI_COMMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				comment();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(185);
				if_();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(186);
				forLoop();
				}
				break;
			case LOOP:
				enterOuterAlt(_localctx, 5);
				{
				setState(187);
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
			setState(190);
			arguments();
			setState(191);
			match(LBRACE);
			setState(192);
			bodyFunction();
			setState(193);
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
			setState(200);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				match(LPAR);
				setState(196);
				appendArgument();
				setState(197);
				match(RPAR);
				}
				break;
			case INT_VAL:
			case FLOAT_VAL:
			case STRING_VAL:
			case BOOL_VAL:
			case FUN_POINTER_VAL:
			case INDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(199);
				appendArgument();
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
	public static class FunctionReturnContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(FunctionCraftParser.RETURN, 0); }
		public ReturnInsideContext returnInside() {
			return getRuleContext(ReturnInsideContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(FunctionCraftParser.SEMICOLON, 0); }
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
			setState(202);
			match(RETURN);
			setState(203);
			returnInside();
			setState(204);
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
	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode INDENTIFIER() { return getToken(FunctionCraftParser.INDENTIFIER, 0); }
		public ArgumentsCallContext argumentsCall() {
			return getRuleContext(ArgumentsCallContext.class,0);
		}
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
			setState(206);
			match(INDENTIFIER);
			setState(207);
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
			setState(209);
			lambdaFunction();
			setState(210);
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
			setState(212);
			match(LOOP);
			setState(213);
			match(DO);
			setState(214);
			bodyLoop();
			setState(215);
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
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 35422845028L) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 7L) != 0)) {
				{
				setState(222);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(217);
					statement();
					}
					break;
				case 2:
					{
					setState(218);
					match(LOOP_CONTINUE);
					}
					break;
				case 3:
					{
					setState(219);
					match(BREAK);
					}
					break;
				case 4:
					{
					setState(220);
					nextIF();
					}
					break;
				case 5:
					{
					setState(221);
					breakIF();
					}
					break;
				}
				}
				setState(226);
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
		enterRule(_localctx, 34, RULE_forLoop);
		try {
			setState(229);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				forRange();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(228);
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
		enterRule(_localctx, 36, RULE_forList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(FOR);
			setState(232);
			match(INDENTIFIER);
			setState(233);
			match(IN);
			setState(234);
			match(INDENTIFIER);
			setState(235);
			bodyLoop();
			setState(236);
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
	public static class StartEndContext extends ParserRuleContext {
		public TerminalNode INDENTIFIER() { return getToken(FunctionCraftParser.INDENTIFIER, 0); }
		public TerminalNode INT_VAL() { return getToken(FunctionCraftParser.INT_VAL, 0); }
		public StartEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startEnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterStartEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitStartEnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitStartEnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartEndContext startEnd() throws RecognitionException {
		StartEndContext _localctx = new StartEndContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_startEnd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			_la = _input.LA(1);
			if ( !(_la==INT_VAL || _la==INDENTIFIER) ) {
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
	public static class ForRangeContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(FunctionCraftParser.FOR, 0); }
		public TerminalNode INDENTIFIER() { return getToken(FunctionCraftParser.INDENTIFIER, 0); }
		public TerminalNode IN() { return getToken(FunctionCraftParser.IN, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public List<StartEndContext> startEnd() {
			return getRuleContexts(StartEndContext.class);
		}
		public StartEndContext startEnd(int i) {
			return getRuleContext(StartEndContext.class,i);
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
		enterRule(_localctx, 40, RULE_forRange);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(FOR);
			setState(241);
			match(INDENTIFIER);
			setState(242);
			match(IN);
			setState(243);
			match(LPAR);
			setState(244);
			startEnd();
			setState(245);
			match(DOT);
			setState(246);
			match(DOT);
			setState(247);
			startEnd();
			setState(248);
			match(RPAR);
			setState(249);
			bodyLoop();
			setState(250);
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
		enterRule(_localctx, 42, RULE_argumentsCall);
		try {
			setState(257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				appendArgument();
				setState(253);
				match(COMMA);
				setState(254);
				argumentsCall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(256);
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
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public AppendInsideContext appendInside() {
			return getRuleContext(AppendInsideContext.class,0);
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
		enterRule(_localctx, 44, RULE_appendArgument);
		try {
			setState(263);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				appendExpr();
				}
				break;
			case INT_VAL:
			case FLOAT_VAL:
			case STRING_VAL:
			case BOOL_VAL:
			case FUN_POINTER_VAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(260);
				val();
				setState(261);
				appendInside();
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
	public static class IfContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(FunctionCraftParser.IF, 0); }
		public IfInsideContext ifInside() {
			return getRuleContext(IfInsideContext.class,0);
		}
		public ElseContext else_() {
			return getRuleContext(ElseContext.class,0);
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
		enterRule(_localctx, 46, RULE_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(IF);
			setState(266);
			ifInside();
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 35422058852L) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & 7L) != 0)) {
				{
				setState(269);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PRINT:
				case RETURN:
				case IF:
				case CHOP:
				case CHOMP:
				case PUSH:
				case LEN:
				case PATTERN_SIGN:
				case LOOP:
				case FOR:
				case INT:
				case FLOAT:
				case STRING:
				case BOOL:
				case LIST:
				case FUN_POINTER:
				case LPAR:
				case ONE_COMMENT:
				case MULTI_COMMENT:
				case INDENTIFIER:
					{
					setState(267);
					statement();
					}
					break;
				case ELSEIF:
					{
					setState(268);
					elif();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(274);
			else_();
			setState(275);
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
		enterRule(_localctx, 48, RULE_elif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(ELSEIF);
			setState(278);
			ifInside();
			setState(279);
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
		public IfInsideContext ifInside() {
			return getRuleContext(IfInsideContext.class,0);
		}
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
		enterRule(_localctx, 50, RULE_else);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(ELSE);
			setState(282);
			ifInside();
			setState(283);
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
		enterRule(_localctx, 52, RULE_afterIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(IF);
			setState(286);
			ifInside();
			setState(287);
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
		enterRule(_localctx, 54, RULE_ifInside);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(LPAR);
			setState(290);
			logicExpr();
			setState(291);
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
		enterRule(_localctx, 56, RULE_nextIF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(LOOP_CONTINUE);
			setState(294);
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
		enterRule(_localctx, 58, RULE_breakIF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(BREAK);
			setState(297);
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
		enterRule(_localctx, 60, RULE_listVal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(LBRACKET);
			setState(300);
			listInside();
			setState(301);
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
		enterRule(_localctx, 62, RULE_listInside);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			val();
			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(304);
				match(COMMA);
				setState(305);
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
		public TerminalNode PATTERN_SIGN() { return getToken(FunctionCraftParser.PATTERN_SIGN, 0); }
		public TerminalNode INDENTIFIER() { return getToken(FunctionCraftParser.INDENTIFIER, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public PatternInsideContext patternInside() {
			return getRuleContext(PatternInsideContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(FunctionCraftParser.SEMICOLON, 0); }
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
		enterRule(_localctx, 64, RULE_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(PATTERN_SIGN);
			setState(309);
			match(INDENTIFIER);
			setState(310);
			arguments();
			setState(311);
			patternInside();
			setState(312);
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
	public static class PatternInsideContext extends ParserRuleContext {
		public List<TerminalNode> TAB() { return getTokens(FunctionCraftParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(FunctionCraftParser.TAB, i);
		}
		public List<TerminalNode> OR() { return getTokens(FunctionCraftParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(FunctionCraftParser.OR, i);
		}
		public List<AssignmentExprContext> assignmentExpr() {
			return getRuleContexts(AssignmentExprContext.class);
		}
		public AssignmentExprContext assignmentExpr(int i) {
			return getRuleContext(AssignmentExprContext.class,i);
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
		enterRule(_localctx, 66, RULE_patternInside);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TAB) {
				{
				{
				setState(314);
				match(TAB);
				setState(315);
				match(OR);
				setState(316);
				assignmentExpr();
				}
				}
				setState(321);
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
		enterRule(_localctx, 68, RULE_builtInsideFuns);
		try {
			setState(325);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINT:
			case PUSH:
				enterOuterAlt(_localctx, 1);
				{
				setState(322);
				putPush();
				}
				break;
			case CHOP:
			case CHOMP:
				enterOuterAlt(_localctx, 2);
				{
				setState(323);
				chopChomp();
				}
				break;
			case LEN:
				enterOuterAlt(_localctx, 3);
				{
				setState(324);
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
		enterRule(_localctx, 70, RULE_putPush);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			_la = _input.LA(1);
			if ( !(_la==PRINT || _la==PUSH) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(328);
			match(LPAR);
			setState(329);
			appendExpr();
			setState(330);
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
		public StrExprContext strExpr() {
			return getRuleContext(StrExprContext.class,0);
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
		enterRule(_localctx, 72, RULE_chopChomp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			_la = _input.LA(1);
			if ( !(_la==CHOP || _la==CHOMP) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(333);
			match(LPAR);
			setState(334);
			strExpr();
			setState(335);
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
		enterRule(_localctx, 74, RULE_len);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(LEN);
			setState(338);
			match(LPAR);
			setState(341);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(339);
				appendExpr();
				}
				break;
			case 2:
				{
				setState(340);
				strExpr();
				}
				break;
			}
			setState(343);
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
		enterRule(_localctx, 76, RULE_appendStr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			match(APPEND_SIGN);
			setState(349);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case APPEND_SIGN:
				{
				setState(346);
				appendStr();
				}
				break;
			case INDENTIFIER:
				{
				setState(347);
				match(INDENTIFIER);
				}
				break;
			case STRING_VAL:
				{
				setState(348);
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
		public AppendStrContext appendStr() {
			return getRuleContext(AppendStrContext.class,0);
		}
		public TerminalNode INDENTIFIER() { return getToken(FunctionCraftParser.INDENTIFIER, 0); }
		public TerminalNode STRING_VAL() { return getToken(FunctionCraftParser.STRING_VAL, 0); }
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
		enterRule(_localctx, 78, RULE_strExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			_la = _input.LA(1);
			if ( !(_la==STRING_VAL || _la==INDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(352);
			appendStr();
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
		public TerminalNode INDENTIFIER() { return getToken(FunctionCraftParser.INDENTIFIER, 0); }
		public AppendExprContext appendExpr() {
			return getRuleContext(AppendExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(FunctionCraftParser.SEMICOLON, 0); }
		public TerminalNode ASSIGN() { return getToken(FunctionCraftParser.ASSIGN, 0); }
		public TerminalNode ADD_ASSIGN() { return getToken(FunctionCraftParser.ADD_ASSIGN, 0); }
		public TerminalNode MINUS_ASSIGN() { return getToken(FunctionCraftParser.MINUS_ASSIGN, 0); }
		public TerminalNode MULT_ASSIGN() { return getToken(FunctionCraftParser.MULT_ASSIGN, 0); }
		public TerminalNode DIV_ASSGIN() { return getToken(FunctionCraftParser.DIV_ASSGIN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(FunctionCraftParser.MOD_ASSIGN, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
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
		enterRule(_localctx, 80, RULE_assignmentExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1056964608L) != 0)) {
				{
				setState(354);
				type();
				}
			}

			setState(357);
			match(INDENTIFIER);
			setState(358);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2216615441596416L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(359);
			appendExpr();
			setState(360);
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
	public static class AppendExprContext extends ParserRuleContext {
		public TerminalNode INDENTIFIER() { return getToken(FunctionCraftParser.INDENTIFIER, 0); }
		public AppendInsideContext appendInside() {
			return getRuleContext(AppendInsideContext.class,0);
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
		enterRule(_localctx, 82, RULE_appendExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			match(INDENTIFIER);
			setState(363);
			appendInside();
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
	public static class AppendInsideContext extends ParserRuleContext {
		public TerminalNode APPEND_SIGN() { return getToken(FunctionCraftParser.APPEND_SIGN, 0); }
		public LogicExprContext logicExpr() {
			return getRuleContext(LogicExprContext.class,0);
		}
		public AppendInsideContext appendInside() {
			return getRuleContext(AppendInsideContext.class,0);
		}
		public AppendInsideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_appendInside; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterAppendInside(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitAppendInside(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitAppendInside(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AppendInsideContext appendInside() throws RecognitionException {
		AppendInsideContext _localctx = new AppendInsideContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_appendInside);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			match(APPEND_SIGN);
			setState(368);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_VAL:
			case FLOAT_VAL:
			case BOOL_VAL:
			case LPAR:
			case MINUS:
			case NOT:
			case INDENTIFIER:
				{
				setState(366);
				logicExpr();
				}
				break;
			case APPEND_SIGN:
				{
				setState(367);
				appendInside();
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
	public static class LogicExprContext extends ParserRuleContext {
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
		enterRule(_localctx, 86, RULE_logicExpr);
		int _la;
		try {
			setState(375);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(370);
				parLogic();
				setState(371);
				_la = _input.LA(1);
				if ( !(_la==LOG_AND || _la==LOG_OR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(372);
				parLogic();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(374);
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
		enterRule(_localctx, 88, RULE_singleLogic);
		try {
			setState(381);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(377);
				match(INT_VAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(378);
				match(BOOL_VAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(379);
				match(INDENTIFIER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(380);
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
		enterRule(_localctx, 90, RULE_parLogic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			match(LPAR);
			setState(384);
			logicExpr();
			setState(385);
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
	public static class PerEqCompContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public EqCompExprContext eqCompExpr() {
			return getRuleContext(EqCompExprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public PerEqCompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_perEqComp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterPerEqComp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitPerEqComp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitPerEqComp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PerEqCompContext perEqComp() throws RecognitionException {
		PerEqCompContext _localctx = new PerEqCompContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_perEqComp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			match(LPAR);
			setState(388);
			eqCompExpr();
			setState(389);
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
		public List<PerEqCompContext> perEqComp() {
			return getRuleContexts(PerEqCompContext.class);
		}
		public PerEqCompContext perEqComp(int i) {
			return getRuleContext(PerEqCompContext.class,i);
		}
		public TerminalNode EQL() { return getToken(FunctionCraftParser.EQL, 0); }
		public TerminalNode NEQ() { return getToken(FunctionCraftParser.NEQ, 0); }
		public CompExprContext compExpr() {
			return getRuleContext(CompExprContext.class,0);
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
		enterRule(_localctx, 94, RULE_eqCompExpr);
		int _la;
		try {
			setState(396);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(391);
				perEqComp();
				setState(392);
				_la = _input.LA(1);
				if ( !(_la==EQL || _la==NEQ) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(393);
				perEqComp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(395);
				compExpr();
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
	public static class PerCompContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public CompExprContext compExpr() {
			return getRuleContext(CompExprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public PerCompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_perComp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).enterPerComp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FunctionCraftListener ) ((FunctionCraftListener)listener).exitPerComp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FunctionCraftVisitor ) return ((FunctionCraftVisitor<? extends T>)visitor).visitPerComp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PerCompContext perComp() throws RecognitionException {
		PerCompContext _localctx = new PerCompContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_perComp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			match(LPAR);
			setState(399);
			compExpr();
			setState(400);
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
	public static class CompExprContext extends ParserRuleContext {
		public List<PerCompContext> perComp() {
			return getRuleContexts(PerCompContext.class);
		}
		public PerCompContext perComp(int i) {
			return getRuleContext(PerCompContext.class,i);
		}
		public TerminalNode GEQ() { return getToken(FunctionCraftParser.GEQ, 0); }
		public TerminalNode LEQ() { return getToken(FunctionCraftParser.LEQ, 0); }
		public TerminalNode GTR() { return getToken(FunctionCraftParser.GTR, 0); }
		public TerminalNode LES() { return getToken(FunctionCraftParser.LES, 0); }
		public MathExprContext mathExpr() {
			return getRuleContext(MathExprContext.class,0);
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
		enterRule(_localctx, 98, RULE_compExpr);
		int _la;
		try {
			setState(407);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(402);
				perComp();
				setState(403);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8246337208320L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(404);
				perComp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(406);
				mathExpr();
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
	public static class MathExprContext extends ParserRuleContext {
		public AddMinusExprContext addMinusExpr() {
			return getRuleContext(AddMinusExprContext.class,0);
		}
		public MathExprContext mathExpr() {
			return getRuleContext(MathExprContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(FunctionCraftParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(FunctionCraftParser.MINUS, 0); }
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
		enterRule(_localctx, 100, RULE_mathExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			addMinusExpr();
			setState(412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(410);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(411);
				mathExpr();
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
	public static class AddMinusExprContext extends ParserRuleContext {
		public PreSingleMathContext preSingleMath() {
			return getRuleContext(PreSingleMathContext.class,0);
		}
		public AddMinusExprContext addMinusExpr() {
			return getRuleContext(AddMinusExprContext.class,0);
		}
		public TerminalNode MULT() { return getToken(FunctionCraftParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(FunctionCraftParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(FunctionCraftParser.MOD, 0); }
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
		enterRule(_localctx, 102, RULE_addMinusExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			preSingleMath();
			setState(417);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 252201579132747776L) != 0)) {
				{
				setState(415);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 252201579132747776L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(416);
				addMinusExpr();
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
		enterRule(_localctx, 104, RULE_preSingleMath);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS || _la==NOT) {
				{
				setState(419);
				_la = _input.LA(1);
				if ( !(_la==MINUS || _la==NOT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(422);
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
		public TerminalNode INT_VAL() { return getToken(FunctionCraftParser.INT_VAL, 0); }
		public TerminalNode FLOAT_VAL() { return getToken(FunctionCraftParser.FLOAT_VAL, 0); }
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public LogicExprContext logicExpr() {
			return getRuleContext(LogicExprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public TerminalNode LBRACKET() { return getToken(FunctionCraftParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(FunctionCraftParser.RBRACKET, 0); }
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
		enterRule(_localctx, 106, RULE_postSingleMath);
		int _la;
		try {
			setState(442);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(424);
				match(INDENTIFIER);
				setState(426);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INC || _la==DEC) {
					{
					setState(425);
					_la = _input.LA(1);
					if ( !(_la==INC || _la==DEC) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(428);
				_la = _input.LA(1);
				if ( !(_la==INT_VAL || _la==FLOAT_VAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(429);
				match(LPAR);
				setState(430);
				logicExpr();
				setState(431);
				match(RPAR);
				setState(433);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INC || _la==DEC) {
					{
					setState(432);
					_la = _input.LA(1);
					if ( !(_la==INC || _la==DEC) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(435);
				match(INDENTIFIER);
				setState(436);
				match(LBRACKET);
				setState(437);
				logicExpr();
				setState(438);
				match(RBRACKET);
				setState(440);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INC || _la==DEC) {
					{
					setState(439);
					_la = _input.LA(1);
					if ( !(_la==INC || _la==DEC) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

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
		enterRule(_localctx, 108, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1056964608L) != 0)) ) {
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
		public TerminalNode BOOL_VAL() { return getToken(FunctionCraftParser.BOOL_VAL, 0); }
		public TerminalNode STRING_VAL() { return getToken(FunctionCraftParser.STRING_VAL, 0); }
		public TerminalNode FUN_POINTER_VAL() { return getToken(FunctionCraftParser.FUN_POINTER_VAL, 0); }
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
		enterRule(_localctx, 110, RULE_val);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 33285996544L) != 0)) ) {
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
		"\u0004\u0001K\u01c1\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"7\u00077\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0005\u0001u"+
		"\b\u0001\n\u0001\f\u0001x\t\u0001\u0001\u0001\u0001\u0001\u0005\u0001"+
		"|\b\u0001\n\u0001\f\u0001\u007f\t\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0005"+
		"\u0004\u008f\b\u0004\n\u0004\f\u0004\u0092\t\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"\u00a1\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00ac\b\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00b5\b\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0003\t\u00bd\b\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u00c9\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0005\u0010\u00df\b\u0010\n\u0010\f\u0010\u00e2"+
		"\t\u0010\u0001\u0011\u0001\u0011\u0003\u0011\u00e6\b\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0003\u0015\u0102\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0003\u0016\u0108\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0005\u0017\u010e\b\u0017\n\u0017\f\u0017\u0111\t\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0003\u001f\u0133\b\u001f\u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001!\u0001!\u0001!\u0005!\u013e\b!\n!\f!\u0141\t!\u0001"+
		"\"\u0001\"\u0001\"\u0003\"\u0146\b\"\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001%\u0001%\u0001%\u0001%\u0003"+
		"%\u0156\b%\u0001%\u0001%\u0001&\u0001&\u0001&\u0001&\u0003&\u015e\b&\u0001"+
		"\'\u0001\'\u0001\'\u0001(\u0003(\u0164\b(\u0001(\u0001(\u0001(\u0001("+
		"\u0001(\u0001)\u0001)\u0001)\u0001*\u0001*\u0001*\u0003*\u0171\b*\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0003+\u0178\b+\u0001,\u0001,\u0001,\u0001"+
		",\u0003,\u017e\b,\u0001-\u0001-\u0001-\u0001-\u0001.\u0001.\u0001.\u0001"+
		".\u0001/\u0001/\u0001/\u0001/\u0001/\u0003/\u018d\b/\u00010\u00010\u0001"+
		"0\u00010\u00011\u00011\u00011\u00011\u00011\u00031\u0198\b1\u00012\u0001"+
		"2\u00012\u00032\u019d\b2\u00013\u00013\u00013\u00033\u01a2\b3\u00014\u0003"+
		"4\u01a5\b4\u00014\u00014\u00015\u00015\u00035\u01ab\b5\u00015\u00015\u0001"+
		"5\u00015\u00015\u00035\u01b2\b5\u00015\u00015\u00015\u00015\u00015\u0003"+
		"5\u01b9\b5\u00035\u01bb\b5\u00016\u00016\u00017\u00017\u00017\u0000\u0000"+
		"8\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjln\u0000\u0010\u0001"+
		"\u0000GH\u0002\u0000\u001e\u001eII\u0002\u0000\u0002\u0002\r\r\u0001\u0000"+
		"\u000b\f\u0002\u0000  II\u0001\u0000-2\u0001\u0000<=\u0001\u0000+,\u0001"+
		"\u0000\'*\u0001\u000056\u0001\u000079\u0002\u000066>>\u0001\u000034\u0001"+
		"\u0000\u001e\u001f\u0001\u0000\u0018\u001d\u0001\u0000\u001e\"\u01bd\u0000"+
		"p\u0001\u0000\u0000\u0000\u0002v\u0001\u0000\u0000\u0000\u0004\u0080\u0001"+
		"\u0000\u0000\u0000\u0006\u0087\u0001\u0000\u0000\u0000\b\u0090\u0001\u0000"+
		"\u0000\u0000\n\u0093\u0001\u0000\u0000\u0000\f\u00a0\u0001\u0000\u0000"+
		"\u0000\u000e\u00a2\u0001\u0000\u0000\u0000\u0010\u00ab\u0001\u0000\u0000"+
		"\u0000\u0012\u00bc\u0001\u0000\u0000\u0000\u0014\u00be\u0001\u0000\u0000"+
		"\u0000\u0016\u00c8\u0001\u0000\u0000\u0000\u0018\u00ca\u0001\u0000\u0000"+
		"\u0000\u001a\u00ce\u0001\u0000\u0000\u0000\u001c\u00d1\u0001\u0000\u0000"+
		"\u0000\u001e\u00d4\u0001\u0000\u0000\u0000 \u00e0\u0001\u0000\u0000\u0000"+
		"\"\u00e5\u0001\u0000\u0000\u0000$\u00e7\u0001\u0000\u0000\u0000&\u00ee"+
		"\u0001\u0000\u0000\u0000(\u00f0\u0001\u0000\u0000\u0000*\u0101\u0001\u0000"+
		"\u0000\u0000,\u0107\u0001\u0000\u0000\u0000.\u0109\u0001\u0000\u0000\u0000"+
		"0\u0115\u0001\u0000\u0000\u00002\u0119\u0001\u0000\u0000\u00004\u011d"+
		"\u0001\u0000\u0000\u00006\u0121\u0001\u0000\u0000\u00008\u0125\u0001\u0000"+
		"\u0000\u0000:\u0128\u0001\u0000\u0000\u0000<\u012b\u0001\u0000\u0000\u0000"+
		">\u012f\u0001\u0000\u0000\u0000@\u0134\u0001\u0000\u0000\u0000B\u013f"+
		"\u0001\u0000\u0000\u0000D\u0145\u0001\u0000\u0000\u0000F\u0147\u0001\u0000"+
		"\u0000\u0000H\u014c\u0001\u0000\u0000\u0000J\u0151\u0001\u0000\u0000\u0000"+
		"L\u0159\u0001\u0000\u0000\u0000N\u015f\u0001\u0000\u0000\u0000P\u0163"+
		"\u0001\u0000\u0000\u0000R\u016a\u0001\u0000\u0000\u0000T\u016d\u0001\u0000"+
		"\u0000\u0000V\u0177\u0001\u0000\u0000\u0000X\u017d\u0001\u0000\u0000\u0000"+
		"Z\u017f\u0001\u0000\u0000\u0000\\\u0183\u0001\u0000\u0000\u0000^\u018c"+
		"\u0001\u0000\u0000\u0000`\u018e\u0001\u0000\u0000\u0000b\u0197\u0001\u0000"+
		"\u0000\u0000d\u0199\u0001\u0000\u0000\u0000f\u019e\u0001\u0000\u0000\u0000"+
		"h\u01a4\u0001\u0000\u0000\u0000j\u01ba\u0001\u0000\u0000\u0000l\u01bc"+
		"\u0001\u0000\u0000\u0000n\u01be\u0001\u0000\u0000\u0000pq\u0007\u0000"+
		"\u0000\u0000q\u0001\u0001\u0000\u0000\u0000ru\u0003\u0006\u0003\u0000"+
		"su\u0003\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000ts\u0001\u0000\u0000"+
		"\u0000ux\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000vw\u0001\u0000"+
		"\u0000\u0000wy\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000y}\u0003"+
		"\u0004\u0002\u0000z|\u0003\u0000\u0000\u0000{z\u0001\u0000\u0000\u0000"+
		"|\u007f\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000}~\u0001\u0000"+
		"\u0000\u0000~\u0003\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000"+
		"\u0080\u0081\u0005\u0003\u0000\u0000\u0081\u0082\u0005\u0001\u0000\u0000"+
		"\u0082\u0083\u0005#\u0000\u0000\u0083\u0084\u0005$\u0000\u0000\u0084\u0085"+
		"\u0003\b\u0004\u0000\u0085\u0086\u0005\u0004\u0000\u0000\u0086\u0005\u0001"+
		"\u0000\u0000\u0000\u0087\u0088\u0005\u0003\u0000\u0000\u0088\u0089\u0005"+
		"I\u0000\u0000\u0089\u008a\u0003\n\u0005\u0000\u008a\u008b\u0003\b\u0004"+
		"\u0000\u008b\u008c\u0005\u0004\u0000\u0000\u008c\u0007\u0001\u0000\u0000"+
		"\u0000\u008d\u008f\u0003\u0012\t\u0000\u008e\u008d\u0001\u0000\u0000\u0000"+
		"\u008f\u0092\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000\u0000"+
		"\u0090\u0091\u0001\u0000\u0000\u0000\u0091\t\u0001\u0000\u0000\u0000\u0092"+
		"\u0090\u0001\u0000\u0000\u0000\u0093\u0094\u0005#\u0000\u0000\u0094\u0095"+
		"\u0003\f\u0006\u0000\u0095\u0096\u0005$\u0000\u0000\u0096\u000b\u0001"+
		"\u0000\u0000\u0000\u0097\u0098\u0005I\u0000\u0000\u0098\u0099\u0005C\u0000"+
		"\u0000\u0099\u00a1\u0003\f\u0006\u0000\u009a\u009b\u0003\u000e\u0007\u0000"+
		"\u009b\u009c\u0005C\u0000\u0000\u009c\u009d\u0003\f\u0006\u0000\u009d"+
		"\u00a1\u0001\u0000\u0000\u0000\u009e\u00a1\u0005I\u0000\u0000\u009f\u00a1"+
		"\u0003\u000e\u0007\u0000\u00a0\u0097\u0001\u0000\u0000\u0000\u00a0\u009a"+
		"\u0001\u0000\u0000\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a0\u009f"+
		"\u0001\u0000\u0000\u0000\u00a1\r\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005"+
		"?\u0000\u0000\u00a3\u00a4\u0003\u0010\b\u0000\u00a4\u00a5\u0005@\u0000"+
		"\u0000\u00a5\u000f\u0001\u0000\u0000\u0000\u00a6\u00a7\u0003P(\u0000\u00a7"+
		"\u00a8\u0005C\u0000\u0000\u00a8\u00a9\u0003\u0010\b\u0000\u00a9\u00ac"+
		"\u0001\u0000\u0000\u0000\u00aa\u00ac\u0003P(\u0000\u00ab\u00a6\u0001\u0000"+
		"\u0000\u0000\u00ab\u00aa\u0001\u0000\u0000\u0000\u00ac\u0011\u0001\u0000"+
		"\u0000\u0000\u00ad\u00b5\u0003\u0018\f\u0000\u00ae\u00b5\u0003\u001a\r"+
		"\u0000\u00af\u00b5\u0003D\"\u0000\u00b0\u00b5\u0003P(\u0000\u00b1\u00b5"+
		"\u0003\u0014\n\u0000\u00b2\u00b5\u0003\u001c\u000e\u0000\u00b3\u00b5\u0003"+
		"@ \u0000\u00b4\u00ad\u0001\u0000\u0000\u0000\u00b4\u00ae\u0001\u0000\u0000"+
		"\u0000\u00b4\u00af\u0001\u0000\u0000\u0000\u00b4\u00b0\u0001\u0000\u0000"+
		"\u0000\u00b4\u00b1\u0001\u0000\u0000\u0000\u00b4\u00b2\u0001\u0000\u0000"+
		"\u0000\u00b4\u00b3\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000"+
		"\u0000\u00b6\u00b7\u0005E\u0000\u0000\u00b7\u00bd\u0001\u0000\u0000\u0000"+
		"\u00b8\u00bd\u0003\u0000\u0000\u0000\u00b9\u00bd\u0003.\u0017\u0000\u00ba"+
		"\u00bd\u0003\"\u0011\u0000\u00bb\u00bd\u0003\u001e\u000f\u0000\u00bc\u00b4"+
		"\u0001\u0000\u0000\u0000\u00bc\u00b8\u0001\u0000\u0000\u0000\u00bc\u00b9"+
		"\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bc\u00bb"+
		"\u0001\u0000\u0000\u0000\u00bd\u0013\u0001\u0000\u0000\u0000\u00be\u00bf"+
		"\u0003\n\u0005\u0000\u00bf\u00c0\u0005A\u0000\u0000\u00c0\u00c1\u0003"+
		"\b\u0004\u0000\u00c1\u00c2\u0005B\u0000\u0000\u00c2\u0015\u0001\u0000"+
		"\u0000\u0000\u00c3\u00c4\u0005#\u0000\u0000\u00c4\u00c5\u0003,\u0016\u0000"+
		"\u00c5\u00c6\u0005$\u0000\u0000\u00c6\u00c9\u0001\u0000\u0000\u0000\u00c7"+
		"\u00c9\u0003,\u0016\u0000\u00c8\u00c3\u0001\u0000\u0000\u0000\u00c8\u00c7"+
		"\u0001\u0000\u0000\u0000\u00c9\u0017\u0001\u0000\u0000\u0000\u00ca\u00cb"+
		"\u0005\u0005\u0000\u0000\u00cb\u00cc\u0003\u0016\u000b\u0000\u00cc\u00cd"+
		"\u0005E\u0000\u0000\u00cd\u0019\u0001\u0000\u0000\u0000\u00ce\u00cf\u0005"+
		"I\u0000\u0000\u00cf\u00d0\u0003*\u0015\u0000\u00d0\u001b\u0001\u0000\u0000"+
		"\u0000\u00d1\u00d2\u0003\u0014\n\u0000\u00d2\u00d3\u0003*\u0015\u0000"+
		"\u00d3\u001d\u0001\u0000\u0000\u0000\u00d4\u00d5\u0005\u0014\u0000\u0000"+
		"\u00d5\u00d6\u0005\u0015\u0000\u0000\u00d6\u00d7\u0003 \u0010\u0000\u00d7"+
		"\u00d8\u0005\u0004\u0000\u0000\u00d8\u001f\u0001\u0000\u0000\u0000\u00d9"+
		"\u00df\u0003\u0012\t\u0000\u00da\u00df\u0005\u0012\u0000\u0000\u00db\u00df"+
		"\u0005\u0013\u0000\u0000\u00dc\u00df\u00038\u001c\u0000\u00dd\u00df\u0003"+
		":\u001d\u0000\u00de\u00d9\u0001\u0000\u0000\u0000\u00de\u00da\u0001\u0000"+
		"\u0000\u0000\u00de\u00db\u0001\u0000\u0000\u0000\u00de\u00dc\u0001\u0000"+
		"\u0000\u0000\u00de\u00dd\u0001\u0000\u0000\u0000\u00df\u00e2\u0001\u0000"+
		"\u0000\u0000\u00e0\u00de\u0001\u0000\u0000\u0000\u00e0\u00e1\u0001\u0000"+
		"\u0000\u0000\u00e1!\u0001\u0000\u0000\u0000\u00e2\u00e0\u0001\u0000\u0000"+
		"\u0000\u00e3\u00e6\u0003(\u0014\u0000\u00e4\u00e6\u0003$\u0012\u0000\u00e5"+
		"\u00e3\u0001\u0000\u0000\u0000\u00e5\u00e4\u0001\u0000\u0000\u0000\u00e6"+
		"#\u0001\u0000\u0000\u0000\u00e7\u00e8\u0005\u0016\u0000\u0000\u00e8\u00e9"+
		"\u0005I\u0000\u0000\u00e9\u00ea\u0005\u0017\u0000\u0000\u00ea\u00eb\u0005"+
		"I\u0000\u0000\u00eb\u00ec\u0003 \u0010\u0000\u00ec\u00ed\u0005\u0004\u0000"+
		"\u0000\u00ed%\u0001\u0000\u0000\u0000\u00ee\u00ef\u0007\u0001\u0000\u0000"+
		"\u00ef\'\u0001\u0000\u0000\u0000\u00f0\u00f1\u0005\u0016\u0000\u0000\u00f1"+
		"\u00f2\u0005I\u0000\u0000\u00f2\u00f3\u0005\u0017\u0000\u0000\u00f3\u00f4"+
		"\u0005#\u0000\u0000\u00f4\u00f5\u0003&\u0013\u0000\u00f5\u00f6\u0005%"+
		"\u0000\u0000\u00f6\u00f7\u0005%\u0000\u0000\u00f7\u00f8\u0003&\u0013\u0000"+
		"\u00f8\u00f9\u0005$\u0000\u0000\u00f9\u00fa\u0003 \u0010\u0000\u00fa\u00fb"+
		"\u0005\u0004\u0000\u0000\u00fb)\u0001\u0000\u0000\u0000\u00fc\u00fd\u0003"+
		",\u0016\u0000\u00fd\u00fe\u0005C\u0000\u0000\u00fe\u00ff\u0003*\u0015"+
		"\u0000\u00ff\u0102\u0001\u0000\u0000\u0000\u0100\u0102\u0003,\u0016\u0000"+
		"\u0101\u00fc\u0001\u0000\u0000\u0000\u0101\u0100\u0001\u0000\u0000\u0000"+
		"\u0102+\u0001\u0000\u0000\u0000\u0103\u0108\u0003R)\u0000\u0104\u0105"+
		"\u0003n7\u0000\u0105\u0106\u0003T*\u0000\u0106\u0108\u0001\u0000\u0000"+
		"\u0000\u0107\u0103\u0001\u0000\u0000\u0000\u0107\u0104\u0001\u0000\u0000"+
		"\u0000\u0108-\u0001\u0000\u0000\u0000\u0109\u010a\u0005\u0006\u0000\u0000"+
		"\u010a\u010f\u00036\u001b\u0000\u010b\u010e\u0003\u0012\t\u0000\u010c"+
		"\u010e\u00030\u0018\u0000\u010d\u010b\u0001\u0000\u0000\u0000\u010d\u010c"+
		"\u0001\u0000\u0000\u0000\u010e\u0111\u0001\u0000\u0000\u0000\u010f\u010d"+
		"\u0001\u0000\u0000\u0000\u010f\u0110\u0001\u0000\u0000\u0000\u0110\u0112"+
		"\u0001\u0000\u0000\u0000\u0111\u010f\u0001\u0000\u0000\u0000\u0112\u0113"+
		"\u00032\u0019\u0000\u0113\u0114\u0005\u0004\u0000\u0000\u0114/\u0001\u0000"+
		"\u0000\u0000\u0115\u0116\u0005\b\u0000\u0000\u0116\u0117\u00036\u001b"+
		"\u0000\u0117\u0118\u0003\b\u0004\u0000\u01181\u0001\u0000\u0000\u0000"+
		"\u0119\u011a\u0005\u0007\u0000\u0000\u011a\u011b\u00036\u001b\u0000\u011b"+
		"\u011c\u0003\b\u0004\u0000\u011c3\u0001\u0000\u0000\u0000\u011d\u011e"+
		"\u0005\u0006\u0000\u0000\u011e\u011f\u00036\u001b\u0000\u011f\u0120\u0005"+
		"E\u0000\u0000\u01205\u0001\u0000\u0000\u0000\u0121\u0122\u0005#\u0000"+
		"\u0000\u0122\u0123\u0003V+\u0000\u0123\u0124\u0005$\u0000\u0000\u0124"+
		"7\u0001\u0000\u0000\u0000\u0125\u0126\u0005\u0012\u0000\u0000\u0126\u0127"+
		"\u00034\u001a\u0000\u01279\u0001\u0000\u0000\u0000\u0128\u0129\u0005\u0013"+
		"\u0000\u0000\u0129\u012a\u00034\u001a\u0000\u012a;\u0001\u0000\u0000\u0000"+
		"\u012b\u012c\u0005?\u0000\u0000\u012c\u012d\u0003>\u001f\u0000\u012d\u012e"+
		"\u0005@\u0000\u0000\u012e=\u0001\u0000\u0000\u0000\u012f\u0132\u0003n"+
		"7\u0000\u0130\u0131\u0005C\u0000\u0000\u0131\u0133\u0003>\u001f\u0000"+
		"\u0132\u0130\u0001\u0000\u0000\u0000\u0132\u0133\u0001\u0000\u0000\u0000"+
		"\u0133?\u0001\u0000\u0000\u0000\u0134\u0135\u0005\u0010\u0000\u0000\u0135"+
		"\u0136\u0005I\u0000\u0000\u0136\u0137\u0003\n\u0005\u0000\u0137\u0138"+
		"\u0003B!\u0000\u0138\u0139\u0005E\u0000\u0000\u0139A\u0001\u0000\u0000"+
		"\u0000\u013a\u013b\u0005J\u0000\u0000\u013b\u013c\u0005;\u0000\u0000\u013c"+
		"\u013e\u0003P(\u0000\u013d\u013a\u0001\u0000\u0000\u0000\u013e\u0141\u0001"+
		"\u0000\u0000\u0000\u013f\u013d\u0001\u0000\u0000\u0000\u013f\u0140\u0001"+
		"\u0000\u0000\u0000\u0140C\u0001\u0000\u0000\u0000\u0141\u013f\u0001\u0000"+
		"\u0000\u0000\u0142\u0146\u0003F#\u0000\u0143\u0146\u0003H$\u0000\u0144"+
		"\u0146\u0003J%\u0000\u0145\u0142\u0001\u0000\u0000\u0000\u0145\u0143\u0001"+
		"\u0000\u0000\u0000\u0145\u0144\u0001\u0000\u0000\u0000\u0146E\u0001\u0000"+
		"\u0000\u0000\u0147\u0148\u0007\u0002\u0000\u0000\u0148\u0149\u0005#\u0000"+
		"\u0000\u0149\u014a\u0003R)\u0000\u014a\u014b\u0005$\u0000\u0000\u014b"+
		"G\u0001\u0000\u0000\u0000\u014c\u014d\u0007\u0003\u0000\u0000\u014d\u014e"+
		"\u0005#\u0000\u0000\u014e\u014f\u0003N\'\u0000\u014f\u0150\u0005$\u0000"+
		"\u0000\u0150I\u0001\u0000\u0000\u0000\u0151\u0152\u0005\u000f\u0000\u0000"+
		"\u0152\u0155\u0005#\u0000\u0000\u0153\u0156\u0003R)\u0000\u0154\u0156"+
		"\u0003N\'\u0000\u0155\u0153\u0001\u0000\u0000\u0000\u0155\u0154\u0001"+
		"\u0000\u0000\u0000\u0156\u0157\u0001\u0000\u0000\u0000\u0157\u0158\u0005"+
		"$\u0000\u0000\u0158K\u0001\u0000\u0000\u0000\u0159\u015d\u0005&\u0000"+
		"\u0000\u015a\u015e\u0003L&\u0000\u015b\u015e\u0005I\u0000\u0000\u015c"+
		"\u015e\u0005 \u0000\u0000\u015d\u015a\u0001\u0000\u0000\u0000\u015d\u015b"+
		"\u0001\u0000\u0000\u0000\u015d\u015c\u0001\u0000\u0000\u0000\u015eM\u0001"+
		"\u0000\u0000\u0000\u015f\u0160\u0007\u0004\u0000\u0000\u0160\u0161\u0003"+
		"L&\u0000\u0161O\u0001\u0000\u0000\u0000\u0162\u0164\u0003l6\u0000\u0163"+
		"\u0162\u0001\u0000\u0000\u0000\u0163\u0164\u0001\u0000\u0000\u0000\u0164"+
		"\u0165\u0001\u0000\u0000\u0000\u0165\u0166\u0005I\u0000\u0000\u0166\u0167"+
		"\u0007\u0005\u0000\u0000\u0167\u0168\u0003R)\u0000\u0168\u0169\u0005E"+
		"\u0000\u0000\u0169Q\u0001\u0000\u0000\u0000\u016a\u016b\u0005I\u0000\u0000"+
		"\u016b\u016c\u0003T*\u0000\u016cS\u0001\u0000\u0000\u0000\u016d\u0170"+
		"\u0005&\u0000\u0000\u016e\u0171\u0003V+\u0000\u016f\u0171\u0003T*\u0000"+
		"\u0170\u016e\u0001\u0000\u0000\u0000\u0170\u016f\u0001\u0000\u0000\u0000"+
		"\u0171U\u0001\u0000\u0000\u0000\u0172\u0173\u0003Z-\u0000\u0173\u0174"+
		"\u0007\u0006\u0000\u0000\u0174\u0175\u0003Z-\u0000\u0175\u0178\u0001\u0000"+
		"\u0000\u0000\u0176\u0178\u0003X,\u0000\u0177\u0172\u0001\u0000\u0000\u0000"+
		"\u0177\u0176\u0001\u0000\u0000\u0000\u0178W\u0001\u0000\u0000\u0000\u0179"+
		"\u017e\u0005\u001e\u0000\u0000\u017a\u017e\u0005!\u0000\u0000\u017b\u017e"+
		"\u0005I\u0000\u0000\u017c\u017e\u0003^/\u0000\u017d\u0179\u0001\u0000"+
		"\u0000\u0000\u017d\u017a\u0001\u0000\u0000\u0000\u017d\u017b\u0001\u0000"+
		"\u0000\u0000\u017d\u017c\u0001\u0000\u0000\u0000\u017eY\u0001\u0000\u0000"+
		"\u0000\u017f\u0180\u0005#\u0000\u0000\u0180\u0181\u0003V+\u0000\u0181"+
		"\u0182\u0005$\u0000\u0000\u0182[\u0001\u0000\u0000\u0000\u0183\u0184\u0005"+
		"#\u0000\u0000\u0184\u0185\u0003^/\u0000\u0185\u0186\u0005$\u0000\u0000"+
		"\u0186]\u0001\u0000\u0000\u0000\u0187\u0188\u0003\\.\u0000\u0188\u0189"+
		"\u0007\u0007\u0000\u0000\u0189\u018a\u0003\\.\u0000\u018a\u018d\u0001"+
		"\u0000\u0000\u0000\u018b\u018d\u0003b1\u0000\u018c\u0187\u0001\u0000\u0000"+
		"\u0000\u018c\u018b\u0001\u0000\u0000\u0000\u018d_\u0001\u0000\u0000\u0000"+
		"\u018e\u018f\u0005#\u0000\u0000\u018f\u0190\u0003b1\u0000\u0190\u0191"+
		"\u0005$\u0000\u0000\u0191a\u0001\u0000\u0000\u0000\u0192\u0193\u0003`"+
		"0\u0000\u0193\u0194\u0007\b\u0000\u0000\u0194\u0195\u0003`0\u0000\u0195"+
		"\u0198\u0001\u0000\u0000\u0000\u0196\u0198\u0003d2\u0000\u0197\u0192\u0001"+
		"\u0000\u0000\u0000\u0197\u0196\u0001\u0000\u0000\u0000\u0198c\u0001\u0000"+
		"\u0000\u0000\u0199\u019c\u0003f3\u0000\u019a\u019b\u0007\t\u0000\u0000"+
		"\u019b\u019d\u0003d2\u0000\u019c\u019a\u0001\u0000\u0000\u0000\u019c\u019d"+
		"\u0001\u0000\u0000\u0000\u019de\u0001\u0000\u0000\u0000\u019e\u01a1\u0003"+
		"h4\u0000\u019f\u01a0\u0007\n\u0000\u0000\u01a0\u01a2\u0003f3\u0000\u01a1"+
		"\u019f\u0001\u0000\u0000\u0000\u01a1\u01a2\u0001\u0000\u0000\u0000\u01a2"+
		"g\u0001\u0000\u0000\u0000\u01a3\u01a5\u0007\u000b\u0000\u0000\u01a4\u01a3"+
		"\u0001\u0000\u0000\u0000\u01a4\u01a5\u0001\u0000\u0000\u0000\u01a5\u01a6"+
		"\u0001\u0000\u0000\u0000\u01a6\u01a7\u0003j5\u0000\u01a7i\u0001\u0000"+
		"\u0000\u0000\u01a8\u01aa\u0005I\u0000\u0000\u01a9\u01ab\u0007\f\u0000"+
		"\u0000\u01aa\u01a9\u0001\u0000\u0000\u0000\u01aa\u01ab\u0001\u0000\u0000"+
		"\u0000\u01ab\u01bb\u0001\u0000\u0000\u0000\u01ac\u01bb\u0007\r\u0000\u0000"+
		"\u01ad\u01ae\u0005#\u0000\u0000\u01ae\u01af\u0003V+\u0000\u01af\u01b1"+
		"\u0005$\u0000\u0000\u01b0\u01b2\u0007\f\u0000\u0000\u01b1\u01b0\u0001"+
		"\u0000\u0000\u0000\u01b1\u01b2\u0001\u0000\u0000\u0000\u01b2\u01bb\u0001"+
		"\u0000\u0000\u0000\u01b3\u01b4\u0005I\u0000\u0000\u01b4\u01b5\u0005?\u0000"+
		"\u0000\u01b5\u01b6\u0003V+\u0000\u01b6\u01b8\u0005@\u0000\u0000\u01b7"+
		"\u01b9\u0007\f\u0000\u0000\u01b8\u01b7\u0001\u0000\u0000\u0000\u01b8\u01b9"+
		"\u0001\u0000\u0000\u0000\u01b9\u01bb\u0001\u0000\u0000\u0000\u01ba\u01a8"+
		"\u0001\u0000\u0000\u0000\u01ba\u01ac\u0001\u0000\u0000\u0000\u01ba\u01ad"+
		"\u0001\u0000\u0000\u0000\u01ba\u01b3\u0001\u0000\u0000\u0000\u01bbk\u0001"+
		"\u0000\u0000\u0000\u01bc\u01bd\u0007\u000e\u0000\u0000\u01bdm\u0001\u0000"+
		"\u0000\u0000\u01be\u01bf\u0007\u000f\u0000\u0000\u01bfo\u0001\u0000\u0000"+
		"\u0000\"tv}\u0090\u00a0\u00ab\u00b4\u00bc\u00c8\u00de\u00e0\u00e5\u0101"+
		"\u0107\u010d\u010f\u0132\u013f\u0145\u0155\u015d\u0163\u0170\u0177\u017d"+
		"\u018c\u0197\u019c\u01a1\u01a4\u01aa\u01b1\u01b8\u01ba";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}