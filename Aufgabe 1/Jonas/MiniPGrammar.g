grammar MiniPGrammar;

// Programm-Struktur
// **************************************** rules *******************************************************

// Programm Startpunkt
prog	:	ProgSym decl* BeginSym stmts EndSym; 

// Deklaration (werden mit Semikolon abgeschlossen. Beispiel: string str1, str2;)
decl	:	(TypeSym ID (COMMA ID)* SEMICOLON);

// Anweisungen (mindestens eine & werden mit Semikolon abgeschlossen)
stmts	:	((assignStmt | mathStmt | compareStmt | ifStmt | whileStmt | readStmt | printStmt) SEMICOLON)+;

// Wertezuweisung (Beispiel: a := 12;)
assignStmt : (ID ASSIGNSYM (mathStmt| STRINGSYM | compareStmt));

// Vergleich (Zwischen Variablen oder Konstanten)
compareStmt : ((ID||INTSYM|REALSYM) CMP_OPERATOR (ID|INTSYM|REALSYM));

// Arithmetischer Ausdruck (enthält: (,),+,-,*,/,Vorzeichen,Konstanten, Variablen)
mathStmt : term ((ADD | SUB) term)*;
term : factor ((MUL | DIV) factor)*;
factor : (INTSYM | REALSYM | ID | (OPENING_BRACKET mathStmt CLOSING_BRACKET));

// IF-Statement 
ifStmt	: IFSYM compareStmt THENSYM stmts (ELSESYM stmts)? FISYM;

// while-Statement
whileStmt : WHILESYM compareStmt DOSYM stmts ODSYM;

// read-Statement (Beispiel: read(var1)
readStmt: READSYM OPENING_BRACKET ID CLOSING_BRACKET;

// print-Statement (Beispiel: print(var12))
printStmt : PRINTSYM OPENING_BRACKET (ID) CLOSING_BRACKET;


// **************************************** KEYWORDS **************************************************
ProgSym	:	'program';
BeginSym:	'begin';
EndSym	:	'end';

IFSYM 	:	'if';
THENSYM	:	'then';
ELSESYM	:	'else';
FISYM	:	'fi';

WHILESYM:	'while';
DOSYM	:	'do';
ODSYM	:	'od';

READSYM	:	'read';
PRINTSYM:	'print'|'println';
// **************************************** SYMBOLS ***************************************************

INTSYM :  (ADD | SUB)? DIGIT+;
REALSYM:   INTSYM ('.' DIGIT+);
STRINGSYM:	SINGLE_QUOTE ( options {greedy=false;}: . )*  SINGLE_QUOTE;
BOOLSYM	:	('true'|'false');
TypeSym	:	('integer' | 'real' | 'string' | 'boolean');

ID  :	LETTER (LETTER | DIGIT | '_')*; 

   
// Operators
CMP_OPERATOR : (EQL|NEQL|LT|LE|GT|GE);
ADD : '+';
SUB : '-';
MUL : '*';
DIV : '/';

COMMENT :   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;} ;
ASSIGNSYM : ':=';
SEMICOLON : ';';
COMMA : ',';
OPENING_BRACKET : '(';
CLOSING_BRACKET : ')';
SINGLE_QUOTE:	'\'';


fragment LETTER	: ('a'..'z'|'A'..'Z');
fragment DIGIT : ('0'..'9');

fragment EQL: '=';
fragment NEQL: '<>';
fragment LT: '<';
fragment LE: '<=';
fragment GT: '>';
fragment GE: '>=';

WS: ( ' ' | '\t' | '\r' | '\n') {$channel=HIDDEN;};

