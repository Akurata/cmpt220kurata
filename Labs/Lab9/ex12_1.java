
import java.util.Scanner;


public class ex12_1 {

	public static void main(String[] args) {
		

		System.out.println( "Usage: Java Calculator operand1 operator operand2");
			
		// JA: This has to be read from the command line arguments
		Scanner input = new Scanner(System.in);
		String line = input.nextLine();
		String[] math = line.split("");
		
		Calculator c = new Calculator(math);
		
		
	}


}
