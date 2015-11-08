package ast;

import lp.Token;

/**
 * 
 * @author skrause
 *
 */
public abstract class ExprNode extends HeteroAST {      
    
	/**
	 * 
	 * @param token
	 */
    public ExprNode(Token token) { 
    	super(token);
    }
    
}
