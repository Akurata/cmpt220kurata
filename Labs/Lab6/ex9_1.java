
public class ex9_1 {

	public static void main(String[] args) {
		
		Rectangle r = new Rectangle(4.0, 40.0);
		Rectangle r2 = new Rectangle(3.5, 35.9);
		
		System.out.println("Rectangle 1 =\nArea: " 
				+ r.getArea(4.0, 40.0) +  //Show Area
				"\nWidth: " + r.width + //Show Width
				"\nHeight: " + r.height + //Show Height
				"\nPerimeter: " + r.getPerimeter(4, 40) //Show Perimeter
				);
		System.out.println("\nRectangle 2 =\nArea: " 
				+ r2.getArea(3.5, 35.9) +  //Show Area
				"\nWidth: " + r2.width + //Show Width
				"\nHeight: " + r2.height + //Show Height
				"\nPerimeter: " + r2.getPerimeter(3.5, 35.9) //Show Perimeter
				);
	}

}


