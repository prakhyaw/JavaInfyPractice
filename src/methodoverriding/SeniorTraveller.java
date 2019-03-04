package methodoverriding;

public class SeniorTraveller extends Traveller{
	
	int age;

	public SeniorTraveller(String name, String id, int age) {
		super(name, id);
		this.name = name;
		this.id = id;
		this.age = age;
		
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void calculateFare() {
		double baseFare = 2000;
		double serviceTax = 11.36;
		double discount;
		
		if(50 <= age && age <= 65)
			{
				discount = 10;
			}
		else
			{
				discount = 15;
			}
		double discountedBaseFare = baseFare - (baseFare*discount/100);
		fare = discountedBaseFare + discountedBaseFare*serviceTax/100;
		
		if(age < 50)
		{
			fare = -1;
		}
		
		System.out.println(fare);
		
	}
	
	@Override
	public void displayDetails() {
		if(age < 50)
		{
			System.out.println("Sorry "+name+",age should be 50 or more to avail senior traveller's concession");
		}
		else
		{
			calculateFare();
			System.out.println("Traveller Details");
			System.out.println("********************");
			System.out.println("Traveller name: "+name);
			System.out.println("Traveller id: "+id);
			System.out.println("Cost of travel: "+fare);
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
