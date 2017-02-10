
import java.util.Scanner;


public class ex5_16 {

	// JA: This program does not give all the factors. For example, factors for 340 are 2,2,5,17
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter and integer: ");
		int solve = input.nextInt();
		int i = 0;
		boolean isPrime = true;
		int counter = 0; //Counts the number of 2's
		int threeCounter = 0; //Counts the number of 3's
		int fiveCounter = 0; //Counts the number of 5's
		String two = "";
		String three = "";
		String five = "";
		if (solve % 2 == 0) { //Number is not prime
			isPrime = false;
		}else { //Number is prime
			isPrime = true;
		}
		if (isPrime == true) {
			System.out.println("The factors are: " + solve + ", 1");
		}else {
			while (solve % 2 == 0) {
				solve = solve / 2;
				counter++;
			}
			while (solve % 3 == 0) {
				solve = solve / 3;
				threeCounter++;
			}
			while (solve % 5 == 0) {
				solve = solve / 5;
				fiveCounter++;
			}
			for (i = 0; i < counter; i++) {
				two = two + ", 2";
			}
			for (i = 0; i < threeCounter; i++) {
				three = three + ", 3";
			}
			for (i = 0; i < fiveCounter; i++) {
				five = five + ", 5";
			}
			System.out.println("The factors are: " + two + three + five);
		}
	}
}
//120
//60,2
//30,2,2
//15,2,2,2
//5,3,2,2,2
