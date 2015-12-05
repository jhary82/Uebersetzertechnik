grammar Syntax;


statlist: stat+;

stat
	:	comparison NL 			# comparisonStat
	|	ID '=' sum NL 			# assignStat
	|	NL						# nlStat
; 

comparison  
	:	sum ( op=( '<' | '>' | '==' ) sum )?
;

sum 
	:	prod ( ('+'|'-') prod )*			
;

prod 
	:	potency	(('*'|'/') potency )*
;

potency 
	:	term ('^' potency)*
;
	
term 
	:	INTEGER					# integer
	|	'(' sum ')'				# brackSum
	|	('+'|'-')+ term			# uminusTerm	
	|	ID 						# id
;

// TOKENS
ID : LETTER [DIGIT|LETTER]*;
INTEGER : DIGIT+;
NL: [\n];  
IGNORE: ( WHITESPACE ) -> skip;  

fragment DIGIT: [0-9];
fragment LETTER: [a-zA-Z];
fragment WHITESPACE : [ \t\r]  ;