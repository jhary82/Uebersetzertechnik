/**
 * 
 */
package visitor;

import ast.*;

/**
 * @author skrause
 *
 */
public interface IEvalVisitor {
	public double eval(HeteroAST node);
	public double eval(AddNode node);
	public double eval(DivNode node);	
	public double eval(IntNode node);
	public double eval(MinusNode node);
	public double eval(MultiNode node);
	public double eval(UMinusNode node);
}
