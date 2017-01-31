
import java.util.Scanner;


public class ex3_5 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter today's day: ");
		int dayNumber = input.nextInt();//Generating user input for current date
		
		System.out.print("Enter the number of days elapsed since today: ");
		int  dayCount = input.nextInt();//Generating user input for future number

		
		switch(dayNumber) {//Switch statement to get the current date
			case 0: System.out.println("Today's date is Sunday"); break;
			case 1: System.out.println("Today's date is Monday"); break;
			case 2: System.out.println("Today's date is Tuesday"); break;
			case 3: System.out.println("Today's date is Wednesday"); break;
			case 4: System.out.println("Today's date is Thursday"); break;
			case 5: System.out.println("Today's date is Friday"); break;
			case 6: System.out.println("Today's date is Saturday");
		}
		
		switch(dayNumber + (dayCount % 7)) {//Switch formula to get the future date
			case 0: System.out.println("The future date is Sunday"); break;
			case 1: System.out.println("The future date is Monday"); break;
			case 2: System.out.println("The future date is Tuesday"); break;
			case 3: System.out.println("The future date is Wednesday"); break;
			case 4: System.out.println("The future date is Thursday"); break;
			case 5: System.out.println("The future date is Friday"); break;
			case 6: System.out.println("The future date is Saturday");
		}
	}
}