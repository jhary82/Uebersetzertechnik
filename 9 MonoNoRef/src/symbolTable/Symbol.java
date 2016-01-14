package symbolTable;
/***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
***/
public class Symbol { // A generic programming language symbol
    String name;      // All symbols at least have a name
    Type type;
    boolean ref;
    public Symbol(String name) { 
    	this.name = name;
    	this.ref = false;
    }
    public Symbol(String name, Type type) {
    	this(name); 
    	this.type = type;
    	this.ref = true;
    }
    public String getName() { return name; }
    public String toString() {
        if ( type!=null ) return '<'+getName()+":"+type+'>';
        return getName();
    }
}
