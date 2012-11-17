package euler.problems;

import euler.Problem;

public class Problem006 extends Problem {

	public int getID() {
		return 6;
	}

	public double getAnswer() {
		return 25164150;
	}

	public double test(boolean verbose) {
		double sumOfTheSquares = 0;
		double squareOfTheSum = 0;
		double diff = 0;
		
		for (int i = 1; i <= 100; i++) {
			sumOfTheSquares += Math.pow(i, 2);
			squareOfTheSum += i;
		}
		squareOfTheSum = Math.pow(squareOfTheSum, 2);
		
		diff = squareOfTheSum - sumOfTheSquares;
		
		System.out.println("Sum of the squares: " + sumOfTheSquares);
		System.out.println("Square of the sum: " + squareOfTheSum);
		System.out.println("Difference: " + squareOfTheSum + 
						   " - " + sumOfTheSquares + 
						   " = " + diff);
		
		return diff;
	}
	
}
