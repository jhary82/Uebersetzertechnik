package ast;

import lp.Token;

/**
 * 
 * @author skrause
 *
 */
public abstract class HeteroAST {  
    private Token token;
    
    public HeteroAST()  {}
    public HeteroAST(Token t) {
    	token = t; 
    }
  
   
    /**
     * Erzeugt eine Textbasierte Ausgabe des Baums
     * @return
     */
    public abstract String toStringTree();
    
    @Override
    public String toString(){
    	return token.text;
    }
    
    /**
     * Gibt das Token zurück
     * @return
     */
    public Token getToken(){
    	return token;
    }
}
