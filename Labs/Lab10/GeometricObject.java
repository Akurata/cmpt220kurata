

public class GeometricObject implements Comparable {
	protected String color = "white";
	protected boolean filled;
	private java.util.Date dateCreated;
	
	/**Construct a default geometric object**/
	protected GeometricObject() {
		dateCreated = new java.util.Date();
	}

	/**Construct a geometric object with specified color**/
	protected GeometricObject(double radius, String color, boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}
	
	
	/**Return color**/
	public String getColor() {
		return color;
	}
	
	/**Set a new color**/
	public void setColor(String color) {
		this.color = color;
	}
	
	/**Return filled. Since filled is boolean, the method is called isFilled**/
	public boolean isFilled() {
		return filled;
	}
	
	/**Set filled value**/
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	/**Get Date created**/
	public java.util.Date getCreated() {
		return dateCreated;
	}
	
	/**Extenstion by this superclass to Triangle.java**/
	@Override //Forces compiler to double check that the methods line up (over writes the actual method)
	public String toString() {
		return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
	}

	/**Get Area method**/
	public double getArea() {
		return 0;
	}
	/**Get Perimeter method**/
	public double getPerimeter() {
		return 0;
	}
	
	
	
	/**13.5 Method to find bigger of two objects**/
	public static GeometricObject max(GeometricObject shape1, GeometricObject shape2) {
		if(shape1 instanceof Rectangle && shape2 instanceof Rectangle) {
			if(shape1.getArea() > shape2.getArea()){
				return shape1;
			}else {
				return shape2;
			}
		}else if(shape1 instanceof Circle && shape2 instanceof Circle) {
			if(shape1.getArea() > shape2.getArea()){
				return shape1;
			}else {
				return shape2;
			}
		}else {
			return null;
		}
	}	
}

