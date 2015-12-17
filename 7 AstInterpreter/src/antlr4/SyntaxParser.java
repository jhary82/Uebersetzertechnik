// Generated from Syntax.g4 by ANTLR 4.5.1
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
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, ID=12, INTEGER=13, NL=14, IGNORE=15;
	public static final int
		RULE_statlist = 0, RULE_stat = 1, RULE_comparison = 2, RULE_sum = 3, RULE_prod = 4, 
		RULE_potency = 5, RULE_term = 6;
	public static final String[] ruleNames = {
		"statlist", "stat", "comparison", "sum", "prod", "potency", "term"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "'<'", "'>'", "'=='", "'+'", "'-'", "'*'", "'/'", "'^'", 
		"'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"ID", "INTEGER", "NL", "IGNORE"
	};
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
	public String getGrammarFileName() { return "Syntax.g4"; }

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
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public StatlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statlist; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SyntaxVisitor ) return ((SyntaxVisitor<? extends T>)visitor).visitStatlist(this);
			else return visitor.visitChildren(this);
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
				setState(14);
				stat();
				}
				}
				setState(17); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__9) | (1L << ID) | (1L << INTEGER) | (1L << NL))) != 0) );
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
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	 
		public StatContext() { }
		public void copyFrom(StatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignStatContext extends StatContext {
		public TerminalNode ID() { return getToken(SyntaxParser.ID, 0); }
		public SumContext sum() {
			return getRuleContext(SumContext.class,0);
		}
		public TerminalNode NL() { return getToken(SyntaxParser.NL, 0); }
		public AssignStatContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SyntaxVisitor ) return ((SyntaxVisitor<? extends T>)visitor).visitAssignStat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComparisonStatContext extends StatContext {
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public TerminalNode NL() { return getToken(SyntaxParser.NL, 0); }
		public ComparisonStatContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SyntaxVisitor ) return ((SyntaxVisitor<? extends T>)visitor).visitComparisonStat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NlStatContext extends StatContext {
		public TerminalNode NL() { return getToken(SyntaxParser.NL, 0); }
		public NlStatContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SyntaxVisitor ) return ((SyntaxVisitor<? extends T>)visitor).visitNlStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(28);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new ComparisonStatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(19);
				comparison();
				setState(20);
				match(NL);
				}
				break;
			case 2:
				_localctx = new AssignStatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(22);
				match(ID);
				setState(23);
				match(T__0);
				setState(24);
				sum();
				setState(25);
				match(NL);
				}
				break;
			case 3:
				_localctx = new NlStatContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(27);
				match(NL);
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
		public Token op;
		public List<SumContext> sum() {
			return getRuleContexts(SumContext.class);
		}
		public SumContext sum(int i) {
			return getRuleContext(SumContext.class,i);
		}
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SyntaxVisitor ) return ((SyntaxVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			sum();
			setState(33);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3))) != 0)) {
				{
				setState(31);
				((ComparisonContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3))) != 0)) ) {
					((ComparisonContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(32);
				sum();
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
		public List<ProdContext> prod() {
			return getRuleContexts(ProdContext.class);
		}
		public ProdContext prod(int i) {
			return getRuleContext(ProdContext.class,i);
		}
		public SumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sum; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SyntaxVisitor ) return ((SyntaxVisitor<? extends T>)visitor).visitSum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SumContext sum() throws RecognitionException {
		SumContext _localctx = new SumContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			prod();
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4 || _la==T__5) {
				{
				{
				setState(36);
				_la = _input.LA(1);
				if ( !(_la==T__4 || _la==T__5) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(37);
				prod();
				}
				}
				setState(42);
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
		public List<PotencyContext> potency() {
			return getRuleContexts(PotencyContext.class);
		}
		public PotencyContext potency(int i) {
			return getRuleContext(PotencyContext.class,i);
		}
		public ProdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prod; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SyntaxVisitor ) return ((SyntaxVisitor<? extends T>)visitor).visitProd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProdContext prod() throws RecognitionException {
		ProdContext _localctx = new ProdContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_prod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			potency();
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6 || _la==T__7) {
				{
				{
				setState(44);
				_la = _input.LA(1);
				if ( !(_la==T__6 || _la==T__7) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(45);
				potency();
				}
				}
				setState(50);
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

	public static class PotencyContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public List<PotencyContext> potency() {
			return getRuleContexts(PotencyContext.class);
		}
		public PotencyContext potency(int i) {
			return getRuleContext(PotencyContext.class,i);
		}
		public PotencyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_potency; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SyntaxVisitor ) return ((SyntaxVisitor<? extends T>)visitor).visitPotency(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PotencyContext potency() throws RecognitionException {
		PotencyContext _localctx = new PotencyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_potency);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			term();
			setState(56);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(52);
					match(T__8);
					setState(53);
					potency();
					}
					} 
				}
				setState(58);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	 
		public TermContext() { }
		public void copyFrom(TermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdContext extends TermContext {
		public TerminalNode ID() { return getToken(SyntaxParser.ID, 0); }
		public IdContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SyntaxVisitor ) return ((SyntaxVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BrackSumContext extends TermContext {
		public SumContext sum() {
			return getRuleContext(SumContext.class,0);
		}
		public BrackSumContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SyntaxVisitor ) return ((SyntaxVisitor<? extends T>)visitor).visitBrackSum(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerContext extends TermContext {
		public TerminalNode INTEGER() { return getToken(SyntaxParser.INTEGER, 0); }
		public IntegerContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SyntaxVisitor ) return ((SyntaxVisitor<? extends T>)visitor).visitInteger(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UminusTermContext extends TermContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public UminusTermContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SyntaxVisitor ) return ((SyntaxVisitor<? extends T>)visitor).visitUminusTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_term);
		int _la;
		try {
			int _alt;
			setState(71);
			switch (_input.LA(1)) {
			case INTEGER:
				_localctx = new IntegerContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				match(INTEGER);
				}
				break;
			case T__9:
				_localctx = new BrackSumContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				match(T__9);
				setState(61);
				sum();
				setState(62);
				match(T__10);
				}
				break;
			case T__4:
			case T__5:
				_localctx = new UminusTermContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(65); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(64);
						_la = _input.LA(1);
						if ( !(_la==T__4 || _la==T__5) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(67); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(69);
				term();
				}
				break;
			case ID:
				_localctx = new IdContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(70);
				match(ID);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\21L\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\6\2\22\n\2\r\2\16\2\23"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\37\n\3\3\4\3\4\3\4\5\4$\n\4\3"+
		"\5\3\5\3\5\7\5)\n\5\f\5\16\5,\13\5\3\6\3\6\3\6\7\6\61\n\6\f\6\16\6\64"+
		"\13\6\3\7\3\7\3\7\7\79\n\7\f\7\16\7<\13\7\3\b\3\b\3\b\3\b\3\b\3\b\6\b"+
		"D\n\b\r\b\16\bE\3\b\3\b\5\bJ\n\b\3\b\2\2\t\2\4\6\b\n\f\16\2\5\3\2\4\6"+
		"\3\2\7\b\3\2\t\nO\2\21\3\2\2\2\4\36\3\2\2\2\6 \3\2\2\2\b%\3\2\2\2\n-\3"+
		"\2\2\2\f\65\3\2\2\2\16I\3\2\2\2\20\22\5\4\3\2\21\20\3\2\2\2\22\23\3\2"+
		"\2\2\23\21\3\2\2\2\23\24\3\2\2\2\24\3\3\2\2\2\25\26\5\6\4\2\26\27\7\20"+
		"\2\2\27\37\3\2\2\2\30\31\7\16\2\2\31\32\7\3\2\2\32\33\5\b\5\2\33\34\7"+
		"\20\2\2\34\37\3\2\2\2\35\37\7\20\2\2\36\25\3\2\2\2\36\30\3\2\2\2\36\35"+
		"\3\2\2\2\37\5\3\2\2\2 #\5\b\5\2!\"\t\2\2\2\"$\5\b\5\2#!\3\2\2\2#$\3\2"+
		"\2\2$\7\3\2\2\2%*\5\n\6\2&\'\t\3\2\2\')\5\n\6\2(&\3\2\2\2),\3\2\2\2*("+
		"\3\2\2\2*+\3\2\2\2+\t\3\2\2\2,*\3\2\2\2-\62\5\f\7\2./\t\4\2\2/\61\5\f"+
		"\7\2\60.\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\13\3\2\2"+
		"\2\64\62\3\2\2\2\65:\5\16\b\2\66\67\7\13\2\2\679\5\f\7\28\66\3\2\2\29"+
		"<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;\r\3\2\2\2<:\3\2\2\2=J\7\17\2\2>?\7\f\2"+
		"\2?@\5\b\5\2@A\7\r\2\2AJ\3\2\2\2BD\t\3\2\2CB\3\2\2\2DE\3\2\2\2EC\3\2\2"+
		"\2EF\3\2\2\2FG\3\2\2\2GJ\5\16\b\2HJ\7\16\2\2I=\3\2\2\2I>\3\2\2\2IC\3\2"+
		"\2\2IH\3\2\2\2J\17\3\2\2\2\n\23\36#*\62:EI";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}