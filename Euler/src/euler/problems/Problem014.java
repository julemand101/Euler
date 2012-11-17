package euler.problems;

import euler.Problem;

public class Problem014 extends Problem {

	public int getID() {
		return 14;
	}

	public double getAnswer() {
		return 837799;
	}

	int[] numberList = new int[1000000]; // If 2 we can simulate the program without the cache
	
	public double test(boolean verbose) {
		int big = 0;
		long result = 0;
		
		numberList[1] = 1;
		
		for(long a = 1L; a < 1000000; a++) {
			//System.out.print(a + " : ");
			int value = check(a);
			
			if (value > big) {
				big = value;
				result = a;
			}
			//System.out.println();
		}
		
		return result;
	}
	
	private int check(long a) {
		//System.out.print(a + " ");
		if (a < numberList.length && numberList[(int)a] != 0) {
			return numberList[(int)a];
		} else {
			long n;
			int result;
			
			if (a % 2 == 0) {
				n = a / 2;
			} else {
				n = (3 * a) + 1;
			}
			
			result = check(n) + 1;
			if (a < numberList.length) {
				numberList[(int)a] = result;
			}
			
			return result;
		}
	}
}
