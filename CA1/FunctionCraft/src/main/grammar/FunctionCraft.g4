grammar FunctionCraft;








MAIN: 'main';
PRINT: 'puts';
INT: 'int';
INT_VAL: [1-9][0-9]*;
FLOAT: 'float';
FLOAT_VAL: [1-9][0-9]*'.'[0-9]*;
STRING: 'string';
STRING_VAL: '"'~[""]*'"';
BOOL: 'bool';
BOOL_VAL: [0-1];
FUN_POINTER: 'fptr';
FUN_POINTER_VAL: 'method(:'[a-z][a-zA-Z0-9_]*')'
LPAR:
RPAR:
NOT:
PLUS:
MINUS:
MULT:
DIV:
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
INDENTIFIER:
COMMENT:
WS: