grammar Syntax;

statlist : stat+;
stat : (comparison NL |NL | (ID|sum) EQUALS sum NL);
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
