// Generated from Syntax.g4 by ANTLR 4.4
package antlr4;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SyntaxLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__10=1, T__9=2, T__8=3, T__7=4, T__6=5, T__5=6, T__4=7, T__3=8, T__2=9, 
		T__1=10, T__0=11, ID=12, INTEGER=13, NL=14, IGNORE=15;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'"
	};
	public static final String[] ruleNames = {
		"T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", 
		"T__1", "T__0", "ID", "INTEGER", "NL", "IGNORE", "DIGIT", "LETTER", "WHITESPACE"
	};


	public SyntaxLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Syntax.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\21V\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b"+
		"\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\7\rA\n\r\f\r\16\rD\13\r\3\16"+
		"\6\16G\n\16\r\16\16\16H\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3"+
		"\22\3\23\3\23\2\2\24\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\2#\2%\2\3\2\7\t\2FGIIKKNNTTVV~~\3\2\f\f\3"+
		"\2\62;\4\2C\\c|\5\2\13\13\17\17\"\"T\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\3\'\3\2\2\2\5)\3\2\2\2\7+\3\2\2\2\t-\3\2\2\2\13/\3\2"+
		"\2\2\r\61\3\2\2\2\17\64\3\2\2\2\21\66\3\2\2\2\238\3\2\2\2\25:\3\2\2\2"+
		"\27<\3\2\2\2\31>\3\2\2\2\33F\3\2\2\2\35J\3\2\2\2\37L\3\2\2\2!P\3\2\2\2"+
		"#R\3\2\2\2%T\3\2\2\2\'(\7\61\2\2(\4\3\2\2\2)*\7*\2\2*\6\3\2\2\2+,\7+\2"+
		"\2,\b\3\2\2\2-.\7,\2\2.\n\3\2\2\2/\60\7-\2\2\60\f\3\2\2\2\61\62\7?\2\2"+
		"\62\63\7?\2\2\63\16\3\2\2\2\64\65\7>\2\2\65\20\3\2\2\2\66\67\7/\2\2\67"+
		"\22\3\2\2\289\7?\2\29\24\3\2\2\2:;\7`\2\2;\26\3\2\2\2<=\7@\2\2=\30\3\2"+
		"\2\2>B\5#\22\2?A\t\2\2\2@?\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2C\32\3"+
		"\2\2\2DB\3\2\2\2EG\5!\21\2FE\3\2\2\2GH\3\2\2\2HF\3\2\2\2HI\3\2\2\2I\34"+
		"\3\2\2\2JK\t\3\2\2K\36\3\2\2\2LM\5%\23\2MN\3\2\2\2NO\b\20\2\2O \3\2\2"+
		"\2PQ\t\4\2\2Q\"\3\2\2\2RS\t\5\2\2S$\3\2\2\2TU\t\6\2\2U&\3\2\2\2\5\2BH"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}