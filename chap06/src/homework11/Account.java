package homework11;

public class Account {
	String accountNumber;
	int balance;
	
	public Account() {
		
	}

	public Account(String accountNumber, int balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void deposit(int amount) {
		this.balance += amount;
	}
	
	public void withdraw(int amount) {
		this.balance -= amount;
	}
	
}
