
import java.util.Scanner;


public class ex13_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the three sides of the triangle: ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		
		System.out.println("Enter the color of the triangle: ");
		String color = input.next();
		
		System.out.println("Enter a boolean for whether or not the triangle is filled: ");
		boolean filled = input.nextBoolean();
		
		
		Triangle t = new Triangle(side1, side2, side3, color, filled);
		System.out.println(
				"\nArea: " + t.getArea() + 
				"\nPerimeter: " + t.getPerimeter() +
				"\nColor: " + t.getColor() + 
				"\nFilled: " + t.isFilled()
		);

	}

}
