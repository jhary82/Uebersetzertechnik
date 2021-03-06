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
import org.antlr.v4.runtime.tree.ParseTree;

import visitor.EvalVisitor;
import antlr4.SyntaxLexer;
import antlr4.SyntaxParser;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Calc {
    public static void main(String[] args) throws Exception {
        String inputFile = null;
        if ( args.length>0 ) inputFile = args[0];
        InputStream is = System.in;
        if ( inputFile!=null ) {
            is = new FileInputStream(inputFile);
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String expr = br.readLine();              // get first expression
        int line = 1;                             // track input expr line numbers

		SyntaxParser parser = new SyntaxParser(null); // share single parser instance
  		parser.setBuildParseTree(true);          // don't need trees
  		EvalVisitor eval = new EvalVisitor();
  		
        while ( expr!=null ) {             // while we have more expressions
            // create new lexer and token stream for each line (expression)
            ANTLRInputStream input = new ANTLRInputStream(expr+"\n");
            SyntaxLexer lexer = new SyntaxLexer(input);
            lexer.setLine(line);           // notify lexer of input position
            lexer.setCharPositionInLine(0);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            parser.setInputStream(tokens); // notify parser of new token stream
            ParseTree tree = parser.stat();                 // start the parser                        
            System.out.println( eval.visit(tree) );             
            expr = br.readLine();          // see if there's another line
            line++; 
        }
    }
}

 