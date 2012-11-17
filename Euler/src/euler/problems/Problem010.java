package euler.problems;

import euler.Problem;

public class Problem010 extends Problem {

	public int getID() {
		return 10;
	}

	public double getAnswer() {
		return 142913828922d;
	}

	public double test(boolean verbose) {
		/*
		 * This solution is designed as another attempt
		 * to solve the task as the first option did not 
		 * work particularly effective. This solution is 
		 * made by looking at the PDF document from Euler
		 * (the document can only be readed if the problem
		 * is solved).
		 * 
		 */
		
		// Find all primes: 2...limit
		int limit = 2000000;
		
		//We only need an array contain all odd numbers (half size)
		int sievebound = (limit - 1) / 2;
		
		//The sieve is used to mark all numbers there can't be prime numbers.
		//I know it can be a little stupid but when the boolean is true the number
		//is marked "this number is NOT a prime".
		//
		//The index of the sieve is made so sieve[i] = 2*i+1.
		//So sieve[5] represents '11'.
		//
		//The index is maded this way so we can make the sieve the half size. (only odd numbers)
		boolean[] sieve = new boolean[sievebound];
		
		//Indicates when we don't need to make more calculations
		int crosslimit = ((int)Math.floor(Math.sqrt(limit)) - 1) / 2;
		
		for (int i = 1; i <= crosslimit; i++) {
			if (!sieve[i]) {
				for (int j = 2*i*(i+1); j < sievebound; j += 2*i+1) {
					sieve[j] = true;
				}
			}
		}
		
		double sum = 2;
		for (int i = 1; i < sievebound; i++) {
			if (!sieve[i]) {
				sum += 2*i+1;
			}
		}
		
		return sum;

/*
 * Code lines from the first solution of this task. The answer is currect but
 * can be found a lot faster with use of a "sieve".
 * 
 */
//		double sum = 2;
//		
//		for (int i = 3; i < 2000000; i += 2) {
//			if (isPrimeNumber(i)) {
//				sum += i;
//			}
//		}
//		
//		return sum;
	}
	
/*
 * This method is used by the old solution to this problem. The method
 * is the same as used in other prime number problems and is very effective.
 *
 * In this problem there are another method there are a lot faster. (read
 * description in the 'test' method.
 * 
 */
	
//	private boolean isPrimeNumber(int a) {
//		if (a > 1) {
//			int max = (int) Math.sqrt(a) + 1;
//			
//			for (int test = 2; test < max; test++) {
//				if (a % test == 0) {
//					return false;
//				}
//			}
//		} else {
//			return false;
//		}
//		
//		return true;
//	}
	
}
