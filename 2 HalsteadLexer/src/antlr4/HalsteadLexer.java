// Generated from HalsteadLexer.g4 by ANTLR 4.4
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
public class HalsteadLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OPERATOR=1, OPERAND=2, IGNORE=3;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'"
	};
	public static final String[] ruleNames = {
		"OPERATOR", "OPERAND", "IGNORE", "NUMBER", "TYPESPEC", "INT", "STRING", 
		"CHAR", "SCSPEC", "RESERVED", "TYPE_QUAL", "STAT", "OPERATORS", "IDENTIFIER", 
		"COMMENT", "SL_COMMENT", "HEADER_FILE", "WHITESPACE", "NL"
	};


	public HalsteadLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "HalsteadLexer.g4"; }

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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\5\u024e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\3\2\5\2/\n\2\3\3\3\3\3\3\3\3\3\3"+
		"\5\3\66\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4@\n\4\3\4\3\4\3\5\3\5\3"+
		"\5\5\5G\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5"+
		"\6z\n\6\3\7\6\7}\n\7\r\7\16\7~\3\b\3\b\7\b\u0083\n\b\f\b\16\b\u0086\13"+
		"\b\3\b\3\b\3\t\3\t\7\t\u008c\n\t\f\t\16\t\u008f\13\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00c6\n\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\5\13\u01aa\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u01bf\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u01d1\n\r\3\r\7\r\u01d4\n\r"+
		"\f\r\16\r\u01d7\13\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0216\n\16\3\17\3\17"+
		"\7\17\u021a\n\17\f\17\16\17\u021d\13\17\3\20\3\20\3\20\3\20\7\20\u0223"+
		"\n\20\f\20\16\20\u0226\13\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\7\21\u022f"+
		"\n\21\f\21\16\21\u0232\13\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\6\22\u0241\n\22\r\22\16\22\u0242\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\24\3\24\6\u0084\u008d\u0224\u0230\2\25\3\3"+
		"\5\4\7\5\t\2\13\2\r\2\17\2\21\2\23\2\25\2\27\2\31\2\33\2\35\2\37\2!\2"+
		"#\2%\2\'\2\3\2\n\6\2++<<__\177\177\3\2\62;\4\2**,,\5\2AA]]``\5\2==??\u0080"+
		"\u0080\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\13\17\17\"\"\u02ac\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\3.\3\2\2\2\5\65\3\2\2\2\7?\3\2\2\2\tC\3\2\2\2"+
		"\13y\3\2\2\2\r|\3\2\2\2\17\u0080\3\2\2\2\21\u0089\3\2\2\2\23\u00c5\3\2"+
		"\2\2\25\u01a9\3\2\2\2\27\u01be\3\2\2\2\31\u01d0\3\2\2\2\33\u0215\3\2\2"+
		"\2\35\u0217\3\2\2\2\37\u021e\3\2\2\2!\u022a\3\2\2\2#\u0236\3\2\2\2%\u024a"+
		"\3\2\2\2\'\u024c\3\2\2\2)/\5\23\n\2*/\5\27\f\2+/\5\25\13\2,/\5\31\r\2"+
		"-/\5\33\16\2.)\3\2\2\2.*\3\2\2\2.+\3\2\2\2.,\3\2\2\2.-\3\2\2\2/\4\3\2"+
		"\2\2\60\66\5\13\6\2\61\66\5\35\17\2\62\66\5\t\5\2\63\66\5\17\b\2\64\66"+
		"\5\21\t\2\65\60\3\2\2\2\65\61\3\2\2\2\65\62\3\2\2\2\65\63\3\2\2\2\65\64"+
		"\3\2\2\2\66\6\3\2\2\2\67@\5\37\20\28@\5!\21\29:\7f\2\2:@\7q\2\2;@\t\2"+
		"\2\2<@\5#\22\2=@\5%\23\2>@\5\'\24\2?\67\3\2\2\2?8\3\2\2\2?9\3\2\2\2?;"+
		"\3\2\2\2?<\3\2\2\2?=\3\2\2\2?>\3\2\2\2@A\3\2\2\2AB\b\4\2\2B\b\3\2\2\2"+
		"CF\5\r\7\2DE\7\60\2\2EG\5\r\7\2FD\3\2\2\2FG\3\2\2\2G\n\3\2\2\2HI\7d\2"+
		"\2IJ\7q\2\2JK\7q\2\2Kz\7n\2\2LM\7e\2\2MN\7j\2\2NO\7c\2\2Oz\7t\2\2PQ\7"+
		"f\2\2QR\7q\2\2RS\7w\2\2ST\7d\2\2TU\7n\2\2Uz\7g\2\2VW\7h\2\2WX\7n\2\2X"+
		"Y\7q\2\2YZ\7c\2\2Zz\7v\2\2[\\\7k\2\2\\]\7p\2\2]z\7v\2\2^_\7n\2\2_`\7q"+
		"\2\2`a\7p\2\2az\7i\2\2bc\7u\2\2cd\7j\2\2de\7q\2\2ef\7t\2\2fz\7v\2\2gh"+
		"\7u\2\2hi\7k\2\2ij\7i\2\2jk\7p\2\2kl\7g\2\2lz\7f\2\2mn\7w\2\2no\7p\2\2"+
		"op\7u\2\2pq\7k\2\2qr\7i\2\2rs\7p\2\2st\7g\2\2tz\7f\2\2uv\7x\2\2vw\7q\2"+
		"\2wx\7k\2\2xz\7f\2\2yH\3\2\2\2yL\3\2\2\2yP\3\2\2\2yV\3\2\2\2y[\3\2\2\2"+
		"y^\3\2\2\2yb\3\2\2\2yg\3\2\2\2ym\3\2\2\2yu\3\2\2\2z\f\3\2\2\2{}\t\3\2"+
		"\2|{\3\2\2\2}~\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\16\3\2\2\2\u0080\u0084"+
		"\7$\2\2\u0081\u0083\13\2\2\2\u0082\u0081\3\2\2\2\u0083\u0086\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u0087\3\2\2\2\u0086\u0084\3\2"+
		"\2\2\u0087\u0088\7$\2\2\u0088\20\3\2\2\2\u0089\u008d\7)\2\2\u008a\u008c"+
		"\13\2\2\2\u008b\u008a\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008e\3\2\2\2"+
		"\u008d\u008b\3\2\2\2\u008e\u0090\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0091"+
		"\7)\2\2\u0091\22\3\2\2\2\u0092\u0093\7c\2\2\u0093\u0094\7w\2\2\u0094\u0095"+
		"\7v\2\2\u0095\u00c6\7q\2\2\u0096\u0097\7g\2\2\u0097\u0098\7z\2\2\u0098"+
		"\u0099\7v\2\2\u0099\u009a\7g\2\2\u009a\u009b\7t\2\2\u009b\u00c6\7p\2\2"+
		"\u009c\u009d\7k\2\2\u009d\u009e\7p\2\2\u009e\u009f\7n\2\2\u009f\u00a0"+
		"\7k\2\2\u00a0\u00a1\7p\2\2\u00a1\u00c6\7g\2\2\u00a2\u00a3\7t\2\2\u00a3"+
		"\u00a4\7g\2\2\u00a4\u00a5\7i\2\2\u00a5\u00a6\7k\2\2\u00a6\u00a7\7u\2\2"+
		"\u00a7\u00a8\7v\2\2\u00a8\u00a9\7g\2\2\u00a9\u00c6\7t\2\2\u00aa\u00ab"+
		"\7u\2\2\u00ab\u00ac\7v\2\2\u00ac\u00ad\7c\2\2\u00ad\u00ae\7v\2\2\u00ae"+
		"\u00af\7k\2\2\u00af\u00c6\7e\2\2\u00b0\u00b1\7v\2\2\u00b1\u00b2\7{\2\2"+
		"\u00b2\u00b3\7r\2\2\u00b3\u00b4\7g\2\2\u00b4\u00b5\7f\2\2\u00b5\u00b6"+
		"\7g\2\2\u00b6\u00c6\7h\2\2\u00b7\u00b8\7x\2\2\u00b8\u00b9\7k\2\2\u00b9"+
		"\u00ba\7t\2\2\u00ba\u00bb\7v\2\2\u00bb\u00bc\7w\2\2\u00bc\u00bd\7c\2\2"+
		"\u00bd\u00c6\7n\2\2\u00be\u00bf\7o\2\2\u00bf\u00c0\7w\2\2\u00c0\u00c1"+
		"\7v\2\2\u00c1\u00c2\7c\2\2\u00c2\u00c3\7d\2\2\u00c3\u00c4\7n\2\2\u00c4"+
		"\u00c6\7g\2\2\u00c5\u0092\3\2\2\2\u00c5\u0096\3\2\2\2\u00c5\u009c\3\2"+
		"\2\2\u00c5\u00a2\3\2\2\2\u00c5\u00aa\3\2\2\2\u00c5\u00b0\3\2\2\2\u00c5"+
		"\u00b7\3\2\2\2\u00c5\u00be\3\2\2\2\u00c6\24\3\2\2\2\u00c7\u00c8\7c\2\2"+
		"\u00c8\u00c9\7u\2\2\u00c9\u01aa\7o\2\2\u00ca\u00cb\7d\2\2\u00cb\u00cc"+
		"\7t\2\2\u00cc\u00cd\7g\2\2\u00cd\u00ce\7c\2\2\u00ce\u01aa\7m\2\2\u00cf"+
		"\u00d0\7e\2\2\u00d0\u00d1\7c\2\2\u00d1\u00d2\7u\2\2\u00d2\u01aa\7g\2\2"+
		"\u00d3\u00d4\7e\2\2\u00d4\u00d5\7n\2\2\u00d5\u00d6\7c\2\2\u00d6\u00d7"+
		"\7u\2\2\u00d7\u01aa\7u\2\2\u00d8\u00d9\7e\2\2\u00d9\u00da\7q\2\2\u00da"+
		"\u00db\7p\2\2\u00db\u00dc\7v\2\2\u00dc\u00dd\7k\2\2\u00dd\u00de\7p\2\2"+
		"\u00de\u00df\7w\2\2\u00df\u01aa\7g\2\2\u00e0\u00e1\7f\2\2\u00e1\u00e2"+
		"\7g\2\2\u00e2\u00e3\7h\2\2\u00e3\u00e4\7c\2\2\u00e4\u00e5\7w\2\2\u00e5"+
		"\u00e6\7n\2\2\u00e6\u01aa\7v\2\2\u00e7\u00e8\7f\2\2\u00e8\u00e9\7g\2\2"+
		"\u00e9\u00ea\7n\2\2\u00ea\u00eb\7g\2\2\u00eb\u00ec\7v\2\2\u00ec\u01aa"+
		"\7g\2\2\u00ed\u00ee\7g\2\2\u00ee\u00ef\7n\2\2\u00ef\u00f0\7u\2\2\u00f0"+
		"\u01aa\7g\2\2\u00f1\u00f2\7g\2\2\u00f2\u00f3\7p\2\2\u00f3\u00f4\7w\2\2"+
		"\u00f4\u01aa\7o\2\2\u00f5\u00f6\7i\2\2\u00f6\u00f7\7q\2\2\u00f7\u00f8"+
		"\7v\2\2\u00f8\u01aa\7q\2\2\u00f9\u00fa\7p\2\2\u00fa\u00fb\7g\2\2\u00fb"+
		"\u01aa\7y\2\2\u00fc\u00fd\7q\2\2\u00fd\u00fe\7r\2\2\u00fe\u00ff\7g\2\2"+
		"\u00ff\u0100\7t\2\2\u0100\u0101\7c\2\2\u0101\u0102\7v\2\2\u0102\u0103"+
		"\7q\2\2\u0103\u01aa\7t\2\2\u0104\u0105\7r\2\2\u0105\u0106\7t\2\2\u0106"+
		"\u0107\7k\2\2\u0107\u0108\7x\2\2\u0108\u0109\7c\2\2\u0109\u010a\7v\2\2"+
		"\u010a\u01aa\7g\2\2\u010b\u010c\7r\2\2\u010c\u010d\7t\2\2\u010d\u010e"+
		"\7q\2\2\u010e\u010f\7v\2\2\u010f\u0110\7g\2\2\u0110\u0111\7e\2\2\u0111"+
		"\u0112\7v\2\2\u0112\u0113\7g\2\2\u0113\u01aa\7f\2\2\u0114\u0115\7r\2\2"+
		"\u0115\u0116\7w\2\2\u0116\u0117\7d\2\2\u0117\u0118\7n\2\2\u0118\u0119"+
		"\7k\2\2\u0119\u01aa\7e\2\2\u011a\u011b\7t\2\2\u011b\u011c\7g\2\2\u011c"+
		"\u011d\7v\2\2\u011d\u011e\7w\2\2\u011e\u011f\7t\2\2\u011f\u01aa\7p\2\2"+
		"\u0120\u0121\7u\2\2\u0121\u0122\7k\2\2\u0122\u0123\7|\2\2\u0123\u0124"+
		"\7g\2\2\u0124\u0125\7q\2\2\u0125\u01aa\7h\2\2\u0126\u0127\7u\2\2\u0127"+
		"\u0128\7v\2\2\u0128\u0129\7t\2\2\u0129\u012a\7w\2\2\u012a\u012b\7e\2\2"+
		"\u012b\u01aa\7v\2\2\u012c\u012d\7v\2\2\u012d\u012e\7j\2\2\u012e\u012f"+
		"\7k\2\2\u012f\u01aa\7u\2\2\u0130\u0131\7w\2\2\u0131\u0132\7p\2\2\u0132"+
		"\u0133\7k\2\2\u0133\u0134\7q\2\2\u0134\u01aa\7p\2\2\u0135\u0136\7p\2\2"+
		"\u0136\u0137\7c\2\2\u0137\u0138\7o\2\2\u0138\u0139\7g\2\2\u0139\u013a"+
		"\7u\2\2\u013a\u013b\7r\2\2\u013b\u013c\7c\2\2\u013c\u013d\7e\2\2\u013d"+
		"\u01aa\7g\2\2\u013e\u013f\7w\2\2\u013f\u0140\7u\2\2\u0140\u0141\7k\2\2"+
		"\u0141\u0142\7p\2\2\u0142\u01aa\7i\2\2\u0143\u0144\7v\2\2\u0144\u0145"+
		"\7t\2\2\u0145\u01aa\7{\2\2\u0146\u0147\7e\2\2\u0147\u0148\7c\2\2\u0148"+
		"\u0149\7v\2\2\u0149\u014a\7e\2\2\u014a\u01aa\7j\2\2\u014b\u014c\7v\2\2"+
		"\u014c\u014d\7j\2\2\u014d\u014e\7t\2\2\u014e\u014f\7q\2\2\u014f\u01aa"+
		"\7y\2\2\u0150\u0151\7e\2\2\u0151\u0152\7q\2\2\u0152\u0153\7p\2\2\u0153"+
		"\u0154\7u\2\2\u0154\u0155\7v\2\2\u0155\u0156\7a\2\2\u0156\u0157\7e\2\2"+
		"\u0157\u0158\7c\2\2\u0158\u0159\7u\2\2\u0159\u01aa\7v\2\2\u015a\u015b"+
		"\7u\2\2\u015b\u015c\7v\2\2\u015c\u015d\7c\2\2\u015d\u015e\7v\2\2\u015e"+
		"\u015f\7k\2\2\u015f\u0160\7e\2\2\u0160\u0161\7a\2\2\u0161\u0162\7e\2\2"+
		"\u0162\u0163\7c\2\2\u0163\u0164\7u\2\2\u0164\u01aa\7v\2\2\u0165\u0166"+
		"\7f\2\2\u0166\u0167\7{\2\2\u0167\u0168\7p\2\2\u0168\u0169\7c\2\2\u0169"+
		"\u016a\7o\2\2\u016a\u016b\7k\2\2\u016b\u016c\7e\2\2\u016c\u016d\7a\2\2"+
		"\u016d\u016e\7e\2\2\u016e\u016f\7c\2\2\u016f\u0170\7u\2\2\u0170\u01aa"+
		"\7v\2\2\u0171\u0172\7t\2\2\u0172\u0173\7g\2\2\u0173\u0174\7k\2\2\u0174"+
		"\u0175\7|\2\2\u0175\u0176\7p\2\2\u0176\u0177\7v\2\2\u0177\u0178\7g\2\2"+
		"\u0178\u0179\7t\2\2\u0179\u017a\7r\2\2\u017a\u017b\7t\2\2\u017b\u017c"+
		"\7g\2\2\u017c\u017d\7v\2\2\u017d\u017e\7a\2\2\u017e\u017f\7e\2\2\u017f"+
		"\u0180\7c\2\2\u0180\u0181\7u\2\2\u0181\u01aa\7v\2\2\u0182\u0183\7v\2\2"+
		"\u0183\u0184\7{\2\2\u0184\u0185\7r\2\2\u0185\u0186\7g\2\2\u0186\u0187"+
		"\7k\2\2\u0187\u01aa\7f\2\2\u0188\u0189\7v\2\2\u0189\u018a\7g\2\2\u018a"+
		"\u018b\7o\2\2\u018b\u018c\7r\2\2\u018c\u018d\7n\2\2\u018d\u018e\7c\2\2"+
		"\u018e\u018f\7v\2\2\u018f\u01aa\7g\2\2\u0190\u0191\7g\2\2\u0191\u0192"+
		"\7z\2\2\u0192\u0193\7r\2\2\u0193\u0194\7n\2\2\u0194\u0195\7k\2\2\u0195"+
		"\u0196\7e\2\2\u0196\u0197\7k\2\2\u0197\u01aa\7v\2\2\u0198\u0199\7v\2\2"+
		"\u0199\u019a\7t\2\2\u019a\u019b\7w\2\2\u019b\u01aa\7g\2\2\u019c\u019d"+
		"\7h\2\2\u019d\u019e\7c\2\2\u019e\u019f\7n\2\2\u019f\u01a0\7u\2\2\u01a0"+
		"\u01aa\7g\2\2\u01a1\u01a2\7v\2\2\u01a2\u01a3\7{\2\2\u01a3\u01a4\7r\2\2"+
		"\u01a4\u01a5\7g\2\2\u01a5\u01a6\7p\2\2\u01a6\u01a7\7c\2\2\u01a7\u01a8"+
		"\7o\2\2\u01a8\u01aa\7g\2\2\u01a9\u00c7\3\2\2\2\u01a9\u00ca\3\2\2\2\u01a9"+
		"\u00cf\3\2\2\2\u01a9\u00d3\3\2\2\2\u01a9\u00d8\3\2\2\2\u01a9\u00e0\3\2"+
		"\2\2\u01a9\u00e7\3\2\2\2\u01a9\u00ed\3\2\2\2\u01a9\u00f1\3\2\2\2\u01a9"+
		"\u00f5\3\2\2\2\u01a9\u00f9\3\2\2\2\u01a9\u00fc\3\2\2\2\u01a9\u0104\3\2"+
		"\2\2\u01a9\u010b\3\2\2\2\u01a9\u0114\3\2\2\2\u01a9\u011a\3\2\2\2\u01a9"+
		"\u0120\3\2\2\2\u01a9\u0126\3\2\2\2\u01a9\u012c\3\2\2\2\u01a9\u0130\3\2"+
		"\2\2\u01a9\u0135\3\2\2\2\u01a9\u013e\3\2\2\2\u01a9\u0143\3\2\2\2\u01a9"+
		"\u0146\3\2\2\2\u01a9\u014b\3\2\2\2\u01a9\u0150\3\2\2\2\u01a9\u015a\3\2"+
		"\2\2\u01a9\u0165\3\2\2\2\u01a9\u0171\3\2\2\2\u01a9\u0182\3\2\2\2\u01a9"+
		"\u0188\3\2\2\2\u01a9\u0190\3\2\2\2\u01a9\u0198\3\2\2\2\u01a9\u019c\3\2"+
		"\2\2\u01a9\u01a1\3\2\2\2\u01aa\26\3\2\2\2\u01ab\u01ac\7e\2\2\u01ac\u01ad"+
		"\7q\2\2\u01ad\u01ae\7p\2\2\u01ae\u01af\7u\2\2\u01af\u01bf\7v\2\2\u01b0"+
		"\u01b1\7h\2\2\u01b1\u01b2\7t\2\2\u01b2\u01b3\7k\2\2\u01b3\u01b4\7g\2\2"+
		"\u01b4\u01b5\7p\2\2\u01b5\u01bf\7f\2\2\u01b6\u01b7\7x\2\2\u01b7\u01b8"+
		"\7q\2\2\u01b8\u01b9\7n\2\2\u01b9\u01ba\7c\2\2\u01ba\u01bb\7v\2\2\u01bb"+
		"\u01bc\7k\2\2\u01bc\u01bd\7n\2\2\u01bd\u01bf\7g\2\2\u01be\u01ab\3\2\2"+
		"\2\u01be\u01b0\3\2\2\2\u01be\u01b6\3\2\2\2\u01bf\30\3\2\2\2\u01c0\u01c1"+
		"\7k\2\2\u01c1\u01d1\7h\2\2\u01c2\u01c3\7y\2\2\u01c3\u01c4\7j\2\2\u01c4"+
		"\u01c5\7k\2\2\u01c5\u01c6\7n\2\2\u01c6\u01d1\7g\2\2\u01c7\u01c8\7u\2\2"+
		"\u01c8\u01c9\7y\2\2\u01c9\u01ca\7k\2\2\u01ca\u01cb\7v\2\2\u01cb\u01cc"+
		"\7e\2\2\u01cc\u01d1\7j\2\2\u01cd\u01ce\7h\2\2\u01ce\u01cf\7q\2\2\u01cf"+
		"\u01d1\7t\2\2\u01d0\u01c0\3\2\2\2\u01d0\u01c2\3\2\2\2\u01d0\u01c7\3\2"+
		"\2\2\u01d0\u01cd\3\2\2\2\u01d1\u01d5\3\2\2\2\u01d2\u01d4\7\"\2\2\u01d3"+
		"\u01d2\3\2\2\2\u01d4\u01d7\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d5\u01d6\3\2"+
		"\2\2\u01d6\u01d8\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d8\u01d9\7*\2\2\u01d9"+
		"\32\3\2\2\2\u01da\u0216\7#\2\2\u01db\u01dc\7#\2\2\u01dc\u0216\7?\2\2\u01dd"+
		"\u0216\7\'\2\2\u01de\u01df\7\'\2\2\u01df\u0216\7?\2\2\u01e0\u0216\7(\2"+
		"\2\u01e1\u01e2\7(\2\2\u01e2\u0216\7(\2\2\u01e3\u01e4\7(\2\2\u01e4\u0216"+
		"\7?\2\2\u01e5\u0216\t\4\2\2\u01e6\u01e7\7,\2\2\u01e7\u0216\7?\2\2\u01e8"+
		"\u0216\7-\2\2\u01e9\u01ea\7-\2\2\u01ea\u0216\7-\2\2\u01eb\u01ec\7-\2\2"+
		"\u01ec\u0216\7?\2\2\u01ed\u0216\4./\2\u01ee\u01ef\7/\2\2\u01ef\u0216\7"+
		"/\2\2\u01f0\u01f1\7/\2\2\u01f1\u0216\7?\2\2\u01f2\u01f3\7/\2\2\u01f3\u0216"+
		"\7@\2\2\u01f4\u01f5\7\60\2\2\u01f5\u01f6\7\60\2\2\u01f6\u0216\7\60\2\2"+
		"\u01f7\u0216\7\61\2\2\u01f8\u01f9\7\61\2\2\u01f9\u0216\7?\2\2\u01fa\u01fb"+
		"\7<\2\2\u01fb\u0216\7<\2\2\u01fc\u0216\7>\2\2\u01fd\u01fe\7>\2\2\u01fe"+
		"\u0216\7>\2\2\u01ff\u0200\7>\2\2\u0200\u0201\7>\2\2\u0201\u0216\7?\2\2"+
		"\u0202\u0203\7>\2\2\u0203\u0216\7?\2\2\u0204\u0205\7?\2\2\u0205\u0216"+
		"\7?\2\2\u0206\u0216\7@\2\2\u0207\u0208\7@\2\2\u0208\u0216\7?\2\2\u0209"+
		"\u020a\7@\2\2\u020a\u0216\7@\2\2\u020b\u020c\7@\2\2\u020c\u020d\7@\2\2"+
		"\u020d\u0216\7?\2\2\u020e\u0216\t\5\2\2\u020f\u0210\7`\2\2\u0210\u0216"+
		"\7?\2\2\u0211\u0216\7}\2\2\u0212\u0213\7~\2\2\u0213\u0216\7~\2\2\u0214"+
		"\u0216\t\6\2\2\u0215\u01da\3\2\2\2\u0215\u01db\3\2\2\2\u0215\u01dd\3\2"+
		"\2\2\u0215\u01de\3\2\2\2\u0215\u01e0\3\2\2\2\u0215\u01e1\3\2\2\2\u0215"+
		"\u01e3\3\2\2\2\u0215\u01e5\3\2\2\2\u0215\u01e6\3\2\2\2\u0215\u01e8\3\2"+
		"\2\2\u0215\u01e9\3\2\2\2\u0215\u01eb\3\2\2\2\u0215\u01ed\3\2\2\2\u0215"+
		"\u01ee\3\2\2\2\u0215\u01f0\3\2\2\2\u0215\u01f2\3\2\2\2\u0215\u01f4\3\2"+
		"\2\2\u0215\u01f7\3\2\2\2\u0215\u01f8\3\2\2\2\u0215\u01fa\3\2\2\2\u0215"+
		"\u01fc\3\2\2\2\u0215\u01fd\3\2\2\2\u0215\u01ff\3\2\2\2\u0215\u0202\3\2"+
		"\2\2\u0215\u0204\3\2\2\2\u0215\u0206\3\2\2\2\u0215\u0207\3\2\2\2\u0215"+
		"\u0209\3\2\2\2\u0215\u020b\3\2\2\2\u0215\u020e\3\2\2\2\u0215\u020f\3\2"+
		"\2\2\u0215\u0211\3\2\2\2\u0215\u0212\3\2\2\2\u0215\u0214\3\2\2\2\u0216"+
		"\34\3\2\2\2\u0217\u021b\t\7\2\2\u0218\u021a\t\b\2\2\u0219\u0218\3\2\2"+
		"\2\u021a\u021d\3\2\2\2\u021b\u0219\3\2\2\2\u021b\u021c\3\2\2\2\u021c\36"+
		"\3\2\2\2\u021d\u021b\3\2\2\2\u021e\u021f\7\61\2\2\u021f\u0220\7,\2\2\u0220"+
		"\u0224\3\2\2\2\u0221\u0223\13\2\2\2\u0222\u0221\3\2\2\2\u0223\u0226\3"+
		"\2\2\2\u0224\u0225\3\2\2\2\u0224\u0222\3\2\2\2\u0225\u0227\3\2\2\2\u0226"+
		"\u0224\3\2\2\2\u0227\u0228\7,\2\2\u0228\u0229\7\61\2\2\u0229 \3\2\2\2"+
		"\u022a\u022b\7\61\2\2\u022b\u022c\7\61\2\2\u022c\u0230\3\2\2\2\u022d\u022f"+
		"\13\2\2\2\u022e\u022d\3\2\2\2\u022f\u0232\3\2\2\2\u0230\u0231\3\2\2\2"+
		"\u0230\u022e\3\2\2\2\u0231\u0233\3\2\2\2\u0232\u0230\3\2\2\2\u0233\u0234"+
		"\7^\2\2\u0234\u0235\7p\2\2\u0235\"\3\2\2\2\u0236\u0237\7%\2\2\u0237\u0238"+
		"\7k\2\2\u0238\u0239\7p\2\2\u0239\u023a\7e\2\2\u023a\u023b\7n\2\2\u023b"+
		"\u023c\7w\2\2\u023c\u023d\7f\2\2\u023d\u023e\7g\2\2\u023e\u0240\3\2\2"+
		"\2\u023f\u0241\7\"\2\2\u0240\u023f\3\2\2\2\u0241\u0242\3\2\2\2\u0242\u0240"+
		"\3\2\2\2\u0242\u0243\3\2\2\2\u0243\u0244\3\2\2\2\u0244\u0245\7>\2\2\u0245"+
		"\u0246\5\35\17\2\u0246\u0247\7\60\2\2\u0247\u0248\7j\2\2\u0248\u0249\7"+
		"@\2\2\u0249$\3\2\2\2\u024a\u024b\t\t\2\2\u024b&\3\2\2\2\u024c\u024d\7"+
		"\f\2\2\u024d(\3\2\2\2\25\2.\65?Fy~\u0084\u008d\u00c5\u01a9\u01be\u01d0"+
		"\u01d5\u0215\u021b\u0224\u0230\u0242\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}