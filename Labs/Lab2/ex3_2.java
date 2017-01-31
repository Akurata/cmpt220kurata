
import java.util.Scanner;


public class ex3_2 {

	public static void main(String[] args) {
		int number1 = (int)(System.currentTimeMillis() % 10); //takes the time in milliseconds and takes the remainder value
		int number2 = (int)(System.currentTimeMillis() / 7 % 10);
		int number3 = (int)(System.currentTimeMillis() / 3 % 10);
		
		//Creates Scanner
		Scanner input = new Scanner(System.in);
		
		System.out.print("What is " + number1 + " + " + number2 + " + " + number3 + " ? ");
		int answer = input.nextInt();
		
		System.out.println(number1 + " + " + number2 + " = " + answer + " is " + (number1 + number2 + number3 == answer));
	}

}