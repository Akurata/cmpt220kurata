

public abstract class GeometricObject {
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;
	
	/**Construct a default geometric object**/
	protected GeometricObject() {
		dateCreated = new java.util.Date();
	}
	/**Construct a geometric object with specified color**/
	protected GeometricObject(String color, boolean filled) {
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
	
	
	
	
	
	
	
	/**Extenstion by this superclass to Circle.javas**/
	@Override //Forces compiler to double check that the methods line up (over writes the actual method)
	public String toString() {
		return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
	}
	/**Abstract methid getArea**/
	public abstract double getArea();
	/**Abstract methid getArea**/
	public abstract double getPerimeter();

}
