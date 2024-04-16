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
    LPAR
    RPAR
    statement
    ENDER
    ;


function
    :
    FUN_STARTER
    INDENTIFIER
    arguments
    statement
    ENDER
    ;

returnInside
    :
    LPAR
    expr
    RPAR
    |
    expr
    ;

functionReturn
    :
    RETURN
    returnInside
    SEMICOLON
    ;

lambdaFunction
    :
    arguments
    LBRACE
    statement
    RBRACE
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

assignment
    :
    IDENTIFIER
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
    expr
    SEMICOLON
    ;

arguments
    :
    LPAR
    argInside
    RPAR
    ;

argInside
    :
    IDENTIFIER
    COMMA
    argInside
    |
    parameter
    COMMA
    argInside
    |
    IDENTIFIER
    |
    parameter
    ;

argumentsCall
    :
    expr
    COMMA
    argumentsCall
    |
    expr
    ;

parameter
    :
    LBRACKET
    paramInside
    RBRACKET
    ;

paramInside
    :
    assignment
    COMMA
    paramInside
    |
    assignment
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
    (statement | LOOP_CONTINUE | BREAK)*
    ;

statement
    :
    (
          functionReturn
        | functionCall                 { System.out.println("FunctionCall"); }
        | print_function_call           { System.out.println("Built-in:print"); }
        | primitive_function_call       { System.out.println("FunctionCall"); }
        | expr
        | init
        | declaration
        | assignment
        | schedule?
        | throw_exception
    ) SEMICOLON
    | comment
    | if_condition
    | for_loop
    | loopLoop
    | try_catch
    ;

forList
    :
    For
    INDENTIFIER
    IN
    INDENTIFIER
    statement
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
    statement
    ENDER
    ;

ifInside
    :
    LPAR
    ifStatement
    RPAR
    ;

afterIf
    :
    IF
    ifInside
    SEMICOLON
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
    statement
    ;

else
    :
    ELSE
    ifInside
    statement
    ;

listInside
    :
    val
    COMMA
    listInside
    |
    val
    ;

listVal
    :
    LBRACKET
    listInside
    RBRACKET
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

appendInside
    :
    expr
    ADD_ASSIGN
    ;


append
    :
    INDENTIFIER
    appendInside
    SEMICOLON
    ;

patternInside
    :
    (
    TAB
    OR
    patternexpr
    )*
    ;

pattern
    :
    PATTERN_SIGN
    INDENTIFIER
    arguments
    patternInside
    SEMICOLON
    ;

putPush
    :
    (
    PUT
    |
    PUSH
    )
    LPAR
    expr
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
    listExpr
    |
    strExpr
    )
    RPAR
    ;



builtInsideFuns
    :
    putPush
    |
    chopChomp
    |
    len
    ;

singleMath
    :
    INDENTIFIER
    INC
    |
    INDENTIFIER
    DEC
    |
    INDENTIFIER
    |
    INT_VAL
    |
    FLOAT_VAL
    |
    LPAR
    mathExpr
    RPAR
    ;

addMinusExpr
    :
    singleMath
    |
    singleMath
    MULT
    addMinusExpr
    |
    singleMath
    DIV
    addMinusExpr
    |
    singleMath
    MOD
    addMinusExpr
    ;

mathExpr
    :
    addMinusExpr
    |
    addMinusExpr
    PLUS
    mathExpr
    |
    addMinusExpr
    MINUS
    mathExpr
    ;

singleLogic
    :
    INT_VAL
    |
    BOOL_VAL
    |
    INDENTIFIER
    |
    mathExpr
    ;

parLogic
    :
    LPAR
    logicExpr
    RPAR
    ;

logicExpr
    :
    parLogic
    LOG_AND
    parLogic
    |
    parLogic
    LOG_OR
    parLogic
    |
    singleLogic
    ;

perComp
    :
    

compExpr
    :
    perComp
    GEQ
    perComp
    |
    perComp
    LEQ
    perComp
    |
    perComp
    GTR
    perComp
    |
    perComp
    LES
    perComp
    |
    singleComp
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
APPENDSIGN: '<<';

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