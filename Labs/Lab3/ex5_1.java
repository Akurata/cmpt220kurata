
import java.util.Scanner;


public class ex5_1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer, the input ends if it is 0: ");
		
		int tempNum = input.nextInt(); //Temporary number to store one integer at a time
		
		int posNum = 0; //Positive number total
		int negNum = 0; //Negative number total
		double total = 0; //Total
		int counter = 0; //Counter to see the total number of integers
		
		if (tempNum == 0) {
			System.out.println("No numbers entered excoet 0");
		}else {
			while (tempNum != 0) {
				if (tempNum > 0) {
					posNum++;
				}else {
					negNum++;
				}
				total = total + tempNum;
				tempNum = input.nextInt();
				counter++;
			}
			System.out.println("The number of positives is: " + posNum + 
					"\nThe number of negatives is: " + negNum + 
					"\nThe total is: " + total +
					"\nThe average is: " + (total / counter));
		}
	}

}
