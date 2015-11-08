/**
 * 
 */
package visitor;

import ast.AddNode;
import ast.AtomicNode;
import ast.BinaryNode;
import ast.DivNode;
import ast.ExprNode;
import ast.HeteroAST;
import ast.IntNode;
import ast.MinusNode;
import ast.MultiNode;
import ast.UMinusNode;
import lp.RecursiveDescentLexer;

/**
 * @author skrause
 *
 */
public class IndepEvalVisitor implements IEvalVisitor {

	private boolean byNode;
	
	/**
	 * 
	 */
	public IndepEvalVisitor() {
		this.byNode = true;
	}
	
	public IndepEvalVisitor(boolean byNode){
		this.byNode = byNode;
	}
	

	private double chooseEval(ExprNode node){
		if( byNode ){
			return chooseEvalByNode(node);
		}
		else {
			return chooseEvalByToken(node);
		}
	}
	
	private double chooseEvalByToken(ExprNode node){
		double value = 0.0;
		switch( node.getToken().type ){
			case(RecursiveDescentLexer.PLUS):
				value = eval((AddNode)node);
				break;
			case(RecursiveDescentLexer.MINUS):
				value = eval((MinusNode)node);
				break;
			case(RecursiveDescentLexer.DIV):
				value = eval((DivNode)node);
				break;
			case(RecursiveDescentLexer.MULTI):
				value = eval((MultiNode)node);
				break;
			case(RecursiveDescentLexer.INTEGER):
				value = eval((IntNode)node);
				break;
			case(RecursiveDescentLexer.UMINUS):
				value = eval((UMinusNode)node);
				break;
		}
		return value;
	}
	
	/**
	 * Auswahl einer geeigneten evalMethode
	 * @param node
	 * @return
	 */
	private double chooseEvalByNode(ExprNode node){
		double value = 0.0;
				
		if( node.getClass() == AddNode.class ){
			value = eval((AddNode)node);
		}
		else if ( node.getClass() == MinusNode.class ){
			value = eval( (MinusNode) node);
		}
		else if ( node.getClass() == DivNode.class ){
			value = eval( (DivNode) node);
		}
		else if ( node.getClass() == IntNode.class ){
			value = eval( (IntNode) node);
		}
		else if ( node.getClass() == MultiNode.class ){
			value = eval( (MultiNode) node);
		}
		else if ( node.getClass() == UMinusNode.class ){
			value = eval( (UMinusNode) node);
		}		
		
		return value;
	}


	@Override
	public double eval(HeteroAST node) {		
		return chooseEval( (ExprNode) node);
	}


	@Override
	public double eval(AddNode node) {
		return ( chooseEval(node.getLeft()) + chooseEval(node.getRight()) );
	}


	@Override
	public double eval(DivNode node) {
		return ( chooseEval( node.getLeft() ) / chooseEval(node.getRight() ));
	}


	@Override
	public double eval(IntNode node) {
		return Double.parseDouble( node.toString() );
	}


	@Override
	public double eval(MinusNode node) {
		return ( chooseEval( node.getLeft() ) - chooseEval(node.getRight() ));
	}


	@Override
	public double eval(MultiNode node) {
		return ( chooseEval( node.getLeft() ) * chooseEval(node.getRight() ));
	}


	@Override
	public double eval(UMinusNode node) {
		return ( - chooseEval( node.getLeft() ));
	}
	
}
