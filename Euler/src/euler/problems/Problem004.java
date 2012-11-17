package euler.problems;

import euler.Problem;

public class Problem004 extends Problem {

	public int getID() {
		return 4;
	}

	public double getAnswer() {
		return 906609;
	}

	public double test(boolean verbose) {
		int maxA = 0;
		int maxB = 0;
		
		for (int a = 999; a > 0; a--) {
			for (int b = 999; b > 0; b--) {
				if (isPalindromic(a * b) && a*b > maxA * maxB) {
					System.out.println(a*b + " = " + b + " x " + a);
					maxA = a;
					maxB = b;
				}
			}
		}
		System.out.println("------------------");
		System.out.println(maxA*maxB + " = " + maxB + " x " + maxA);
		
		return maxA*maxB;
	}
	
	private boolean isPalindromic(int a) {
		char[] numberAsChar = String.valueOf(a).toCharArray();
		
		for (int i = 0; i < numberAsChar.length; i++) {
			if (numberAsChar[numberAsChar.length - 1 - i] != numberAsChar[i])
				return false;
		}
		return true;
	}

}
