grammar Syntax;

@header {
package antlr4;
import java.util.*;
}
/*
@parser::members {
/** "memory" for our calculator; variable/value pairs go here 
	Map<String, Integer> memory = new HashMap<String, Integer>();
	int eval(int left, int op, int right) {
		switch ( op ) {
			case MUL : return left * right;
			case DIV : return left / right;
			case ADD : return left + right;
			case SUB : return left - right;
		}
		return 0;
	}
}*/

statlist : stat+;
stat : 	comparison NL 
	 |	NL	 
	 | 	(ID|sum) EQUALS sum NL
;
comparison : sum (('<' |'>') sum)?;
sum : prod ((PLUS|MINUS)prod)*;
prod : potenz ((MULTI|DIV)potenz)*;
potenz : term ('^' term)* ;
term : (PLUS|MINUS)? INTEGER | (PLUS|MINUS)?ID | LBRACK sum RBRACK;

 
ID : LETTER [DIGIT|LETTER]*;
INTEGER : DIGIT+;
PLUS : [+]; 
MINUS : [-];
MULTI: [*];
DIV : [/]; 
LBRACK :[(];
RBRACK : [)];
EQUALS : [=];
NL: [\n];  
IGNORE: ( WHITESPACE ) -> skip;  

fragment DIGIT: [0-9];
fragment LETTER: [a-zA-Z];
fragment WHITESPACE : [ \t\r]  ;


