package association;

public class FDAccount {
	
	int accountId;
	float balance;
	
	public FDAccount(int accountId, float balance) {
		this.accountId = accountId;
		this.balance = balance;
	}
	
	public void updateBalance(InterestCalculator interestCalc) {
		balance = balance + interestCalc.calculateInterest(balance);
		System.out.println("Updated balance : "+balance);
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public static void main(String[] args) {
		
	}

}
