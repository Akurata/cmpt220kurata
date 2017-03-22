
public class MyInteger {
	int value = 0; //Int data field	
	public MyInteger(int value) { //Constructor for int value
		this.value = value;
	}
	
	public int getInt() { //Getter for int values
		return value;
	}
	
	//Boolean methods
	public boolean isEven() {
		return value % 2 == 0; //Check if Even
	}
	public boolean isOdd() {
		return value % 2 != 0; //Check if not even
	}
	public boolean isPrime() {
		if (value == 2 || value % 2 == 1) { //Check to see if number is 2 or if k % 2 == 1
			return true;
		}else { //If it's neither of these conditions, the number is not prime
			return false;
		}
	}
	
	//Static Boolean methods
	public boolean isEven(int value) {
		return value % 2 == 0;
	}
	public boolean isOdd(int value) {
		return value % 2 != 0;
	}
	public boolean isPrime(int value) {
		if (value == 2 || value % 2 == 1) { 
			return true;
		}else {
			return false;
		}
	}
	
	//Additional static methods
	public static boolean isEven(MyInteger number) {
		return number.isEven();
	}
	public static boolean isOdd(MyInteger number) {
		return number.isOdd();
	}
	public static boolean isPrime(MyInteger number) {
		return number.isPrime();
	}
	
	//Equals methods
	public boolean equals(int value) { //Check if overall value == the value of this method
		return this.value == value;
	}
	public boolean equals(MyInteger value) {
		return this.value == value.value;
	}
	
	//Convert char array to int array
	public static int parseInt(char[] n) {
		int numbers = 0;
		for (int i = 0; i < n.length; i++) {
			numbers += n[i]; //Add the value of the char to a new variable
		}
		return numbers;
	}
	//Convert string to an int value
	public static int parseInt(String s) {
		return parseInt(s.toCharArray());
		
	}
}

