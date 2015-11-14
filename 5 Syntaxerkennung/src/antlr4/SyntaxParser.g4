grammar SyntaxParser;

statlist : stat+;
stat : (sum NL |NL | ID EQUALS sum NL);
sum : prod ((PLUS|MINUS)prod)*;
prod : term ( (PLUS|MINUS) term)*;
term : PLUS term | MINUS term | ( term ) | INTEGER | ID;


ID : LETTER [DIGIT|LETTER]+;
INTEGER : DIGIT+;
PLUS : [+];
MINUS : [-];
MULTI: [*];
DIV : [/];
LBRACK :[(];
RBRACK : [)];
EQUALS : [=];
NL: [\n];  
IGNORE: ( LETTER+ | WHITESPACE | .*? ) -> skip;  


fragment DIGIT: [0-9];
fragment LETTER: [a-zA-Z];
fragment WHITESPACE : [ \t\r]  ;
