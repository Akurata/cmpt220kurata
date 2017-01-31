
import java.util.Scanner;


public class ex4_13 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a letter: ");
		
		char ch = input.next().charAt(0);
		
		
		switch (Character.toLowerCase(ch)) {
		  case 'a':
		  case 'e':
		  case 'i':
		  case 'o':
		  case 'u':
		  case 'y': System.out.println("This is a vowel"); break;
		  default: System.out.println("This is not a vowel");
		}
	}
}
