package euler.problems;

import java.math.BigInteger;

public class Problem020 implements IProblem {

	public int getID() {
		return 20;
	}

	public String getDescription() {
		return "n! means n * (n - 1) * ... * 3 * 2 * 1\n\n" +
		
		"Find the sum of the digits in the number 100!";
	}

	public double getAnswer() {
		return 648;
	}

	public double test(boolean verbose) {
		BigInteger result = factorial(100);
		
		int sum = 0;
		
		for (char cifre : result.toString().toCharArray()) {
			sum = sum + Character.getNumericValue(cifre);
		}
		
		return sum;
	}
	
	private BigInteger factorial(int input) {
		if (input == 1) {
			return BigInteger.ONE;
		} else {
			return factorial(input - 1).multiply(BigInteger.valueOf(input));
		}
	}
}
