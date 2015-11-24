grammar AST_Erzeugung1;

options {
	output = AST;
	ASTLabelType = CommonTree;
	}

expr 	:	 atom (('+'^|'-'^)atom)* //beliebig viele Zahlen Addieren oder Subtrahieren
	;

atom	:	INT
	;
	
INT 	:	'0'..'9'+ // +=mindestens eine Zahl muss da sein
    	;

