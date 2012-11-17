package euler.problems;

import euler.Problem;

public class Problem007 extends Problem {

	public int getID() {
		return 7;
	}

	public double getAnswer() {
		return 104743;
	}

	public double test(boolean verbose) {
		int count = 1;
		int prime = 1;
		
		do {
			prime += 2;
			if (isPrimeNumber(prime)) {
				count++;
			}
		} while (count < 10001);
		
		System.out.println("Prime found: " + prime);
		
		return prime;
	}
	
	private boolean isPrimeNumber(int a) {
		if (a > 1) {
			int max = (int) Math.sqrt(a) + 1;
			
			for (int test = 2; test < max; test++) {
				if (a % test == 0) {
					return false;
				}
			}
		} else {
			return false;
		}
		
		return true;
	}
	
}
