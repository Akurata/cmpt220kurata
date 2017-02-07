
import java.util.Scanner;


public class ex6_3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int userIn = input.nextInt();
		
		if (isPalindrome(userIn)){
			System.out.println(userIn + " Is a Palindrome");
		}else {
			System.out.println(userIn + " Is not a Palindrome");
		}
		
	}
		public static int reverse(int number) {
			int reverse = 0;
	        while (number != 0) {
	            reverse *= 10; // is ignored first iteration
	            reverse += number % 10;
	            number /= 10;
	        }
	        return reverse;
		}
		public static boolean isPalindrome(int number) {	
			 return (number == reverse(number));
		}
}
