tree grammar AST_SymbolRaetsel_Normalisierung;

options{
	output=AST;
	tokenVocab=AST_SymbolRaetsel;
	ASTLabelType=CommonTree;
}

prog 	:	line line line line line line;

line	: 	linePlus
	|	lineMinus;
	
//Plus -> so lassen wie es is
linePlus:	^(EQ ^(PLUS ^(WORD z1) ^(WORD z2)) ^(WORD z3));

//Minus -> Umwandeln
lineMinus:	^(EQ ^(MINUS ^(WORD z1) ^(WORD z2)) ^(WORD z3)) 
	->	^(EQ ^(MINUS["+"] ^(WORD z3) ^(WORD z2)) ^(WORD z1));

	
z1 	:	BUCHSTABEN+;
z2 	:	BUCHSTABEN+;
z3 	: 	BUCHSTABEN+;