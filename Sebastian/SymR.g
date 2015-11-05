grammar SymR;

/*start -> Starsymbol*/
start	:	taskline opline taskline equalsline taskline; //taskline = 1. Zeile, opline = 2. Zeile, usw.

taskline	: word OPERATOR	word EQUALS word	;     //taskline ist eine Zeile die Buchstaben, Operatoren und ein Gleichheitszeichten enhaelt

opline		: OPERATOR OPERATOR OPERATOR	;

equalsline	: EQUALS EQUALS EQUALS	;

word		: (A_TOKEN | B_TOKEN | C_TOKEN | D_TOKEN | E_TOKEN | F_TOKEN | G_TOKEN | H_TOKEN | I_TOKEN | J_TOKEN 
		| K_TOKEN | L_TOKEN | M_TOKEN | N_TOKEN | O_TOKEN | P_TOKEN | Q_TOKEN | R_TOKEN | S_TOKEN | T_TOKEN 
		| U_TOKEN | V_TOKEN | W_TOKEN | X_TOKEN | Y_TOKEN | Z_TOKEN )+ ;

//Lexeme
OPERATOR	: '+' | '-'	;	//als Operatoren sind nur + oder - erlaubt
EQUALS		: '='		;

//Jedem Buchstaben wird ein Token zugeordnet
A_TOKEN		: ('a' | 'A')	;	
B_TOKEN		: ('b' | 'B')	;	
C_TOKEN		: ('c' | 'C')	;	
D_TOKEN		: ('d' | 'D')	;	
E_TOKEN		: ('e' | 'E')	;	
F_TOKEN		: ('f' | 'F')	;	
G_TOKEN		: ('g' | 'G')	;	
H_TOKEN		: ('h' | 'H')	;	
I_TOKEN		: ('i' | 'I')	;	
J_TOKEN		: ('j' | 'J')	;	
K_TOKEN		: ('k' | 'K')	;	
L_TOKEN		: ('l' | 'L')	;	
M_TOKEN		: ('m' | 'M')	;
N_TOKEN		: ('n' | 'N')	;
O_TOKEN		: ('o' | 'O')	;	
P_TOKEN		: ('p' | 'P')	;	
Q_TOKEN		: ('q' | 'Q')	;	
R_TOKEN		: ('r' | 'R')	;	
S_TOKEN		: ('s' | 'S')	;	
T_TOKEN		: ('t' | 'T')	;	
U_TOKEN		: ('u' | 'U')	;	
V_TOKEN		: ('v' | 'V')	;	
W_TOKEN		: ('w' | 'W')	;	
X_TOKEN		: ('x' | 'X')	;	
Y_TOKEN		: ('y' | 'Y')	;	
Z_TOKEN		: ('z' | 'Z')	;	




  