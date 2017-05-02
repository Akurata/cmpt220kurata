
import java.util.Scanner;


public class ex18_9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a String to be reversed:" );
		String display = input.nextLine();
		reverseDisplay(display);
	}
	
	public static void reverseDisplay(String value) {
		String newString;
		if (value.length() != 0) {
			System.out.print(value.substring(value.length() - 1));
			newString = value.substring(0, value.length() - 1);
			
			reverseDisplay(newString);
		}
		
	}

}
