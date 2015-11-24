grammar AST_SymbolRaetsel;

//AST-Ereugen
options {
	output = AST;
	ASTLabelType = CommonTree;
	}
	
//NOTATION: Tree Rewrite Syntax
/*start -> Starsymbol*/
start :

w1_1=WORD op1=OPERATOR w1_2=WORD e1=EQUALS w1_3=WORD

op2_1=OPERATOR op2_2=OPERATOR op2_3=OPERATOR

w3_1=WORD op3=OPERATOR w3_2=WORD e3=EQUALS w3_3=WORD

e4_1=EQUALS e4_2= EQUALS e4_3=EQUALS

w5_1=WORD op5=OPERATOR w5_2=WORD e5=EQUALS w5_3=WORD

-> 	^($e1 ^($op1 $w1_1 $w1_2) $w1_3) //1. ZeileQuer

	^($e3 ^($op3 $w3_1 $w3_2) $w3_3) //2. ZeileQuer
	
	^($e5 ^($op5 $w5_1 $w5_2) $w5_3) //3. ZeileQuer
	
	^($e4_1 ^($op2_1 $w1_1 $w3_1) $w5_1) //1. ZeileHochkant
	
	^($e4_2 ^($op2_2 $w1_2 $w3_2) $w5_2) //2. ZeileHochkant
	
	^($e4_3 ^($op2_3 $w1_3 $w3_3) $w5_3) //2. ZeileHochkant
	;

WORD		: ('a'..'z'|'A'..'Z')+	;

OPERATOR	: '+' | '-'	;

EQUALS		: '='	;
