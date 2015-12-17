grammar Ast;



statlist: stat+; 

stat
	:	comparison NL 			# comparisonStat
	|	ID EQUALS sum NL		# assignStat
	|	NL						# nlStat
;  

comparison  
	:	sum	( '<' sum | '>' sum | EQUALS EQUALS sum )?  		
;

sum 
	:	prod (PLUS prod |MINUS prod	)*
;

prod  
	:	term (MULTI term | DIV term )*
;
	
term 
	:	INTEGER						# int
	|	LBRACK sum RBRACK			# brack
	|	(PLUS term|MINUS term	)*  # uminus
	|	ID 							# id
	| <assoc = right> term '^' term	# potenz
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