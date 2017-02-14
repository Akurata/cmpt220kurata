
import java.util.Scanner;


public class ex7_8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 10 double numbers: ");
		
		double[] array = new double[10];
		
		for (int i = 0; i < 10; i++) {
			array[i] = input.nextDouble();
		}
		System.out.println("The average value is: " + average(array));
	}
	public static int average(int[] array) {
		int total = 0;
		for (int i = 0; i < array.length; i++) {
			total = total + array[i];
		}
		return total / array.length;
	}
	public static double average(double[] array) {
		double total = 0;
		for (int i = 0; i < array.length; i++) {
			total = total + array[i];
		}
		return total / array.length;	
	}

}
