
public class ex10_21 {

	public static void main(String[] args) {
		
		int c = 0;
		long[] numbers = new long[10];
		
		for(long i = Long.MAX_VALUE; c < 10; i++) {
			
			if (i % 5 == 0|| i % 6 == 0) {
				numbers[c] = i;
				c++;
			}
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.println(numbers[i]);
		}

	}

}
