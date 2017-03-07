
import java.util.Scanner;


public class ex9_11 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a, b, c, d, e, f Separated By Spaces: ");
		
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int d = input.nextInt();
		int e = input.nextInt();
		int f = input.nextInt();
		
		LinearEquation linear = new LinearEquation(a,b,c,d,e,f);
		
		if (linear.isSolvable()) {
			System.out.println("X: " + linear.getX() + "\nY: " + linear.getY());
        } else {
            System.out.println("The equation has no solution.");
        }
	}
}


