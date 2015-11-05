grammar MiniP;

start
	: 'program' deklaration+ 'begin' anweisung+ 'end'	;
	
deklaration
	: ('integer' | 'real' | 'string' | 'boolean') VARIABLE	(',' VARIABLE)* ';' ;

anweisung
	: (wertzuweisung | read | println | fi | elihw) ';'	;
wertzuweisung
	: (VARIABLE ':=')? ausdruck	;
ausdruck
	: mult (('+' | '-') mult)*	;
mult	
	: atom (('*' | '/') atom)*	;
atom	
	: ('+' | '-')? INTEGER
	| ('+' | '-')? REAL
	| VARIABLE
	| '(' ausdruck ')'	;

fi 
	: 'if' vergleich  'then' anweisung+ ('else' anweisung+)? 'fi';

vergleich
	: ausdruck ('=' | '<' | '>' | '<>' | '<= '| '>=') ausdruck	;

elihw
	: 'while' vergleich 'do' anweisung+ 'od'	;

read 	
	: 'read(' VARIABLE ')'	;

println 
	: 'println(' ausdruck | STRING ')'	; 

//SysmbolKlassen
BOOLEAN	
	: 'true' | 'false'	;

VARIABLE 	
	: BUCHSTABE (BUCHSTABE | ZAHL | '_')*	;
	
INTEGER 
	: ZAHL+	;
REAL	
	: ZAHL+'.'ZAHL+	;
STRING	
	:'\'' (BUCHSTABE | ZAHL | ' ')* '\''	;
fragment ZAHL 
	:('0'..'9')	;
fragment BUCHSTABE
	: 'a'..'z' | 'A'..'Z'	;
	
BLOCK_KOMMENTAR 
	: '/*' .* '*/' { $channel = HIDDEN; }	;
LEERZEICHEN
	: (' ' | '\t') { $channel = HIDDEN; }	;
NEUE_ZEILE 
	: ('\r'? '\n')	{ $channel = HIDDEN; }	;
	