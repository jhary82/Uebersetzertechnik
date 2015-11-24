// Generated from Syntax.g4 by ANTLR 4.4
package antlr4;

	import java.util.*;

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
		"<INVALID>", "'*'", "'+'", "'-'", "ID", "INTEGER", "PLUS", "MINUS", "MULTI", 
		"DIV", "LBRACK", "RBRACK", "EQUALS", "NL", "IGNORE"
	};
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_sum = 2, RULE_multExpr = 3, RULE_term = 4;
	public static final String[] ruleNames = {
		"prog", "stat", "sum", "multExpr", "term"
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
	public static class ProgContext extends ParserRuleContext {
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SyntaxListener ) ((SyntaxListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SyntaxListener ) ((SyntaxListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(11); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(10); stat();
				}
				}
				setState(13); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__1) | (1L << T__0) | (1L << INTEGER) | (1L << PLUS) | (1L << MINUS) | (1L << LBRACK) | (1L << NL))) != 0) );
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
		public SumContext sum;
		public TerminalNode NL() { return getToken(SyntaxParser.NL, 0); }
		public SumContext sum() {
			return getRuleContext(SumContext.class,0);
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
			setState(20);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(15); ((StatContext)_localctx).sum = sum();
				setState(16); match(NL);
				System.out.println(((StatContext)_localctx).sum.value);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(19); match(NL);
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

	public static class SumContext extends ParserRuleContext {
		public int value;
		public MultExprContext e;
		public List<MultExprContext> multExpr() {
			return getRuleContexts(MultExprContext.class);
		}
		public MultExprContext multExpr(int i) {
			return getRuleContext(MultExprContext.class,i);
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
		enterRule(_localctx, 4, RULE_sum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22); ((SumContext)_localctx).e = multExpr();
			((SumContext)_localctx).value =  ((SumContext)_localctx).e.value;
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1 || _la==T__0) {
				{
				setState(32);
				switch (_input.LA(1)) {
				case T__1:
					{
					setState(24); match(T__1);
					setState(25); ((SumContext)_localctx).e = multExpr();
					_localctx.value += ((SumContext)_localctx).e.value;
					}
					break;
				case T__0:
					{
					setState(28); match(T__0);
					setState(29); ((SumContext)_localctx).e = multExpr();
					_localctx.value -= ((SumContext)_localctx).e.value;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(36);
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

	public static class MultExprContext extends ParserRuleContext {
		public int value;
		public TermContext e;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public MultExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SyntaxListener ) ((SyntaxListener)listener).enterMultExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SyntaxListener ) ((SyntaxListener)listener).exitMultExpr(this);
		}
	}

	public final MultExprContext multExpr() throws RecognitionException {
		MultExprContext _localctx = new MultExprContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_multExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37); ((MultExprContext)_localctx).e = term();
			((MultExprContext)_localctx).value =  ((MultExprContext)_localctx).e.value;
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(39); match(T__2);
				setState(40); ((MultExprContext)_localctx).e = term();
				_localctx.value *= ((MultExprContext)_localctx).e.value;
				}
				}
				setState(47);
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
		public int value;
		public Token INTEGER;
		public SumContext sum;
		public TermContext e;
		public TerminalNode MINUS(int i) {
			return getToken(SyntaxParser.MINUS, i);
		}
		public TerminalNode INTEGER() { return getToken(SyntaxParser.INTEGER, 0); }
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(SyntaxParser.PLUS); }
		public List<TerminalNode> MINUS() { return getTokens(SyntaxParser.MINUS); }
		public TerminalNode RBRACK() { return getToken(SyntaxParser.RBRACK, 0); }
		public TerminalNode PLUS(int i) {
			return getToken(SyntaxParser.PLUS, i);
		}
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
		enterRule(_localctx, 8, RULE_term);
		try {
			int _alt;
			setState(68);
			switch (_input.LA(1)) {
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(48); ((TermContext)_localctx).INTEGER = match(INTEGER);
				((TermContext)_localctx).value =  (((TermContext)_localctx).INTEGER!=null?Integer.valueOf(((TermContext)_localctx).INTEGER.getText()):0);
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 2);
				{
				setState(50); match(LBRACK);
				setState(51); ((TermContext)_localctx).sum = sum();
				setState(52); match(RBRACK);
				((TermContext)_localctx).value =  ((TermContext)_localctx).sum.value;
				}
				break;
			case T__2:
			case T__1:
			case T__0:
			case PLUS:
			case MINUS:
			case RBRACK:
			case NL:
				enterOuterAlt(_localctx, 3);
				{
				setState(65);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(63);
						switch (_input.LA(1)) {
						case PLUS:
							{
							setState(55); match(PLUS);
							setState(56); ((TermContext)_localctx).e = term();
							_localctx.value += ((TermContext)_localctx).e.value;
							}
							break;
						case MINUS:
							{
							setState(59); match(MINUS);
							setState(60); ((TermContext)_localctx).e = term();
							_localctx.value -= ((TermContext)_localctx).e.value;
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(67);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\20I\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\6\2\16\n\2\r\2\16\2\17\3\3\3\3\3\3\3\3"+
		"\3\3\5\3\27\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4#\n\4\f\4\16"+
		"\4&\13\4\3\5\3\5\3\5\3\5\3\5\3\5\7\5.\n\5\f\5\16\5\61\13\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6B\n\6\f\6\16\6E\13"+
		"\6\5\6G\n\6\3\6\2\2\7\2\4\6\b\n\2\2L\2\r\3\2\2\2\4\26\3\2\2\2\6\30\3\2"+
		"\2\2\b\'\3\2\2\2\nF\3\2\2\2\f\16\5\4\3\2\r\f\3\2\2\2\16\17\3\2\2\2\17"+
		"\r\3\2\2\2\17\20\3\2\2\2\20\3\3\2\2\2\21\22\5\6\4\2\22\23\7\17\2\2\23"+
		"\24\b\3\1\2\24\27\3\2\2\2\25\27\7\17\2\2\26\21\3\2\2\2\26\25\3\2\2\2\27"+
		"\5\3\2\2\2\30\31\5\b\5\2\31$\b\4\1\2\32\33\7\4\2\2\33\34\5\b\5\2\34\35"+
		"\b\4\1\2\35#\3\2\2\2\36\37\7\5\2\2\37 \5\b\5\2 !\b\4\1\2!#\3\2\2\2\"\32"+
		"\3\2\2\2\"\36\3\2\2\2#&\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%\7\3\2\2\2&$\3\2"+
		"\2\2\'(\5\n\6\2(/\b\5\1\2)*\7\3\2\2*+\5\n\6\2+,\b\5\1\2,.\3\2\2\2-)\3"+
		"\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\t\3\2\2\2\61/\3\2\2\2\62\63"+
		"\7\7\2\2\63G\b\6\1\2\64\65\7\f\2\2\65\66\5\6\4\2\66\67\7\r\2\2\678\b\6"+
		"\1\28G\3\2\2\29:\7\b\2\2:;\5\n\6\2;<\b\6\1\2<B\3\2\2\2=>\7\t\2\2>?\5\n"+
		"\6\2?@\b\6\1\2@B\3\2\2\2A9\3\2\2\2A=\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2"+
		"\2\2DG\3\2\2\2EC\3\2\2\2F\62\3\2\2\2F\64\3\2\2\2FC\3\2\2\2G\13\3\2\2\2"+
		"\n\17\26\"$/ACF";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}