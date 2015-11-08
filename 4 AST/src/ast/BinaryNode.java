/**
 * 
 */
package ast;

import lp.Token;

/**
 * @author skrause
 *
 */
public abstract class BinaryNode extends ExprNode {
	  private ExprNode left, right;	      
	    
	    public BinaryNode(ExprNode left, Token addToken, ExprNode right) {
	        super(addToken);
	        this.left = left;
	        this.right = right;
	    }
	    
	    public void setRight(ExprNode r){
	    	this.right = r;
	    }
	    
	    @Override
	    public String toStringTree() {
	        if ( left==null || right==null ) return this.toString();
	        StringBuilder buf = new StringBuilder();
	        buf.append("(");
	        buf.append(this.toString());
	        buf.append(' ');
	        buf.append(left.toStringTree());
	        buf.append(' ');
	        buf.append(right.toStringTree());
	        buf.append(")");
	        return buf.toString();
	    }

		/**
		 * @return the left
		 */
		public ExprNode getLeft() {
			return left;
		}

		/**
		 * @return the right
		 */
		public ExprNode getRight() {
			return right;
		}
	    
	    
}
