package euler.problems;

public class Problem015 implements IProblem {

	public int getID() {
		return 15;
	}

	public String getDescription() {
		return "Starting in the top left corner of a 22 grid, there are 6 routes " + 
		"(without backtracking) to the bottom right corner.\n\n" +
		
		"How many routes are there through a 2020 grid?";
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
