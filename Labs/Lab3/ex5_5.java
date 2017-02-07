
public class ex5_5 {

	public static void main(String[] args) {
		
		System.out.printf("%-9s%15s","Kilograms","Pounds");
		System.out.print("\t|\t");
		System.out.printf("%-9s%15s\n","Kilograms","Pounds");
		
		double kilo = 1;
		double lbs = kilo * 2.20462;
		double lbsRight = 20;
		double kiloRight = lbsRight * 0.453592;
		
		int i = 1;
		for (i = 1; i < 199; i = i + 2) {
			kilo = i;
			lbs = kilo * 2.20462;
			lbsRight = lbsRight + 5;
			kiloRight = lbsRight * 0.453592;
			System.out.printf("%-6.0f   %15.1f", kilo, lbs);
			System.out.print("\t|\t");
			System.out.printf("%-6.0f   %15.1f\n", lbsRight, kiloRight);
			
		}
	}
}