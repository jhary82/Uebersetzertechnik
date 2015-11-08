/**
 * 
 */
package ast;

import lp.Token;

/**
 * @author skrause
 *
 */
public class UnaryNode extends ExprNode {
	private ExprNode left;

	public UnaryNode(ExprNode left, Token token) {
		super(token);
		this.left = left;
	}

	@Override
	public String toStringTree() {
		if (left == null)
			return this.toString();
		StringBuilder buf = new StringBuilder();
		buf.append("(");
		buf.append(this.toString());
		buf.append(' ');
		buf.append(left.toStringTree());		
		buf.append(")");
		return buf.toString();
	}

	public ExprNode getLeft(){
		return this.left;
	}
}
