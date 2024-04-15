grammar FunctionCraft;

comment
    :
    SINGLELINECOMMENT
    | MULTILINECOMMENT
    ;

program
    :
    (function | comment)*
    main
    comment*
    ;

main
    :
    FUN_STARTER
    MAIN
    '('
    ')'
    bodyFunction
    ENDER
    ;


function
    :
    FUN_STARTER
    INDENTIFIER
    arguments
    bodyFunction
    ENDER
    ;

functionReturn
    :
    RETURN
    '('
    expr
    ')'
    SEMICOLON
    ;

bodyFunction
    :
    (statement | comment)*
    functionReturn?
    ;

lambdaFunction
    :
    arguments
    LBRACE
    bodyFunction
    RBRACE
    ;

// Keywords:
MAIN: 'main';
PRINT: 'puts';
FUN_STARTER: 'def';
ENDER: 'end';
RETURN: 'return';
IF: 'if';
ELSE: 'else';
ELSEIF: 'elseif';
TRUE: 'true';
FALSE: 'false';
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

// Data Types:
INT: 'int';
FLOAT: 'float';
STRING: 'string';
BOOL: 'bool';
LIST: 'list';
FUN_POINTER: 'fptr';

// Data Values:
INT_VAL: [1-9][0-9]*;
FLOAT_VAL: INT_VAL'.'[0-9]*;
STRING_VAL: '"'~[""]*'"';
BOOL_VAL: TRUE|FALSE;
FUN_POINTER_VAL: METHOD'(:'[a-z][a-zA-Z0-9_]*')';

// Parenthesis:
LPAR: '(';
RPAR: ')';

// Access and Methods:
DOT: '.';

// Append Operators:
APPEND: '<<';

// Comparator Operators:
GEQ: '>=';
LEQ: '<=';
GTR: '>';
LES: '<';
EQL: '==';
NEQ: '!=';

// Assigning Operators:
ASSIGN: '=';
ADD_ASSIGN: '+=';
MINUS_ASSIGN: '-=';
MULT_ASSIGN: '*=';
DIV_ASSGIN: '/=';
MOD_ASSIGN: '%=';

// Arithmetic Operators
INC: '++';
DEC: '--';
PLUS: '+';
MINUS: '-';
MULT: '*';
DIV: '/';
MOD: '%';

// Logical Operator:
AND: '&&';
OR: '||';
NOT: '!';

//Brackets:
LBRACKET: '[';
RBRACKET: ']';

//Braces:
LBRACE: '{';
RBRACE: '}';

// Symbols:
COMMA: ',';
COLON: ':';
SEMICOLON: ';';
LAMBDA_STARTER: '->';

//Comments:
ONE_COMMENT: '#' ~[\r\n]* -> skip;
MULTI_COMMENT: '=begin' .*? '=end' -> skip;

// Others:
INDENTIFIER: [a-z][a-zA-Z0-9_]*;
WS: [ \t\r\n]+ -> skip;