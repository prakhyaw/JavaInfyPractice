package epaywallet;
import epaywallet.KYCUser;

public class EPayWallet {

	public static void processPaymentByUser(User user, double billAmount) {
		if(user instanceof KYCUser)
			{
				KYCUser kyc = (KYCUser)user;
				if(kyc.makePayment(billAmount) == true)
				{
					System.out.println("Congratulations "+kyc.username+", payment of "+billAmount+" was successful");
					System.out.println("Your wallet balance is "+kyc.walletBalance);
					System.out.println("You have "+kyc.rewardPoints+" reward points");
					System.out.println("----------------------------------------------------");
				}			
				else
				{
					System.out.println("Sorry "+kyc.username+", not enough balance to make payment");
					System.out.println("Your wallet balance is "+kyc.walletBalance);
					System.out.println("You have "+kyc.rewardPoints+" reward points");
					System.out.println("----------------------------------------------------");
				}
			}
	      
		
		else
		{
			if(user.makePayment(billAmount) == true)
			{
				System.out.println("Congratulations "+user.username+", payment of "+billAmount+" was successful");
				System.out.println("Your wallet balance is "+user.walletBalance);
				System.out.println("----------------------------------------------------");
			}			
			else
			{
				System.out.println("Sorry "+user.username+", not enough balance to make payment");
				System.out.println("Your wallet balance is "+user.walletBalance);
				System.out.println("----------------------------------------------------");
			}
		}	
	}
	
	public static void main(String[] args) {
		

	}

}
