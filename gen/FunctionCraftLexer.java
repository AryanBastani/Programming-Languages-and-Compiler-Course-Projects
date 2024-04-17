// Generated from C:/Users/Aryan/Documents/GitHub/PLC-Course-CAs/CA1/FunctionCraft/src/main/grammar/FunctionCraft.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class FunctionCraftLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"MAIN", "PRINT", "FUN_STARTER", "ENDER", "RETURN", "IF", "ELSE", "ELSEIF", 
			"TRUE", "FALSE", "CHOP", "CHOMP", "PUSH", "METHOD", "LEN", "PATTERN_SIGN", 
			"MATCH", "LOOP_CONTINUE", "BREAK", "LOOP", "DO", "FOR", "IN", "INT", 
			"FLOAT", "STRING", "BOOL", "LIST", "FUN_POINTER", "INT_VAL", "FLOAT_VAL", 
			"STRING_VAL", "BOOL_VAL", "FUN_POINTER_VAL", "LPAR", "RPAR", "DOT", "APPEND_SIGN", 
			"GEQ", "LEQ", "GTR", "LES", "EQL", "NEQ", "ASSIGN", "ADD_ASSIGN", "MINUS_ASSIGN", 
			"MULT_ASSIGN", "DIV_ASSGIN", "MOD_ASSIGN", "INC", "DEC", "PLUS", "MINUS", 
			"MULT", "DIV", "MOD", "AND", "OR", "LOG_AND", "LOG_OR", "NOT", "LBRACKET", 
			"RBRACKET", "LBRACE", "RBRACE", "COMMA", "COLON", "SEMICOLON", "LAMBDA_STARTER", 
			"ONE_COMMENT", "MULTI_COMMENT", "INDENTIFIER", "TAB", "WS"
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


	public FunctionCraftLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "FunctionCraft.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000K\u01e3\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007"+
		"+\u0002,\u0007,\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u0007"+
		"0\u00021\u00071\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u0007"+
		"5\u00026\u00076\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007"+
		":\u0002;\u0007;\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007"+
		"?\u0002@\u0007@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007"+
		"D\u0002E\u0007E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007"+
		"I\u0002J\u0007J\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d"+
		"\u0005\u001d\u0130\b\u001d\n\u001d\f\u001d\u0133\t\u001d\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0005\u001e\u0138\b\u001e\n\u001e\f\u001e\u013b\t\u001e"+
		"\u0001\u001f\u0001\u001f\u0005\u001f\u013f\b\u001f\n\u001f\f\u001f\u0142"+
		"\t\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0003 \u0148\b \u0001!"+
		"\u0001!\u0001!\u0001!\u0001!\u0001!\u0005!\u0150\b!\n!\f!\u0153\t!\u0001"+
		"!\u0001!\u0001\"\u0001\"\u0001#\u0001#\u0001$\u0001$\u0001%\u0001%\u0001"+
		"%\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001(\u0001(\u0001)\u0001"+
		")\u0001*\u0001*\u0001*\u0001+\u0001+\u0001+\u0001,\u0001,\u0001-\u0001"+
		"-\u0001-\u0001.\u0001.\u0001.\u0001/\u0001/\u0001/\u00010\u00010\u0001"+
		"0\u00011\u00011\u00011\u00012\u00012\u00012\u00013\u00013\u00013\u0001"+
		"4\u00014\u00015\u00015\u00016\u00016\u00017\u00017\u00018\u00018\u0001"+
		"9\u00019\u0001:\u0001:\u0001;\u0001;\u0001;\u0001<\u0001<\u0001<\u0001"+
		"=\u0001=\u0001>\u0001>\u0001?\u0001?\u0001@\u0001@\u0001A\u0001A\u0001"+
		"B\u0001B\u0001C\u0001C\u0001D\u0001D\u0001E\u0001E\u0001E\u0001F\u0001"+
		"F\u0005F\u01b0\bF\nF\fF\u01b3\tF\u0001F\u0001F\u0001G\u0001G\u0001G\u0001"+
		"G\u0001G\u0001G\u0001G\u0001G\u0005G\u01bf\bG\nG\fG\u01c2\tG\u0001G\u0001"+
		"G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001H\u0001H\u0005H\u01cd\bH\nH"+
		"\fH\u01d0\tH\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001"+
		"I\u0003I\u01db\bI\u0001J\u0004J\u01de\bJ\u000bJ\fJ\u01df\u0001J\u0001"+
		"J\u0001\u01c0\u0000K\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t"+
		"\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f"+
		"\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014"+
		")\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b7\u001c9\u001d;\u001e"+
		"=\u001f? A!C\"E#G$I%K&M\'O(Q)S*U+W,Y-[.]/_0a1c2e3g4i5k6m7o8q9s:u;w<y="+
		"{>}?\u007f@\u0081A\u0083B\u0085C\u0087D\u0089E\u008bF\u008dG\u008fH\u0091"+
		"I\u0093J\u0095K\u0001\u0000\u0007\u0001\u000019\u0001\u000009\u0001\u0000"+
		"\"\"\u0001\u0000az\u0004\u000009AZ__az\u0002\u0000\n\n\r\r\u0005\u0000"+
		"\n\n\r\r  ABTT\u01ec\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000"+
		"\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000"+
		"\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000"+
		"\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000"+
		"\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000"+
		"%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001"+
		"\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000"+
		"\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u0000"+
		"3\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00007\u0001"+
		"\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000;\u0001\u0000\u0000"+
		"\u0000\u0000=\u0001\u0000\u0000\u0000\u0000?\u0001\u0000\u0000\u0000\u0000"+
		"A\u0001\u0000\u0000\u0000\u0000C\u0001\u0000\u0000\u0000\u0000E\u0001"+
		"\u0000\u0000\u0000\u0000G\u0001\u0000\u0000\u0000\u0000I\u0001\u0000\u0000"+
		"\u0000\u0000K\u0001\u0000\u0000\u0000\u0000M\u0001\u0000\u0000\u0000\u0000"+
		"O\u0001\u0000\u0000\u0000\u0000Q\u0001\u0000\u0000\u0000\u0000S\u0001"+
		"\u0000\u0000\u0000\u0000U\u0001\u0000\u0000\u0000\u0000W\u0001\u0000\u0000"+
		"\u0000\u0000Y\u0001\u0000\u0000\u0000\u0000[\u0001\u0000\u0000\u0000\u0000"+
		"]\u0001\u0000\u0000\u0000\u0000_\u0001\u0000\u0000\u0000\u0000a\u0001"+
		"\u0000\u0000\u0000\u0000c\u0001\u0000\u0000\u0000\u0000e\u0001\u0000\u0000"+
		"\u0000\u0000g\u0001\u0000\u0000\u0000\u0000i\u0001\u0000\u0000\u0000\u0000"+
		"k\u0001\u0000\u0000\u0000\u0000m\u0001\u0000\u0000\u0000\u0000o\u0001"+
		"\u0000\u0000\u0000\u0000q\u0001\u0000\u0000\u0000\u0000s\u0001\u0000\u0000"+
		"\u0000\u0000u\u0001\u0000\u0000\u0000\u0000w\u0001\u0000\u0000\u0000\u0000"+
		"y\u0001\u0000\u0000\u0000\u0000{\u0001\u0000\u0000\u0000\u0000}\u0001"+
		"\u0000\u0000\u0000\u0000\u007f\u0001\u0000\u0000\u0000\u0000\u0081\u0001"+
		"\u0000\u0000\u0000\u0000\u0083\u0001\u0000\u0000\u0000\u0000\u0085\u0001"+
		"\u0000\u0000\u0000\u0000\u0087\u0001\u0000\u0000\u0000\u0000\u0089\u0001"+
		"\u0000\u0000\u0000\u0000\u008b\u0001\u0000\u0000\u0000\u0000\u008d\u0001"+
		"\u0000\u0000\u0000\u0000\u008f\u0001\u0000\u0000\u0000\u0000\u0091\u0001"+
		"\u0000\u0000\u0000\u0000\u0093\u0001\u0000\u0000\u0000\u0000\u0095\u0001"+
		"\u0000\u0000\u0000\u0001\u0097\u0001\u0000\u0000\u0000\u0003\u009c\u0001"+
		"\u0000\u0000\u0000\u0005\u00a1\u0001\u0000\u0000\u0000\u0007\u00a5\u0001"+
		"\u0000\u0000\u0000\t\u00a9\u0001\u0000\u0000\u0000\u000b\u00b0\u0001\u0000"+
		"\u0000\u0000\r\u00b3\u0001\u0000\u0000\u0000\u000f\u00b8\u0001\u0000\u0000"+
		"\u0000\u0011\u00bf\u0001\u0000\u0000\u0000\u0013\u00c4\u0001\u0000\u0000"+
		"\u0000\u0015\u00ca\u0001\u0000\u0000\u0000\u0017\u00cf\u0001\u0000\u0000"+
		"\u0000\u0019\u00d5\u0001\u0000\u0000\u0000\u001b\u00da\u0001\u0000\u0000"+
		"\u0000\u001d\u00e1\u0001\u0000\u0000\u0000\u001f\u00e5\u0001\u0000\u0000"+
		"\u0000!\u00ed\u0001\u0000\u0000\u0000#\u00f3\u0001\u0000\u0000\u0000%"+
		"\u00f8\u0001\u0000\u0000\u0000\'\u00fe\u0001\u0000\u0000\u0000)\u0103"+
		"\u0001\u0000\u0000\u0000+\u0106\u0001\u0000\u0000\u0000-\u010a\u0001\u0000"+
		"\u0000\u0000/\u010d\u0001\u0000\u0000\u00001\u0111\u0001\u0000\u0000\u0000"+
		"3\u0117\u0001\u0000\u0000\u00005\u011e\u0001\u0000\u0000\u00007\u0123"+
		"\u0001\u0000\u0000\u00009\u0128\u0001\u0000\u0000\u0000;\u012d\u0001\u0000"+
		"\u0000\u0000=\u0134\u0001\u0000\u0000\u0000?\u013c\u0001\u0000\u0000\u0000"+
		"A\u0147\u0001\u0000\u0000\u0000C\u0149\u0001\u0000\u0000\u0000E\u0156"+
		"\u0001\u0000\u0000\u0000G\u0158\u0001\u0000\u0000\u0000I\u015a\u0001\u0000"+
		"\u0000\u0000K\u015c\u0001\u0000\u0000\u0000M\u015f\u0001\u0000\u0000\u0000"+
		"O\u0162\u0001\u0000\u0000\u0000Q\u0165\u0001\u0000\u0000\u0000S\u0167"+
		"\u0001\u0000\u0000\u0000U\u0169\u0001\u0000\u0000\u0000W\u016c\u0001\u0000"+
		"\u0000\u0000Y\u016f\u0001\u0000\u0000\u0000[\u0171\u0001\u0000\u0000\u0000"+
		"]\u0174\u0001\u0000\u0000\u0000_\u0177\u0001\u0000\u0000\u0000a\u017a"+
		"\u0001\u0000\u0000\u0000c\u017d\u0001\u0000\u0000\u0000e\u0180\u0001\u0000"+
		"\u0000\u0000g\u0183\u0001\u0000\u0000\u0000i\u0186\u0001\u0000\u0000\u0000"+
		"k\u0188\u0001\u0000\u0000\u0000m\u018a\u0001\u0000\u0000\u0000o\u018c"+
		"\u0001\u0000\u0000\u0000q\u018e\u0001\u0000\u0000\u0000s\u0190\u0001\u0000"+
		"\u0000\u0000u\u0192\u0001\u0000\u0000\u0000w\u0194\u0001\u0000\u0000\u0000"+
		"y\u0197\u0001\u0000\u0000\u0000{\u019a\u0001\u0000\u0000\u0000}\u019c"+
		"\u0001\u0000\u0000\u0000\u007f\u019e\u0001\u0000\u0000\u0000\u0081\u01a0"+
		"\u0001\u0000\u0000\u0000\u0083\u01a2\u0001\u0000\u0000\u0000\u0085\u01a4"+
		"\u0001\u0000\u0000\u0000\u0087\u01a6\u0001\u0000\u0000\u0000\u0089\u01a8"+
		"\u0001\u0000\u0000\u0000\u008b\u01aa\u0001\u0000\u0000\u0000\u008d\u01ad"+
		"\u0001\u0000\u0000\u0000\u008f\u01b6\u0001\u0000\u0000\u0000\u0091\u01ca"+
		"\u0001\u0000\u0000\u0000\u0093\u01da\u0001\u0000\u0000\u0000\u0095\u01dd"+
		"\u0001\u0000\u0000\u0000\u0097\u0098\u0005m\u0000\u0000\u0098\u0099\u0005"+
		"a\u0000\u0000\u0099\u009a\u0005i\u0000\u0000\u009a\u009b\u0005n\u0000"+
		"\u0000\u009b\u0002\u0001\u0000\u0000\u0000\u009c\u009d\u0005p\u0000\u0000"+
		"\u009d\u009e\u0005u\u0000\u0000\u009e\u009f\u0005t\u0000\u0000\u009f\u00a0"+
		"\u0005s\u0000\u0000\u00a0\u0004\u0001\u0000\u0000\u0000\u00a1\u00a2\u0005"+
		"d\u0000\u0000\u00a2\u00a3\u0005e\u0000\u0000\u00a3\u00a4\u0005f\u0000"+
		"\u0000\u00a4\u0006\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005e\u0000\u0000"+
		"\u00a6\u00a7\u0005n\u0000\u0000\u00a7\u00a8\u0005d\u0000\u0000\u00a8\b"+
		"\u0001\u0000\u0000\u0000\u00a9\u00aa\u0005r\u0000\u0000\u00aa\u00ab\u0005"+
		"e\u0000\u0000\u00ab\u00ac\u0005t\u0000\u0000\u00ac\u00ad\u0005u\u0000"+
		"\u0000\u00ad\u00ae\u0005r\u0000\u0000\u00ae\u00af\u0005n\u0000\u0000\u00af"+
		"\n\u0001\u0000\u0000\u0000\u00b0\u00b1\u0005i\u0000\u0000\u00b1\u00b2"+
		"\u0005f\u0000\u0000\u00b2\f\u0001\u0000\u0000\u0000\u00b3\u00b4\u0005"+
		"e\u0000\u0000\u00b4\u00b5\u0005l\u0000\u0000\u00b5\u00b6\u0005s\u0000"+
		"\u0000\u00b6\u00b7\u0005e\u0000\u0000\u00b7\u000e\u0001\u0000\u0000\u0000"+
		"\u00b8\u00b9\u0005e\u0000\u0000\u00b9\u00ba\u0005l\u0000\u0000\u00ba\u00bb"+
		"\u0005s\u0000\u0000\u00bb\u00bc\u0005e\u0000\u0000\u00bc\u00bd\u0005i"+
		"\u0000\u0000\u00bd\u00be\u0005f\u0000\u0000\u00be\u0010\u0001\u0000\u0000"+
		"\u0000\u00bf\u00c0\u0005t\u0000\u0000\u00c0\u00c1\u0005r\u0000\u0000\u00c1"+
		"\u00c2\u0005u\u0000\u0000\u00c2\u00c3\u0005e\u0000\u0000\u00c3\u0012\u0001"+
		"\u0000\u0000\u0000\u00c4\u00c5\u0005f\u0000\u0000\u00c5\u00c6\u0005a\u0000"+
		"\u0000\u00c6\u00c7\u0005l\u0000\u0000\u00c7\u00c8\u0005s\u0000\u0000\u00c8"+
		"\u00c9\u0005e\u0000\u0000\u00c9\u0014\u0001\u0000\u0000\u0000\u00ca\u00cb"+
		"\u0005c\u0000\u0000\u00cb\u00cc\u0005h\u0000\u0000\u00cc\u00cd\u0005o"+
		"\u0000\u0000\u00cd\u00ce\u0005p\u0000\u0000\u00ce\u0016\u0001\u0000\u0000"+
		"\u0000\u00cf\u00d0\u0005c\u0000\u0000\u00d0\u00d1\u0005h\u0000\u0000\u00d1"+
		"\u00d2\u0005o\u0000\u0000\u00d2\u00d3\u0005m\u0000\u0000\u00d3\u00d4\u0005"+
		"p\u0000\u0000\u00d4\u0018\u0001\u0000\u0000\u0000\u00d5\u00d6\u0005p\u0000"+
		"\u0000\u00d6\u00d7\u0005u\u0000\u0000\u00d7\u00d8\u0005s\u0000\u0000\u00d8"+
		"\u00d9\u0005h\u0000\u0000\u00d9\u001a\u0001\u0000\u0000\u0000\u00da\u00db"+
		"\u0005m\u0000\u0000\u00db\u00dc\u0005e\u0000\u0000\u00dc\u00dd\u0005t"+
		"\u0000\u0000\u00dd\u00de\u0005h\u0000\u0000\u00de\u00df\u0005o\u0000\u0000"+
		"\u00df\u00e0\u0005d\u0000\u0000\u00e0\u001c\u0001\u0000\u0000\u0000\u00e1"+
		"\u00e2\u0005l\u0000\u0000\u00e2\u00e3\u0005e\u0000\u0000\u00e3\u00e4\u0005"+
		"n\u0000\u0000\u00e4\u001e\u0001\u0000\u0000\u0000\u00e5\u00e6\u0005p\u0000"+
		"\u0000\u00e6\u00e7\u0005a\u0000\u0000\u00e7\u00e8\u0005t\u0000\u0000\u00e8"+
		"\u00e9\u0005t\u0000\u0000\u00e9\u00ea\u0005e\u0000\u0000\u00ea\u00eb\u0005"+
		"r\u0000\u0000\u00eb\u00ec\u0005n\u0000\u0000\u00ec \u0001\u0000\u0000"+
		"\u0000\u00ed\u00ee\u0005m\u0000\u0000\u00ee\u00ef\u0005a\u0000\u0000\u00ef"+
		"\u00f0\u0005t\u0000\u0000\u00f0\u00f1\u0005c\u0000\u0000\u00f1\u00f2\u0005"+
		"h\u0000\u0000\u00f2\"\u0001\u0000\u0000\u0000\u00f3\u00f4\u0005n\u0000"+
		"\u0000\u00f4\u00f5\u0005e\u0000\u0000\u00f5\u00f6\u0005x\u0000\u0000\u00f6"+
		"\u00f7\u0005t\u0000\u0000\u00f7$\u0001\u0000\u0000\u0000\u00f8\u00f9\u0005"+
		"b\u0000\u0000\u00f9\u00fa\u0005r\u0000\u0000\u00fa\u00fb\u0005e\u0000"+
		"\u0000\u00fb\u00fc\u0005a\u0000\u0000\u00fc\u00fd\u0005k\u0000\u0000\u00fd"+
		"&\u0001\u0000\u0000\u0000\u00fe\u00ff\u0005l\u0000\u0000\u00ff\u0100\u0005"+
		"o\u0000\u0000\u0100\u0101\u0005o\u0000\u0000\u0101\u0102\u0005p\u0000"+
		"\u0000\u0102(\u0001\u0000\u0000\u0000\u0103\u0104\u0005d\u0000\u0000\u0104"+
		"\u0105\u0005o\u0000\u0000\u0105*\u0001\u0000\u0000\u0000\u0106\u0107\u0005"+
		"f\u0000\u0000\u0107\u0108\u0005o\u0000\u0000\u0108\u0109\u0005r\u0000"+
		"\u0000\u0109,\u0001\u0000\u0000\u0000\u010a\u010b\u0005i\u0000\u0000\u010b"+
		"\u010c\u0005n\u0000\u0000\u010c.\u0001\u0000\u0000\u0000\u010d\u010e\u0005"+
		"i\u0000\u0000\u010e\u010f\u0005n\u0000\u0000\u010f\u0110\u0005t\u0000"+
		"\u0000\u01100\u0001\u0000\u0000\u0000\u0111\u0112\u0005f\u0000\u0000\u0112"+
		"\u0113\u0005l\u0000\u0000\u0113\u0114\u0005o\u0000\u0000\u0114\u0115\u0005"+
		"a\u0000\u0000\u0115\u0116\u0005t\u0000\u0000\u01162\u0001\u0000\u0000"+
		"\u0000\u0117\u0118\u0005s\u0000\u0000\u0118\u0119\u0005t\u0000\u0000\u0119"+
		"\u011a\u0005r\u0000\u0000\u011a\u011b\u0005i\u0000\u0000\u011b\u011c\u0005"+
		"n\u0000\u0000\u011c\u011d\u0005g\u0000\u0000\u011d4\u0001\u0000\u0000"+
		"\u0000\u011e\u011f\u0005b\u0000\u0000\u011f\u0120\u0005o\u0000\u0000\u0120"+
		"\u0121\u0005o\u0000\u0000\u0121\u0122\u0005l\u0000\u0000\u01226\u0001"+
		"\u0000\u0000\u0000\u0123\u0124\u0005l\u0000\u0000\u0124\u0125\u0005i\u0000"+
		"\u0000\u0125\u0126\u0005s\u0000\u0000\u0126\u0127\u0005t\u0000\u0000\u0127"+
		"8\u0001\u0000\u0000\u0000\u0128\u0129\u0005f\u0000\u0000\u0129\u012a\u0005"+
		"p\u0000\u0000\u012a\u012b\u0005t\u0000\u0000\u012b\u012c\u0005r\u0000"+
		"\u0000\u012c:\u0001\u0000\u0000\u0000\u012d\u0131\u0007\u0000\u0000\u0000"+
		"\u012e\u0130\u0007\u0001\u0000\u0000\u012f\u012e\u0001\u0000\u0000\u0000"+
		"\u0130\u0133\u0001\u0000\u0000\u0000\u0131\u012f\u0001\u0000\u0000\u0000"+
		"\u0131\u0132\u0001\u0000\u0000\u0000\u0132<\u0001\u0000\u0000\u0000\u0133"+
		"\u0131\u0001\u0000\u0000\u0000\u0134\u0135\u0003;\u001d\u0000\u0135\u0139"+
		"\u0005.\u0000\u0000\u0136\u0138\u0007\u0001\u0000\u0000\u0137\u0136\u0001"+
		"\u0000\u0000\u0000\u0138\u013b\u0001\u0000\u0000\u0000\u0139\u0137\u0001"+
		"\u0000\u0000\u0000\u0139\u013a\u0001\u0000\u0000\u0000\u013a>\u0001\u0000"+
		"\u0000\u0000\u013b\u0139\u0001\u0000\u0000\u0000\u013c\u0140\u0005\"\u0000"+
		"\u0000\u013d\u013f\b\u0002\u0000\u0000\u013e\u013d\u0001\u0000\u0000\u0000"+
		"\u013f\u0142\u0001\u0000\u0000\u0000\u0140\u013e\u0001\u0000\u0000\u0000"+
		"\u0140\u0141\u0001\u0000\u0000\u0000\u0141\u0143\u0001\u0000\u0000\u0000"+
		"\u0142\u0140\u0001\u0000\u0000\u0000\u0143\u0144\u0005\"\u0000\u0000\u0144"+
		"@\u0001\u0000\u0000\u0000\u0145\u0148\u0003\u0011\b\u0000\u0146\u0148"+
		"\u0003\u0013\t\u0000\u0147\u0145\u0001\u0000\u0000\u0000\u0147\u0146\u0001"+
		"\u0000\u0000\u0000\u0148B\u0001\u0000\u0000\u0000\u0149\u014a\u0003\u001b"+
		"\r\u0000\u014a\u014b\u0005(\u0000\u0000\u014b\u014c\u0005:\u0000\u0000"+
		"\u014c\u014d\u0001\u0000\u0000\u0000\u014d\u0151\u0007\u0003\u0000\u0000"+
		"\u014e\u0150\u0007\u0004\u0000\u0000\u014f\u014e\u0001\u0000\u0000\u0000"+
		"\u0150\u0153\u0001\u0000\u0000\u0000\u0151\u014f\u0001\u0000\u0000\u0000"+
		"\u0151\u0152\u0001\u0000\u0000\u0000\u0152\u0154\u0001\u0000\u0000\u0000"+
		"\u0153\u0151\u0001\u0000\u0000\u0000\u0154\u0155\u0005)\u0000\u0000\u0155"+
		"D\u0001\u0000\u0000\u0000\u0156\u0157\u0005(\u0000\u0000\u0157F\u0001"+
		"\u0000\u0000\u0000\u0158\u0159\u0005)\u0000\u0000\u0159H\u0001\u0000\u0000"+
		"\u0000\u015a\u015b\u0005.\u0000\u0000\u015bJ\u0001\u0000\u0000\u0000\u015c"+
		"\u015d\u0005<\u0000\u0000\u015d\u015e\u0005<\u0000\u0000\u015eL\u0001"+
		"\u0000\u0000\u0000\u015f\u0160\u0005>\u0000\u0000\u0160\u0161\u0005=\u0000"+
		"\u0000\u0161N\u0001\u0000\u0000\u0000\u0162\u0163\u0005<\u0000\u0000\u0163"+
		"\u0164\u0005=\u0000\u0000\u0164P\u0001\u0000\u0000\u0000\u0165\u0166\u0005"+
		">\u0000\u0000\u0166R\u0001\u0000\u0000\u0000\u0167\u0168\u0005<\u0000"+
		"\u0000\u0168T\u0001\u0000\u0000\u0000\u0169\u016a\u0005=\u0000\u0000\u016a"+
		"\u016b\u0005=\u0000\u0000\u016bV\u0001\u0000\u0000\u0000\u016c\u016d\u0005"+
		"!\u0000\u0000\u016d\u016e\u0005=\u0000\u0000\u016eX\u0001\u0000\u0000"+
		"\u0000\u016f\u0170\u0005=\u0000\u0000\u0170Z\u0001\u0000\u0000\u0000\u0171"+
		"\u0172\u0005+\u0000\u0000\u0172\u0173\u0005=\u0000\u0000\u0173\\\u0001"+
		"\u0000\u0000\u0000\u0174\u0175\u0005-\u0000\u0000\u0175\u0176\u0005=\u0000"+
		"\u0000\u0176^\u0001\u0000\u0000\u0000\u0177\u0178\u0005*\u0000\u0000\u0178"+
		"\u0179\u0005=\u0000\u0000\u0179`\u0001\u0000\u0000\u0000\u017a\u017b\u0005"+
		"/\u0000\u0000\u017b\u017c\u0005=\u0000\u0000\u017cb\u0001\u0000\u0000"+
		"\u0000\u017d\u017e\u0005%\u0000\u0000\u017e\u017f\u0005=\u0000\u0000\u017f"+
		"d\u0001\u0000\u0000\u0000\u0180\u0181\u0005+\u0000\u0000\u0181\u0182\u0005"+
		"+\u0000\u0000\u0182f\u0001\u0000\u0000\u0000\u0183\u0184\u0005-\u0000"+
		"\u0000\u0184\u0185\u0005-\u0000\u0000\u0185h\u0001\u0000\u0000\u0000\u0186"+
		"\u0187\u0005+\u0000\u0000\u0187j\u0001\u0000\u0000\u0000\u0188\u0189\u0005"+
		"-\u0000\u0000\u0189l\u0001\u0000\u0000\u0000\u018a\u018b\u0005*\u0000"+
		"\u0000\u018bn\u0001\u0000\u0000\u0000\u018c\u018d\u0005/\u0000\u0000\u018d"+
		"p\u0001\u0000\u0000\u0000\u018e\u018f\u0005%\u0000\u0000\u018fr\u0001"+
		"\u0000\u0000\u0000\u0190\u0191\u0005&\u0000\u0000\u0191t\u0001\u0000\u0000"+
		"\u0000\u0192\u0193\u0005|\u0000\u0000\u0193v\u0001\u0000\u0000\u0000\u0194"+
		"\u0195\u0005&\u0000\u0000\u0195\u0196\u0005&\u0000\u0000\u0196x\u0001"+
		"\u0000\u0000\u0000\u0197\u0198\u0005|\u0000\u0000\u0198\u0199\u0005|\u0000"+
		"\u0000\u0199z\u0001\u0000\u0000\u0000\u019a\u019b\u0005!\u0000\u0000\u019b"+
		"|\u0001\u0000\u0000\u0000\u019c\u019d\u0005[\u0000\u0000\u019d~\u0001"+
		"\u0000\u0000\u0000\u019e\u019f\u0005]\u0000\u0000\u019f\u0080\u0001\u0000"+
		"\u0000\u0000\u01a0\u01a1\u0005{\u0000\u0000\u01a1\u0082\u0001\u0000\u0000"+
		"\u0000\u01a2\u01a3\u0005}\u0000\u0000\u01a3\u0084\u0001\u0000\u0000\u0000"+
		"\u01a4\u01a5\u0005,\u0000\u0000\u01a5\u0086\u0001\u0000\u0000\u0000\u01a6"+
		"\u01a7\u0005:\u0000\u0000\u01a7\u0088\u0001\u0000\u0000\u0000\u01a8\u01a9"+
		"\u0005;\u0000\u0000\u01a9\u008a\u0001\u0000\u0000\u0000\u01aa\u01ab\u0005"+
		"-\u0000\u0000\u01ab\u01ac\u0005>\u0000\u0000\u01ac\u008c\u0001\u0000\u0000"+
		"\u0000\u01ad\u01b1\u0005#\u0000\u0000\u01ae\u01b0\b\u0005\u0000\u0000"+
		"\u01af\u01ae\u0001\u0000\u0000\u0000\u01b0\u01b3\u0001\u0000\u0000\u0000"+
		"\u01b1\u01af\u0001\u0000\u0000\u0000\u01b1\u01b2\u0001\u0000\u0000\u0000"+
		"\u01b2\u01b4\u0001\u0000\u0000\u0000\u01b3\u01b1\u0001\u0000\u0000\u0000"+
		"\u01b4\u01b5\u0006F\u0000\u0000\u01b5\u008e\u0001\u0000\u0000\u0000\u01b6"+
		"\u01b7\u0005=\u0000\u0000\u01b7\u01b8\u0005b\u0000\u0000\u01b8\u01b9\u0005"+
		"e\u0000\u0000\u01b9\u01ba\u0005g\u0000\u0000\u01ba\u01bb\u0005i\u0000"+
		"\u0000\u01bb\u01bc\u0005n\u0000\u0000\u01bc\u01c0\u0001\u0000\u0000\u0000"+
		"\u01bd\u01bf\t\u0000\u0000\u0000\u01be\u01bd\u0001\u0000\u0000\u0000\u01bf"+
		"\u01c2\u0001\u0000\u0000\u0000\u01c0\u01c1\u0001\u0000\u0000\u0000\u01c0"+
		"\u01be\u0001\u0000\u0000\u0000\u01c1\u01c3\u0001\u0000\u0000\u0000\u01c2"+
		"\u01c0\u0001\u0000\u0000\u0000\u01c3\u01c4\u0005=\u0000\u0000\u01c4\u01c5"+
		"\u0005e\u0000\u0000\u01c5\u01c6\u0005n\u0000\u0000\u01c6\u01c7\u0005d"+
		"\u0000\u0000\u01c7\u01c8\u0001\u0000\u0000\u0000\u01c8\u01c9\u0006G\u0000"+
		"\u0000\u01c9\u0090\u0001\u0000\u0000\u0000\u01ca\u01ce\u0007\u0003\u0000"+
		"\u0000\u01cb\u01cd\u0007\u0004\u0000\u0000\u01cc\u01cb\u0001\u0000\u0000"+
		"\u0000\u01cd\u01d0\u0001\u0000\u0000\u0000\u01ce\u01cc\u0001\u0000\u0000"+
		"\u0000\u01ce\u01cf\u0001\u0000\u0000\u0000\u01cf\u0092\u0001\u0000\u0000"+
		"\u0000\u01d0\u01ce\u0001\u0000\u0000\u0000\u01d1\u01d2\u0005\r\u0000\u0000"+
		"\u01d2\u01d3\u0005\n\u0000\u0000\u01d3\u01db\u0005\t\u0000\u0000\u01d4"+
		"\u01d5\u0005\r\u0000\u0000\u01d5\u01d6\u0005\n\u0000\u0000\u01d6\u01d7"+
		"\u0005 \u0000\u0000\u01d7\u01d8\u0005 \u0000\u0000\u01d8\u01d9\u0005 "+
		"\u0000\u0000\u01d9\u01db\u0005 \u0000\u0000\u01da\u01d1\u0001\u0000\u0000"+
		"\u0000\u01da\u01d4\u0001\u0000\u0000\u0000\u01db\u0094\u0001\u0000\u0000"+
		"\u0000\u01dc\u01de\u0007\u0006\u0000\u0000\u01dd\u01dc\u0001\u0000\u0000"+
		"\u0000\u01de\u01df\u0001\u0000\u0000\u0000\u01df\u01dd\u0001\u0000\u0000"+
		"\u0000\u01df\u01e0\u0001\u0000\u0000\u0000\u01e0\u01e1\u0001\u0000\u0000"+
		"\u0000\u01e1\u01e2\u0006J\u0000\u0000\u01e2\u0096\u0001\u0000\u0000\u0000"+
		"\u000b\u0000\u0131\u0139\u0140\u0147\u0151\u01b1\u01c0\u01ce\u01da\u01df"+
		"\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}