grammar AST_Symbolraetsel;

options{
	output=AST;
	ASTLabelType=CommonTree;
}
tokens{WORD;}
/*
 *	erstellt einen AST fuer SymbolRaetsel
 */
prog	:	id11=word op12=OP id13=word eq14=EQ id15=word
		op21=OP 	op22=OP 	op23=OP
		id31=word op32=OP id33=word eq34=EQ id35=word
		eq41=EQ 	eq42=EQ 	eq43=EQ
		id51=word op52=OP id53=word eq54=EQ id55=word

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
	:	(A|B|C|D|E|F|G|H|I|J|K|L|M|N|O|P|Q|R|S|T|U|V|W|X|Y|Z);


EQ	:	'=';

OP	:	('+'|'-');

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
	|'\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;