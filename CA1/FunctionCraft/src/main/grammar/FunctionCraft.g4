grammar FunctionCraft;








MAIN: 'main';
PRINT: 'puts';
FUN_STARTER: 'def';
ENDER: 'end';
RETURN: 'return';
IF: 'if';
ELSE: 'else';
ELSEIF: 'elseif';
TRUE: 'true';
FLASE: 'false';
CHOP: 'chop';
CHOMP: 'chomp';
PUSH: 'push';
METHOD: 'method';
LEN: 'len';
PATTERN: 'pattern';
MATCH: 'match';
LOOP_CONTINUE: 'next';
BREAK: 'break';
LOOP: 'loop';
DO: 'do';
FOR: 'for';
IN: 'in';
INT: 'int';
INT_VAL: [1-9][0-9]*;
FLOAT: 'float';
FLOAT_VAL: [1-9][0-9]*'.'[0-9]*;
STRING: 'string';
STRING_VAL: '"'~['']*'"';
BOOL: 'bool';
BOOL_VAL: TRUE|FALSE;
FUN_POINTER: 'fptr';
FUN_POINTER_VAL: METHOD'(:'[a-z][a-zA-Z0-9_]*')';
LPAR: '(';
RPAR: ')';
PLUS: '+';
MINUS: '-';
MULT: '*';
DIV: '/';
MOD:
GEQ:
LEQ:
GTR:
LES:
EQL:
NEQ:
AND:
OR:
ASSIGN:
LBRACE:
RBRACE:
COMMA:
DOT:
COLON:
SEMICOLON:
INDENTIFIER: [a-z][a-zA-Z0-9_]*;
ONE_COMMENT: '#' ~[\r\n]* -> skip;
MULTI_COMMENT: '=begin' ~['=end']* -> skip;
WS: