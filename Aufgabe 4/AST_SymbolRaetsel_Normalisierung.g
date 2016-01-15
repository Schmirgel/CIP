tree grammar AST_SymbolRaetsel_Normalisierung;

options{
	output=AST;
	tokenVocab=AST_Symbolraetsel;
	ASTLabelType=CommonTree;
}


tokens{PUZZLE;}

prog	:	 l1=line l2=line l3=line l4=line l5=line l6=line -> ^(PUZZLE $l1 $l2 $l3 $l4 $l5 $l6);

line	: 	linePlus
	|	lineMinus;
	
//Plus -> so lassen wie es is
linePlus:	^(EQ ^(PLUS ^(WORD z1) ^(WORD z2)) ^(WORD z3));

//Minus -> Umwandeln
lineMinus:	^(EQ ^(MINUS ^(WORD z1) ^(WORD z2)) ^(WORD z3)) 
	->	^(EQ ^(PLUS["+"] ^(WORD z3) ^(WORD z2)) ^(WORD z1));

	
z1 	:	BUCHSTABEN+;
z2 	:	BUCHSTABEN+;
z3 	: 	BUCHSTABEN+;