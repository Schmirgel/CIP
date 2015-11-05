grammar SymbolRaetsel;

start	:	taskline opline taskline equalsline taskline;

taskline	: WORD OPERATOR	WORD EQUALS WORD;
opline		: OPERATOR OPERATOR OPERATOR	;
equalsline	: EQUALS EQUALS EQUALS	;

WORD	: ('a'..'z'|'A'..'Z')+	;
OPERATOR: '+' | '-'	;
EQUALS	: '='	;

