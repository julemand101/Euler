package euler.problems;

import java.util.ArrayList;

import euler.Problem;

public class Problem003 extends Problem {

	public int getID() {
		return 3;
	}

	public double getAnswer() {
		return 6857;
	}

	public double test(boolean verbose) {
		final long NUMBER = 600851475143L; //The number we want to test
		
		long temp = NUMBER;
		long rest = 0;
		ArrayList<Integer> primeFactors = new ArrayList<Integer>();
		
		while (temp != 1) {
			resetPrimeNumber();
			do {
				rest = temp % getNextPrimeNumber();
			} while (rest != 0);
			temp = temp / getPrimeNumber();
			primeFactors.add(getPrimeNumber());
		}
		
		System.out.print(NUMBER + " = ");
		
		boolean first = true;
		for (Integer integer : primeFactors) {
			if (first) {
				System.out.print(integer);
				first = false;
			} else {
				System.out.print(" x " + integer);
			}
		}
		
		System.out.println();
		
		return primeFactors.get(primeFactors.size() - 1);
	}
	
	int nextPrime = 0;
	
	private int getPrimeNumber() {
		return nextPrime;
	}
	
	private void resetPrimeNumber() {
		nextPrime = 1;
	}
	
	private int getNextPrimeNumber() {
		if (nextPrime < 3) {
			nextPrime++;
			return nextPrime;
		} else {
			do {
				nextPrime++;
			} while (!isPrimeNumber(nextPrime));
			
			return nextPrime;
		}
	}
	
	private boolean isPrimeNumber(int a) {
		int max = (int) Math.sqrt(a) + 1;
		
		for (int test = 3; test < max; test += 2) {
			if (a % test == 0) {
				return false;
			}
		}
		
		return true;
	}
	
}
