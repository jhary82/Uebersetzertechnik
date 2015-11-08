/**
 * 
 */
package visitor;


import ast.*;
import lp.RecursiveDescentLexer;

/**
 * Independant Inorder PrintVisitor
 * und Expr-Evaluator
 * auf Node-Type-Basis
 * @author skrause
 *
 */
public class IndepInorderPrintVisitor implements IPrintVisitor{
	
	/**
	 * switching by Node Type ?
	 */
	private boolean byNode;
	
	/**
	 * Konstruktor
	 */

	public IndepInorderPrintVisitor() {		
		this.byNode = true;
    }
	
	/**
	 * Konstruktor mit Auswahlmöglichkeit ob
	 * switching by Node Type oder Token Type
	 * @param byNode 
	 */
	public IndepInorderPrintVisitor(boolean byNode){
		this.byNode = byNode;
	}
	
	/**
	 * Entweder choosePrintByNode oder choosePrintByToken
	 * @param node
	 * @return
	 */
	private String choosePrint(ExprNode node){		
		if( byNode ){
			return choosePrintByNode(node);
		}
		else {
			return choosePrintByToken(node);
		}
	}
	
	/**
	 * Auswahl iner geeigneten printMethode
	 * anhand des Tokentyps
	 * @param node
	 * @return
	 */
	private String choosePrintByToken(ExprNode node){
		String str = "";
		switch( node.getToken().type ){
			case(RecursiveDescentLexer.PLUS):
			case(RecursiveDescentLexer.MINUS):
			case(RecursiveDescentLexer.DIV):
			case(RecursiveDescentLexer.MULTI):
				str = print((BinaryNode)node);
				break;
			case(RecursiveDescentLexer.INTEGER):
				str = print((AtomicNode)node);
				break;
			case(RecursiveDescentLexer.UMINUS):
				str = print((UMinusNode)node);
				break;
		}
		return str;
	}
	
	/**
	 * Auswahl einer geeigneten printMethode
	 * anhand der Knotenklassen
	 * @param node
	 * @return
	 */
	private String choosePrintByNode(ExprNode node){
		String str = "";
		if( node.getClass() == AddNode.class || node.getClass() == MinusNode.class
			|| node.getClass() == DivNode.class || node.getClass() == MultiNode.class) {
			str = print((BinaryNode)node);
		}
		else if( node.getClass() == IntNode.class) {
			str = print((AtomicNode)node);
		}
		else if( node.getClass() == UMinusNode.class){
			str = print( (UMinusNode)node);
		}
		return str;
	}
	
	@Override	
	public String print(UMinusNode node) {		
		return " (-"+choosePrint(node.getLeft())+")";
	}

	@Override
	public String print(AtomicNode node) {		
		return " "+node.toString();
	}

	@Override
	public String print(BinaryNode node) {
		String str = "";
		str += " (" + choosePrint(node.getLeft());
		str += " "+node.toString();
		str += choosePrint(node.getRight())+")";
		return str;
	}

	@Override
	public String print(HeteroAST node) {
		String str = "";
		
		str = choosePrint((ExprNode) node);
		
		return str;
	}



}
