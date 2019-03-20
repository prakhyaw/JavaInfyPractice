package exceptionassignment;

public class SavingsAccount extends Account{
	
	double minimumBalance = 500;
	int interestRate = 12;
	
	public SavingsAccount(int accountNo, double minimumBalance,int interestRate,Customer customer,double balance ) {
		//super();
		this.accountNo = accountNo;
		this.minimumBalance = minimumBalance;
		this.interestRate = interestRate;
		this.customer = customer;
		this.balance = balance;		
	}
	
	public void withdraw(double amount) throws Exception {
		double remainingBalance = balance - amount;
		try{
			if(remainingBalance > minimumBalance)
		
		{
			balance = balance - amount;
		}
		else
			throw new Exception("INSUFFICIENT_BALANCE");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public double calculateInterest() {
		double interest = (interestRate*balance)/100;
		return interest;
	}
	
	
	

	public double getMinimumBalance() {
		return minimumBalance;
	}

	public void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}

	public int getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(int interestRate) {
		this.interestRate = interestRate;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}