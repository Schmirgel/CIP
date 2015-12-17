package choco;

import choco.cp.model.CPModel;
import choco.cp.solver.CPSolver;
import choco.kernel.model.Model;
import choco.kernel.model.variables.integer.IntegerExpressionVariable;
import choco.kernel.model.variables.integer.IntegerVariable;
import choco.kernel.solver.Solver;


public class DonaldGeraldRobertSPALTENWEISE {

	public static void main(String[] args) {
		// Build model
		Model model = new CPModel();
		
		// Declare every letter as a variable
		IntegerVariable d = Choco.makeIntVar("d", 0, 9, Options.V_ENUM);
		IntegerVariable o = Choco.makeIntVar("o", 0, 9, Options.V_ENUM);
		IntegerVariable n = Choco.makeIntVar("n", 0, 9, Options.V_ENUM);
		IntegerVariable a = Choco.makeIntVar("a", 0, 9, Options.V_ENUM);
		IntegerVariable l = Choco.makeIntVar("l", 0, 9, Options.V_ENUM);
		IntegerVariable g = Choco.makeIntVar("g", 0, 9, Options.V_ENUM);
		IntegerVariable e = Choco.makeIntVar("e", 0, 9, Options.V_ENUM);
		IntegerVariable r = Choco.makeIntVar("r", 0, 9, Options.V_ENUM);
		IntegerVariable b = Choco.makeIntVar("b", 0, 9, Options.V_ENUM);
		IntegerVariable t = Choco.makeIntVar("t", 0, 9, Options.V_ENUM);
		
		//Uebertraege
		IntegerVariable u1 = Choco.makeIntVar("u0", 0, 1, Options.V_ENUM);
		IntegerVariable u2 = Choco.makeIntVar("u1", 0, 1, Options.V_ENUM);
		IntegerVariable u3 = Choco.makeIntVar("u2", 0, 1, Options.V_ENUM);
		IntegerVariable u4 = Choco.makeIntVar("u3", 0, 1, Options.V_ENUM);
		IntegerVariable u5 = Choco.makeIntVar("u4", 0, 1, Options.V_ENUM);
		IntegerVariable u6 = Choco.makeIntVar("u5", 0, 1, Options.V_ENUM);
		
		// Add constraints
									// d + d         =                 10 x u1 + t
		model.addConstraint(Choco.eq(Choco.plus(d, d), Choco.plus(Choco.mult(10, u1), t)));
									// l + l		 = 				   10 x u2 + r                -  u1
		model.addConstraint(Choco.eq(Choco.plus(l, l), Choco.minus(Choco.plus(Choco.mult(10, u2), r),u1)));
									// a + a		 = 				   10 x u3 + e                -  u2
		model.addConstraint(Choco.eq(Choco.plus(a, a), Choco.minus(Choco.plus(Choco.mult(10, u3), e),u2)));
		
		model.addConstraint(Choco.eq(Choco.plus(n, r), Choco.minus(Choco.plus(Choco.mult(10, u4), b),u3)));
		
		model.addConstraint(Choco.eq(Choco.plus(o, e), Choco.minus(Choco.plus(Choco.mult(10, u5), o),u4)));
		
		model.addConstraint(Choco.eq(Choco.plus(d, g), Choco.minus(Choco.plus(Choco.mult(10, u6), r),u5)));
									// d + g < 10
		model.addConstraint(Choco.lt(Choco.plus(d, g),10));
	
		
		// Add constraint of all different letters.
		model.addConstraint(Choco.allDifferent(new IntegerVariable[]{d,o,n,a,l,g,e,r,b,t}));
		
		// Build a solver, read the model and solve it
		Solver s = new CPSolver();
		s.read(model);
		s.solve();
		
		// Print name value
		System.out.print(s.getVar(d).getVal());
		System.out.print(s.getVar(o).getVal());
		System.out.print(s.getVar(n).getVal());
		System.out.print(s.getVar(a).getVal());
		System.out.print(s.getVar(l).getVal());
		System.out.print(s.getVar(d).getVal());
		System.out.println();
		System.out.print(s.getVar(g).getVal());
		System.out.print(s.getVar(e).getVal());
		System.out.print(s.getVar(r).getVal());
		System.out.print(s.getVar(a).getVal());
		System.out.print(s.getVar(l).getVal());
		System.out.print(s.getVar(d).getVal());
		System.out.println();
		System.out.println("-------");
		System.out.print(s.getVar(r).getVal());
		System.out.print(s.getVar(o).getVal());
		System.out.print(s.getVar(b).getVal());
		System.out.print(s.getVar(e).getVal());
		System.out.print(s.getVar(r).getVal());
		System.out.print(s.getVar(t).getVal());

		System.out.println();
		System.out.println();
		System.out.print("u1=" + s.getVar(u1).getVal());
		System.out.print(" u2=" + s.getVar(u2).getVal());
		System.out.print(" u3=" + s.getVar(u3).getVal());
		System.out.print(" u4=" + s.getVar(u4).getVal());
		System.out.print(" u5=" + s.getVar(u5).getVal());
		System.out.print(" u6=" + s.getVar(u6).getVal());
	}

}
