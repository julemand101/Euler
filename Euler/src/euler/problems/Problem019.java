package euler.problems;

public class Problem019 implements IProblem {

	public int getID() {
		return 19;
	}

	public String getDescription() {
		return "You are given the following information, but you may prefer to do some research for yourself.\n\n" + 
		
		"* 1 Jan 1900 was a Monday.\n" +
		"* Thirty days has September,\n" +
		"  April, June and November.\n" + 
		"  All the rest have thirty-one,\n" + 
		"  Saving February alone,\n" +
		"  Which has twenty-eight, rain or shine.\n" + 
		"  And on leap years, twenty-nine.\n" + 
		"* A leap year occurs on any year evenly divisible by 4, but not on a century unless it is divisible by 400.\n\n" +
		
		"How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?";
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
