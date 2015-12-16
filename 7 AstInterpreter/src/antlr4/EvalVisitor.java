/**
 * 
 */
package antlr4;

import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import antlr4.AstParser.AssignStatContext;
import antlr4.AstParser.BrackContext;
import antlr4.AstParser.ComparisonContext;
import antlr4.AstParser.ComparisonStatContext;
import antlr4.AstParser.IdContext;
import antlr4.AstParser.IntContext;
import antlr4.AstParser.NlStatContext;
import antlr4.AstParser.PotenzContext;
import antlr4.AstParser.ProdContext;
import antlr4.AstParser.StatlistContext;
import antlr4.AstParser.SumContext;
import antlr4.AstParser.TermContext;
import antlr4.AstParser.UminusContext;

/**
 * @author simon
 *
 */
public final class EvalVisitor implements AstVisitor<Integer> {

	/**
	 * Datenspeicher
	 */
	private Map<String, Integer> memory = new HashMap<>();
	
	@Override
	public Integer visit(ParseTree arg0) {
	
		return null;
	}

	@Override
	public Integer visitChildren(RuleNode arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer visitErrorNode(ErrorNode arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer visitTerminal(TerminalNode arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer visitStatlist(StatlistContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer visitComparisonStat(ComparisonStatContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Integer visitNlStat(NlStatContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer visitComparison(ComparisonContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer visitSum(SumContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer visitProd(ProdContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public Integer visitAssignStat(AssignStatContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer visitId(IdContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer visitUminus(UminusContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer visitInt(IntContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer visitPotenz(PotenzContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer visitBrack(BrackContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

}
