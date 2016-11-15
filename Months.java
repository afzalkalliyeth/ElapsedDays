
public class Months {
	
	private static final int months[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public static int getDaysOfMonth(int year, int i) {
		if (i != 2) {
			return months[i - 1];
		} else {
			if (Util.isLeapYear(year)) {
				return 29;
			} else {
				return 28;
			}
		}
	}
}
