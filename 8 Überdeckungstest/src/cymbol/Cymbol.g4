grammar Cymbol;  

file:   (functionDecl | varDecl)+ ;

varDecl
    :   type ID ('=' expr)? ';'
    ;
type:   'float' | 'int' | 'void' | 'char'; // user-defined types

functionDecl
    :   type ID '(' formalParameters? ')' block // "void f(int x) {...}"
    ;
formalParameters
    :   formalParameter (',' formalParameter)*
    ;
formalParameter
    :   type ID
    ;

block:  '{' stat* '}' ;   // possibly empty statement block
stat:   block								#statBlock
    |   varDecl								#statVarDecl
    |   'if' expr 'then' stat ('else' stat)? #statIf
    |	'for' '('  expr ';' ID ('<'|'>'|'==' | '!=') expr ';'	expr ')' block #statFor
    //for(int i=0; i < 2; i = i + 1){} 
    |   'return' expr? ';' 			#statReturn
    |   expr '=' expr ';' 			#statAssignment// assignment
    |   expr ';'          			#statFuncCall// func call
    ;

expr:   ID '(' exprList? ')'    // func call like f(), f(x), f(1,2)
    |   ID '[' expr ']'         // array index like a[i], a[i][j]
    |   '-' expr                // unary minus
    |   '!' expr                // boolean not
    |   expr '*' expr
    |   expr ('+'|'-') expr
    |   expr ('=='|'!=') expr          // equality comparison (lowest priority op)
    |   ID                      // variable reference
    |   INT
    |   '(' expr ')'
    ;
exprList : expr (',' expr)* ;   // arg list

ID  :   LETTER (LETTER | [0-9])* ;
fragment
LETTER : [a-zA-Z] ;

INT :   [0-9]+ ;

WS  :   [ \t\n\r]+ -> skip ;

SL_COMMENT
    :   '//' .*? '\n' -> skip
    ;
