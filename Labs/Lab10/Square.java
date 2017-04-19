
public class Square extends GeometricObject implements Colorable {

	double side; //Assuming all sides to be the same to be a square
	
	Square() {
	}
	
	Square(double side) {
		this.side = side;
	}
	
	@Override
	public double getArea() {
		return side * side;
	}
	
	@Override
	public double getPerimeter() {
		return side * 4;
	}
	
	@Override
	public void howToColor() {
		System.out.println("Color all four sides.");
	}

}
