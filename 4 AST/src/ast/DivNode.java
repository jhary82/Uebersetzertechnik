/**
 * 
 */
package ast;

import lp.Token;

/**
 * @author skrause
 *
 */
public class DivNode extends BinaryNode {

	public DivNode(ExprNode left, Token addToken, ExprNode right) {
		super(left, addToken, right);	}

}
