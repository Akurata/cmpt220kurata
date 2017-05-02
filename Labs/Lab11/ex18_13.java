
import java.util.Scanner;


public class ex18_13 {

	public static void main(String[] args) {
		int[] array = new int[8];
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a list of 8 integers: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}
		System.out.println("The greatest element in the array is: " + findGreatest(array, 0, 0));
	}
	
	private static int findGreatest(int[] array, int i, int highest) {
		if (i == array.length) {
            return highest;
		}
        if (highest < array[i]) {
            highest = array[i];
        }
        return findGreatest(array, i + 1, highest);
	}
}
