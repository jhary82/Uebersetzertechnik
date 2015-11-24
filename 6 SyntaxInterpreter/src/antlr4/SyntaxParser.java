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


		Map<String, Integer> memory = new HashMap<>();

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
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__1) | (1L << T__0) | (1L << ID) | (1L << INTEGER) | (1L << PLUS) | (1L << MINUS) | (1L << MULTI) | (1L << DIV) | (1L << LBRACK) | (1L << NL))) != 0) );
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
		public ComparisonContext comparison;
		public Token ID;
		public SumContext e;
		public TerminalNode NL() { return getToken(SyntaxParser.NL, 0); }
		public TerminalNode ID() { return getToken(SyntaxParser.ID, 0); }
		public TerminalNode EQUALS() { return getToken(SyntaxParser.EQUALS, 0); }
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
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
			setState(30);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(19); ((StatContext)_localctx).comparison = comparison();
				setState(20); match(NL);
				System.out.println(((StatContext)_localctx).comparison.value);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(23); ((StatContext)_localctx).ID = match(ID);
				setState(24); match(EQUALS);
				setState(25); ((StatContext)_localctx).e = sum();
				setState(26); match(NL);
				 memory.put((((StatContext)_localctx).ID!=null?((StatContext)_localctx).ID.getText():null), ((StatContext)_localctx).e.value); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(29); match(NL);
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

	public static class ComparisonContext extends ParserRuleContext {
		public int value;
		public SumContext e;
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32); ((ComparisonContext)_localctx).e = sum();
			((ComparisonContext)_localctx).value =  ((ComparisonContext)_localctx).e.value;
			setState(42);
			switch (_input.LA(1)) {
			case T__2:
				{
				setState(34); match(T__2);
				setState(35); ((ComparisonContext)_localctx).e = sum();
				 if( _localctx.value < ((ComparisonContext)_localctx).e.value) ((ComparisonContext)_localctx).value =  1; else ((ComparisonContext)_localctx).value =  0;
				}
				break;
			case T__0:
				{
				setState(38); match(T__0);
				setState(39); ((ComparisonContext)_localctx).e = sum();
				 if( _localctx.value > ((ComparisonContext)_localctx).e.value) ((ComparisonContext)_localctx).value =  1; else ((ComparisonContext)_localctx).value =  0;
				}
				break;
			case NL:
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

	public static class SumContext extends ParserRuleContext {
		public int value;
		public ProdContext e;
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
			setState(44); ((SumContext)_localctx).e = prod();
			((SumContext)_localctx).value =  ((SumContext)_localctx).e.value;
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				setState(54);
				switch (_input.LA(1)) {
				case PLUS:
					{
					setState(46); match(PLUS);
					setState(47); ((SumContext)_localctx).e = prod();
					_localctx.value += ((SumContext)_localctx).e.value;
					}
					break;
				case MINUS:
					{
					setState(50); match(MINUS);
					setState(51); ((SumContext)_localctx).e = prod();
					_localctx.value -= ((SumContext)_localctx).e.value;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(58);
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
		public int value;
		public PotenzContext e;
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
			setState(59); ((ProdContext)_localctx).e = potenz();
			((ProdContext)_localctx).value =  ((ProdContext)_localctx).e.value;
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULTI || _la==DIV) {
				{
				setState(69);
				switch (_input.LA(1)) {
				case MULTI:
					{
					setState(61); match(MULTI);
					setState(62); ((ProdContext)_localctx).e = potenz();
					_localctx.value *= ((ProdContext)_localctx).e.value;
					}
					break;
				case DIV:
					{
					setState(65); match(DIV);
					setState(66); ((ProdContext)_localctx).e = potenz();
					_localctx.value /= ((ProdContext)_localctx).e.value;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(73);
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
		public int value;
		public TermContext e;
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
			setState(74); ((PotenzContext)_localctx).e = term();
			((PotenzContext)_localctx).value =  ((PotenzContext)_localctx).e.value;
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(76); match(T__1);
				setState(77); ((PotenzContext)_localctx).e = term();
				 ((PotenzContext)_localctx).value =  (int)Math.pow( _localctx.value, ((PotenzContext)_localctx).e.value); 
				}
				}
				setState(84);
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
		public Token ID;
		public TerminalNode ID() { return getToken(SyntaxParser.ID, 0); }
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
		enterRule(_localctx, 12, RULE_term);
		try {
			int _alt;
			setState(107);
			switch (_input.LA(1)) {
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(85); ((TermContext)_localctx).INTEGER = match(INTEGER);
				((TermContext)_localctx).value =  (((TermContext)_localctx).INTEGER!=null?Integer.valueOf(((TermContext)_localctx).INTEGER.getText()):0);
				}
				break;
			case LBRACK:
				enterOuterAlt(_localctx, 2);
				{
				setState(87); match(LBRACK);
				setState(88); ((TermContext)_localctx).sum = sum();
				setState(89); match(RBRACK);
				((TermContext)_localctx).value =  ((TermContext)_localctx).sum.value;
				}
				break;
			case T__2:
			case T__1:
			case T__0:
			case PLUS:
			case MINUS:
			case MULTI:
			case DIV:
			case RBRACK:
			case NL:
				enterOuterAlt(_localctx, 3);
				{
				setState(102);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(100);
						switch (_input.LA(1)) {
						case PLUS:
							{
							setState(92); match(PLUS);
							setState(93); ((TermContext)_localctx).e = term();
							_localctx.value += ((TermContext)_localctx).e.value;
							}
							break;
						case MINUS:
							{
							setState(96); match(MINUS);
							setState(97); ((TermContext)_localctx).e = term();
							_localctx.value -= ((TermContext)_localctx).e.value;
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(104);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(105); ((TermContext)_localctx).ID = match(ID);
				 ((TermContext)_localctx).value =  memory.get((((TermContext)_localctx).ID!=null?((TermContext)_localctx).ID.getText():null)); 
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\20p\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\6\2\22\n\2\r\2\16\2\23"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3!\n\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\5\4-\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\7\59\n\5\f\5\16\5<\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7"+
		"\6H\n\6\f\6\16\6K\13\6\3\7\3\7\3\7\3\7\3\7\3\7\7\7S\n\7\f\7\16\7V\13\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\bg\n\b"+
		"\f\b\16\bj\13\b\3\b\3\b\5\bn\n\b\3\b\2\2\t\2\4\6\b\n\f\16\2\2w\2\21\3"+
		"\2\2\2\4 \3\2\2\2\6\"\3\2\2\2\b.\3\2\2\2\n=\3\2\2\2\fL\3\2\2\2\16m\3\2"+
		"\2\2\20\22\5\4\3\2\21\20\3\2\2\2\22\23\3\2\2\2\23\21\3\2\2\2\23\24\3\2"+
		"\2\2\24\3\3\2\2\2\25\26\5\6\4\2\26\27\7\17\2\2\27\30\b\3\1\2\30!\3\2\2"+
		"\2\31\32\7\6\2\2\32\33\7\16\2\2\33\34\5\b\5\2\34\35\7\17\2\2\35\36\b\3"+
		"\1\2\36!\3\2\2\2\37!\7\17\2\2 \25\3\2\2\2 \31\3\2\2\2 \37\3\2\2\2!\5\3"+
		"\2\2\2\"#\5\b\5\2#,\b\4\1\2$%\7\3\2\2%&\5\b\5\2&\'\b\4\1\2\'-\3\2\2\2"+
		"()\7\5\2\2)*\5\b\5\2*+\b\4\1\2+-\3\2\2\2,$\3\2\2\2,(\3\2\2\2,-\3\2\2\2"+
		"-\7\3\2\2\2./\5\n\6\2/:\b\5\1\2\60\61\7\b\2\2\61\62\5\n\6\2\62\63\b\5"+
		"\1\2\639\3\2\2\2\64\65\7\t\2\2\65\66\5\n\6\2\66\67\b\5\1\2\679\3\2\2\2"+
		"8\60\3\2\2\28\64\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;\t\3\2\2\2<:\3"+
		"\2\2\2=>\5\f\7\2>I\b\6\1\2?@\7\n\2\2@A\5\f\7\2AB\b\6\1\2BH\3\2\2\2CD\7"+
		"\13\2\2DE\5\f\7\2EF\b\6\1\2FH\3\2\2\2G?\3\2\2\2GC\3\2\2\2HK\3\2\2\2IG"+
		"\3\2\2\2IJ\3\2\2\2J\13\3\2\2\2KI\3\2\2\2LM\5\16\b\2MT\b\7\1\2NO\7\4\2"+
		"\2OP\5\16\b\2PQ\b\7\1\2QS\3\2\2\2RN\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2"+
		"\2\2U\r\3\2\2\2VT\3\2\2\2WX\7\7\2\2Xn\b\b\1\2YZ\7\f\2\2Z[\5\b\5\2[\\\7"+
		"\r\2\2\\]\b\b\1\2]n\3\2\2\2^_\7\b\2\2_`\5\16\b\2`a\b\b\1\2ag\3\2\2\2b"+
		"c\7\t\2\2cd\5\16\b\2de\b\b\1\2eg\3\2\2\2f^\3\2\2\2fb\3\2\2\2gj\3\2\2\2"+
		"hf\3\2\2\2hi\3\2\2\2in\3\2\2\2jh\3\2\2\2kl\7\6\2\2ln\b\b\1\2mW\3\2\2\2"+
		"mY\3\2\2\2mh\3\2\2\2mk\3\2\2\2n\17\3\2\2\2\r\23 ,8:GITfhm";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}