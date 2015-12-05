package visitor;


import java.util.HashMap;
import java.util.Map;
import org.antlr.v4.runtime.tree.ParseTree;

import antlr4.*;

/**
 * @author skrause
 *
 */
public class EvalVisitor extends SyntaxBaseVisitor<Integer>{

	/**
	 * Datenspeicher
	 */
	private Map<String, Integer> memory = new HashMap<>();

	
	// Stat
	
	@Override
	public Integer visitComparisonStat(SyntaxParser.ComparisonStatContext ctx) {		
		return visit( ctx.comparison() );
	}
	
	@Override
	public Integer visitAssignStat(SyntaxParser.AssignStatContext ctx) { 
		String id = ctx.ID().getText(); 
		int value = visit(ctx.sum());
		memory.put(id, value);
		return value;
	}
	
	// Comparison
	
	@Override 
	public Integer visitComparison(SyntaxParser.ComparisonContext ctx) {		
		int value = visit ( ctx.sum(0) );
		if( ctx.op != null){		
			switch(ctx.op.getText()){
				case("<"): 
					if( value < visit( ctx.sum(1) ) ){
						return 1;
					}
					else{
						return 0;
					}
				case(">"): 
					if( value > visit( ctx.sum(1) ) ) {
						return 1;
					}
					else{
						return 0;
					}			
				case("=="): 
					if( value == visit( ctx.sum(1) ) ) {
						return 1;
					}
					else{
						return 0;
					}			
				}
		}
		
		return value;		
	}
	
	// sum
	
	@Override 
	public Integer visitSum(SyntaxParser.SumContext ctx) {
		int sum = visit ( ctx.getChild(0) );
		
		for(int i = 1; i < ctx.getChildCount(); i++){
			ParseTree tmp = ctx.getChild(i);
			if( tmp.getText().equals("+") ){
				sum += visit( ctx.getChild(i+1) );
			}
			if( tmp.getText().equals("-") ){
				sum -= visit( ctx.getChild(i+1) );
			}
		}
		
		return sum;		
	}
		
	// prod
		
	@Override 
	public Integer visitProd( SyntaxParser.ProdContext ctx) { 
		int prod = visit( ctx.potency(0) );
		
		for(int i = 1; i < ctx.getChildCount(); i++){
			ParseTree tmp = ctx.getChild(i);
			if( tmp.getText().equals("*") ){
				prod *= visit( ctx.getChild(i+1) );
			}
			if( tmp.getText().equals("/") ){
				prod /= visit( ctx.getChild(i+1) );
			}
		}
		
		return prod;
	}
	
	// potency
	
	@Override 
	public Integer visitPotency(SyntaxParser.PotencyContext ctx) {
		int term = visit( ctx.term() );
		
		if( ctx.potency().isEmpty()) {
			return term;
		}
		int max = ctx.potency().size();
		int tmp = visit( ctx.potency(max-1));
		if(max >= 2){
			for( int i = max-2; i >= 0; i-- ){
				tmp = (int) Math.pow( visit(ctx.potency(i) ), tmp);
			}
		}
		
		return (int) Math.pow( term, tmp); 
	}
	
	// term
	
	@Override 
	public Integer visitInteger( SyntaxParser.IntegerContext ctx) { 
		return Integer.parseInt( ctx.getText() ); 
	}
		
	@Override
	public Integer visitBrackSum( SyntaxParser.BrackSumContext ctx) { 
		return visit( ctx.sum() ); 
	}
	
	@Override 
	public Integer visitUminusTerm(SyntaxParser.UminusTermContext ctx) { 
		int value = 1;
		
		if( ctx.getChildCount()-1 % 2 == 1){
			value = -1;
		}
				
		return value * visit( ctx.term() ); 
	}
	
	@Override 
	public Integer visitId(SyntaxParser.IdContext ctx) {
		String id = ctx.ID().getText();
		if ( memory.containsKey(id) ) {
			return memory.get(id);
		}
		return 0; 
	}
	

}
