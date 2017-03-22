import java.util.Arrays;

public class MyString2 {
	
	
	private static String string;
	
	

	public MyString2(String s) { //Basic constructor
		this.string = s;
	}
	public MyString2(char[] ch) {
		this.string = java.util.Arrays.toString(ch);
	}
	
	
	
	
	/**Compare**/
	public int compare(String s) {
		return s.compareTo(string);
	}
	/**Substring**/
	public MyString2 substring(int begin) { //Go to the index of the int, start creating an array of all the chars afer
		char[] array = new char[string.length()];
		int c = 0; //Counter
		for (int i = begin; i < string.length(); i++) {
			array[c] = string.charAt(i);
			c++;
		}
		String s = new String(array);
		return new MyString2(s);
	}
	/**To Upper Case**/
	public MyString2 toUpperCase() {
		int[] array = new int[string.length()]; //Sending chars to int
		for(int i = 0; i < string.length(); i++) {
			array[i] = (int) string.charAt(i) + 32;
			if((int) array[i] > 122) {
				array[i] -= 32;
			}
		}
		char[] array2 = new char[string.length()]; //Sending int to chars
		for(int i = 0; i < string.length(); i++) {
			array2[i] = (char) array[i];
		}
		
		return new MyString2(array2.toString()); //Returning chars in most upper form
	}

	/**To Chars**/
	public char[] toChars() { //Sends each char to a point in the array
		char[] array = new char[string.length()];
		for(int i = 0; i < string.length(); i++) {
			array[i] = string.charAt(i);
		}
		return array;
	}
	/**Value of**/
	public static MyString2 valueOf(boolean b) {
		return new MyString2(string);
	}

}
