grammar Alguma;

@header{
    package antlr;
}

prog: (declaracoes)? algoritmo EOF #NInicio;
declaracoes: ':DECLARACAO' decl* #BlocoDeclaracao;
decl: TIPO ID #NDecl;
algoritmo: ':ALGORITMO' algr* #BlocoAlgoritmo;
algr: atr #Nalgr;
atr: 'ATRIBUIR' (operando|operacao) 'A' ID #NAtr;
operando: ID | NUM | STR #Noperando;
operacao: ID OPERADOR (operando|operacao) #Noperacao;

TIPO: ('int'|'float'|'string'|'Bool');
ID: [a-zA-Z]+([a-z]|[A-Z]|[0-9])*;
NUM: [0-9]+(','([0-9])*)?;
OPERADOR: ('+'|'-'|'*'|'/'|'<'|'>');
WS: [ \t\r\n]+ ->skip;
STR: ('"'~["]*'"');

