/**
 * 
 */
package cymbol;

/**
 * @author simon
 *
 */
public class MetricsListener extends CymbolBaseListener {

	/**
	 * Gibt den Wert für die McCabe-Komplexität an 
	 */
	private int mcCabeValue = 0;
	
	/**
	 * Gibt den Wert für die Interior-Pfadüberdeckung an
	 * @param ctx
	 */
	private int interiorValue = 1;
	
	/*
	 * für jede Funktion
	 */
	@Override 
	public void enterFunctionDecl(CymbolParser.FunctionDeclContext ctx) {
		System.out.println("Metriken für "+ctx.getText());
		this.mcCabeValue = 0;
		this.interiorValue = 1;
	}
	
	@Override
	public void exitFunctionDecl(CymbolParser.FunctionDeclContext ctx) {
		System.out.println("McCabe-Komplexität: "+this.mcCabeValue);
	}
	
	/*
	 * zähle die Anzahl der if-Vorkommen für McCabe 
	 * und
	 * 
	 */
	@Override 
	public void enterStatIf(CymbolParser.StatIfContext ctx) { 
		this.mcCabeValue++;
	}
}
