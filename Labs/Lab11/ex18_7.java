
import java.util.Scanner;


public class ex18_7 {
	
	static int fibCalled = 0;
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an index for a fibonacci number: ");
		int index = input.nextInt();
		
		System.out.println("The fibbonacci number at index " + index + " is " + fib(index));
		System.out.println("The number of times 'fib' is called is: " + fibCalled);
	}
	
	public static long fib(long index) {
		
		fibCalled++;
		
		if (index == 0) {
			return 0;
		}else if (index == 1) {
			return 1;
		}else {
			return fib(index - 1) + fib(index - 2);
		}
	}
}
