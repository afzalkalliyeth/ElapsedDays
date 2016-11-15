import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {

		System.out.println("Please enter dates in DD/MM/YYYY - DD/MM/YYYY format:");
		Scanner scanner = new Scanner(System.in);
		String dateRange = scanner.nextLine();
		System.out.println(getElapsedDays(dateRange));
	}
	
	public static String getElapsedDays(String input) {
		
		String[] dates = input.split(" - ");
		
		int[] date11 = parseIntArray(dates[0].split("/"));
		int[] date22 = parseIntArray(dates[1].split("/"));
		
		// Find the min and max of the dates entered
		int[] date1 = Util.getMin(date11, date22);
		int[] date2 = Util.getMax(date11, date22);
		
		int days = 0;
		int yearsInDays = 0;
		int monthsInDays = 0;
		if (date2[2] - date1[2] >= 2) {
			yearsInDays = Util.getElapsedYearsInDays(date1[2] +1 , date2[2] - 1);
			monthsInDays = Util.getElapsedMonthsInDays(date2[2], date1[2], date2[1] - 1, date1[1] + 1);
		} else {
			monthsInDays = Util.getElapsedMonthsInDays(date2[2], date1[2], date2[1] - 1, date1[1] + 1);
		}
		
		int elapsedDays = 0;
		if (date2[1] == date1[1]) {
			elapsedDays = date2[0] - date1[0] - 1;
		} else {
			int elapsedDaysOfDate1 = Util.getElapsedDaysInTheMonth(date1[2], date1[1], date1[0]);
			int elapsedDaysOfDate2 = date2[0] -1;
			elapsedDays = elapsedDaysOfDate1 + elapsedDaysOfDate2;
		}
		
		days = yearsInDays + monthsInDays + elapsedDays;
		
		return input + ": " + days + " days";
	}
	
	static int[] parseIntArray(String[] arr) {
	    return Stream.of(arr).mapToInt(Integer::parseInt).toArray();
	}

}
