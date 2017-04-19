
public class ex13_11 {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Octagon o1 = new Octagon(5);
		Octagon o2 = (Octagon) o1.clone(); //Creates clone with throw
		
		System.out.println("o1 > o2: " + o1.compareTo(o2));
		

	}

}
