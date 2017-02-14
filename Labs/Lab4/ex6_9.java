
public class ex6_9 {

	public static void main(String[] args) {
		
		System.out.println("Feet \t Meters  |  Meters  \tFeet");
		System.out.println("-----------------------------------------------------");
		
		double c = 20;
		for (double i = 1; i <= 10; i++) {
			System.out.println(i + " \t " + footToMeter(i) + " \t |  " + c + " \t " + meterToFoot(c));
			c = c + 5;
		}
	}
	//Feet to meters
	public static double footToMeter(double foot) {
		foot = foot * 0.305;
		return foot;
	}
	//Meters to feet
	public static double meterToFoot(double meter) {
		meter = meter * 3.279;
		return meter;
	}

}
