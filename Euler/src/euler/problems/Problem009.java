package euler.problems;

import euler.Problem;

public class Problem009 extends Problem {

	public int getID() {
		return 9;
	}

	public double getAnswer() {
		return 31875000;
	}

	public double test(boolean verbose) {
		int productABC = 0;
		
		for (int a = 0; a < 500; a++) {
			for (int b = a; b < 500; b++) {
				int c = 1000 - a - b;
				
				if ((Math.pow(a, 2) + Math.pow(b, 2)) == Math.pow(c, 2)) {
					System.out.println("a^2 + b^2 = c^2");
					System.out.printf("%d^2 + %d^2 = %d^2\n", a, b, c);
					productABC = a * b * c;
					System.out.println("\na * b * c = answer");
					System.out.printf("%d * %d * %d = %d\n", a, b, c, productABC);
				}
			}
		}
		
		return productABC;
	}
	
}
