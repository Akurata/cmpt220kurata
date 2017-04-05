
public class Calculator {

	Calculator() {
		
	}
	Calculator(String[] args) {
		
			
		//The result of the operation
		int result = 0;
			
			try {
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
			}catch (NumberFormatException e) {
				System.out.println("Wrong Input: " + e);
				
		}	
	}
	
}

