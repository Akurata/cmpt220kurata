
import java.util.Scanner;


public class ex4_20 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		
		String message = input.nextLine();
		
		// JA: You should create an output message with the answer.
		int length = message.length(); //Gives input length
		System.out.println(length);
		
		char ch = message.charAt(0); //Gives first character
		System.out.println(ch);
		
	}
}
