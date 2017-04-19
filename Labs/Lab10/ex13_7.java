
public class ex13_7 {

	public static void main(String[] args) {
		
		GeometricObject[] a = new GeometricObject[5];
		a[0] = new Rectangle();
		a[1] = new Circle();
		a[2] = new Square();
		a[3] = new Rectangle(3, 5);
		a[4] = new Square(5);
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Shape " + i + ": " + "area = " + a[i].getArea());
			if (a[i] instanceof Colorable) {
				System.out.print("How to color: ");
				((Square) a[i]).howToColor();
			}
			System.out.println();
		}

	}

}
