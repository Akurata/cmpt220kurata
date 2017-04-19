
public class Triangle extends GeometricObject {

	double side1;
	double side2;
	double side3;
	
	Triangle(double side1, double side2, double side3, String color, boolean filled) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		this.color = color;
		this.filled = filled;
	}
	
	
	@Override
	public double getArea() {
		return Math.sqrt((getPerimeter()/2) * ((getPerimeter()/2) - side1) * ((getPerimeter()/2) - side2) * ((getPerimeter()/2) - side3));
	}

	@Override
	public double getPerimeter() {
		return side1 +  side2 + side3;
	}

}
