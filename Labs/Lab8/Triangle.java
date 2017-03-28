
public class Triangle extends GeometricObject {

	double side1;
	double side2;
	double side3;
	
	/**No-arg constructor**/
	Triangle() {
	}
	
	/**Basic constructor**/
	Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	
	/**Accessor Methods**/
	double getSide1() {
		return side1;
	}
	double getSide2() {
		return side2;
	}
	double getSide3() {
		return side3;
	}
	
	
	
	@Override
	public double getArea() {
		double p = getPerimeter() / 2;
		return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
	}

	@Override
	public double getPerimeter() {
		return side1 + side2 + side3;
	}
	
	@Override
	public String toString() {
		return "Triangle: \nside1 = " + side1 + "\nside2 = " + side2 + "\nside3 = " + side3;
	}

}
