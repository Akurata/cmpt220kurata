
import java.util.Scanner;


public class ex10_3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter 3 integers: "); //Prompt to enter a new int
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		int n3 = input.nextInt();
		MyInteger q = new MyInteger(n1); //Construct object from class
		MyInteger w = new MyInteger(n2);
		MyInteger e = new MyInteger(n3);
		
		
		//I called the methods a bunch of different ways out of boredom and trying to find ways to spice it up
		System.out.println();
		System.out.println("Value: " + q.getInt());
		System.out.println("isEven(): " + q.isEven());
		System.out.println("isOdd(): " + q.isOdd());
		System.out.println("isPrime(): " + q.isPrime());
		System.out.println();
		System.out.println("Value: " + w.getInt());
		System.out.println("isEven(int): " + w.isEven(n2));
		System.out.println("isOdd(int): " + w.isOdd(n2));
		System.out.println("isPrime(int): " + w.isPrime(n2));
		System.out.println();
		System.out.println("Value: " + e.getInt());
		System.out.println("isEven(MyInteger): " + e.isEven(e.getInt()));
		System.out.println("isOdd(MyInteger): " + e.isOdd(e.getInt()));
		System.out.println("isPrime(MyInteger): " + e.isPrime(e.getInt()));
		System.out.println();
		System.out.println("Num 1 == Num 2: " + q.equals(n2));
	    System.out.println("Num 1 == Num 3: " +  q.equals(n3));
	    System.out.println();
	    System.out.println("Parse int 100 string value: " + MyInteger.parseInt("100"));
        System.out.println("Parse int 150 char array value: " + MyInteger.parseInt("150".toCharArray()));
	}

}
