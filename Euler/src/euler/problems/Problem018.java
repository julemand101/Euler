package euler.problems;

import euler.Problem;

public class Problem018 extends Problem {

	public int getID() {
		return 18;
	}

	public double getAnswer() {
		return 1074;
	}

	public double test(boolean verbose) {
		short triangle[][] = new short[15][];
		
		triangle[0] 	= new short[] {75};
		triangle[1] 	= new short[] {95,64};
		triangle[2] 	= new short[] {17,47,82};
		triangle[3] 	= new short[] {18,35,87,10};
		triangle[4] 	= new short[] {20, 4,82,47,65};
		triangle[5] 	= new short[] {19, 1,23,75,03,34};
		triangle[6] 	= new short[] {88, 2,77,73,07,63,67};
		triangle[7] 	= new short[] {99,65, 4,28, 6,16,70,92};
		triangle[8] 	= new short[] {41,41,26,56,83,40,80,70,33};
		triangle[9] 	= new short[] {41,48,72,33,47,32,37,16,94,29};
		triangle[10] 	= new short[] {53,71,44,65,25,43,91,52,97,51,14};
		triangle[11] 	= new short[] {70,11,33,28,77,73,17,78,39,68,17,57};
		triangle[12] 	= new short[] {91,71,52,38,17,14,91,43,58,50,27,29,48};
		triangle[13] 	= new short[] {63,66, 4,68,89,53,67,30,73,16,69,87,40,31};
		triangle[14] 	= new short[] { 4,62,98,27,23, 9,70,98,73,93,38,53,60,04,23};
		
		for (int i = triangle.length - 2; i >= 0; i--) {
			for (int j = 0; j < triangle[i].length; j++) {
				short compare1 = triangle[i+1][j];
				short compare2 = triangle[i+1][j+1];
				
				if (compare1 > compare2) {
					triangle[i][j] += compare1;
				} else {
					triangle[i][j] += compare2;
				}
			}
		}
		
		return triangle[0][0];
	}
}
