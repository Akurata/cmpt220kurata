
import java.util.Scanner;


public class ex6_18 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a Password: ");
		String password = input.nextLine();
		
		if (eightChar(password.length()) && checkLettersAndDigits(password) == true) {
			System.out.println("Valid Password");
		}else {
			System.out.println("Invalid Password");
		}
	}
	public static boolean eightChar(int charCount) {
		if (charCount >= 8){
			return true;
		}else {
			return false;
		}
	}
	public static boolean checkLettersAndDigits(String pass) {
		int letterCheck = 0;
		int digitCheck = 0;
		for (int i = 0; i < pass.length(); i++) {
			if (Character.isLetter(pass.charAt(i))){
				letterCheck++;
			}else if (Character.isDigit(pass.charAt(i))){
				digitCheck++;
			}
		}
		if (letterCheck + digitCheck == pass.length() && digitCheck >= 2){
			return true;
		}else {
			return false;
		}
	}
}
