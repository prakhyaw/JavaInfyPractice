package epaywallet;

public class User {
	
	int id;
	String username;
	String email;
	double walletBalance;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getWalletBalance() {
		return walletBalance;
	}

	public void setWalletBalance(double walletBalance) {
		this.walletBalance = walletBalance;
	}

	public User(int id, String username, String email, double walletBalance) {
		this.id = id;
		this.username = username;
		this.email = email;
		this.walletBalance = walletBalance;
	}
	
	public boolean makePayment(double billAmount) {
		boolean paymentStatus;
		if(billAmount > walletBalance)
		{
			paymentStatus =  false;
			return paymentStatus;
		}
		else
		{
			walletBalance = walletBalance - billAmount;
			paymentStatus =  true;
			return paymentStatus;			
		}
	}

	public static void main(String[] args) {
		

	}

}
