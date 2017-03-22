
public class ex10_23 {

	public static void main(String[] args) {
		
		MyString2 test = new MyString2("string");
		
		System.out.println("The String is: \"string\"");
		System.out.println(test.compare("string test"));
		System.out.println(test.substring(3));
		System.out.println(test.toUpperCase());
		System.out.println(test.toChars().toString());
		System.out.println(test.valueOf(false));
		

	}

}
