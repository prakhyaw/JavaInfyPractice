package exceptionassignment;

public abstract class Account {
	
	int accountNo;
	Customer customer;
	double balance;
	
	public void deposit(double amount) {
		balance = balance + amount;
	}
	
	abstract void withdraw(double amount) throws Exception;

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}