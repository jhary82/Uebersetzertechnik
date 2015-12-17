// Generated from Syntax.g4 by ANTLR 4.5.1
package antlr4;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SyntaxParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SyntaxVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SyntaxParser#statlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatlist(SyntaxParser.StatlistContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comparisonStat}
	 * labeled alternative in {@link SyntaxParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonStat(SyntaxParser.ComparisonStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignStat}
	 * labeled alternative in {@link SyntaxParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStat(SyntaxParser.AssignStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nlStat}
	 * labeled alternative in {@link SyntaxParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNlStat(SyntaxParser.NlStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link SyntaxParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(SyntaxParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link SyntaxParser#sum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSum(SyntaxParser.SumContext ctx);
	/**
	 * Visit a parse tree produced by {@link SyntaxParser#prod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProd(SyntaxParser.ProdContext ctx);
	/**
	 * Visit a parse tree produced by {@link SyntaxParser#potency}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPotency(SyntaxParser.PotencyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code integer}
	 * labeled alternative in {@link SyntaxParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(SyntaxParser.IntegerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code brackSum}
	 * labeled alternative in {@link SyntaxParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBrackSum(SyntaxParser.BrackSumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code uminusTerm}
	 * labeled alternative in {@link SyntaxParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUminusTerm(SyntaxParser.UminusTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link SyntaxParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(SyntaxParser.IdContext ctx);
}