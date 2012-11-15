package euler.problems;

public class Problem006 implements IProblem {

	public int getID() {
		return 6;
	}

	public String getDescription() {
		return "The sum of the squares of the first ten natural numbers is,\n\n" + 
		
		"1^2 + 2^2 + ... + 102 = 385\n\n" +
		
		"The square of the sum of the first ten natural numbers is,\n\n" + 
		
		"(1 + 2 + ... + 10)^2 = 55^2 = 3025\n\n" +
		
		"Hence the difference between the sum of the squares of the first ten " + 
		"natural numbers and the square of the sum is 3025 - 385 = 2640\n\n" +
		
		"Find the difference between the sum of the squares of the first one " + 
		"hundred natural numbers and the square of the sum.";
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
