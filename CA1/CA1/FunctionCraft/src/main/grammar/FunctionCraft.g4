grammar FunctionCraft;

program
    :
    (function | pattern)*
    main
    ;

main
    :
    {System.out.println("MAIN");}
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
    name = INDENTIFIER {System.out.println("FuncDec: " + $name.text);}
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
        | appendExpr
        | patternCall
    )
    SEMICOLON
    )
    | if
    | forLoop {System.out.println("Built-in: FOR");}
    | loopLoop {System.out.println("Built-in: DO");}
    ;

lambdaFunction
    :
    LAMBDA_STARTER {System.out.println("LAMBDA");}
    arguments
    LBRACE
    bodyFunction
    RBRACE
    ;

returnInside
    :
    (
    LPAR
    appendArgument
    RPAR
    )
    |
    appendArgument
    ;

functionReturn
    :
    RETURN {System.out.println("RETURN");}
    returnInside?
    ;

functionCall
    :
    INDENTIFIER {System.out.println("Function Call");}
    LPAR
    argumentsCall
    RPAR
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
    (statement |
    LOOP_CONTINUE {System.out.println("NEXT");}|
    BREAK | {System.out.println("BREAK");}
    nextIF | {System.out.println("NEXT");}
    breakIF {System.out.println("BREAK");})*
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
    listVal
    ;

if
    :
    IF {System.out.println("Decision: IF");}
    ifInside
    (statement|elif)*
    else?
    ENDER
    ;

elif
    :
    ELSEIF {System.out.println("Decision: ELSE IF");}
    ifInside
    bodyFunction
    ;

else
    :
    ELSE {System.out.println("Decision: ELSE");}
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
    |
    ;

listInside
    :
    val
    (COMMA listInside)?
    ;

pattern
    :
    PATTERN_SIGN
    name = INDENTIFIER {System.out.println("patternDec: " + $name.text);}
    arguments
    patternInside
    SEMICOLON
    ;

patternCall
    :
    INDENTIFIER
    DOT
    MATCH {System.out.println("Built-in: MATCH");}
    LPAR
    argumentsCall
    RPAR
    ;

patternInside
    :
    (
    TAB
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
    PRINT {System.out.println("Built-in: PUTS");}
    |
    PUSH {System.out.println("Built-in: PUSH");}
    )
    LPAR
    appendExpr
    RPAR
    ;

chopChomp
    :
    (
    CHOP {System.out.println("Built-in: CHOP");}
    |
    CHOMP {System.out.println("Built-in: CHOMP");}
    )
    LPAR
    appendExpr
    RPAR
    ;

len
    :
    LEN {System.out.println("Built-in: LEN");}
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
    APPEND_SIGN {System.out.println("Operator: <<");}
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
    appendStr?
    ;

assignmentExpr
    :
    name = appendExpr {System.out.println("Assignment: " + $name.text);}
    (
    ASSIGN {System.out.println("Operator: =");}
    |
    ADD_ASSIGN {System.out.println("Operator: +=");}
    |
    MINUS_ASSIGN {System.out.println("Operator: -=");}
    |
    MULT_ASSIGN {System.out.println("Operator: *=");}
    |
    DIV_ASSGIN {System.out.println("Operator: /=");}
    |
    MOD_ASSIGN {System.out.println("Operator: %=");}
    )
    appendExpr
    ;

appendExpr
    :
    (logicExpr
    (itemAcces)?
    APPEND_SIGN {System.out.println("Operator: <<");})
    appendExpr
    |
    logicExpr
    ;

logicExpr
    :
    logicExpr2
    (LOG_AND {System.out.println("Operator: &&");} | LOG_OR {System.out.println("Operator: ||");})
    logicExpr2
    |
    singleLogic
    ;

logicExpr2
    :
    parLogic
    (LOG_AND {System.out.println("Operator: &&");}| LOG_OR {System.out.println("Operator: ||");})
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
    eqCompExpr2
    (EQL{System.out.println("Operator: ==");} | NEQ{System.out.println("Operator: !=");})
    eqCompExpr2
    |
    compExpr
    ;

eqCompExpr2
    :
    perEqComp
    (EQL{System.out.println("Operator: ==");} | NEQ{System.out.println("Operator: !=");})
    perEqComp
    |
    compExpr
    ;

compExpr
    :
    compExpr
    (
    GEQ {System.out.println("Operator: >=");}
    |
    LEQ {System.out.println("Operator: <=");}
    |
    GTR {System.out.println("Operator: >");}
    |
    LES {System.out.println("Operator: <");}
    )
    compExpr
    |
    mathExpr
    ;

mathExpr
    :
    addMinusExpr
    ((PLUS{System.out.println("Operator: +" );} | MINUS{System.out.println("Operator: -");})
    mathExpr)?
    ;

addMinusExpr
    :
    preSingleMath
    ((MULT {System.out.println("Operator: *");} | DIV {System.out.println("Operator: /");} | {System.out.println("Operator: %");} MOD)
    addMinusExpr)?
    ;

preSingleMath
    :
    (MINUS{System.out.println("Operator: -");} | NOT{System.out.println("Operator: !");})?
    postSingleMath
    ;

postSingleMath
    :
    INDENTIFIER
    (INC{System.out.println("Operator: ++");} | DEC{System.out.println("Operator: --");})?
    |
    val
    |
    LPAR
    appendExpr
    RPAR
    (INC{System.out.println("Operator: ++");} | DEC{System.out.println("Operator: --");})?
    |
    INDENTIFIER
    itemAcces
    (INC{System.out.println("Operator: ++");} | DEC{System.out.println("Operator: --");})?
    |
    builtInsideFuns
    |
    functionCall
    |
    patternCall
    |
    lambdaFunction
    ;

itemAcces:
    (
    LBRACKET
    logicExpr
    RBRACKET
    )
    *
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
    booolVal
    |
    STRING_VAL
    |
    FUN_POINTER_VAL
    |
    listVal
    ;

booolVal
    :
    TRUE
    |
    FALSE
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

INDENTIFIER: [a-z][a-zA-Z0-9_]*;

// Data Types:
INT: 'int';
FLOAT: 'float';
STRING: 'string';
BOOL: 'bool';
LIST: 'list';
FUN_POINTER: 'fptr';

// Data Values:
INT_VAL: [0-9]+;
FLOAT_VAL: INT_VAL'.'[0-9]*;
STRING_VAL: '"'~["]*'"';
FUN_POINTER_VAL: 'method''(:'[a-z][a-zA-Z0-9_]*')';

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
TAB:  ('\r'?'\n')('\t|' | '    |');
WS: [ TAB\r\n]+ -> skip;