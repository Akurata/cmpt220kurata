
public class IllegalTriangleException extends IllegalArgumentException {
	
	public IllegalTriangleException(double s1, double s2, double s3) {
		super("This is not a real triangle");
	}
	
}
