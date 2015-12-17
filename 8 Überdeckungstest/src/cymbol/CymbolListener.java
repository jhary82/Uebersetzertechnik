// Generated from Cymbol.g4 by ANTLR 4.5.1
package cymbol;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CymbolParser}.
 */
public interface CymbolListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CymbolParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(CymbolParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(CymbolParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(CymbolParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(CymbolParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(CymbolParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(CymbolParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDecl(CymbolParser.FunctionDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDecl(CymbolParser.FunctionDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(CymbolParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(CymbolParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(CymbolParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(CymbolParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(CymbolParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(CymbolParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statBlock}
	 * labeled alternative in {@link CymbolParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStatBlock(CymbolParser.StatBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statBlock}
	 * labeled alternative in {@link CymbolParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStatBlock(CymbolParser.StatBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statVarDecl}
	 * labeled alternative in {@link CymbolParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStatVarDecl(CymbolParser.StatVarDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statVarDecl}
	 * labeled alternative in {@link CymbolParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStatVarDecl(CymbolParser.StatVarDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statIf}
	 * labeled alternative in {@link CymbolParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStatIf(CymbolParser.StatIfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statIf}
	 * labeled alternative in {@link CymbolParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStatIf(CymbolParser.StatIfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statFor}
	 * labeled alternative in {@link CymbolParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStatFor(CymbolParser.StatForContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statFor}
	 * labeled alternative in {@link CymbolParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStatFor(CymbolParser.StatForContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statReturn}
	 * labeled alternative in {@link CymbolParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStatReturn(CymbolParser.StatReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statReturn}
	 * labeled alternative in {@link CymbolParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStatReturn(CymbolParser.StatReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statAssignment}
	 * labeled alternative in {@link CymbolParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStatAssignment(CymbolParser.StatAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statAssignment}
	 * labeled alternative in {@link CymbolParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStatAssignment(CymbolParser.StatAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statFuncCall}
	 * labeled alternative in {@link CymbolParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStatFuncCall(CymbolParser.StatFuncCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statFuncCall}
	 * labeled alternative in {@link CymbolParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStatFuncCall(CymbolParser.StatFuncCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(CymbolParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(CymbolParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#exprList}.
	 * @param ctx the parse tree
	 */
	void enterExprList(CymbolParser.ExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#exprList}.
	 * @param ctx the parse tree
	 */
	void exitExprList(CymbolParser.ExprListContext ctx);
}