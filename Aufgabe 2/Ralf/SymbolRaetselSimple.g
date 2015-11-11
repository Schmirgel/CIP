grammar SymbolRaetselSimple;

options{ output=AST;}

start	:	taskline taskline taskline taskline taskline taskline ;

taskline	: w1=WORD OPERATOR w2=WORD EQUALS w3=WORD -> ^(EQUALS ^(OPERATOR $w1 $w2) $w3);

WORD	: ('a'..'z'|'A'..'Z')+	;
OPERATOR: '+' | '-'	;
EQUALS	: '='	;

