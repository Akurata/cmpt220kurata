



public class CalculatorB {
	CalculatorB() {
			
	}
	CalculatorB(String[] args) {	
		
		if(!isNumeric(args[0])) {
			System.out.println("Error \""+args[0]+"\" is not numeric.");
			System.exit(0);
		}
		if(!isNumeric(args[2])) {
			System.out.println("Error \""+args[2]+"\" is not numeric.");
			System.exit(0);
		}
	
		//The result of the operation
		int result = 0;
				//Determine the operator
			switch (args[1].charAt(0)) {
				case '+': result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
					break;
				case '-': result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
					break;
				case '*': result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
					break;
				case '/': result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]);
			}
				
		//Display Result
		System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + " = " + result);
		
	}
	public boolean isNumeric(String s) {  
	    return s.matches("[-+]?\\d*\\.?\\d+");  
	}  
}
