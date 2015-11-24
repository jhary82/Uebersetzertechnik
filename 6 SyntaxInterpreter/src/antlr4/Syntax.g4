grammar Syntax;

@header {
	import java.util.*;
}

prog: stat+;

stat: sum NL {System.out.println($sum.value);}
	| NL
	; 

sum returns [int value]
	:	e=multExpr {$value = $e.value;}
		('+' e=multExpr {$value += $e.value;}
		|'-' e=multExpr {$value -= $e.value;}
		)*
	;

multExpr returns [int value]
	:	e=term {$value = $e.value;} ('*' e=term {$value *= $e.value;})*
	;
	
term returns [int value]
	:	INTEGER 				{$value = $INTEGER.int;}
	|	LBRACK sum RBRACK		{$value = $sum.value;}
	|	(PLUS e=term	{$value += $e.value;}
		|MINUS e=term	{$value -= $e.value;}
		)*
	;
	


//
//@parser::members {
///** "memory" for our calculator; variable/value pairs go here */ 
//	Map<String, Integer> memory = new HashMap<String, Integer>();
//
//	int eval(int left, int op, int right) {
//		switch ( op ) {
//			case MULTI : return left * right;
//			case DIV :   return left / right;
//			case PLUS :  return left + right;
//			case MINUS : return left - right;
//		}
//		return 0;
//	}
//}
//
//statlist : stat+;
//stat : (comparison NL |NL | (ID|sum) EQUALS sum NL);
//comparison : sum (('<' |'>') sum)?;
//sum : prod ((PLUS|MINUS)prod)*;
//prod : potenz ((MULTI|DIV)potenz)*;
//potenz : term ('^' term)* ;
//term : (PLUS|MINUS)? INTEGER | (PLUS|MINUS)?ID | LBRACK sum RBRACK;
//
//


// TOKENS
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