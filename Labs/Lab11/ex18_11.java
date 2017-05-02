
import java.util.Scanner;


public class ex18_11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number to have the digits added together: ");
		long num = input.nextLong();
		System.out.println("The sum of " + num + "'s digits are: " + sumDigits(num));
	}
	
	public static int sumDigits(long n) {
		if (n == 0) {
			return (int) n;
		}
		return (int) n % 10 + sumDigits(n / 10);
	}

}
