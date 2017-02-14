
import java.util.Scanner;


public class ex7_4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int averageScore = 0;
		System.out.print("Enter the scores, and conclude with a negative number to end the sequence: ");
		int[] nextNum = new int[100];
		int i = 0;
		for (i = 0; i < 100; i++) {
			nextNum[i] = input.nextInt();
			averageScore = averageScore + nextNum[i];
			if (nextNum[i] < 0) {
				break;
			}
		}
		averageScore = averageScore / i;
		int aboveCounter = 0;
		int belowCounter = 0;
		for (i = 0; i < 100; i++) {
			if (nextNum[i] > 0){
				if (nextNum[i] >= averageScore) {
					aboveCounter++;
				}else {
					belowCounter++;
				}
			}
		}
		System.out.println("There are " + aboveCounter + " scores above average");
		System.out.println("There are " + belowCounter + " scores below average");
	}
}
