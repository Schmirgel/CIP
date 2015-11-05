grammar SymbolRaetselDSL;

// rules
prog : expr NL
		operatorLine NL
		expr NL
		equalLine NL
		expr;
		
expr : ID OP ID Equal ID;

operatorLine : OP OP OP;
	
equalLine
	:	Equal Equal Equal;


// tokens
ID : ('A'..'Z')+;
NL : '\r'? '\n';
Equal : '=';
OP : '+' | '-';