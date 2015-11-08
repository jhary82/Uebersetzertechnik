/**
 * 
 */
package ast;

import lp.Token;

/**
 * @author skrause
 *
 */
public class MultiNode extends BinaryNode {

	public MultiNode(ExprNode left, Token addToken, ExprNode right) {
		super(left, addToken, right);
	}

}
