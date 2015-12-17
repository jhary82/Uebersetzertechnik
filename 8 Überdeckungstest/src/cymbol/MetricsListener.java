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
	 * Gibt den Wert f�r die McCabe-Komplexit�t an 
	 */
	private int mcCabeValue = 0;
	
	/**
	 * Gibt den Wert f�r die Interior-Pfad�berdeckung an
	 * @param ctx
	 */
	private int interiorValue = 1;
	
	/*
	 * f�r jede Funktion
	 */
	@Override 
	public void enterFunctionDecl(CymbolParser.FunctionDeclContext ctx) {
		System.out.println("Metriken f�r "+ctx.getText());
		this.mcCabeValue = 0;
		this.interiorValue = 1;
	}
	
	@Override
	public void exitFunctionDecl(CymbolParser.FunctionDeclContext ctx) {
		System.out.println("McCabe-Komplexit�t: "+this.mcCabeValue);
	}
	
	/*
	 * z�hle die Anzahl der if-Vorkommen f�r McCabe 
	 * und
	 * 
	 */
	@Override 
	public void enterStatIf(CymbolParser.StatIfContext ctx) { 
		this.mcCabeValue++;
	}
}
