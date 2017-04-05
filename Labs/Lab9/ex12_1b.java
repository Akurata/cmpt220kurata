
import java.util.Scanner;


public class ex12_1b {
	public static void main(String[] args) {
			
	
			System.out.println( "Usage: Java Calculator operand1 operator operand2");
				
			
			Scanner input = new Scanner(System.in);
			String line = input.nextLine();
			String[] math = line.split("");
			
			CalculatorB c = new CalculatorB(math);
	}
}
