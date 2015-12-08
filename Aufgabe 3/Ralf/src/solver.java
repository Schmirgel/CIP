package impl;

import choco.Choco;
import choco.Options;
import choco.cp.model.CPModel;
import choco.cp.solver.CPSolver;
import choco.kernel.model.Model;
import choco.kernel.model.variables.integer.IntegerExpressionVariable;
import choco.kernel.model.variables.integer.IntegerVariable;
import choco.kernel.solver.Solver;

public class solver {
	
	public static void main(String[] args) {
        // Build model
        Model model = new CPModel();
        Model modelNew = new CPModel();

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
        
        //define carry
        IntegerVariable u1 = Choco.makeIntVar("u1", 0, 1, Options.V_ENUM);
        IntegerVariable u2 = Choco.makeIntVar("u2", 0, 1, Options.V_ENUM);
        IntegerVariable u3 = Choco.makeIntVar("u3", 0, 1, Options.V_ENUM);
        IntegerVariable u4 = Choco.makeIntVar("u4", 0, 1, Options.V_ENUM);
        IntegerVariable u5 = Choco.makeIntVar("u5", 0, 1, Options.V_ENUM);



        // Declare every name as a variable
        IntegerVariable donald = Choco.makeIntVar("donald", 0, 1000000, Options.V_BOUND);
        IntegerVariable gerald = Choco.makeIntVar("gerald", 0, 1000000, Options.V_BOUND);
        IntegerVariable robert = Choco.makeIntVar("robert", 0, 1000000, Options.V_BOUND);

        // Array of coefficients
        int[] c = new int[]{100000, 10000, 1000, 100, 10, 1};

        // Declare every combination of letter as an integer expression
        IntegerExpressionVariable donaldLetters = Choco.scalar(new IntegerVariable[]{d, o, n, a, l, d}, c);
        IntegerExpressionVariable geraldLetters = Choco.scalar(new IntegerVariable[]{g, e, r, a, l, d}, c);
        IntegerExpressionVariable robertLetters = Choco.scalar(new IntegerVariable[]{r, o, b, e, r, t}, c);

        // Add equality between name and letters combination
        model.addConstraint(Choco.eq(donaldLetters, donald));
        model.addConstraint(Choco.eq(geraldLetters, gerald));
        model.addConstraint(Choco.eq(robertLetters, robert));
        
        // Add constraint name sum
        model.addConstraint(Choco.eq(Choco.plus(donald, gerald), robert));

        //New Solution
        modelNew.addConstraint(Choco.eq(Choco.plus(d, d), Choco.plus(t, Choco.mult(u1, 10))));
        modelNew.addConstraint(Choco.eq(Choco.plus(Choco.plus(l, l), u1), Choco.plus(r, Choco.mult(u2, 10))));
        modelNew.addConstraint(Choco.eq(Choco.plus(Choco.plus(a, a), u2), Choco.plus(e, Choco.mult(u3, 10))));
        modelNew.addConstraint(Choco.eq(Choco.plus(Choco.plus(n, r), u3), Choco.plus(b, Choco.mult(u4, 10))));
        modelNew.addConstraint(Choco.eq(Choco.plus(Choco.plus(o, e), u4), Choco.plus(o, Choco.mult(u5, 10))));
        modelNew.addConstraint(Choco.eq(Choco.plus(Choco.plus(d, g), u5), r));
        
        // Add constraint of all different letters.
        model.addConstraint(Choco.allDifferent(d, o, n, a, l, g, e, r, b, t));
        modelNew.addConstraint(Choco.allDifferent(d, o, n, a, l, g, e, r, b, t));

        // Build a solver, read the model and solve it
        Solver s = new CPSolver();
        Solver sNew = new CPSolver();
        s.read(model);
        sNew.read(modelNew);
        s.solve();
        sNew.solve();

        // Print name value
        System.out.println("donald = " + s.getVar(donald).getVal());
        System.out.println("gerald = " + s.getVar(gerald).getVal());
        System.out.println("robert = " + s.getVar(robert).getVal());
        
        System.out.println("New donald = " + sNew.getVar(d).getVal() + sNew.getVar(o).getVal() + sNew.getVar(n).getVal() + sNew.getVar(a).getVal() + sNew.getVar(l).getVal() + sNew.getVar(d).getVal());
        System.out.println("New gerald = " + sNew.getVar(g).getVal() + sNew.getVar(e).getVal() + sNew.getVar(r).getVal() + sNew.getVar(a).getVal() + sNew.getVar(l).getVal() + sNew.getVar(d).getVal());
        System.out.println("New robert = " + sNew.getVar(r).getVal() + sNew.getVar(o).getVal() + sNew.getVar(b).getVal() + sNew.getVar(e).getVal() + sNew.getVar(r).getVal() + sNew.getVar(t).getVal());

	}

}
