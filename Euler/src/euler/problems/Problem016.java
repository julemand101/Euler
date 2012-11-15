package euler.problems;

import java.math.BigInteger;

public class Problem016 implements IProblem {

	public int getID() {
		return 16;
	}

	public String getDescription() {
		return "2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.\n\n" +
		
		"What is the sum of the digits of the number 2^1000?";
	}

	public double getAnswer() {
		return 1366;
	}

	public double test(boolean verbose) {
		BigInteger two = new BigInteger("2");
		BigInteger result = two.pow(1000);
		int sum = 0;
		
		for (char cifre : result.toString().toCharArray()) {
			sum = sum + Character.getNumericValue(cifre);
		}
		
		return sum;
	}
}
