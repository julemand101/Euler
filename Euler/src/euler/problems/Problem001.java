package euler.problems;

import euler.Problem;

public class Problem001 extends Problem {

	public int getID() {
		return 1;
	}

	public double getAnswer() {
		return 233168;
	}

	public double test(boolean verbose) {
		int sum = 0;
		
		for (int i = 0; i < 1000; i++) {
			if (((i % 3) == 0 || ((i % 5) == 0))) {
				sum += i;
			}
		}
		
		System.out.println("Sum: " + sum);
		
		return sum;
	}

}
