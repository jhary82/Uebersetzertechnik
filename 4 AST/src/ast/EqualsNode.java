/**
 * 
 */
package ast;

import lp.Token;

/**
 * @author skrause
 *
 */
public class EqualsNode extends BinaryNode {

	/**
	 * @param left
	 * @param addToken
	 * @param right
	 */
	public EqualsNode(ExprNode left, Token addToken, ExprNode right) {
		super(left, addToken, right);
	}

}
