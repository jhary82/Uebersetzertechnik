/**
 * 
 */
package ast;

import lp.Token;

/**
 * @author skrause
 *
 */
public class MinusNode extends BinaryNode {

	/**
	 * @param left
	 * @param addToken
	 * @param right
	 */
	public MinusNode(ExprNode left, Token addToken, ExprNode right) {
		super(left, addToken, right);
	}

}
