grammar FunctionCraft;

comment
    :
    ONE_COMMENT
    | MULTI_COMMENT
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
    LPAR
    RPAR
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

bodyFunction
    :
    statement*
    ;

arguments
    :
    LPAR
    argInside
    RPAR
    ;

argInside
    :
    INDENTIFIER
    COMMA
    argInside
    |
    parameter
    COMMA
    argInside
    |
    INDENTIFIER
    |
    parameter
    ;

parameter
    :
    LBRACKET
    paramInside
    RBRACKET
    ;

paramInside
    :
    assignmentExpr
    COMMA
    paramInside
    |
    assignmentExpr
    ;

statement
    :
    (
    (
          functionReturn
        | functionCall
        | builtInsideFuns
        | assignmentExpr
        | lambdaFunction
        | labdaCall
        | pattern
    )
    SEMICOLON
    )
    | comment
    | if
    | forLoop
    | loopLoop
    ;

lambdaFunction
    :
    arguments
    LBRACE
    bodyFunction
    RBRACE
    ;

returnInside
    :
    LPAR
    appendArgument
    RPAR
    |
    appendArgument
    ;

functionReturn
    :
    RETURN
    returnInside
    SEMICOLON
    ;

functionCall
    :
    INDENTIFIER
    argumentsCall
    ;
labdaCall
    :
    lambdaFunction
    argumentsCall
    ;

loopLoop
    :
    LOOP
    DO
    bodyLoop
    ENDER
    ;

bodyLoop
    :
    (statement | LOOP_CONTINUE | BREAK | nextIF | breakIF)*
    ;
forLoop
    :
    forRange
    |
    forList
    ;

forList
    :
    FOR
    INDENTIFIER
    IN
    INDENTIFIER
    bodyLoop
    ENDER
    ;

startEnd
    :
    (INDENTIFIER|INT_VAL)
    ;

forRange
    :
    FOR
    INDENTIFIER
    IN
    LPAR
    startEnd
    DOT
    DOT
    startEnd
    RPAR
    bodyLoop
    ENDER
    ;

argumentsCall
    :
    appendArgument
    COMMA
    argumentsCall
    |
    appendArgument
    ;

appendArgument
    :
    appendExpr
    |
    val
    appendInside
    ;

if
    :
    IF
    ifInside
    (statement|elif)*
    else
    ENDER
    ;

elif
    :
    ELSEIF
    ifInside
    bodyFunction
    ;

else
    :
    ELSE
    ifInside
    bodyFunction
    ;

afterIf
    :
    IF
    ifInside
    SEMICOLON
    ;

ifInside
    :
    LPAR
    logicExpr
    RPAR
    ;

nextIF
    :
    LOOP_CONTINUE
    afterIf
    ;

breakIF
    :
    BREAK
    afterIf
    ;

listVal
    :
    LBRACKET
    listInside
    RBRACKET
    ;

listInside
    :
    val
    (COMMA listInside)?
    ;

pattern
    :
    PATTERN_SIGN
    INDENTIFIER
    arguments
    patternInside
    SEMICOLON
    ;
patternInside
    :
    (
    TAB
    OR
    assignmentExpr
    )*
    ;

builtInsideFuns
    :
    putPush
    |
    chopChomp
    |
    len
    ;

putPush
    :
    (
    PRINT
    |
    PUSH
    )
    LPAR
    appendExpr
    RPAR
    ;

chopChomp
    :
    (
    CHOP
    |
    CHOMP
    )
    LPAR
    strExpr
    RPAR
    ;

len
    :
    LEN
    LPAR
    (
    appendExpr
    |
    strExpr
    )
    RPAR
    ;

appendStr
    :
    APPEND_SIGN
    (
    appendStr
    |
    INDENTIFIER
    |
    STRING_VAL
    )
    ;

strExpr
    :
    (
    INDENTIFIER
    |
    STRING_VAL
    )
    appendStr
    ;

assignmentExpr
    :
    type?
    INDENTIFIER
    (
    ASSIGN
    |
    ADD_ASSIGN
    |
    MINUS_ASSIGN
    |
    MULT_ASSIGN
    |
    DIV_ASSGIN
    |
    MOD_ASSIGN
    )
    appendExpr
    SEMICOLON
    ;

appendExpr
    :
    INDENTIFIER
    appendInside
    ;

appendInside
    :
    APPEND_SIGN
    (logicExpr | appendInside)
    ;

logicExpr
    :
    parLogic
    (LOG_AND | LOG_OR)
    parLogic
    |
    singleLogic
    ;

singleLogic
    :
    INT_VAL
    |
    BOOL_VAL
    |
    INDENTIFIER
    |
    eqCompExpr
    ;

parLogic
    :
    LPAR
    logicExpr
    RPAR
    ;

perEqComp
    :
    LPAR
    eqCompExpr
    RPAR
    ;

eqCompExpr
    :
    perEqComp
    (EQL | NEQ)
    perEqComp
    |
    compExpr
    ;

perComp
    :
    LPAR
    compExpr
    RPAR
    ;

compExpr
    :
    perComp
    (
    GEQ
    |
    LEQ
    |
    GTR
    |
    LES
    )
    perComp
    |
    mathExpr
    ;

mathExpr
    :
    addMinusExpr
    ((PLUS | MINUS)
    mathExpr)?
    ;

addMinusExpr
    :
    preSingleMath
    ((MULT | DIV | MOD)
    addMinusExpr)?
    ;

preSingleMath
    :
    (MINUS | NOT)?
    postSingleMath
    ;

postSingleMath
    :
    INDENTIFIER
    (INC | DEC)?
    |
    (INT_VAL | FLOAT_VAL)
    |
    LPAR
    logicExpr
    RPAR
    (INC | DEC)?
    |
    INDENTIFIER
    LBRACKET
    logicExpr
    RBRACKET
    (INC | DEC)?
    ;

type
    :
    INT
    |
    FLOAT
    |
    STRING
    |
    BOOL
    |
    LIST
    |
    FUN_POINTER
    ;

val
    :
    INT_VAL
    |
    FLOAT_VAL
    |
    BOOL_VAL
    |
    STRING_VAL
    |
    FUN_POINTER_VAL
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
PATTERN_SIGN: 'pattern';
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
APPEND_SIGN: '<<';

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

// Arithmatic Operators:
AND: '&';
OR: '|';

// Logical Operator:
LOG_AND: '&&';
LOG_OR: '||';
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
TAB: '\r\n\t' | '\r\n    ';
WS: [ TAB\r\n]+ -> skip;