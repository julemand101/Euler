package euler.problems;

import java.math.BigInteger;

import euler.Problem;

public class Problem016 extends Problem {

	public int getID() {
		return 16;
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
