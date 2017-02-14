
import java.util.Scanner;


public class ex6_16 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int y1 = input.nextInt();
		System.out.print("Enter another year: ");
		int y2 = input.nextInt();
		
		int years = Math.abs(y1 - y2);
		int leapYearCounter = 0;
		for (int i = (y1 < y2 ? y1 : y2); i <= (y1 > y2 ? y1 : y2); i++) {
			if (i % 4 == 0) {
				leapYearCounter++;
			}
		}
		System.out.println("The number of days from " + y1 + " to " + y2 + " is: " + (numberOfDaysInAYear(years) + leapYearCounter));
	}
	public static int numberOfDaysInAYear(int year) {
		year = year * 365;
		return year;
	}

}
