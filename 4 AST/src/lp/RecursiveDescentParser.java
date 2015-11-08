/**
 * 
 */
package lp;

import static lp.RecursiveDescentLexer.*;

import ast.AddNode;
import ast.BinaryNode;
import ast.DivNode;
import ast.EqualsNode;
import ast.ExprNode;
import ast.HeteroAST;
import ast.IDNode;
import ast.IntNode;
import ast.MinusNode;
import ast.MultiNode;
import ast.UMinusNode;



/**
 * @author skrause
 *
 */
public class RecursiveDescentParser extends Parser {

	private ExprNode root;

	/**
	 * @param input
	 */
	public RecursiveDescentParser(Lexer input) {
		super(input);
		root = null;
	}
		
	@Override
	public void match(int x){

		super.match(x);
	}
	
	/**
	 * statlist -> stat+
	 */
	public HeteroAST statlist() {
		HeteroAST ast = null;
		do{		
			ast = stat();
		}while( lookahead.type != EOF_TYPE);
		return ast;
	}
	 
	/**
	 * stat -> (sum NL |NL | ID = sum NL)
	 */
	public HeteroAST stat(){
		ExprNode ast = null;
		if( lookahead.type == NL){ 
			match( NL );
		}
		else if( lookahead.type == ID && nextToken.type == EQUALS){
			ExprNode node = new IDNode(lookahead);
			Token token = nextToken;
			match( ID );
			match( EQUALS );
			ast = sum();
			EqualsNode equals = new EqualsNode(node, token, ast);
			ast = equals;
			match(NL);
		}
		else{
			ast = sum();
			match( NL );
		}
		return ast;
	}
		
	/**
	 * sum -> prod [(+|-)prod]*
	 */
	public ExprNode sum(){
		BinaryNode node = null, oldNode = null, localRoot = null;
		ExprNode left = null, right = null;
		Token token = null;
		if( root == null ){
			root = node;
		}		
		
		left = prod();
		while( lookahead.type == PLUS || lookahead.type == MINUS ){
			token = lookahead;
			if( lookahead.type == PLUS ){
				if(right != null){	 
					if(localRoot == null){
						localRoot = node;
					}
					oldNode = node;
					left = right;
					match( PLUS ); 
					node = new AddNode(left, token, right);
					oldNode.setRight(node);
				}
				else{
					match( PLUS ); 
					node = new AddNode(left, token, right);
				}			}
			else if( lookahead.type == MINUS ){
				if(right != null){	
					if(localRoot == null){
						localRoot = node;
					}
					oldNode = node;
					left = right;
					match( MINUS ); 
					node = new MinusNode(left, token, right);
					oldNode.setRight(node);
				}
				else{
					match( MINUS ); 
					node = new MinusNode(left, token, right);
				}
			}
			else {
				throw new Error("Error RDP_1: + or - expected");
			}
			right =  prod() ;
		}
		 
		if( node == null){
			return left;
		}
		else{			 
			node.setRight(right);
			if(localRoot == null){
				return node;
			}
			else {
				return localRoot;
			}
		}
	}
	
	/**
	 * prod -> term [(+|-)term]*
	 */
	public ExprNode prod(){
		BinaryNode node = null, oldNode = null, localRoot = null;
		ExprNode left = null, right = null;
		Token token = null;
		if( root == null ){
			root = node;
		}		
		
		left = term();
		while( lookahead.type == MULTI || lookahead.type == DIV ){
			token = lookahead;
			if( lookahead.type == MULTI ){
				if(right != null){	
					if(localRoot == null){
						localRoot = node; 
					}
					oldNode = node;
					left = right;
					match( MULTI ); 
					node = new MultiNode(left, token, right);
					oldNode.setRight(node);
				}
				else{
					match( MULTI ); 
					node = new MultiNode(left, token, right);
				}
			}
			else if( lookahead.type == DIV ){
				if(right != null){	
					if(localRoot == null){
						localRoot = node;
					}
					oldNode = node;
					left = right;
					match( DIV ); 
					node = new DivNode(left, token, right);
					oldNode.setRight(node);
				}
				else{
					match( DIV ); 
					node = new DivNode(left, token, right);
				}
			}
			else {
				throw new Error("Error RDP_2: / or * expected");
			}
			right =  term() ;
		}
		 
		if( node == null){
			return left;
		}
		else{			
			node.setRight(right);
			if(localRoot == null){
				return node;
			}
			else{
				return localRoot;
			}
		}
	}
	
	/**
	 * term -> + term | - term | ( term ) | (#)? INTEGER | ID
	 */
	public ExprNode term(){
		ExprNode node = null;		
		Token token = lookahead;
		if( root == null ){
			root = node;
		}	
		
		/*
		if( lookahead.type == PLUS){
			match( PLUS );  
			term();			 
		}
		else if( lookahead.type == MINUS ){		
			 match( MINUS ); term();
		}
		else */if( lookahead.type == LBRACK ){
			match( LBRACK ); 
			node = sum(); 
			match( RBRACK );
		}
		else if( lookahead.type == INTEGER){			
			match( INTEGER );
			node = new IntNode(token);
		}
		else if( lookahead.type == UMINUS){			
			match( UMINUS );
			Token i = lookahead;
			match( INTEGER );
			node = new UMinusNode(new IntNode(i), token);
		}
		else if( lookahead.type == ID ){			
			match( ID );
			node = new IDNode(token);
			
		}
		else {
			throw new Error("Error RDP_3: #, ( ,INTEGER or ID expected");
		}
		
		return node;
	}

}