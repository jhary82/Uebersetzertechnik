// Generated from Cymbol.g4 by ANTLR 4.4
package antlr4;

	import symbolTable.*;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CymbolParser}.
 */
public interface CymbolListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CymbolParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(@NotNull CymbolParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(@NotNull CymbolParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull CymbolParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull CymbolParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull CymbolParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull CymbolParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(@NotNull CymbolParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(@NotNull CymbolParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CymbolParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(@NotNull CymbolParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CymbolParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(@NotNull CymbolParser.PrimaryContext ctx);
}