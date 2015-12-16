grammar AST_SymbolRaetsel;

//AST-Ereugen
options{
	language = Java;
	output=AST;
}
tokens{WORD;}

/*
 *	erstellt einen AST für SymbolRaetsel
 */
prog	:	id11=word op12=op id13=word eq14=EQ id15=word
		op21=op 	op22=op 	op23=op
		id31=word op32=op id33=word eq34=EQ id35=word
		eq41=EQ 	eq42=EQ 	eq43=EQ
		id51=word op52=op id53=word eq54=EQ id55=word
		
		->
		//waagerechte Aufgaben
		^($eq14 ^($op12 $id11 $id13) $id15) // Zeile 1
		^($eq34 ^($op32 $id31 $id33) $id35) // zeile 2
		^($eq54 ^($op52 $id51 $id53) $id55) // Zeile 3
		// senkrechte Aufgaben
		^($eq41 ^($op21 $id11 $id31) $id51) // Spalte 1
		^($eq42 ^($op22 $id13 $id33) $id53) // Spalte 2
		^($eq43 ^($op23 $id15 $id35) $id55) // Spalte 3 
		;
		
word  :	BUCHSTABEN+ -> ^(WORD BUCHSTABEN+);

BUCHSTABEN 
	:	(A|B|C|D|E|F|G|H|I|J|K|L|N|M|O|P|Q|R|T|U|S|V|W|X|Y|Z);


EQ	:	'=';

op	:	PLUS 
	| 	MINUS;

PLUS	:	'+';

MINUS	:	'-';

fragment A	:	'A';
fragment B	:	'B';
fragment C	:	'C';
fragment D	:	'D';
fragment E	:	'E';
fragment F	:	'F';
fragment G	:	'G';
fragment H	:	'H';
fragment I	:	'I';
fragment J	:	'J';
fragment K	:	'K';
fragment L	:	'L';
fragment M	:	'M';
fragment N	:	'N';
fragment O	:	'O';
fragment P	:	'P';
fragment Q	:	'Q';
fragment R	:	'R';
fragment S	:	'S';
fragment T	:	'T';
fragment U	:	'U';
fragment V	:	'V';
fragment W	:	'W';
fragment X	:	'X';
fragment Y	:	'Y';
fragment Z	:	'Z';

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;