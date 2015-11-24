// Generated from Syntax.g4 by ANTLR 4.4
package antlr4;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SyntaxParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__2=1, T__1=2, T__0=3, ID=4, INTEGER=5, PLUS=6, MINUS=7, MULTI=8, DIV=9, 
		LBRACK=10, RBRACK=11, EQUALS=12, NL=13, IGNORE=14;
	public static final String[] tokenNames = {
		"<INVALID>", "'<'", "'^'", "'>'", "ID", "INTEGER", "PLUS", "MINUS", "MULTI", 
		"DIV", "LBRACK", "RBRACK", "EQUALS", "NL", "IGNORE"
	};
	public static final int
		RULE_statlist = 0, RULE_stat = 1, RULE_comparison = 2, RULE_sum = 3, RULE_prod = 4, 
		RULE_potenz = 5, RULE_term = 6;
	public static final String[] ruleNames = {
		"statlist", "stat", "comparison", "sum", "prod", "potenz", "term"
	};

	@Override
	public String getGrammarFileName() { return "Syntax.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SyntaxParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StatlistContext extends ParserRuleContext {
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SyntaxListener ) ((SyntaxListener)listener).enterStatlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SyntaxListener ) ((SyntaxListener)listener).exitStatlist(this);
		}
	}

	public final StatlistContext statlist() throws RecognitionException {
		StatlistContext _localctx = new StatlistContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_statlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(14); stat();
				}
				}
				setState(17); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << INTEGER) | (1L << PLUS) | (1L << MINUS) | (1L << LBRACK) | (1L << NL))) != 0) );
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

	public static class StatContext extends ParserRuleContext {
		public TerminalNode NL() { return getToken(SyntaxParser.NL, 0); }
		public TerminalNode EQUALS() { return getToken(SyntaxParser.EQUALS, 0); }
		public TerminalNode ID() { return getToken(SyntaxParser.ID, 0); }
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public SumContext sum(int i) {
			return getRuleContext(SumContext.class,i);
		}
		public List<SumContext> sum() {
			return getRuleContexts(SumContext.class);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SyntaxListener ) ((SyntaxListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SyntaxListener ) ((SyntaxListener)listener).exitStat(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(19); comparison();
				setState(20); match(NL);
				}
				break;
			case 2:
				{
				setState(22); match(NL);
				}
				break;
			case 3:
				{
				setState(25);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(23); match(ID);
					}
					break;
				case 2:
					{
					setState(24); sum();
					}
					break;
				}
				setState(27); match(EQUALS);
				setState(28); sum();
				setState(29); match(NL);
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

	public static class ComparisonContext extends ParserRuleContext {
		public SumContext sum(int i) {
			return getRuleContext(SumContext.class,i);
		}
		public List<SumContext> sum() {
			return getRuleContexts(SumContext.class);
		}
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SyntaxListener ) ((SyntaxListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SyntaxListener ) ((SyntaxListener)listener).exitComparison(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33); sum();
			setState(36);
			_la = _input.LA(1);
			if (_la==T__2 || _la==T__0) {
				{
				setState(34);
				_la = _input.LA(1);
				if ( !(_la==T__2 || _la==T__0) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(35); sum();
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

	public static class SumContext extends ParserRuleContext {
		public TerminalNode MINUS(int i) {
			return getToken(SyntaxParser.MINUS, i);
		}
		public List<ProdContext> prod() {
			return getRuleContexts(ProdContext.class);
		}
		public List<TerminalNode> PLUS() { return getTokens(SyntaxParser.PLUS); }
		public List<TerminalNode> MINUS() { return getTokens(SyntaxParser.MINUS); }
		public ProdContext prod(int i) {
			return getRuleContext(ProdContext.class,i);
		}
		public TerminalNode PLUS(int i) {
			return getToken(SyntaxParser.PLUS, i);
		}
		public SumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SyntaxListener ) ((SyntaxListener)listener).enterSum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SyntaxListener ) ((SyntaxListener)listener).exitSum(this);
		}
	}

	public final SumContext sum() throws RecognitionException {
		SumContext _localctx = new SumContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38); prod();
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(39);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(40); prod();
				}
				}
				setState(45);
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

	public static class ProdContext extends ParserRuleContext {
		public List<TerminalNode> MULTI() { return getTokens(SyntaxParser.MULTI); }
		public PotenzContext potenz(int i) {
			return getRuleContext(PotenzContext.class,i);
		}
		public TerminalNode MULTI(int i) {
			return getToken(SyntaxParser.MULTI, i);
		}
		public List<TerminalNode> DIV() { return getTokens(SyntaxParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(SyntaxParser.DIV, i);
		}
		public List<PotenzContext> potenz() {
			return getRuleContexts(PotenzContext.class);
		}
		public ProdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SyntaxListener ) ((SyntaxListener)listener).enterProd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SyntaxListener ) ((SyntaxListener)listener).exitProd(this);
		}
	}

	public final ProdContext prod() throws RecognitionException {
		ProdContext _localctx = new ProdContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_prod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46); potenz();
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULTI || _la==DIV) {
				{
				{
				setState(47);
				_la = _input.LA(1);
				if ( !(_la==MULTI || _la==DIV) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(48); potenz();
				}
				}
				setState(53);
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

	public static class PotenzContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public PotenzContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_potenz; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SyntaxListener ) ((SyntaxListener)listener).enterPotenz(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SyntaxListener ) ((SyntaxListener)listener).exitPotenz(this);
		}
	}

	public final PotenzContext potenz() throws RecognitionException {
		PotenzContext _localctx = new PotenzContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_potenz);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54); term();
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(55); match(T__1);
				setState(56); term();
				}
				}
				setState(61);
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

	public static class TermContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SyntaxParser.ID, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode INTEGER() { return getToken(SyntaxParser.INTEGER, 0); }
		public TerminalNode PLUS() { return getToken(SyntaxParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SyntaxParser.MINUS, 0); }
		public TerminalNode RBRACK() { return getToken(SyntaxParser.RBRACK, 0); }
		public TerminalNode LBRACK() { return getToken(SyntaxParser.LBRACK, 0); }
		public SumContext sum() {
			return getRuleContext(SumContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SyntaxListener ) ((SyntaxListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SyntaxListener ) ((SyntaxListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_term);
		try {
			setState(72);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(62); match(PLUS);
				setState(63); term();
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(64); match(MINUS);
				setState(65); term();
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 3);
				{
				setState(66); match(INTEGER);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(67); match(ID);
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 5);
				{
				setState(68); match(LBRACK);
				setState(69); sum();
				setState(70); match(RBRACK);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\20M\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\6\2\22\n\2\r\2\16\2\23"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\5\3\34\n\3\3\3\3\3\3\3\3\3\5\3\"\n\3\3\4\3\4"+
		"\3\4\5\4\'\n\4\3\5\3\5\3\5\7\5,\n\5\f\5\16\5/\13\5\3\6\3\6\3\6\7\6\64"+
		"\n\6\f\6\16\6\67\13\6\3\7\3\7\3\7\7\7<\n\7\f\7\16\7?\13\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bK\n\b\3\b\2\2\t\2\4\6\b\n\f\16\2\5\4\2"+
		"\3\3\5\5\3\2\b\t\3\2\n\13Q\2\21\3\2\2\2\4!\3\2\2\2\6#\3\2\2\2\b(\3\2\2"+
		"\2\n\60\3\2\2\2\f8\3\2\2\2\16J\3\2\2\2\20\22\5\4\3\2\21\20\3\2\2\2\22"+
		"\23\3\2\2\2\23\21\3\2\2\2\23\24\3\2\2\2\24\3\3\2\2\2\25\26\5\6\4\2\26"+
		"\27\7\17\2\2\27\"\3\2\2\2\30\"\7\17\2\2\31\34\7\6\2\2\32\34\5\b\5\2\33"+
		"\31\3\2\2\2\33\32\3\2\2\2\34\35\3\2\2\2\35\36\7\16\2\2\36\37\5\b\5\2\37"+
		" \7\17\2\2 \"\3\2\2\2!\25\3\2\2\2!\30\3\2\2\2!\33\3\2\2\2\"\5\3\2\2\2"+
		"#&\5\b\5\2$%\t\2\2\2%\'\5\b\5\2&$\3\2\2\2&\'\3\2\2\2\'\7\3\2\2\2(-\5\n"+
		"\6\2)*\t\3\2\2*,\5\n\6\2+)\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\t\3"+
		"\2\2\2/-\3\2\2\2\60\65\5\f\7\2\61\62\t\4\2\2\62\64\5\f\7\2\63\61\3\2\2"+
		"\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\13\3\2\2\2\67\65\3\2\2"+
		"\28=\5\16\b\29:\7\4\2\2:<\5\16\b\2;9\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2"+
		"\2\2>\r\3\2\2\2?=\3\2\2\2@A\7\b\2\2AK\5\16\b\2BC\7\t\2\2CK\5\16\b\2DK"+
		"\7\7\2\2EK\7\6\2\2FG\7\f\2\2GH\5\b\5\2HI\7\r\2\2IK\3\2\2\2J@\3\2\2\2J"+
		"B\3\2\2\2JD\3\2\2\2JE\3\2\2\2JF\3\2\2\2K\17\3\2\2\2\n\23\33!&-\65=J";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}