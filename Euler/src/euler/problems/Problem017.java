package euler.problems;

import euler.Problem;

public class Problem017 extends Problem {

	public int getID() {
		return 17;
	}

	public double getAnswer() {
		return 21124;
	}

	public double test(boolean verbose) {
		int sum = 0;
		
		for (int i = 1; i <= 1000; i++) {
			sum += lenghtOfnumber(i);
		}
		
		return sum;
	}
	
	private int lenghtOfnumber(int number) {
		if (number < 20) {
			switch (number) {
				case 1: return 3;	// One
				case 2: return 3;	// Two
				case 3: return 5;	// Three
				case 4: return 4;	// Four
				case 5: return 4;	// Five
				case 6: return 3;	// Six
				case 7: return 5;	// Seven
				case 8: return 5;	// Eight
				case 9: return 4;	// Nine
				case 10:return 3;	// Ten
				case 11:return 6;	// Eleven
				case 12:return 6;	// Twelve
				case 13:return 8;	// Thirteen
				case 14:return 8;	// Fourteen
				case 15:return 7;	// Fifteen
				case 16:return 7;	// Sixteen
				case 17:return 9;	// Seventeen
				case 18:return 8;	// Eighteen
				case 19:return 8;	// Nineteen
			}
		} else if (number < 100) {
			switch (number) {
				case 20:return 6;	// Twenty
				case 30:return 6;	// Thirty
				case 40:return 5;	// Forty
				case 50:return 5;	// Fifty
				case 60:return 5;	// Sixty
				case 70:return 7;	// Seventy
				case 80:return 6;	// Eighty
				case 90:return 6;	// Ninety
				default:
					return (lenghtOfnumber((number / 10) * 10) + lenghtOfnumber(number % 10));
			}
		} else if (number < 1000 && number % 100 == 0) {
			return lenghtOfnumber(number / 100) + 7 ; // xxx hundred
		} else if (number < 1000) {
			int lenght = lenghtOfnumber(number / 100) + 7 ; // xxx hundred
			lenght += 3; // and
			lenght += lenghtOfnumber(number % 100);
			return lenght;
			
		} else if (number == 1000) {
			return 11; // one thousand
		}
		
		return 0;
	}
}
