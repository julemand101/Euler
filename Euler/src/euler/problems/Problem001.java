package euler.problems;

public class Problem001 extends Problem {

	public int getID() {
		return 1;
	}

	public String getDescription() {
		return "If we list all the natural numbers below " + 
		"10 that are multiples of 3 or 5, we get 3, 5, 6 " + 
		"and 9. The sum of these multiples is 23.\n\n" + 
		
		"Find the sum of all the multiples of 3 or 5 below 1000.";
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
