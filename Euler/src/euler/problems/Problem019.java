package euler.problems;

import euler.Problem;

public class Problem019 extends Problem {

	public int getID() {
		return 19;
	}

	public double getAnswer() {
		return 171;
	}

	enum MONTH { January, February, March, April, May, June, July, August, September, October, November, December }
	enum DAYNAME { Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday }
	
	int year;
	MONTH month;
	int day;
	DAYNAME dayName;
	
	private boolean isEndDate(int endDay, MONTH endMonth, int endYear) {
		if (year == endYear && month == endMonth && day == endDay) {
			return true;
		} else {
			return false;
		}
	}
	
	private boolean isLeapYear() {
		if (year % 4 == 0 && (!(year % 100 == 0) || year % 400 == 0)) {
			return true;
		} else {
			return false;
		}
	}
	
	private int daysInMonth() {
		switch (month) {
			case January:
				return 31;
			case February:
				if (isLeapYear()) {
					return 29;
				} else {
					return 28;
				}
			case March:
				return 31;
			case April:
				return 30;
			case May:
				return 31;
			case June:
				return 30;
			case July:
			case August:
				return 31;
			case September:
				return 30;
			case October:
				return 31;
			case November:
				return 30;
			case December:
				return 31;
		}	
		
		return 0;
	}
	
	private void nextDay() {
		if ((day + 1) > daysInMonth()) {
			day = 1;
			
			if ((month.ordinal() + 1) >= MONTH.values().length) {
				month = MONTH.January;
				year++;
			} else {
				month = MONTH.values()[month.ordinal() + 1];
			}
		} else {
			day++;
		}
		
		if ((dayName.ordinal() + 1) >= DAYNAME.values().length) {
			dayName = DAYNAME.Monday;
		} else {
			dayName = DAYNAME.values()[dayName.ordinal() + 1];
		}
	}
	
	public double test(boolean verbose) {
		year = 1900;
		month = MONTH.January;
		day = 1;
		dayName = DAYNAME.Monday;
		
		while (!isEndDate(1, MONTH.January, 1901)) {
			nextDay();
		}
		
		int sundays = 0;
		if (dayName == DAYNAME.Sunday) {
			sundays++;
		}
		while (!isEndDate(31, MONTH.December, 2000)) {
			nextDay();
			if (day == 1 && dayName == DAYNAME.Sunday) {
				sundays++;
			}
		}
		
		return sundays;
	}
}
