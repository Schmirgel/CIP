grammar minip2;

start
	: START_TOKEN deklaration* BEGIN_TOKEN anweisung+ END_TOKEN ; 	//deklaration optional oder beliebig viele; EINE anweisung mindestens noetig
	
deklaration
	: konstanten IDENTIFIER (',' IDENTIFIER)* ';' ;			//deklaration wird mit Semikolon abgeschlossen

konstanten
	: (INT_KONSTANTE | REAL_KONSTANTE | STRING_KONSTANTE | BOOL_KONSTANTE) ;

anweisung
	: (wertzuweisung) ';' ;
	
wertzuweisung
	: IDENTIFIER ':=' ( STRING | arith_ausdruck | vergleich); 
	
arith_ausdruck
	: mult (('+' | '-') mult)*	; //da mult links steht wird es als erstes vom Parser bearbeitet -> so wird "Punkt vor Strich" garantiert
	
mult	
	: atom (('*' | '/') atom)*	;
	
atom	
	: ('+' | '-')? INTEGER
	| ('+' | '-')? REAL
	| IDENTIFIER
	| '(' arith_ausdruck ')'	;
	
vergleich
	://(arithmetischen) Variablen
	arith_ausdruck COMPARE_OP arith_ausdruck;


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