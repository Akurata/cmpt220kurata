



public class ex6_12 {

	public static void main(String[] args) {
		printChars('1', 'Z', 10);
	}
	
	public static void printChars(char ch1, char ch2, int numberPerLine) {
		for (int i = 1; ch1 <= ch2; i++, ch1++) {
			System.out.print(ch1 + " ");
			if (i % numberPerLine == 0) {
				System.out.println();
			}
		}
	}

}
