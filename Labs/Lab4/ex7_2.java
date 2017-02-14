
import java.util.Scanner;


public class ex7_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String s = input.nextLine();
		String n = s;
		
		int length = s.length();
		
		char[] temp = new char[length];
		for (int i = 0; i < length; i++) {
			temp[i] = s.charAt(i);
		}
		for (int i = length - 1; i >= 0; i--){
			System.out.print(temp[i]);
		}
	}

}
