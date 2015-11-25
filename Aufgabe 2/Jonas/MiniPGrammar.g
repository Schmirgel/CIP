grammar MiniPGrammar;

options{
	output=AST;
	ASTLabelType=CommonTree;
}

// Programm-Struktur
// **************************************** rules *******************************************************
tokens{
	STATEMENTS;
	DECLARATIONS;
	VARDEF;
	COMPARE;
	ASSIGN;
	MATHSTMT;
	IF;
	THEN;
	ELSE;
	WHILE;
	DO;
	PRINT;
	READ;		
}

// Programm Startpunkt
prog	:	ProgSym decl* BeginSym stmts EndSym 
		-> ^(DECLARATIONS decl*) ^(STATEMENTS stmts)	
		 ; 

// Deklaration (werden mit Semikolon abgeschlossen. Beispiel: string str1, str2;)
decl	:	(TypeSym ID (COMMA ID)* SEMICOLON) -> ^(VARDEF TypeSym ID);

// Anweisungen (mindestens eine & werden mit Semikolon abgeschlossen)
stmts	:	((assignStmt | mathStmt | compareStmt | ifStmt | whileStmt | readStmt | printStmt) SEMICOLON!)+; // SEMIKOLON NICHT ANZEIGEN

// Wertezuweisung (Beispiel: a := 12;)
assignStmt : (ID ASSIGNSYM ) assignment -> ^(ASSIGN ^(ASSIGNSYM ID assignment));

assignment
	:	(mathStmt| STRINGSYM | compareStmt);

// Vergleich (Zwischen Variablen oder Konstanten)
compareStmt : (cmp1=compareVal CMP_OPERATOR cmp2=compareVal) -> ^(COMPARE ^(CMP_OPERATOR $cmp1 $cmp2));

compareVal
	:	(ID|('+'|'-')?INTSYM|('+'|'-')?REALSYM);

// Arithmetischer Ausdruck (enthält: (,),+,-,*,/,Vorzeichen,Konstanten, Variablen)
mathStmt : t1=term ((ADD|SUB)^ t2=term)*;
term : factor ((MUL | DIV)^ factor)*;
factor : ( ('+'|'-')?INTSYM | ('+'|'-')?REALSYM | ID | (OPENING_BRACKET! mathStmt CLOSING_BRACKET!));

// IF-Statement 
ifStmt	: IFSYM compareStmt THENSYM stmts (ELSESYM stmts)? FISYM -> ^(IF compareStmt ^(THEN stmts) ^(ELSE stmts)) ;

// while-Statement
whileStmt : WHILESYM compareStmt DOSYM stmts ODSYM -> ^(WHILE compareStmt ^(DO stmts));

// read-Statement (Beispiel: read(var1)
readStmt: READSYM OPENING_BRACKET ID CLOSING_BRACKET -> ^(READ ID);

// print-Statement (Beispiel: print(var12))
printStmt : PRINTSYM OPENING_BRACKET (ID) CLOSING_BRACKET -> ^(PRINT ID);


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

INTSYM : DIGIT+;
REALSYM:  DIGIT+ ('.' DIGIT+);
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

