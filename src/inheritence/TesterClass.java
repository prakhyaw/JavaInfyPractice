package inheritence;

import association.FDAccount;
import association.InterestCalculator;

public class TesterClass {

	public static void main(String[] args) {
		
		FDAccount acc = new FDAccount(1010, 50000);
		InterestCalculator fdic = new InterestCalculator(1, 8.4f);
		acc.updateBalance(fdic);
	}

}
