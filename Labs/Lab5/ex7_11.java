
import java.util.Scanner;


public class ex7_11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter 10 numbers: ");
		double[] nums = new double[10];
		for (int i = 0; i < 10; i++) {
			nums[i] = input.nextDouble();
		}
		
		System.out.println("Mean: " + mean(nums));
		System.out.println("Standard Deviation: " + deviation(nums));
	}			
	public static double deviation(double[] x) {
		double total = 0;
		for (int i = 0; i < 10; i++) {
			total = total + x[i];
		}
		total = (Math.pow(total - (total / x.length), 2)) / (x.length - 1);
		total = Math.sqrt(total);
		
		return total;
	}
	public static double mean(double[] x) {
		double total = 0;
		for (int i = 0; i < 10; i++) {
			total = total + x[i];
		}
		total = total / x.length;
		
		return total;
	}

}
