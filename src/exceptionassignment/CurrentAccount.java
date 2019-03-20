package exceptionassignment;

public class CurrentAccount extends Account{
	
	int overdraftAmount;
	
	public CurrentAccount(Customer customer,int overdraftAmount, int accountNo, double balance) {
		this.customer = customer;
		this.overdraftAmount = overdraftAmount;
		this.accountNo = accountNo;		
		this.balance = balance;		
	}
	
	public void withdraw(double amount) throws Exception {
		double currentAccountBalance = overdraftAmount + balance;
		double remainingBalance = currentAccountBalance - amount;
		if(remainingBalance >= 0)
		{
			balance = balance - amount;
		}
		else
			throw new Exception("INSUFFICIENT_BALANCE");
	}
	
	

	public int getOverdraftAmount() {
		return overdraftAmount;
	}

	public void setOverdraftAmount(int overdraftAmount) {
		this.overdraftAmount = overdraftAmount;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}