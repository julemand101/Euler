package euler.problems;

public class Problem007 implements IProblem {

	public int getID() {
		return 7;
	}

	public String getDescription() {
		return "By listing the first six prime numbers: " + 
		"2, 3, 5, 7, 11, and 13, we can see that the " + 
		"6th prime is 13.\n\n" +
		
		"What is the 10001st prime number?";
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