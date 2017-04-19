
public class ex13_9 {

	public static void main(String[] args) {
		
		Circle c1 = new Circle(15);
		Circle c2 = new Circle(30);
		Circle c3 = new Circle(43);
		Circle c4 = new Circle(30);
		
		System.out.println("C1.equals(C2): " + c1.equals(c2));
		System.out.println("C2.equals(C3): " + c2.equals(c3));
		System.out.println("C3.equals(C4): " + c3.equals(c4));
		System.out.println("C2.equals(C4): " + c2.equals(c4));
		System.out.println("C1.equals(C3): " + c1.equals(c3));
	}

}
