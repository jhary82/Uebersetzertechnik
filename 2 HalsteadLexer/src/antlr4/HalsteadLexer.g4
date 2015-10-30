lexer grammar HalsteadLexer;

// Token definitions
OPERATOR: ( SCSPEC | TYPE_QUAL | RESERVED | STAT | OPERATORS ) ;
OPERAND: ( TYPESPEC | IDENTIFIER | NUMBER | STRING | CHAR ) ;
IGNORE: ( COMMENT | SL_COMMENT | 'do' | ':' | ')' | '}' | ']' | HEADER_FILE | WHITESPACE | NL) -> skip;
 
fragment NUMBER: ( INT ( '.' INT )? );
fragment TYPESPEC: ( 'bool' | 'char' | 'double' | 'float' | 'int' | 'long' | 'short' | 'signed' | 'unsigned' | 'void' );
fragment INT: ( [0-9]+ );
fragment STRING: ( '\"' ( . )*? '\"' );
fragment CHAR: ( '\'' ( . )*? '\'' );
fragment SCSPEC: ( 'auto' | 'extern' | 'inline' | 'register' | 'static' | 'typedef' | 'virtual' | 'mutable' );
fragment RESERVED: ( 'asm' | 'break' | 'case' | 'class' | 'continue' | 'default' | 'delete' | 'else' | 'enum' | 'goto' | 'new' | 'operator' | 'private' | 'protected' | 'public' | 'return' | 'sizeof' | 'struct' | 'this' | 'union' | 'namespace' | 'using' | 'try' | 'catch' | 'throw' | 'const_cast' | 'static_cast' | 'dynamic_cast' | 'reiznterpret_cast' | 'typeid' | 'template' | 'explicit' | 'true' | 'false' | 'typename' );
fragment TYPE_QUAL: ( 'const' | 'friend' | 'volatile' );
fragment STAT: ( ( 'if' | 'while' | 'switch' | 'for' ) ( ' ' )* '(' );
fragment OPERATORS:  ( '!' | '!=' | '%' | '%=' | '&' | '&&' | '&=' | '(' | '*' | '*=' | '+' | '++' | '+=' | ',' | '-' | '--' | '-=' | '->' | '...' | '/' | '/=' | '::' | '<' | '<<' | '<<=' | '<=' | '==' | '>' | '>=' | '>>' | '>>=' | '?' | '[' | '^' | '^=' | '{' | '||' | '=' | '~' | ';' );
fragment IDENTIFIER: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* );
fragment COMMENT: ( '/*' ( . )*? '*/' );
fragment SL_COMMENT:  ( '//' ( . )*? '\\n' );
fragment HEADER_FILE: ( '#include' ( ' ' )+ '<' IDENTIFIER '.h>' );
fragment WHITESPACE :(' '|'\t'|'\r') ;   
fragment NL: '\n';
