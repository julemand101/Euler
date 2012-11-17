package euler.problems;

import euler.Problem;

public class Problem002 extends Problem {

	public int getID() {
		return 2;
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
