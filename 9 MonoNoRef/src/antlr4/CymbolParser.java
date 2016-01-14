// Generated from Cymbol.g4 by ANTLR 4.5.1
package antlr4;

	import symbolTable.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CymbolParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, ID=8, INT=9, WS=10, 
		SL_COMMENT=11;
	public static final int
		RULE_compilationUnit = 0, RULE_type = 1, RULE_varDeclaration = 2, RULE_expression = 3, 
		RULE_primary = 4;
	public static final String[] ruleNames = {
		"compilationUnit", "type", "varDeclaration", "expression", "primary"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'float'", "'int'", "'='", "';'", "'+'", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, "ID", "INT", "WS", "SL_COMMENT"
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
	public String getGrammarFileName() { return "Cymbol.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	SymbolTable symtab;
	public CymbolParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CompilationUnitContext extends ParserRuleContext {
		public SymbolTable symtab;
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public CompilationUnitContext(ParserRuleContext parent, int invokingState, SymbolTable symtab) {
			super(parent, invokingState);
			this.symtab = symtab;
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CymbolVisitor ) return ((CymbolVisitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit(SymbolTable symtab) throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState(), symtab);
		enterRule(_localctx, 0, RULE_compilationUnit);
		this.symtab = symtab;
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
				setState(10);
				varDeclaration();
				}
				}
				setState(13); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 || _la==T__1 );
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

	public static class TypeContext extends ParserRuleContext {
		public Type tsym;
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CymbolVisitor ) return ((CymbolVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_type);
		try {
			setState(19);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(15);
				match(T__0);
				((TypeContext)_localctx).tsym =  (Type)symtab.resolve("float");
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(17);
				match(T__1);
				((TypeContext)_localctx).tsym =  (Type)symtab.resolve("int");
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			 // _localctx.start is the first tree node matched by this rule
			    System.out.println("line "+_localctx.start.getLine()+": ref "+_localctx.tsym.getName());

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

	public static class VarDeclarationContext extends ParserRuleContext {
		public TypeContext type;
		public Token ID;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(CymbolParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CymbolVisitor ) return ((CymbolVisitor<? extends T>)visitor).visitVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_varDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			((VarDeclarationContext)_localctx).type = type();
			setState(22);
			((VarDeclarationContext)_localctx).ID = match(ID);
			setState(25);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(23);
				match(T__2);
				setState(24);
				expression();
				}
			}

			setState(27);
			match(T__3);

			        System.out.println("line "+((VarDeclarationContext)_localctx).ID.getLine()+": def "+(((VarDeclarationContext)_localctx).ID!=null?((VarDeclarationContext)_localctx).ID.getText():null));
			    	VariableSymbol vs = new VariableSymbol((((VarDeclarationContext)_localctx).ID!=null?((VarDeclarationContext)_localctx).ID.getText():null),((VarDeclarationContext)_localctx).type.tsym);
			    	symtab.define(vs);
			    	
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

	public static class ExpressionContext extends ParserRuleContext {
		public List<PrimaryContext> primary() {
			return getRuleContexts(PrimaryContext.class);
		}
		public PrimaryContext primary(int i) {
			return getRuleContext(PrimaryContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CymbolVisitor ) return ((CymbolVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			primary();
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(31);
				match(T__4);
				setState(32);
				primary();
				}
				}
				setState(37);
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

	public static class PrimaryContext extends ParserRuleContext {
		public Token ID;
		public TerminalNode ID() { return getToken(CymbolParser.ID, 0); }
		public TerminalNode INT() { return getToken(CymbolParser.INT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CymbolVisitor ) return ((CymbolVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_primary);
		try {
			setState(45);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				((PrimaryContext)_localctx).ID = match(ID);
				System.out.println("line "+((PrimaryContext)_localctx).ID.getLine()+": ref to "+
				    	 symtab.resolve((((PrimaryContext)_localctx).ID!=null?((PrimaryContext)_localctx).ID.getText():null)));symtab.resolve((((PrimaryContext)_localctx).ID!=null?((PrimaryContext)_localctx).ID.getText():null)).ref = true;
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(40);
				match(INT);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(41);
				match(T__5);
				setState(42);
				expression();
				setState(43);
				match(T__6);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\r\62\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\6\2\16\n\2\r\2\16\2\17\3\3\3\3\3\3\3"+
		"\3\5\3\26\n\3\3\4\3\4\3\4\3\4\5\4\34\n\4\3\4\3\4\3\4\3\5\3\5\3\5\7\5$"+
		"\n\5\f\5\16\5\'\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\60\n\6\3\6\2\2\7"+
		"\2\4\6\b\n\2\2\62\2\r\3\2\2\2\4\25\3\2\2\2\6\27\3\2\2\2\b \3\2\2\2\n/"+
		"\3\2\2\2\f\16\5\6\4\2\r\f\3\2\2\2\16\17\3\2\2\2\17\r\3\2\2\2\17\20\3\2"+
		"\2\2\20\3\3\2\2\2\21\22\7\3\2\2\22\26\b\3\1\2\23\24\7\4\2\2\24\26\b\3"+
		"\1\2\25\21\3\2\2\2\25\23\3\2\2\2\26\5\3\2\2\2\27\30\5\4\3\2\30\33\7\n"+
		"\2\2\31\32\7\5\2\2\32\34\5\b\5\2\33\31\3\2\2\2\33\34\3\2\2\2\34\35\3\2"+
		"\2\2\35\36\7\6\2\2\36\37\b\4\1\2\37\7\3\2\2\2 %\5\n\6\2!\"\7\7\2\2\"$"+
		"\5\n\6\2#!\3\2\2\2$\'\3\2\2\2%#\3\2\2\2%&\3\2\2\2&\t\3\2\2\2\'%\3\2\2"+
		"\2()\7\n\2\2)\60\b\6\1\2*\60\7\13\2\2+,\7\b\2\2,-\5\b\5\2-.\7\t\2\2.\60"+
		"\3\2\2\2/(\3\2\2\2/*\3\2\2\2/+\3\2\2\2\60\13\3\2\2\2\7\17\25\33%/";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}