package entities;

public class Account {
	
	//Attributes
	private int number;
	private String holder;
	private double balance;
	private final int TAX = 5;
	
	//default constructor
	public Account() {
			
	}
		
	//constructor with parameter
	public Account(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}

	//constructor without balance
	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	//Getters and sets
	public int getNumber() {
		return number;
	}
	
	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		this.balance += amount;
	}
	
	public void withdraw(double amount) {
		this.balance -= amount + TAX;
	}

	@Override
	public String toString() {
		return "Account "+ number 
				+ ", Holder: "+ holder
				+ ", balance: $ "+ String.format("%.2f", balance);
	}
}
