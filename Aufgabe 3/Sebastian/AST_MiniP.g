grammar AST_MiniP;

//AST-Ereugen
options {
	output = AST;
	ASTLabelType = CommonTree;
	}
	
//imaginaere Knoten deklarieren
tokens{PROGRAM;VARDEF;ANWEISUNG;WERTZUWEISUNG;IF;WHILE;PRINT;READ;COMPARE;ELSE;}


start
	: START_TOKEN deklaration* BEGIN_TOKEN anweisung+ END_TOKEN -> ^(PROGRAM ^(VARDEF deklaration*) ^(ANWEISUNG anweisung+));
	
deklaration
	: konstanten IDENTIFIER (',' IDENTIFIER)* ';' -> ^(konstanten IDENTIFIER)+; //VARDEF ist Elternknoten, alles andere sind Kinder

konstanten
	: (INT_KONSTANTE | REAL_KONSTANTE | STRING_KONSTANTE | BOOL_KONSTANTE) ;

anweisung
	: (wertzuweisung | arith_ausdruck s | read | println | fi | elihw) ';'!; //; soll nicht angezeigt werden
	
wertzuweisung
	: IDENTIFIER ':=' wertzuweisung_optionen
	-> ^(WERTZUWEISUNG IDENTIFIER wertzuweisung_optionen);
	
wertzuweisung_optionen 
	:	( STRING | arith_ausdruck s);

s	: COMPARE_OP^ arith_ausdruck
	| 	;
	
arith_ausdruck
	: mult (('+' | '-')^ mult)* 	; //da mult links steht wird es als erstes vom Parser bearbeitet -> so wird "Punkt vor Strich" garantiert
	
mult	
	: atom (('*' | '/')^ atom)*	; 
	
atom	
	: ('+' | '-')? INTEGER
	| ('+' | '-')? REAL
	| IDENTIFIER
	| '('! arith_ausdruck ')'!	;

fi 
	: 'if' vergleich  'then' anweisung+ ('else' anweisung+)? 'fi'
	-> ^(IF vergleich anweisung  ^(ELSE anweisung+)); //fi nicht mehr in der Anzeige

vergleich
	://(arithmetischen) Variablen
	 arith_ausdruck COMPARE_OP^ arith_ausdruck ;

elihw
	: 'while' vergleich 'do' anweisung+ 'od' 
	-> ^(WHILE vergleich anweisung+); //od nicht mehr in der Anzeige

read 	
	: 'read(' IDENTIFIER ')'	
	-> ^(READ IDENTIFIER); 

println 
	: 'println(' drucken ')'
	-> ^(PRINT drucken);

drucken :	arith_ausdruck
	|	STRING;

//Symbol-Klassen
START_TOKEN 
	:	'program'; 	//Schluesselwort
BEGIN_TOKEN 
	:	'begin';	//Schluesselwort
END_TOKEN
	:	'end';		//Schluesselwort
	
//Konstanten
INT_KONSTANTE 
	:	'integer' ;
REAL_KONSTANTE 
	:	'real' ;
STRING_KONSTANTE 
	:	'string' ;
BOOL_KONSTANTE 
	:	'boolean' ;

BOOLEAN	
	: 	'true' | 'false' ;
	
COMPARE_OP
	: 	('=' | '<' | '>' | '<>' | '<= '| '>=') ;

IDENTIFIER 	
	: BUCHSTABE (BUCHSTABE | ZAHL | '_')* 	; //muss mit Buchstaben beginnen
	
INTEGER 
	: ZAHL+	;
REAL	
	: ZAHL+'.'ZAHL+	;
STRING	
	:'\'' (BUCHSTABE | ZAHL | ' ')* '\''	; // \' -> einzelnes Hochkommata
//Makrodefinition -> laeuft so schneller
fragment ZAHL 
	:('0'..'9')	;
fragment BUCHSTABE
	: 'a'..'z' | 'A'..'Z'	;
/* */
BLOCK_KOMMENTAR 
	: '/*' .* '*/' { skip();}	; //.* -> beliebige Eingaben
LEERZEICHEN
	: (' ' | '\t') { skip();}	; //\t -> Tab
NEUE_ZEILE 
	: ('\r'? '\n') { skip();}	; //\r -> automatischer Zeilenumbruch (Carriage return)
	