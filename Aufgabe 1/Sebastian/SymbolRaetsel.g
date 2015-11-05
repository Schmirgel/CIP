grammar SymbolRaetsel;
/*start -> Starsymbol*/
start	:	taskline opline taskline equalsline taskline; //taskline ist eine Zeile

taskline	: WORD OPERATOR	WORD EQUALS WORD;
opline		: OPERATOR OPERATOR OPERATOR	;
equalsline	: EQUALS EQUALS EQUALS	;

WORD	: ('a'..'z'|'A'..'Z')+	;
OPERATOR: '+' | '-'	;
EQUALS	: '='	;

