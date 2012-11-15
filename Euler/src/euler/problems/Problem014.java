package euler.problems;

public class Problem014 implements IProblem {

	public int getID() {
		return 14;
	}

	public String getDescription() {
		return "The following iterative sequence is defined for the set of positive integers:\n\n" + 
		
		"\tn -> n/2 (n is even)\n" +
		"\tn -> 3n + 1 (n is odd)\n\n" +
		
		"Using the rule above and starting with 13, we generate the following sequence:\n\n" +
		
		"\t13->40->20->10->5->16->8->4->2->1\n\n" +
		
		"It can be seen that this sequence (starting at 13 and finishing at 1) contains " + 
		"10 terms. Although it has not been proved yet (Collatz Problem), it is thought " + 
		"that all starting numbers finish at 1.\n\n" +
		
		"Which starting number, under one million, produces the longest chain?\n\n" +
		
		"NOTE: Once the chain starts the terms are allowed to go above one million.";
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
