grammar AST_Test01;

options{
	output=AST;
	ASTLabelType=CommonTree;
}

/*
 *	erstellt einen AST für SymbolRaetsel
 */
prog	:	id11=ID op12=OP id13=ID eq14=EQ id15=ID
		op21=OP 	op22=OP 	op23=OP
		id31=ID op32=OP id33=ID eq34=EQ id35=ID
		eq41=EQ 	eq42=EQ 	eq43=EQ
		id51=ID op52=OP id53=ID eq54=EQ id55=ID
		
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


EQ	:	'=';

OP	:	('+'|'-');

ID  :	('A'..'Z')+;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;

