lexer grammar ExprLexer;

// Token definitions
BINOP: /*('+' | '-' | '*' | '/' |  '^') */ [+-*/^];
UNAOP: [#];
OPERAND: DIGIT+;
NL: [\n];  
IGNORE: ( LETTER+ | WHITESPACE | .*? ) -> skip;  


fragment DIGIT: [0-9];
fragment LETTER: [a-zA-Z];
fragment WHITESPACE : [ \t\r]  ;

//ignore
  