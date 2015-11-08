package ast;

import lp.Token;

public class AddNode extends BinaryNode {    
   

    
    public AddNode(ExprNode left, Token addToken, ExprNode right) {
        super(left, addToken, right);
    }
    
    
}
