
public class ex9_7 {
	
	 public static void main(String[] args) {

        Account account = new Account(1122, 20000);
        account.setAnnualInterestRate(4.5);
        
        account.withdraw(2500);
        account.deposit(3000);
        
        System.out.println("Balance: " + account.getBalance()); //Print Balance 
        System.out.println("Monthly Interest: " + account.getMonthlyInterest()); //Print monthly interest
        System.out.println("Date Account Created: " + account.dateCreated()); //Print date created
    }
}
