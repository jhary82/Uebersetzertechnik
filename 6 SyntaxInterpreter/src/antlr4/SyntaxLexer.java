// Generated from Syntax.g4 by ANTLR 4.4
package antlr4;

	import java.util.*;

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
		T__2=1, T__1=2, T__0=3, ID=4, INTEGER=5, PLUS=6, MINUS=7, MULTI=8, DIV=9, 
		LBRACK=10, RBRACK=11, EQUALS=12, NL=13, IGNORE=14;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'"
	};
	public static final String[] ruleNames = {
		"T__2", "T__1", "T__0", "ID", "INTEGER", "PLUS", "MINUS", "MULTI", "DIV", 
		"LBRACK", "RBRACK", "EQUALS", "NL", "IGNORE", "DIGIT", "LETTER", "WHITESPACE"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\20Q\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\7\5.\n\5\f\5\16\5\61\13\5\3\6\6\6\64"+
		"\n\6\r\6\16\6\65\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r"+
		"\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\2\2\23"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\2!\2#\2\3\2\16\t\2FGIIKKNNTTVV~~\3\2--\3\2//\3\2,,\3\2\61\61\3\2*"+
		"*\3\2++\3\2??\3\2\f\f\3\2\62;\4\2C\\c|\5\2\13\13\17\17\"\"O\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\3%\3\2\2\2\5\'\3\2\2\2\7)\3\2\2\2\t+\3\2"+
		"\2\2\13\63\3\2\2\2\r\67\3\2\2\2\179\3\2\2\2\21;\3\2\2\2\23=\3\2\2\2\25"+
		"?\3\2\2\2\27A\3\2\2\2\31C\3\2\2\2\33E\3\2\2\2\35G\3\2\2\2\37K\3\2\2\2"+
		"!M\3\2\2\2#O\3\2\2\2%&\7,\2\2&\4\3\2\2\2\'(\7-\2\2(\6\3\2\2\2)*\7/\2\2"+
		"*\b\3\2\2\2+/\5!\21\2,.\t\2\2\2-,\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3"+
		"\2\2\2\60\n\3\2\2\2\61/\3\2\2\2\62\64\5\37\20\2\63\62\3\2\2\2\64\65\3"+
		"\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\f\3\2\2\2\678\t\3\2\28\16\3\2\2"+
		"\29:\t\4\2\2:\20\3\2\2\2;<\t\5\2\2<\22\3\2\2\2=>\t\6\2\2>\24\3\2\2\2?"+
		"@\t\7\2\2@\26\3\2\2\2AB\t\b\2\2B\30\3\2\2\2CD\t\t\2\2D\32\3\2\2\2EF\t"+
		"\n\2\2F\34\3\2\2\2GH\5#\22\2HI\3\2\2\2IJ\b\17\2\2J\36\3\2\2\2KL\t\13\2"+
		"\2L \3\2\2\2MN\t\f\2\2N\"\3\2\2\2OP\t\r\2\2P$\3\2\2\2\5\2/\65\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}