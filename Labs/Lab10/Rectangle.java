
public class Rectangle extends GeometricObject {
	double side1;
	double side2;
	
	Rectangle() {
	}
	
	Rectangle(double side1, double side2) {
		this.side1 = side1;
		this.side2 = side2;
	}
	
	public double getArea() {
		return side1 * side2;
	}
		
	
}
