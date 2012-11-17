package euler.problems;

public class Problem005 extends Problem {

	public int getID() {
		return 5;
	}

	public String getDescription() {
		return "2520 is the smallest number that can be divided " +
		"by each of the numbers from 1 to 10 without any " +
		"remainder.\n\n" + 
		
		"What is the smallest positive number that is evenly " +
		"divisible by all of the numbers from 1 to 20?";
	}

	public double getAnswer() {
		return 232792560;
	}

	public double test(boolean verbose) {
		int numberToTest = 0;
		
		do {
			numberToTest += 20;
		} while (!evenlyDivisibleCheck(numberToTest));
		
		System.out.println("Testing number: " + numberToTest);
		for (int i = 1; i <= 20; i++) {
			System.out.println(numberToTest + " % " + i + " = " + numberToTest % i);
		}
		
		return numberToTest;
	}
	
	public boolean evenlyDivisibleCheck(int test) {
		for (int i = 2; i <= 20; i++) { //We don't need to test '1'
			if ((test % i) != 0) {
				return false;
			}
		}
		return true;
	}

}
