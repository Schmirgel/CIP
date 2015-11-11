grammar SymbolRaetsel;

options {output=AST;}

start	:	 word11 = WORD op11= OPERATOR word12 = WORD equals11 = EQUALS word13 = WORD 
		 opS1 = OPERATOR opS2 = OPERATOR opS3 = OPERATOR 
		 word21 = WORD op21= OPERATOR word22 = WORD equals21 = EQUALS word23 = WORD
		 equalsS1 = EQUALS equalsS2 = EQUALS equalsS3 = EQUALS  
		 word31 = WORD op31= OPERATOR word32 = WORD equals31 = EQUALS word33 = WORD 
		 -> ^($equals11 ^($op11 $word11 $word12) $word13)
		    ^($equals21 ^($op21 $word21 $word22) $word23)
		    ^($equals31 ^($op31 $word31 $word32) $word33)
		    ^($equalsS1 ^($opS1 $word11 $word21) $word31)
		    ^($equalsS2 ^($opS2 $word12 $word22) $word32)
		    ^($equalsS3 ^($opS3 $word13 $word23) $word33);

WORD	: ('a'..'z'|'A'..'Z')+	;
OPERATOR: '+' | '-'	;
EQUALS	: '='	;