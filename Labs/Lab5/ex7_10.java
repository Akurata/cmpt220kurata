
import java.util.Scanner;


public class ex7_10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] array = new double[10];
		System.out.print("Enter 10 numbers: ");
		
		for (int i = 0; i < 10; i++) {
			array[i] = input.nextDouble();
		}

		System.out.println("The index of the smallest element is: " + indexOfSmallestElement(array));
	}
	public static int indexOfSmallestElement(double[] array) {
		int i = 0;
		int index = (int) array[i];
		for (i = 0; i < 9; i++) {
			if (index > array[i]) {
				index = i;
			}
		}
		return index;
	}
}
