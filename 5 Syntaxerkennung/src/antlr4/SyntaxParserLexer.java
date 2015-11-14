// Generated from SyntaxParser.g4 by ANTLR 4.4
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
public class SyntaxParserLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ID=1, INTEGER=2, PLUS=3, MINUS=4, MULTI=5, DIV=6, LBRACK=7, RBRACK=8, 
		EQUALS=9, NL=10, IGNORE=11;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'"
	};
	public static final String[] ruleNames = {
		"ID", "INTEGER", "PLUS", "MINUS", "MULTI", "DIV", "LBRACK", "RBRACK", 
		"EQUALS", "NL", "IGNORE", "DIGIT", "LETTER", "WHITESPACE"
	};


	public SyntaxParserLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SyntaxParser.g4"; }

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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\rP\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\6\2\"\n\2\r\2\16\2#\3"+
		"\3\6\3\'\n\3\r\3\16\3(\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t"+
		"\3\n\3\n\3\13\3\13\3\f\6\f<\n\f\r\f\16\f=\3\f\3\f\7\fB\n\f\f\f\16\fE\13"+
		"\f\5\fG\n\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3C\2\20\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\2\33\2\35\2\3\2\16\t\2FGIIKK"+
		"NNTTVV~~\3\2--\3\2//\3\2,,\3\2\61\61\3\2**\3\2++\3\2??\3\2\f\f\3\2\62"+
		";\4\2C\\c|\5\2\13\13\17\17\"\"R\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\3\37\3\2\2\2\5&\3\2\2\2\7*\3\2\2\2\t,\3"+
		"\2\2\2\13.\3\2\2\2\r\60\3\2\2\2\17\62\3\2\2\2\21\64\3\2\2\2\23\66\3\2"+
		"\2\2\258\3\2\2\2\27F\3\2\2\2\31J\3\2\2\2\33L\3\2\2\2\35N\3\2\2\2\37!\5"+
		"\33\16\2 \"\t\2\2\2! \3\2\2\2\"#\3\2\2\2#!\3\2\2\2#$\3\2\2\2$\4\3\2\2"+
		"\2%\'\5\31\r\2&%\3\2\2\2\'(\3\2\2\2(&\3\2\2\2()\3\2\2\2)\6\3\2\2\2*+\t"+
		"\3\2\2+\b\3\2\2\2,-\t\4\2\2-\n\3\2\2\2./\t\5\2\2/\f\3\2\2\2\60\61\t\6"+
		"\2\2\61\16\3\2\2\2\62\63\t\7\2\2\63\20\3\2\2\2\64\65\t\b\2\2\65\22\3\2"+
		"\2\2\66\67\t\t\2\2\67\24\3\2\2\289\t\n\2\29\26\3\2\2\2:<\5\33\16\2;:\3"+
		"\2\2\2<=\3\2\2\2=;\3\2\2\2=>\3\2\2\2>G\3\2\2\2?G\5\35\17\2@B\13\2\2\2"+
		"A@\3\2\2\2BE\3\2\2\2CD\3\2\2\2CA\3\2\2\2DG\3\2\2\2EC\3\2\2\2F;\3\2\2\2"+
		"F?\3\2\2\2FC\3\2\2\2GH\3\2\2\2HI\b\f\2\2I\30\3\2\2\2JK\t\13\2\2K\32\3"+
		"\2\2\2LM\t\f\2\2M\34\3\2\2\2NO\t\r\2\2O\36\3\2\2\2\b\2#(=CF\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}