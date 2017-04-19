
public class Circle extends GeometricObject implements Comparable {
	
	double radius;
	
	Circle() {
	}
	
	Circle(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return Math.pow(Math.PI * radius, 2);
	}
	
	
	
	@Override
	public boolean equals(Object o) {
		return radius == ((Circle) o).radius; //Using Comparator
	}
}
