tree grammar SymbolraetselEmitter;


// ### Options
options {
  language=Java;
  tokenVocab=AST_SymbolRaetsel_Normalisierung;
  output=template;
  ASTLabelType=CommonTree;
}

// ### Header

// package for parser
@header {package solver;

import java.util.Set;
import java.util.HashSet;
import java.lang.Character;

import solver.Constraint;
import solver.Number;
}

@members {
Set<Character> symbols = new HashSet<Character>();
}

// ### Parser rules

puzzle
  : ^(PUZZLE constraints+=constraint*)
    -> puzzle(symbols={symbols}, constraints={$constraints})
  ;

constraint
@after {
Constraint constraint = new Constraint();
constraint.getNumbers().add($n1.number);
constraint.getNumbers().add($n2.number);
constraint.getNumbers().add($n3.number);
constraint.prepare();
}
  : ^(EQ ^(PLUS n1=number n2=number) n3=number)
    -> constraint(number1={$n1.number}, number2={$n2.number}, number3={$n3.number})
  ;

number returns [Number number]
@after {
$number = new Number();
$number.setDigits($syms);
symbols.addAll($number.getCharacters());
}
  : ^(WORD syms+=BUCHSTABEN+)
  ;
