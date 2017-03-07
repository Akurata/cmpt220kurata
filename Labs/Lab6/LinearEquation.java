
public class LinearEquation {
	private int a; 
	private int b;
	private int c; 
	private int d;
	private int e; 
	private int f;
	
	//Constructor for a,b,c,d,e,f
	LinearEquation(int a, int b, int c, int d, int e, int f) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
	}
	
	//Getter for all letters
	int getA() {
		return a;
	}
	int getB() {
		return b;
	}
	int getC() {
		return c;
	}
	int getD() {
		return d;
	}
	int getE() {
		return e;
	}
	int getF() {
		return f;
	}
	
	//Putting (a*d)-(b*c) in a method to not have to repeat
	int adMinusbc() {
		return (a * d) - (b * c);
	}
	
	//Boolean to see if equation can be solved
	boolean isSolvable() {
		return adMinusbc() != 0;
	}
	
	//Return solutions
	int getX() {
		return ((e * d) - (b * f)) / adMinusbc();
	}
	int getY() {
		return ((a * f) - (e * c)) / adMinusbc();
	}
}
