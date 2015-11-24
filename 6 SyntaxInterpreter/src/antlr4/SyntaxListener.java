// Generated from Syntax.g4 by ANTLR 4.4
package antlr4;

	import java.util.*;	

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SyntaxParser}.
 */
public interface SyntaxListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SyntaxParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(@NotNull SyntaxParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntaxParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(@NotNull SyntaxParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntaxParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(@NotNull SyntaxParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntaxParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(@NotNull SyntaxParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntaxParser#prod}.
	 * @param ctx the parse tree
	 */
	void enterProd(@NotNull SyntaxParser.ProdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntaxParser#prod}.
	 * @param ctx the parse tree
	 */
	void exitProd(@NotNull SyntaxParser.ProdContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntaxParser#statlist}.
	 * @param ctx the parse tree
	 */
	void enterStatlist(@NotNull SyntaxParser.StatlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntaxParser#statlist}.
	 * @param ctx the parse tree
	 */
	void exitStatlist(@NotNull SyntaxParser.StatlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntaxParser#sum}.
	 * @param ctx the parse tree
	 */
	void enterSum(@NotNull SyntaxParser.SumContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntaxParser#sum}.
	 * @param ctx the parse tree
	 */
	void exitSum(@NotNull SyntaxParser.SumContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntaxParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(@NotNull SyntaxParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntaxParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(@NotNull SyntaxParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntaxParser#potenz}.
	 * @param ctx the parse tree
	 */
	void enterPotenz(@NotNull SyntaxParser.PotenzContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntaxParser#potenz}.
	 * @param ctx the parse tree
	 */
	void exitPotenz(@NotNull SyntaxParser.PotenzContext ctx);
}