package euler.problems;

public class Problem009 implements IProblem {

	public int getID() {
		return 9;
	}

	public String getDescription() {
		return "A Pythagorean triplet is a set of three natural numbers, " + 
		"a < b < c, for which,\n\n" +
		
		"a^2 + b^2 = c^2\n\n" +
		
		"For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.\n\n" +
		
		"There exists exactly one Pythagorean triplet for which a + b + c = 1000.\n" +
		"Find the product abc.";
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
