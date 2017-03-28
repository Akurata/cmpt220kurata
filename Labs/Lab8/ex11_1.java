
import java.util.Scanner;


public class ex11_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter 3 side lengths: ");
		
		
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		
		System.out.println("Enter a boolean for filled or not filled: ");
		boolean filled = input.nextBoolean();
		
		System.out.println("Enter the color: ");
		String color = input.next();
		
		Triangle t = new Triangle(side1, side2, side3);
		t.setColor(color);
		t.setFilled(filled);
		
		System.out.println(t.toString());
		System.out.println("Area = " + t.getArea());
		System.out.println("Perimeter = " + t.getPerimeter());
		System.out.println("Color: " + t.getColor());
		System.out.println("Filed: " + t.isFilled());
		
		

	}

}
