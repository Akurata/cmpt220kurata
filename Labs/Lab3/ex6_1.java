
public class ex6_1 {

	public static void main(String[] args) {
		int i;
		int num;
		for (i = 1; i < 100; i++) {
			num = getPentagonalNumber(i);
			if (i % 10 == 0) {
				System.out.println(num + " ");
			}
			System.out.print(num + " ");
		}
	}
	public static int getPentagonalNumber(int n) {
		int result;
		result = n * (3 * n - 1) / 2;
		return result;
	}

}
