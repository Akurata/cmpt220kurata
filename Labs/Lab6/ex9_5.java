
import java.util.GregorianCalendar;
import java.util.Date;


public class ex9_5 {
	
	public static void main(String[] args) {
		Date date = new Date(); //Create Date
		GregorianCalendar gCalendar = new GregorianCalendar(); //Create Gregorian Calendar
		gCalendar.setTimeInMillis(1234567898765L); //Setting time on calendar
		
		
		System.out.println("Current Year: " + (date.getYear())); //Print Year
		System.out.println("Current Month: " + (date.getMonth())); //Print Month
		System.out.println("Current Day: " + (date.getDay())); //Print Day
		
		System.out.println(); //Empty line for formatting
		
		System.out.println("Current Year: " + (gCalendar.get(GregorianCalendar.YEAR))); //Gregorian Year
		System.out.println("Current Month: " + (gCalendar.get(GregorianCalendar.MONTH))); //Gregorian Month
		System.out.println("Current Day: " + (gCalendar.get(GregorianCalendar.DAY_OF_MONTH))); //Gregoiran Month
	}

}
