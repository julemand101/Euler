package euler.problems;

public class Problem002 implements IProblem {

	public int getID() {
		return 2;
	}

	public String getDescription() {
		return "Each new term in the Fibonacci sequence is " + 
		"generated by adding the previous two terms. By " + 
		"starting with 1 and 2, the first 10 terms will be:\n\n" +
		
		"1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...\n\n" +
		
		"Find the sum of all the even-valued terms in the " + 
		"sequence which do not exceed four million.";
	}

	public double getAnswer() {
		return 4613732;
	}

	public double test(boolean verbose) {
		int temp[] = new int[2];
		int currentFibonacci = 0;
		int sum = 0;
		
		//Init numbers
		temp[0] = 1;
		temp[1] = 2;
		sum = 2;
		System.out.print("1 2 ");
		
		while (currentFibonacci < 4000000) {
			currentFibonacci = temp[0] + temp[1];
			
			if ((currentFibonacci % 2) == 0) {
				sum += currentFibonacci;
			}
			
			temp[0] = temp[1];
			temp[1] = currentFibonacci;
			
			System.out.print(currentFibonacci + " ");
		}
		System.out.println();
		System.out.println("Sum: " + sum);
		
		return sum;
	}

}
