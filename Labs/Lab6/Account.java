
import java.util.Date;


public class Account {
	
	private int id = 0; //Id
	private double balance = 0; //Current balance 
	private double  annualInterestRate = 0; //Stores current interest rate
	private static Date dateCreated = new Date();
	
	//No arg, creates account
	Account() {
	}
	//Constructor to create account with specific balance
	Account(int id,double balance) {
		this.id = id;
		this.balance = balance;
	}
	
	//Mutator methods
	void setId(int newId) { //Setting new ID
		id = newId;
	}
	void setBalance(double newBalance) { //Setting new balance
		balance = newBalance;
	}
	void setAnnualInterestRate(double newAnnual) { //Setting new annual interest rate
		annualInterestRate = newAnnual;
	}
	
	//Accessor methods
	int getId() { //get id
		return id;
	}
	double getBalance() {
		return balance;
	}
	double annualInterestRate() {
		return annualInterestRate;
	}
	
	//Accessor for date created
	public static Date dateCreated() {
		return dateCreated;	
	}
	
	//Getting monthly interest rate (annual/12)
	public double getMonthlyInterest() {
		return annualInterestRate / 12;
	}
	
	//Withdraw__Balance-Amount
	public void withdraw(double amount) {
		balance = balance - amount; 
	}
	//Deposit__Balance+Amount
	public void deposit(double amount) {
		balance = balance + amount;
	}
	
}
