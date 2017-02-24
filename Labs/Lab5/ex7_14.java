// JA: Alaways add comments to your code
import java.util.Scanner;


public class ex7_14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] nums = new int[5];
		
		System.out.print("Enter 5 numbers: ");
		for (int i = 0; i < 5; i++) {
			nums[i] = input.nextInt();
		}
		System.out.println("The GCD is: " + gcd(nums));
	}

	// JA: This logic is not right
	public static int gcd(int... numbers){
		int gcd = 1;
		int length = numbers.length - 1;
		
		int index = 0; // JA: It would be better to say index = numbers[0]
		int c = 0;
		for (c = 0; c < 5; c++) {
			if (index > numbers[c]) { // JA: This will never be true because index == 0
				index = numbers[c];
			}
		}
		
		
		int count = 0;
		for (int i = 2; i <= index; i++) {
		
		    for (int k = 0; k <= length; k++) {
		        if (numbers[k] % i == 0) {
		            count++;
		            if (count == length) gcd = i;
		        } else {
		            count = 0;
		        }
		    }
		}
		
		return gcd;
	}

}
