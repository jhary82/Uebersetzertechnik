package lp;

/***
 * Excerpted from "Language Implementation Patterns",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpdsl for more book information.
***/
public class ListParser extends Parser {
    public ListParser(Lexer input) { super(input); }
    
    /** list : '[' elements ']' ; // match bracketed list */
    public void RecursiveDescent() {
        match(RecursiveDescentLexer.LBRACK); elements(); match(RecursiveDescentLexer.RBRACK);
    } 
    /** elements : element (',' element)* ; */
    void elements() {
        element();
        /*while ( lookahead.type==RecursiveDescentLexer.COMMA ) {
            match(RecursiveDescentLexer.COMMA); element();
        }*/
    }
    /** element : name | RecursiveDescent ; // element is name or nested RecursiveDescent */
    void element() {
        /*if ( lookahead.type==RecursiveDescentLexer.NAME ) match(RecursiveDescentLexer.NAME);
        else if ( lookahead.type==RecursiveDescentLexer.LBRACK ) RecursiveDescent();
        else throw new Error("expecting name or RecursiveDescent; found "+lookahead);*/
    }
}
