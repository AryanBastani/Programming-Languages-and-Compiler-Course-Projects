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
		INDENTIFIER=73, TAB=74, WS=75, SINGLELINECOMMENT=76, MULTILINECOMMENT=77, 
		IDENTIFIER=78, For=79, PUT=80;
	public static final int
		RULE_comment = 0, RULE_program = 1, RULE_main = 2, RULE_bodyFunction = 3, 
		RULE_function = 4, RULE_returnInside = 5, RULE_functionReturn = 6, RULE_lambdaFunction = 7, 
		RULE_functionCall = 8, RULE_labdaCall = 9, RULE_arguments = 10, RULE_argInside = 11, 
		RULE_argumentsCall = 12, RULE_parameter = 13, RULE_paramInside = 14, RULE_loopLoop = 15, 
		RULE_bodyLoop = 16, RULE_statement = 17, RULE_forLoop = 18, RULE_forList = 19, 
		RULE_startEnd = 20, RULE_forRange = 21, RULE_ifInside = 22, RULE_afterIf = 23, 
		RULE_nextIF = 24, RULE_breakIF = 25, RULE_if = 26, RULE_elif = 27, RULE_else = 28, 
		RULE_listInside = 29, RULE_listVal = 30, RULE_val = 31, RULE_patternInside = 32, 
		RULE_pattern = 33, RULE_putPush = 34, RULE_chopChomp = 35, RULE_appendStr = 36, 
		RULE_strExpr = 37, RULE_len = 38, RULE_builtInsideFuns = 39, RULE_postSingleMath = 40, 
		RULE_preSingleMath = 41, RULE_addMinusExpr = 42, RULE_mathExpr = 43, RULE_perComp = 44, 
		RULE_compExpr = 45, RULE_perEqComp = 46, RULE_eqCompExpr = 47, RULE_singleLogic = 48, 
		RULE_parLogic = 49, RULE_logicExpr = 50, RULE_appendArgument = 51, RULE_appendExpr = 52, 
		RULE_appendInside = 53, RULE_assignmentExpr = 54, RULE_type = 55;
	private static String[] makeRuleNames() {
		return new String[] {
			"comment", "program", "main", "bodyFunction", "function", "returnInside", 
			"functionReturn", "lambdaFunction", "functionCall", "labdaCall", "arguments", 
			"argInside", "argumentsCall", "parameter", "paramInside", "loopLoop", 
			"bodyLoop", "statement", "forLoop", "forList", "startEnd", "forRange", 
			"ifInside", "afterIf", "nextIF", "breakIF", "if", "elif", "else", "listInside", 
			"listVal", "val", "patternInside", "pattern", "putPush", "chopChomp", 
			"appendStr", "strExpr", "len", "builtInsideFuns", "postSingleMath", "preSingleMath", 
			"addMinusExpr", "mathExpr", "perComp", "compExpr", "perEqComp", "eqCompExpr", 
			"singleLogic", "parLogic", "logicExpr", "appendArgument", "appendExpr", 
			"appendInside", "assignmentExpr", "type"
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
			"INDENTIFIER", "TAB", "WS", "SINGLELINECOMMENT", "MULTILINECOMMENT", 
			"IDENTIFIER", "For", "PUT"
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
		public TerminalNode SINGLELINECOMMENT() { return getToken(FunctionCraftParser.SINGLELINECOMMENT, 0); }
		public TerminalNode MULTILINECOMMENT() { return getToken(FunctionCraftParser.MULTILINECOMMENT, 0); }
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
			if ( !(_la==SINGLELINECOMMENT || _la==MULTILINECOMMENT) ) {
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
					case SINGLELINECOMMENT:
					case MULTILINECOMMENT:
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
			while (_la==SINGLELINECOMMENT || _la==MULTILINECOMMENT) {
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
			setState(138);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(135);
					statement();
					}
					} 
				}
				setState(140);
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
		enterRule(_localctx, 8, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(FUN_STARTER);
			setState(142);
			match(INDENTIFIER);
			setState(143);
			arguments();
			setState(144);
			bodyFunction();
			setState(145);
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
		enterRule(_localctx, 10, RULE_returnInside);
		try {
			setState(152);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				match(LPAR);
				setState(148);
				appendArgument();
				setState(149);
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
				setState(151);
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
		enterRule(_localctx, 12, RULE_functionReturn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(RETURN);
			setState(155);
			returnInside();
			setState(156);
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
		enterRule(_localctx, 14, RULE_lambdaFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			arguments();
			setState(159);
			match(LBRACE);
			setState(160);
			bodyFunction();
			setState(161);
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
		enterRule(_localctx, 16, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(INDENTIFIER);
			setState(164);
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
		enterRule(_localctx, 18, RULE_labdaCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			lambdaFunction();
			setState(167);
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
		enterRule(_localctx, 20, RULE_arguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(LPAR);
			setState(170);
			argInside();
			setState(171);
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
		public TerminalNode IDENTIFIER() { return getToken(FunctionCraftParser.IDENTIFIER, 0); }
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
		enterRule(_localctx, 22, RULE_argInside);
		try {
			setState(182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				match(IDENTIFIER);
				setState(174);
				match(COMMA);
				setState(175);
				argInside();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				parameter();
				setState(177);
				match(COMMA);
				setState(178);
				argInside();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(180);
				match(IDENTIFIER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(181);
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
		enterRule(_localctx, 24, RULE_argumentsCall);
		try {
			setState(189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				appendArgument();
				setState(185);
				match(COMMA);
				setState(186);
				argumentsCall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
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
		enterRule(_localctx, 26, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(LBRACKET);
			setState(192);
			paramInside();
			setState(193);
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
		enterRule(_localctx, 28, RULE_paramInside);
		try {
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				assignmentExpr();
				setState(196);
				match(COMMA);
				setState(197);
				paramInside();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(199);
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
			setState(202);
			match(LOOP);
			setState(203);
			match(DO);
			setState(204);
			bodyLoop();
			setState(205);
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
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1063041120L) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & 249L) != 0)) {
				{
				setState(210);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case RETURN:
				case IF:
				case CHOP:
				case CHOMP:
				case PUSH:
				case LEN:
				case LOOP:
				case FOR:
				case INT:
				case FLOAT:
				case STRING:
				case BOOL:
				case LIST:
				case FUN_POINTER:
				case INDENTIFIER:
				case SINGLELINECOMMENT:
				case MULTILINECOMMENT:
				case IDENTIFIER:
				case For:
				case PUT:
					{
					setState(207);
					statement();
					}
					break;
				case LOOP_CONTINUE:
					{
					setState(208);
					match(LOOP_CONTINUE);
					}
					break;
				case BREAK:
					{
					setState(209);
					match(BREAK);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(214);
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
		enterRule(_localctx, 34, RULE_statement);
		try {
			setState(227);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RETURN:
			case CHOP:
			case CHOMP:
			case PUSH:
			case LEN:
			case INT:
			case FLOAT:
			case STRING:
			case BOOL:
			case LIST:
			case FUN_POINTER:
			case INDENTIFIER:
			case IDENTIFIER:
			case PUT:
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case RETURN:
					{
					setState(215);
					functionReturn();
					}
					break;
				case INDENTIFIER:
					{
					setState(216);
					functionCall();
					}
					break;
				case CHOP:
				case CHOMP:
				case PUSH:
				case LEN:
				case PUT:
					{
					setState(217);
					builtInsideFuns();
					}
					break;
				case INT:
				case FLOAT:
				case STRING:
				case BOOL:
				case LIST:
				case FUN_POINTER:
				case IDENTIFIER:
					{
					setState(218);
					assignmentExpr();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(221);
				match(SEMICOLON);
				}
				break;
			case SINGLELINECOMMENT:
			case MULTILINECOMMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
				comment();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(224);
				if_();
				}
				break;
			case FOR:
			case For:
				enterOuterAlt(_localctx, 4);
				{
				setState(225);
				forLoop();
				}
				break;
			case LOOP:
				enterOuterAlt(_localctx, 5);
				{
				setState(226);
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
		enterRule(_localctx, 36, RULE_forLoop);
		try {
			setState(231);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(229);
				forRange();
				}
				break;
			case For:
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
				forList();
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
	public static class ForListContext extends ParserRuleContext {
		public TerminalNode For() { return getToken(FunctionCraftParser.For, 0); }
		public List<TerminalNode> INDENTIFIER() { return getTokens(FunctionCraftParser.INDENTIFIER); }
		public TerminalNode INDENTIFIER(int i) {
			return getToken(FunctionCraftParser.INDENTIFIER, i);
		}
		public TerminalNode IN() { return getToken(FunctionCraftParser.IN, 0); }
		public BodyFunctionContext bodyFunction() {
			return getRuleContext(BodyFunctionContext.class,0);
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
		enterRule(_localctx, 38, RULE_forList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(For);
			setState(234);
			match(INDENTIFIER);
			setState(235);
			match(IN);
			setState(236);
			match(INDENTIFIER);
			setState(237);
			bodyFunction();
			setState(238);
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
		enterRule(_localctx, 40, RULE_startEnd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
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
		public BodyFunctionContext bodyFunction() {
			return getRuleContext(BodyFunctionContext.class,0);
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
		enterRule(_localctx, 42, RULE_forRange);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(FOR);
			setState(243);
			match(INDENTIFIER);
			setState(244);
			match(IN);
			setState(245);
			match(LPAR);
			setState(246);
			startEnd();
			setState(247);
			match(DOT);
			setState(248);
			match(DOT);
			setState(249);
			startEnd();
			setState(250);
			match(RPAR);
			setState(251);
			bodyFunction();
			setState(252);
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
		enterRule(_localctx, 44, RULE_ifInside);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(LPAR);
			setState(255);
			logicExpr();
			setState(256);
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
		enterRule(_localctx, 46, RULE_afterIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(IF);
			setState(259);
			ifInside();
			setState(260);
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
		enterRule(_localctx, 48, RULE_nextIF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(LOOP_CONTINUE);
			setState(263);
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
		enterRule(_localctx, 50, RULE_breakIF);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(BREAK);
			setState(266);
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
		enterRule(_localctx, 52, RULE_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(IF);
			setState(269);
			ifInside();
			setState(274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1062254944L) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & 249L) != 0)) {
				{
				setState(272);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case RETURN:
				case IF:
				case CHOP:
				case CHOMP:
				case PUSH:
				case LEN:
				case LOOP:
				case FOR:
				case INT:
				case FLOAT:
				case STRING:
				case BOOL:
				case LIST:
				case FUN_POINTER:
				case INDENTIFIER:
				case SINGLELINECOMMENT:
				case MULTILINECOMMENT:
				case IDENTIFIER:
				case For:
				case PUT:
					{
					setState(270);
					statement();
					}
					break;
				case ELSEIF:
					{
					setState(271);
					elif();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(277);
			else_();
			setState(278);
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
		enterRule(_localctx, 54, RULE_elif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(ELSEIF);
			setState(281);
			ifInside();
			setState(282);
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
		enterRule(_localctx, 56, RULE_else);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(ELSE);
			setState(285);
			ifInside();
			setState(286);
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
		enterRule(_localctx, 58, RULE_listInside);
		try {
			setState(293);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(288);
				val();
				setState(289);
				match(COMMA);
				setState(290);
				listInside();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(292);
				val();
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
			setState(295);
			match(LBRACKET);
			setState(296);
			listInside();
			setState(297);
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
		enterRule(_localctx, 62, RULE_val);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
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
		enterRule(_localctx, 64, RULE_patternInside);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TAB) {
				{
				{
				setState(301);
				match(TAB);
				setState(302);
				match(OR);
				setState(303);
				assignmentExpr();
				}
				}
				setState(308);
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
		enterRule(_localctx, 66, RULE_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			match(PATTERN_SIGN);
			setState(310);
			match(INDENTIFIER);
			setState(311);
			arguments();
			setState(312);
			patternInside();
			setState(313);
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
	public static class PutPushContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(FunctionCraftParser.LPAR, 0); }
		public AppendExprContext appendExpr() {
			return getRuleContext(AppendExprContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(FunctionCraftParser.RPAR, 0); }
		public TerminalNode PUT() { return getToken(FunctionCraftParser.PUT, 0); }
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
		enterRule(_localctx, 68, RULE_putPush);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			_la = _input.LA(1);
			if ( !(_la==PUSH || _la==PUT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(316);
			match(LPAR);
			setState(317);
			appendExpr();
			setState(318);
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
		enterRule(_localctx, 70, RULE_chopChomp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			_la = _input.LA(1);
			if ( !(_la==CHOP || _la==CHOMP) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(321);
			match(LPAR);
			setState(322);
			strExpr();
			setState(323);
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
		enterRule(_localctx, 72, RULE_appendStr);
		try {
			setState(331);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(325);
				match(APPEND_SIGN);
				setState(326);
				appendStr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(327);
				match(APPEND_SIGN);
				setState(328);
				match(INDENTIFIER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(329);
				match(APPEND_SIGN);
				setState(330);
				match(STRING_VAL);
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
	public static class StrExprContext extends ParserRuleContext {
		public TerminalNode INDENTIFIER() { return getToken(FunctionCraftParser.INDENTIFIER, 0); }
		public AppendStrContext appendStr() {
			return getRuleContext(AppendStrContext.class,0);
		}
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
		enterRule(_localctx, 74, RULE_strExpr);
		try {
			setState(337);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(333);
				match(INDENTIFIER);
				setState(334);
				appendStr();
				}
				break;
			case STRING_VAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(335);
				match(STRING_VAL);
				setState(336);
				appendStr();
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
		enterRule(_localctx, 76, RULE_len);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			match(LEN);
			setState(340);
			match(LPAR);
			setState(343);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(341);
				appendExpr();
				}
				break;
			case 2:
				{
				setState(342);
				strExpr();
				}
				break;
			}
			setState(345);
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
		enterRule(_localctx, 78, RULE_builtInsideFuns);
		try {
			setState(350);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PUSH:
			case PUT:
				enterOuterAlt(_localctx, 1);
				{
				setState(347);
				putPush();
				}
				break;
			case CHOP:
			case CHOMP:
				enterOuterAlt(_localctx, 2);
				{
				setState(348);
				chopChomp();
				}
				break;
			case LEN:
				enterOuterAlt(_localctx, 3);
				{
				setState(349);
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
		enterRule(_localctx, 80, RULE_postSingleMath);
		int _la;
		try {
			setState(370);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(352);
				match(INDENTIFIER);
				setState(354);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INC || _la==DEC) {
					{
					setState(353);
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
				setState(356);
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
				setState(357);
				match(LPAR);
				setState(358);
				logicExpr();
				setState(359);
				match(RPAR);
				setState(361);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INC || _la==DEC) {
					{
					setState(360);
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
				setState(363);
				match(INDENTIFIER);
				setState(364);
				match(LBRACKET);
				setState(365);
				logicExpr();
				setState(366);
				match(RBRACKET);
				setState(368);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INC || _la==DEC) {
					{
					setState(367);
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
		enterRule(_localctx, 82, RULE_preSingleMath);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS || _la==NOT) {
				{
				setState(372);
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

			setState(375);
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
	public static class AddMinusExprContext extends ParserRuleContext {
		public PreSingleMathContext preSingleMath() {
			return getRuleContext(PreSingleMathContext.class,0);
		}
		public TerminalNode MULT() { return getToken(FunctionCraftParser.MULT, 0); }
		public AddMinusExprContext addMinusExpr() {
			return getRuleContext(AddMinusExprContext.class,0);
		}
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
		enterRule(_localctx, 84, RULE_addMinusExpr);
		try {
			setState(390);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(377);
				preSingleMath();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(378);
				preSingleMath();
				setState(379);
				match(MULT);
				setState(380);
				addMinusExpr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(382);
				preSingleMath();
				setState(383);
				match(DIV);
				setState(384);
				addMinusExpr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(386);
				preSingleMath();
				setState(387);
				match(MOD);
				setState(388);
				addMinusExpr();
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
		public TerminalNode PLUS() { return getToken(FunctionCraftParser.PLUS, 0); }
		public MathExprContext mathExpr() {
			return getRuleContext(MathExprContext.class,0);
		}
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
		enterRule(_localctx, 86, RULE_mathExpr);
		try {
			setState(401);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(392);
				addMinusExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(393);
				addMinusExpr();
				setState(394);
				match(PLUS);
				setState(395);
				mathExpr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(397);
				addMinusExpr();
				setState(398);
				match(MINUS);
				setState(399);
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
		enterRule(_localctx, 88, RULE_perComp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			match(LPAR);
			setState(404);
			compExpr();
			setState(405);
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
		enterRule(_localctx, 90, RULE_compExpr);
		int _la;
		try {
			setState(412);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(407);
				perComp();
				setState(408);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8246337208320L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(409);
				perComp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(411);
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
			setState(414);
			match(LPAR);
			setState(415);
			eqCompExpr();
			setState(416);
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
		try {
			setState(427);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(418);
				perEqComp();
				setState(419);
				match(EQL);
				setState(420);
				perEqComp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(422);
				perEqComp();
				setState(423);
				match(NEQ);
				setState(424);
				perEqComp();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(426);
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
			setState(433);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(429);
				match(INT_VAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(430);
				match(BOOL_VAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(431);
				match(INDENTIFIER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(432);
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
			setState(435);
			match(LPAR);
			setState(436);
			logicExpr();
			setState(437);
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
		enterRule(_localctx, 100, RULE_logicExpr);
		try {
			setState(448);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(439);
				parLogic();
				setState(440);
				match(LOG_AND);
				setState(441);
				parLogic();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(443);
				parLogic();
				setState(444);
				match(LOG_OR);
				setState(445);
				parLogic();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(447);
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
		enterRule(_localctx, 102, RULE_appendArgument);
		try {
			setState(454);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(450);
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
				setState(451);
				val();
				setState(452);
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
		enterRule(_localctx, 104, RULE_appendExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			match(INDENTIFIER);
			setState(457);
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
		enterRule(_localctx, 106, RULE_appendInside);
		try {
			setState(463);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(459);
				match(APPEND_SIGN);
				setState(460);
				logicExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(461);
				match(APPEND_SIGN);
				setState(462);
				appendInside();
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
	public static class AssignmentExprContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(FunctionCraftParser.IDENTIFIER, 0); }
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
		enterRule(_localctx, 108, RULE_assignmentExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1056964608L) != 0)) {
				{
				setState(465);
				type();
				}
			}

			setState(468);
			match(IDENTIFIER);
			setState(469);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2216615441596416L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(470);
			appendExpr();
			setState(471);
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
		enterRule(_localctx, 110, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
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

	public static final String _serializedATN =
		"\u0004\u0001P\u01dc\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0005"+
		"\u0003\u0089\b\u0003\n\u0003\f\u0003\u008c\t\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0099\b\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u00b7\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003"+
		"\f\u00be\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00c9\b\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0005\u0010\u00d3\b\u0010\n\u0010\f\u0010\u00d6\t\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00dc\b\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011"+
		"\u00e4\b\u0011\u0001\u0012\u0001\u0012\u0003\u0012\u00e8\b\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u0111\b\u001a\n\u001a\f\u001a"+
		"\u0114\t\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d"+
		"\u0126\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f"+
		"\u0001\u001f\u0001 \u0001 \u0001 \u0005 \u0131\b \n \f \u0134\t \u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0003$\u014c\b$\u0001%\u0001%\u0001%\u0001%\u0003%\u0152\b%\u0001"+
		"&\u0001&\u0001&\u0001&\u0003&\u0158\b&\u0001&\u0001&\u0001\'\u0001\'\u0001"+
		"\'\u0003\'\u015f\b\'\u0001(\u0001(\u0003(\u0163\b(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0003(\u016a\b(\u0001(\u0001(\u0001(\u0001(\u0001(\u0003"+
		"(\u0171\b(\u0003(\u0173\b(\u0001)\u0003)\u0176\b)\u0001)\u0001)\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0003*\u0187\b*\u0001+\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0003+\u0192\b+\u0001,\u0001,\u0001,\u0001,\u0001"+
		"-\u0001-\u0001-\u0001-\u0001-\u0003-\u019d\b-\u0001.\u0001.\u0001.\u0001"+
		".\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0003"+
		"/\u01ac\b/\u00010\u00010\u00010\u00010\u00030\u01b2\b0\u00011\u00011\u0001"+
		"1\u00011\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u00012\u0001"+
		"2\u00032\u01c1\b2\u00013\u00013\u00013\u00013\u00033\u01c7\b3\u00014\u0001"+
		"4\u00014\u00015\u00015\u00015\u00015\u00035\u01d0\b5\u00016\u00036\u01d3"+
		"\b6\u00016\u00016\u00016\u00016\u00016\u00017\u00017\u00017\u0000\u0000"+
		"8\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjln\u0000\u000b\u0001"+
		"\u0000LM\u0002\u0000\u001e\u001eII\u0001\u0000\u001e\"\u0002\u0000\r\r"+
		"PP\u0001\u0000\u000b\f\u0001\u000034\u0001\u0000\u001e\u001f\u0002\u0000"+
		"66>>\u0001\u0000\'*\u0001\u0000-2\u0001\u0000\u0018\u001d\u01d9\u0000"+
		"p\u0001\u0000\u0000\u0000\u0002v\u0001\u0000\u0000\u0000\u0004\u0080\u0001"+
		"\u0000\u0000\u0000\u0006\u008a\u0001\u0000\u0000\u0000\b\u008d\u0001\u0000"+
		"\u0000\u0000\n\u0098\u0001\u0000\u0000\u0000\f\u009a\u0001\u0000\u0000"+
		"\u0000\u000e\u009e\u0001\u0000\u0000\u0000\u0010\u00a3\u0001\u0000\u0000"+
		"\u0000\u0012\u00a6\u0001\u0000\u0000\u0000\u0014\u00a9\u0001\u0000\u0000"+
		"\u0000\u0016\u00b6\u0001\u0000\u0000\u0000\u0018\u00bd\u0001\u0000\u0000"+
		"\u0000\u001a\u00bf\u0001\u0000\u0000\u0000\u001c\u00c8\u0001\u0000\u0000"+
		"\u0000\u001e\u00ca\u0001\u0000\u0000\u0000 \u00d4\u0001\u0000\u0000\u0000"+
		"\"\u00e3\u0001\u0000\u0000\u0000$\u00e7\u0001\u0000\u0000\u0000&\u00e9"+
		"\u0001\u0000\u0000\u0000(\u00f0\u0001\u0000\u0000\u0000*\u00f2\u0001\u0000"+
		"\u0000\u0000,\u00fe\u0001\u0000\u0000\u0000.\u0102\u0001\u0000\u0000\u0000"+
		"0\u0106\u0001\u0000\u0000\u00002\u0109\u0001\u0000\u0000\u00004\u010c"+
		"\u0001\u0000\u0000\u00006\u0118\u0001\u0000\u0000\u00008\u011c\u0001\u0000"+
		"\u0000\u0000:\u0125\u0001\u0000\u0000\u0000<\u0127\u0001\u0000\u0000\u0000"+
		">\u012b\u0001\u0000\u0000\u0000@\u0132\u0001\u0000\u0000\u0000B\u0135"+
		"\u0001\u0000\u0000\u0000D\u013b\u0001\u0000\u0000\u0000F\u0140\u0001\u0000"+
		"\u0000\u0000H\u014b\u0001\u0000\u0000\u0000J\u0151\u0001\u0000\u0000\u0000"+
		"L\u0153\u0001\u0000\u0000\u0000N\u015e\u0001\u0000\u0000\u0000P\u0172"+
		"\u0001\u0000\u0000\u0000R\u0175\u0001\u0000\u0000\u0000T\u0186\u0001\u0000"+
		"\u0000\u0000V\u0191\u0001\u0000\u0000\u0000X\u0193\u0001\u0000\u0000\u0000"+
		"Z\u019c\u0001\u0000\u0000\u0000\\\u019e\u0001\u0000\u0000\u0000^\u01ab"+
		"\u0001\u0000\u0000\u0000`\u01b1\u0001\u0000\u0000\u0000b\u01b3\u0001\u0000"+
		"\u0000\u0000d\u01c0\u0001\u0000\u0000\u0000f\u01c6\u0001\u0000\u0000\u0000"+
		"h\u01c8\u0001\u0000\u0000\u0000j\u01cf\u0001\u0000\u0000\u0000l\u01d2"+
		"\u0001\u0000\u0000\u0000n\u01d9\u0001\u0000\u0000\u0000pq\u0007\u0000"+
		"\u0000\u0000q\u0001\u0001\u0000\u0000\u0000ru\u0003\b\u0004\u0000su\u0003"+
		"\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000ts\u0001\u0000\u0000\u0000"+
		"ux\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000"+
		"\u0000wy\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000y}\u0003\u0004"+
		"\u0002\u0000z|\u0003\u0000\u0000\u0000{z\u0001\u0000\u0000\u0000|\u007f"+
		"\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000"+
		"\u0000~\u0003\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u0080"+
		"\u0081\u0005\u0003\u0000\u0000\u0081\u0082\u0005\u0001\u0000\u0000\u0082"+
		"\u0083\u0005#\u0000\u0000\u0083\u0084\u0005$\u0000\u0000\u0084\u0085\u0003"+
		"\u0006\u0003\u0000\u0085\u0086\u0005\u0004\u0000\u0000\u0086\u0005\u0001"+
		"\u0000\u0000\u0000\u0087\u0089\u0003\"\u0011\u0000\u0088\u0087\u0001\u0000"+
		"\u0000\u0000\u0089\u008c\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000"+
		"\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u0007\u0001\u0000"+
		"\u0000\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008d\u008e\u0005\u0003"+
		"\u0000\u0000\u008e\u008f\u0005I\u0000\u0000\u008f\u0090\u0003\u0014\n"+
		"\u0000\u0090\u0091\u0003\u0006\u0003\u0000\u0091\u0092\u0005\u0004\u0000"+
		"\u0000\u0092\t\u0001\u0000\u0000\u0000\u0093\u0094\u0005#\u0000\u0000"+
		"\u0094\u0095\u0003f3\u0000\u0095\u0096\u0005$\u0000\u0000\u0096\u0099"+
		"\u0001\u0000\u0000\u0000\u0097\u0099\u0003f3\u0000\u0098\u0093\u0001\u0000"+
		"\u0000\u0000\u0098\u0097\u0001\u0000\u0000\u0000\u0099\u000b\u0001\u0000"+
		"\u0000\u0000\u009a\u009b\u0005\u0005\u0000\u0000\u009b\u009c\u0003\n\u0005"+
		"\u0000\u009c\u009d\u0005E\u0000\u0000\u009d\r\u0001\u0000\u0000\u0000"+
		"\u009e\u009f\u0003\u0014\n\u0000\u009f\u00a0\u0005A\u0000\u0000\u00a0"+
		"\u00a1\u0003\u0006\u0003\u0000\u00a1\u00a2\u0005B\u0000\u0000\u00a2\u000f"+
		"\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005I\u0000\u0000\u00a4\u00a5\u0003"+
		"\u0018\f\u0000\u00a5\u0011\u0001\u0000\u0000\u0000\u00a6\u00a7\u0003\u000e"+
		"\u0007\u0000\u00a7\u00a8\u0003\u0018\f\u0000\u00a8\u0013\u0001\u0000\u0000"+
		"\u0000\u00a9\u00aa\u0005#\u0000\u0000\u00aa\u00ab\u0003\u0016\u000b\u0000"+
		"\u00ab\u00ac\u0005$\u0000\u0000\u00ac\u0015\u0001\u0000\u0000\u0000\u00ad"+
		"\u00ae\u0005N\u0000\u0000\u00ae\u00af\u0005C\u0000\u0000\u00af\u00b7\u0003"+
		"\u0016\u000b\u0000\u00b0\u00b1\u0003\u001a\r\u0000\u00b1\u00b2\u0005C"+
		"\u0000\u0000\u00b2\u00b3\u0003\u0016\u000b\u0000\u00b3\u00b7\u0001\u0000"+
		"\u0000\u0000\u00b4\u00b7\u0005N\u0000\u0000\u00b5\u00b7\u0003\u001a\r"+
		"\u0000\u00b6\u00ad\u0001\u0000\u0000\u0000\u00b6\u00b0\u0001\u0000\u0000"+
		"\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b6\u00b5\u0001\u0000\u0000"+
		"\u0000\u00b7\u0017\u0001\u0000\u0000\u0000\u00b8\u00b9\u0003f3\u0000\u00b9"+
		"\u00ba\u0005C\u0000\u0000\u00ba\u00bb\u0003\u0018\f\u0000\u00bb\u00be"+
		"\u0001\u0000\u0000\u0000\u00bc\u00be\u0003f3\u0000\u00bd\u00b8\u0001\u0000"+
		"\u0000\u0000\u00bd\u00bc\u0001\u0000\u0000\u0000\u00be\u0019\u0001\u0000"+
		"\u0000\u0000\u00bf\u00c0\u0005?\u0000\u0000\u00c0\u00c1\u0003\u001c\u000e"+
		"\u0000\u00c1\u00c2\u0005@\u0000\u0000\u00c2\u001b\u0001\u0000\u0000\u0000"+
		"\u00c3\u00c4\u0003l6\u0000\u00c4\u00c5\u0005C\u0000\u0000\u00c5\u00c6"+
		"\u0003\u001c\u000e\u0000\u00c6\u00c9\u0001\u0000\u0000\u0000\u00c7\u00c9"+
		"\u0003l6\u0000\u00c8\u00c3\u0001\u0000\u0000\u0000\u00c8\u00c7\u0001\u0000"+
		"\u0000\u0000\u00c9\u001d\u0001\u0000\u0000\u0000\u00ca\u00cb\u0005\u0014"+
		"\u0000\u0000\u00cb\u00cc\u0005\u0015\u0000\u0000\u00cc\u00cd\u0003 \u0010"+
		"\u0000\u00cd\u00ce\u0005\u0004\u0000\u0000\u00ce\u001f\u0001\u0000\u0000"+
		"\u0000\u00cf\u00d3\u0003\"\u0011\u0000\u00d0\u00d3\u0005\u0012\u0000\u0000"+
		"\u00d1\u00d3\u0005\u0013\u0000\u0000\u00d2\u00cf\u0001\u0000\u0000\u0000"+
		"\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d1\u0001\u0000\u0000\u0000"+
		"\u00d3\u00d6\u0001\u0000\u0000\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000"+
		"\u00d4\u00d5\u0001\u0000\u0000\u0000\u00d5!\u0001\u0000\u0000\u0000\u00d6"+
		"\u00d4\u0001\u0000\u0000\u0000\u00d7\u00dc\u0003\f\u0006\u0000\u00d8\u00dc"+
		"\u0003\u0010\b\u0000\u00d9\u00dc\u0003N\'\u0000\u00da\u00dc\u0003l6\u0000"+
		"\u00db\u00d7\u0001\u0000\u0000\u0000\u00db\u00d8\u0001\u0000\u0000\u0000"+
		"\u00db\u00d9\u0001\u0000\u0000\u0000\u00db\u00da\u0001\u0000\u0000\u0000"+
		"\u00dc\u00dd\u0001\u0000\u0000\u0000\u00dd\u00de\u0005E\u0000\u0000\u00de"+
		"\u00e4\u0001\u0000\u0000\u0000\u00df\u00e4\u0003\u0000\u0000\u0000\u00e0"+
		"\u00e4\u00034\u001a\u0000\u00e1\u00e4\u0003$\u0012\u0000\u00e2\u00e4\u0003"+
		"\u001e\u000f\u0000\u00e3\u00db\u0001\u0000\u0000\u0000\u00e3\u00df\u0001"+
		"\u0000\u0000\u0000\u00e3\u00e0\u0001\u0000\u0000\u0000\u00e3\u00e1\u0001"+
		"\u0000\u0000\u0000\u00e3\u00e2\u0001\u0000\u0000\u0000\u00e4#\u0001\u0000"+
		"\u0000\u0000\u00e5\u00e8\u0003*\u0015\u0000\u00e6\u00e8\u0003&\u0013\u0000"+
		"\u00e7\u00e5\u0001\u0000\u0000\u0000\u00e7\u00e6\u0001\u0000\u0000\u0000"+
		"\u00e8%\u0001\u0000\u0000\u0000\u00e9\u00ea\u0005O\u0000\u0000\u00ea\u00eb"+
		"\u0005I\u0000\u0000\u00eb\u00ec\u0005\u0017\u0000\u0000\u00ec\u00ed\u0005"+
		"I\u0000\u0000\u00ed\u00ee\u0003\u0006\u0003\u0000\u00ee\u00ef\u0005\u0004"+
		"\u0000\u0000\u00ef\'\u0001\u0000\u0000\u0000\u00f0\u00f1\u0007\u0001\u0000"+
		"\u0000\u00f1)\u0001\u0000\u0000\u0000\u00f2\u00f3\u0005\u0016\u0000\u0000"+
		"\u00f3\u00f4\u0005I\u0000\u0000\u00f4\u00f5\u0005\u0017\u0000\u0000\u00f5"+
		"\u00f6\u0005#\u0000\u0000\u00f6\u00f7\u0003(\u0014\u0000\u00f7\u00f8\u0005"+
		"%\u0000\u0000\u00f8\u00f9\u0005%\u0000\u0000\u00f9\u00fa\u0003(\u0014"+
		"\u0000\u00fa\u00fb\u0005$\u0000\u0000\u00fb\u00fc\u0003\u0006\u0003\u0000"+
		"\u00fc\u00fd\u0005\u0004\u0000\u0000\u00fd+\u0001\u0000\u0000\u0000\u00fe"+
		"\u00ff\u0005#\u0000\u0000\u00ff\u0100\u0003d2\u0000\u0100\u0101\u0005"+
		"$\u0000\u0000\u0101-\u0001\u0000\u0000\u0000\u0102\u0103\u0005\u0006\u0000"+
		"\u0000\u0103\u0104\u0003,\u0016\u0000\u0104\u0105\u0005E\u0000\u0000\u0105"+
		"/\u0001\u0000\u0000\u0000\u0106\u0107\u0005\u0012\u0000\u0000\u0107\u0108"+
		"\u0003.\u0017\u0000\u01081\u0001\u0000\u0000\u0000\u0109\u010a\u0005\u0013"+
		"\u0000\u0000\u010a\u010b\u0003.\u0017\u0000\u010b3\u0001\u0000\u0000\u0000"+
		"\u010c\u010d\u0005\u0006\u0000\u0000\u010d\u0112\u0003,\u0016\u0000\u010e"+
		"\u0111\u0003\"\u0011\u0000\u010f\u0111\u00036\u001b\u0000\u0110\u010e"+
		"\u0001\u0000\u0000\u0000\u0110\u010f\u0001\u0000\u0000\u0000\u0111\u0114"+
		"\u0001\u0000\u0000\u0000\u0112\u0110\u0001\u0000\u0000\u0000\u0112\u0113"+
		"\u0001\u0000\u0000\u0000\u0113\u0115\u0001\u0000\u0000\u0000\u0114\u0112"+
		"\u0001\u0000\u0000\u0000\u0115\u0116\u00038\u001c\u0000\u0116\u0117\u0005"+
		"\u0004\u0000\u0000\u01175\u0001\u0000\u0000\u0000\u0118\u0119\u0005\b"+
		"\u0000\u0000\u0119\u011a\u0003,\u0016\u0000\u011a\u011b\u0003\u0006\u0003"+
		"\u0000\u011b7\u0001\u0000\u0000\u0000\u011c\u011d\u0005\u0007\u0000\u0000"+
		"\u011d\u011e\u0003,\u0016\u0000\u011e\u011f\u0003\u0006\u0003\u0000\u011f"+
		"9\u0001\u0000\u0000\u0000\u0120\u0121\u0003>\u001f\u0000\u0121\u0122\u0005"+
		"C\u0000\u0000\u0122\u0123\u0003:\u001d\u0000\u0123\u0126\u0001\u0000\u0000"+
		"\u0000\u0124\u0126\u0003>\u001f\u0000\u0125\u0120\u0001\u0000\u0000\u0000"+
		"\u0125\u0124\u0001\u0000\u0000\u0000\u0126;\u0001\u0000\u0000\u0000\u0127"+
		"\u0128\u0005?\u0000\u0000\u0128\u0129\u0003:\u001d\u0000\u0129\u012a\u0005"+
		"@\u0000\u0000\u012a=\u0001\u0000\u0000\u0000\u012b\u012c\u0007\u0002\u0000"+
		"\u0000\u012c?\u0001\u0000\u0000\u0000\u012d\u012e\u0005J\u0000\u0000\u012e"+
		"\u012f\u0005;\u0000\u0000\u012f\u0131\u0003l6\u0000\u0130\u012d\u0001"+
		"\u0000\u0000\u0000\u0131\u0134\u0001\u0000\u0000\u0000\u0132\u0130\u0001"+
		"\u0000\u0000\u0000\u0132\u0133\u0001\u0000\u0000\u0000\u0133A\u0001\u0000"+
		"\u0000\u0000\u0134\u0132\u0001\u0000\u0000\u0000\u0135\u0136\u0005\u0010"+
		"\u0000\u0000\u0136\u0137\u0005I\u0000\u0000\u0137\u0138\u0003\u0014\n"+
		"\u0000\u0138\u0139\u0003@ \u0000\u0139\u013a\u0005E\u0000\u0000\u013a"+
		"C\u0001\u0000\u0000\u0000\u013b\u013c\u0007\u0003\u0000\u0000\u013c\u013d"+
		"\u0005#\u0000\u0000\u013d\u013e\u0003h4\u0000\u013e\u013f\u0005$\u0000"+
		"\u0000\u013fE\u0001\u0000\u0000\u0000\u0140\u0141\u0007\u0004\u0000\u0000"+
		"\u0141\u0142\u0005#\u0000\u0000\u0142\u0143\u0003J%\u0000\u0143\u0144"+
		"\u0005$\u0000\u0000\u0144G\u0001\u0000\u0000\u0000\u0145\u0146\u0005&"+
		"\u0000\u0000\u0146\u014c\u0003H$\u0000\u0147\u0148\u0005&\u0000\u0000"+
		"\u0148\u014c\u0005I\u0000\u0000\u0149\u014a\u0005&\u0000\u0000\u014a\u014c"+
		"\u0005 \u0000\u0000\u014b\u0145\u0001\u0000\u0000\u0000\u014b\u0147\u0001"+
		"\u0000\u0000\u0000\u014b\u0149\u0001\u0000\u0000\u0000\u014cI\u0001\u0000"+
		"\u0000\u0000\u014d\u014e\u0005I\u0000\u0000\u014e\u0152\u0003H$\u0000"+
		"\u014f\u0150\u0005 \u0000\u0000\u0150\u0152\u0003H$\u0000\u0151\u014d"+
		"\u0001\u0000\u0000\u0000\u0151\u014f\u0001\u0000\u0000\u0000\u0152K\u0001"+
		"\u0000\u0000\u0000\u0153\u0154\u0005\u000f\u0000\u0000\u0154\u0157\u0005"+
		"#\u0000\u0000\u0155\u0158\u0003h4\u0000\u0156\u0158\u0003J%\u0000\u0157"+
		"\u0155\u0001\u0000\u0000\u0000\u0157\u0156\u0001\u0000\u0000\u0000\u0158"+
		"\u0159\u0001\u0000\u0000\u0000\u0159\u015a\u0005$\u0000\u0000\u015aM\u0001"+
		"\u0000\u0000\u0000\u015b\u015f\u0003D\"\u0000\u015c\u015f\u0003F#\u0000"+
		"\u015d\u015f\u0003L&\u0000\u015e\u015b\u0001\u0000\u0000\u0000\u015e\u015c"+
		"\u0001\u0000\u0000\u0000\u015e\u015d\u0001\u0000\u0000\u0000\u015fO\u0001"+
		"\u0000\u0000\u0000\u0160\u0162\u0005I\u0000\u0000\u0161\u0163\u0007\u0005"+
		"\u0000\u0000\u0162\u0161\u0001\u0000\u0000\u0000\u0162\u0163\u0001\u0000"+
		"\u0000\u0000\u0163\u0173\u0001\u0000\u0000\u0000\u0164\u0173\u0007\u0006"+
		"\u0000\u0000\u0165\u0166\u0005#\u0000\u0000\u0166\u0167\u0003d2\u0000"+
		"\u0167\u0169\u0005$\u0000\u0000\u0168\u016a\u0007\u0005\u0000\u0000\u0169"+
		"\u0168\u0001\u0000\u0000\u0000\u0169\u016a\u0001\u0000\u0000\u0000\u016a"+
		"\u0173\u0001\u0000\u0000\u0000\u016b\u016c\u0005I\u0000\u0000\u016c\u016d"+
		"\u0005?\u0000\u0000\u016d\u016e\u0003d2\u0000\u016e\u0170\u0005@\u0000"+
		"\u0000\u016f\u0171\u0007\u0005\u0000\u0000\u0170\u016f\u0001\u0000\u0000"+
		"\u0000\u0170\u0171\u0001\u0000\u0000\u0000\u0171\u0173\u0001\u0000\u0000"+
		"\u0000\u0172\u0160\u0001\u0000\u0000\u0000\u0172\u0164\u0001\u0000\u0000"+
		"\u0000\u0172\u0165\u0001\u0000\u0000\u0000\u0172\u016b\u0001\u0000\u0000"+
		"\u0000\u0173Q\u0001\u0000\u0000\u0000\u0174\u0176\u0007\u0007\u0000\u0000"+
		"\u0175\u0174\u0001\u0000\u0000\u0000\u0175\u0176\u0001\u0000\u0000\u0000"+
		"\u0176\u0177\u0001\u0000\u0000\u0000\u0177\u0178\u0003P(\u0000\u0178S"+
		"\u0001\u0000\u0000\u0000\u0179\u0187\u0003R)\u0000\u017a\u017b\u0003R"+
		")\u0000\u017b\u017c\u00057\u0000\u0000\u017c\u017d\u0003T*\u0000\u017d"+
		"\u0187\u0001\u0000\u0000\u0000\u017e\u017f\u0003R)\u0000\u017f\u0180\u0005"+
		"8\u0000\u0000\u0180\u0181\u0003T*\u0000\u0181\u0187\u0001\u0000\u0000"+
		"\u0000\u0182\u0183\u0003R)\u0000\u0183\u0184\u00059\u0000\u0000\u0184"+
		"\u0185\u0003T*\u0000\u0185\u0187\u0001\u0000\u0000\u0000\u0186\u0179\u0001"+
		"\u0000\u0000\u0000\u0186\u017a\u0001\u0000\u0000\u0000\u0186\u017e\u0001"+
		"\u0000\u0000\u0000\u0186\u0182\u0001\u0000\u0000\u0000\u0187U\u0001\u0000"+
		"\u0000\u0000\u0188\u0192\u0003T*\u0000\u0189\u018a\u0003T*\u0000\u018a"+
		"\u018b\u00055\u0000\u0000\u018b\u018c\u0003V+\u0000\u018c\u0192\u0001"+
		"\u0000\u0000\u0000\u018d\u018e\u0003T*\u0000\u018e\u018f\u00056\u0000"+
		"\u0000\u018f\u0190\u0003V+\u0000\u0190\u0192\u0001\u0000\u0000\u0000\u0191"+
		"\u0188\u0001\u0000\u0000\u0000\u0191\u0189\u0001\u0000\u0000\u0000\u0191"+
		"\u018d\u0001\u0000\u0000\u0000\u0192W\u0001\u0000\u0000\u0000\u0193\u0194"+
		"\u0005#\u0000\u0000\u0194\u0195\u0003Z-\u0000\u0195\u0196\u0005$\u0000"+
		"\u0000\u0196Y\u0001\u0000\u0000\u0000\u0197\u0198\u0003X,\u0000\u0198"+
		"\u0199\u0007\b\u0000\u0000\u0199\u019a\u0003X,\u0000\u019a\u019d\u0001"+
		"\u0000\u0000\u0000\u019b\u019d\u0003V+\u0000\u019c\u0197\u0001\u0000\u0000"+
		"\u0000\u019c\u019b\u0001\u0000\u0000\u0000\u019d[\u0001\u0000\u0000\u0000"+
		"\u019e\u019f\u0005#\u0000\u0000\u019f\u01a0\u0003^/\u0000\u01a0\u01a1"+
		"\u0005$\u0000\u0000\u01a1]\u0001\u0000\u0000\u0000\u01a2\u01a3\u0003\\"+
		".\u0000\u01a3\u01a4\u0005+\u0000\u0000\u01a4\u01a5\u0003\\.\u0000\u01a5"+
		"\u01ac\u0001\u0000\u0000\u0000\u01a6\u01a7\u0003\\.\u0000\u01a7\u01a8"+
		"\u0005,\u0000\u0000\u01a8\u01a9\u0003\\.\u0000\u01a9\u01ac\u0001\u0000"+
		"\u0000\u0000\u01aa\u01ac\u0003Z-\u0000\u01ab\u01a2\u0001\u0000\u0000\u0000"+
		"\u01ab\u01a6\u0001\u0000\u0000\u0000\u01ab\u01aa\u0001\u0000\u0000\u0000"+
		"\u01ac_\u0001\u0000\u0000\u0000\u01ad\u01b2\u0005\u001e\u0000\u0000\u01ae"+
		"\u01b2\u0005!\u0000\u0000\u01af\u01b2\u0005I\u0000\u0000\u01b0\u01b2\u0003"+
		"^/\u0000\u01b1\u01ad\u0001\u0000\u0000\u0000\u01b1\u01ae\u0001\u0000\u0000"+
		"\u0000\u01b1\u01af\u0001\u0000\u0000\u0000\u01b1\u01b0\u0001\u0000\u0000"+
		"\u0000\u01b2a\u0001\u0000\u0000\u0000\u01b3\u01b4\u0005#\u0000\u0000\u01b4"+
		"\u01b5\u0003d2\u0000\u01b5\u01b6\u0005$\u0000\u0000\u01b6c\u0001\u0000"+
		"\u0000\u0000\u01b7\u01b8\u0003b1\u0000\u01b8\u01b9\u0005<\u0000\u0000"+
		"\u01b9\u01ba\u0003b1\u0000\u01ba\u01c1\u0001\u0000\u0000\u0000\u01bb\u01bc"+
		"\u0003b1\u0000\u01bc\u01bd\u0005=\u0000\u0000\u01bd\u01be\u0003b1\u0000"+
		"\u01be\u01c1\u0001\u0000\u0000\u0000\u01bf\u01c1\u0003`0\u0000\u01c0\u01b7"+
		"\u0001\u0000\u0000\u0000\u01c0\u01bb\u0001\u0000\u0000\u0000\u01c0\u01bf"+
		"\u0001\u0000\u0000\u0000\u01c1e\u0001\u0000\u0000\u0000\u01c2\u01c7\u0003"+
		"h4\u0000\u01c3\u01c4\u0003>\u001f\u0000\u01c4\u01c5\u0003j5\u0000\u01c5"+
		"\u01c7\u0001\u0000\u0000\u0000\u01c6\u01c2\u0001\u0000\u0000\u0000\u01c6"+
		"\u01c3\u0001\u0000\u0000\u0000\u01c7g\u0001\u0000\u0000\u0000\u01c8\u01c9"+
		"\u0005I\u0000\u0000\u01c9\u01ca\u0003j5\u0000\u01cai\u0001\u0000\u0000"+
		"\u0000\u01cb\u01cc\u0005&\u0000\u0000\u01cc\u01d0\u0003d2\u0000\u01cd"+
		"\u01ce\u0005&\u0000\u0000\u01ce\u01d0\u0003j5\u0000\u01cf\u01cb\u0001"+
		"\u0000\u0000\u0000\u01cf\u01cd\u0001\u0000\u0000\u0000\u01d0k\u0001\u0000"+
		"\u0000\u0000\u01d1\u01d3\u0003n7\u0000\u01d2\u01d1\u0001\u0000\u0000\u0000"+
		"\u01d2\u01d3\u0001\u0000\u0000\u0000\u01d3\u01d4\u0001\u0000\u0000\u0000"+
		"\u01d4\u01d5\u0005N\u0000\u0000\u01d5\u01d6\u0007\t\u0000\u0000\u01d6"+
		"\u01d7\u0003h4\u0000\u01d7\u01d8\u0005E\u0000\u0000\u01d8m\u0001\u0000"+
		"\u0000\u0000\u01d9\u01da\u0007\n\u0000\u0000\u01dao\u0001\u0000\u0000"+
		"\u0000#tv}\u008a\u0098\u00b6\u00bd\u00c8\u00d2\u00d4\u00db\u00e3\u00e7"+
		"\u0110\u0112\u0125\u0132\u014b\u0151\u0157\u015e\u0162\u0169\u0170\u0172"+
		"\u0175\u0186\u0191\u019c\u01ab\u01b1\u01c0\u01c6\u01cf\u01d2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}