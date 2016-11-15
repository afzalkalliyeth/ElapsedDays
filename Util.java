
public class Util {
	
	public static int getElapsedYearsInDays(int year1, int year2) {
		
		int days = 0;		
		for (int i = year1; i <= year2; i++) {
			
			if (isLeapYear(i)) {
				days = days + 366;
			} else {
				days = days + 365;
			}			
		}
		return days;
	}
	
	static boolean isLeapYear(int year) {
		
		if (year % 4 != 0) {
			return false;
		} else {
			
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					return true;
				}
			} else {
				return true;
			}
			return false;
		}		
	}
	
	/**
	 * Find elapsed days in the month - month
	 * no. of days in month  - days
	 * @param month
	 * @param days
	 * @return
	 */
	public static int getElapsedDaysInTheMonth(int year, int month, int dayOfMonth) {
		
		int totalDays = Months.getDaysOfMonth(year, month);		
		return totalDays - dayOfMonth;
	}	
	
	
	public static int getElapsedMonthsInDays(int year2, int year1, int month2, int month1) {
		
		int days = 0;		
		if (year1 == year2) {
			for (int i = month1; i <= month2; i++) {
				
				days = days + Months.getDaysOfMonth(year1, i);
			}
		} else  {
			for (int i = month1; i <= 12; i++) {
				
				days = days + Months.getDaysOfMonth(year1, i);
			}
			for (int i = 1; i <= month2; i++) {
				
				days = days + Months.getDaysOfMonth(year2, i);
			}			
		}		
		
		return days;
	}
	
	public static int[] getMin(int[] date1, int[] date2) {
		
		if (date2[2] > date1[2]) {
			return date1;
		} else if (date2[2] == date1[2]) {
			
			if (date2[1] > date1[1]) {
				return date1;
			} else if (date2[1] == date1[1]) {
				
				if (date2[0] > date1[0]) {
					return date1;
				}
			}			
		}		
		return date2;
	}
	
	public static int[] getMax(int[] date1, int[] date2) {
		
		if (date2[2] > date1[2]) {
			return date2;
		} else if (date2[2] == date1[2]) {
			
			if (date2[1] > date1[1]) {
				return date2;
			} else if (date2[1] == date1[1]) {
				
				if (date2[0] > date1[0]) {
					return date2;
				}
			}			
		}		
		return date1;
	}	
	
}
