package epaywallet;

public class TesterClass {

	public static void main(String[] args) {
		
		User user = new User(101, "Jack", "jack@infy.com", 1000);
		User kycuser = new KYCUser(201, "Jill", "jill@infy.com", 3000);
		EPayWallet e = new EPayWallet();
		e.processPaymentByUser(user, 700);
		e.processPaymentByUser(kycuser, 1500);
		e.processPaymentByUser(kycuser, 800);
		e.processPaymentByUser(kycuser, 1200);
	}

}
