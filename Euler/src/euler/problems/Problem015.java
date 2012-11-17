package euler.problems;

import euler.Problem;

public class Problem015 extends Problem {

	public int getID() {
		return 15;
	}

	public double getAnswer() {
		return 137846528820L;
	}

	//The solution is made from some knowlage gain from the web that we can solve this by:
	//	40! / 20! * 20!
	// LINK: http://realultimateprogramming.blogspot.com/2009/03/project-euler-problem-15.html
	public double test(boolean verbose) {
		double gridSize = 20; //Ex. gridsize 20x20 = 20
		
		return factorial(gridSize * 2) / (factorial(gridSize) * factorial(gridSize));
	}
	
	private double factorial(double n) {
		if (n == 1) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}
}
