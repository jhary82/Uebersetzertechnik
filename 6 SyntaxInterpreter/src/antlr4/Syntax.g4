grammar Syntax;

@header {
	import java.util.*;	
}

@parser::members {
	Map<String, Integer> memory = new HashMap<>();
}

statlist: stat+;

stat
	:	comparison NL {System.out.println($comparison.value);}
	|	ID EQUALS e=sum NL { memory.put($ID.text, $e.value); }
	|	NL
; 

comparison returns[int value] 
	:	e=sum {$value = $e.value;} 
		( '<' e=sum { if( $value < $e.value) $value = 1; else $value = 0;}
		| '>' e=sum { if( $value > $e.value) $value = 1; else $value = 0;})?
;

sum returns [int value]
	:	e=prod {$value = $e.value;}
		(PLUS e=prod {$value += $e.value;}
		|MINUS e=prod {$value -= $e.value;}
		)*
;

prod returns [int value] 
	:	e=potenz {$value = $e.value;} 
		(MULTI e=potenz {$value *= $e.value;}
		|DIV e=potenz {$value /= $e.value;})*
;

potenz returns [int value]
	:	e=term {$value = $e.value;} 
		('^' e=term { $value = (int)Math.pow( $value, $e.value); })*
;
	
term returns [int value]
	:	INTEGER 				{$value = $INTEGER.int;}
	|	LBRACK sum RBRACK		{$value = $sum.value;}
	|	(PLUS e=term	{$value += $e.value;}
		|MINUS e=term	{$value -= $e.value;}
		)*
	|	ID { $value = memory.get($ID.text); }
;

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