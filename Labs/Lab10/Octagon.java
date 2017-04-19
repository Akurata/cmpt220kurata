
public class Octagon extends GeometricObject implements Comparable, Cloneable {

	double side; //Assuming all sides are equal
	
	Octagon() {
	}
	
	Octagon(double side) {
		this.side = side;
	}
	
	public double getArea(double side) {
		return (2 + (4 / Math.sqrt(2) * side * side));
	}
	public double getPerimeter(double side) {
		return side * 8;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public boolean compareTo(Octagon o2) { //I dont think this is the right inteded method, but it works the same
		return this.getArea() > o2.getArea();
	}
	
}
