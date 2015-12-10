/***
 * Excerpted from "The Definitive ANTLR 4 Reference",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpantlr2 for more book information.
***/
package test;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import cymbol.*;


public class Calc {
    public static void main(String[] args) throws Exception {	          

        ANTLRInputStream input = new ANTLRInputStream("for(int i = 0; i < 5; i = i +1){int b = 1;}"+"\n");        
        CymbolLexer lexer = new CymbolLexer(input);
        
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CymbolParser parser = new CymbolParser(tokens); // share single parser instance
  		parser.setBuildParseTree(false);
  		parser.stat();
       
    }
}
