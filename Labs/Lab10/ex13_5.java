
import java.util.Scanner;


public class ex13_5 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Are the shapes Rectangles or Circles?");
		String shapeType = input.next();
		
		while(shapeType != "Rectangle" || shapeType != "Circle") { //Loop until given valid response
			if (shapeType == "Rectangle") {
				double side1 = input.nextDouble();
				double side2 = input.nextDouble();
				Rectangle r1 = new Rectangle(side1, side2);
				
				side1 = input.nextDouble();
				side2 = input.nextDouble();
				Rectangle r2 = new Rectangle(side1, side2);
				
				GeometricObject maxRectangle = (Rectangle) GeometricObject.max(r1, r2);
				System.out.println(maxRectangle);
				
			}else if (shapeType == "Circle") {
				double radius = input.nextDouble();
				Circle c1 = new Circle(radius);
				
				radius = input.nextDouble();
				Circle c2 = new Circle(radius);
				
				GeometricObject maxCircle = (Circle) GeometricObject.max(c1, c2);
				System.out.println(maxCircle);
			}else {
				System.out.println("Please enter either 'Rectangle' or 'Circle'");
				shapeType = input.next();
			}
		}
	}

}
