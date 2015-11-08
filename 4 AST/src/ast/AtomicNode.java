/**
 * 
 */
package ast;

import lp.Token;

/**
 * @author skrause
 *
 */
public class AtomicNode extends ExprNode {

	public AtomicNode(Token token) {
		super(token);		
	}

	@Override
	public String toStringTree() {		
		return this.toString();
	}

}
