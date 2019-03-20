package exceptionassignment;

public class Tester {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		String a = "b", b = "c";
		Customer customer1 = new Customer();
		customer1.customerId = 1001;
		customer1.name = "John";
		
		SavingsAccount sa1 = new SavingsAccount(101, 500, 12, customer1, 1000);
		sa1.withdraw(1600);

		Customer customer2 = new Customer();
		customer2.customerId = 1002;
		customer2.name = "Jenny";
		
		CurrentAccount ca1 = new CurrentAccount(customer2, 500, 102, 2000);
		ca1.deposit(1500);
		System.out.println(customer2.name+"and"+ca1.balance);
		ca1.withdraw(4000);
		System.out.println(ca1.balance);
		ca1.withdraw(1500);
	}

}