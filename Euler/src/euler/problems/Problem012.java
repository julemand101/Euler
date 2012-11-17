package euler.problems;

import euler.Problem;

public class Problem012 extends Problem {

	public int getID() {
		return 12;
	}

	public double getAnswer() {
		return 76576500;
	}

	public double test(boolean verbose) {
	    int numberT = 1;
	    int count = 1;
		
	    while(check(numberT)<500) {
	    	//Calculate next triangle number
	    	count++;
	    	numberT = numberT + count;
	    }
	    
	    return numberT;
	}
	
	//Check how many divisors input x have
	//The method use a nice trick where we only count to sqrt(x). The reason is we now there
	//are the same number of divisors from 1->sqrt(x) and sqrt(x)->x. So we only need to calculate
	//the 1->sqrt(x) and multiply with 2.
	//
	//An example with the number 486:
	//sqrt(486) = 22
	//Divisors of 486 = 1, 2, 3, 6, 9, 18 | 27, 54, 81, 162, 243, 486
	//
	//As we can see we got the same number of divisors on both side of |
	private int check(int x)
    {
		int divCount = 0;
		int countTo = (int) Math.sqrt((double) x);
		
        for(int j = 1; j <= countTo; j++)
        {
            if(x%j == 0)
                divCount++;
        }
        
        return 2*divCount;
    }
	
}
