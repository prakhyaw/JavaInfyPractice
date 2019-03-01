package inheritence;

public class RRAccount {
	
	String customerName;
	Address address;
	double depositAmount;
	
	public RRAccount(String customerName, Address address, double depositAmount) {
		this.customerName = customerName;
		this.address = address;
		this.depositAmount = depositAmount;
		if(isValidAddress())
			{
				System.out.println("        Customer Details              ");
				System.out.println("***************************************");
				System.out.println("Customer Name	: "+customerName);
				System.out.println("Address  	:"+address.firstLine+", "+address.secondLine+","+address.city+","+address.state+","+address.pinCode);
				System.out.println("Deposit Amount	: "+depositAmount);
				System.out.println("Congratulations!! Your account has been created");
			}
	}
	
	public boolean isValidAddress() {
		boolean validpinCode;
		String pincode = Integer.toString(address.pinCode);
		if(pincode.length() == 6 )
		{
			validpinCode = true;
		}
		else
		{
			validpinCode = false;
			System.out.println("The pincode entered by you is invalid");
		}
		return validpinCode;
	}
	

	public String getCustomerName() {
		return customerName;
	}

	public Address getAddress() {
		return address;
	}

	public double getDepositAmount() {
		return depositAmount;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address add = new Address("No. 123", "9th cross Trinetra circle", "Mysuru", "Karnataka", 570017);
		RRAccount rr = new RRAccount("Rakesh", add , 50000.0);
	}

}
