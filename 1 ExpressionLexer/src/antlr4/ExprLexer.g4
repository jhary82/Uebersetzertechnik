lexer grammar ExprLexer;

// Token definitions
BINOP: /*('+' | '-' | '*' | '/' |  '^') */ [+-*/^];
UNAOP: [#];
OPERAND: DIGIT+;
NL: [\n];  


fragment DIGIT: [0-9];
fragment LETTER: [a-zA-Z];

//ignore
IGNORE:  LETTER+ | WHITESPACE | .*? -> skip;
fragment WHITESPACE : [ \t\r] -> skip ;    