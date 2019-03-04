package epaywallet;

public class KYCUser extends User{	
	
	int rewardPoints;
	
	public int getRewardPoints() {
		return rewardPoints;
	}

	public void setRewardPoints(int rewardPoints) {
		this.rewardPoints = rewardPoints;
	}

	public KYCUser(int id, String username, String email, double walletBalance) {
		super(id, username, email, walletBalance);
		this.id = id;
		this.username = username;
		this.email = email;
		this.walletBalance = walletBalance;
	}
	
	@Override
	public boolean makePayment(double billAmount) {
		boolean paymentStatus;
		if(super.makePayment(billAmount))
		{
			rewardPoints = (int) (rewardPoints + (10*billAmount/100));
			paymentStatus = true;
			return paymentStatus;
		}
		else
		{
			paymentStatus = false;
			return paymentStatus;
		}
	}

	public static void main(String[] args) {
		
		

	}

}
