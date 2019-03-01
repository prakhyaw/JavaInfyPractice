package inheritence;

public class PermanentEmployee extends Employee{

	double basicPay;
	double hra;
	int experience;
	
	public PermanentEmployee(int empId, String name, double basicPay, double hra, int experience) {
		super();
		this.basicPay = basicPay;
		this.hra = hra;
		this.experience = experience;
	}
	
	public void calculateSalary() {
		int percentageOfBasicPay;
		double variableComponent;
		if(experience < 3)
		{
			percentageOfBasicPay = 0;
		}
		else if(experience >= 3 && experience < 5)
		{
			percentageOfBasicPay = 5;			
		}
		else if(experience >= 5 && experience < 10)
		{
			percentageOfBasicPay = 7;			
		}
		else
		{
			percentageOfBasicPay = 12;			
		}
		
		variableComponent = basicPay*percentageOfBasicPay/100;
		salary = variableComponent + basicPay + hra;
		System.out.println(salary);
	}
	
	public double getBasicPay() {
		return basicPay;
	}

	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}

	public double getHra() {
		return hra;
	}

	public void setHra(double hra) {
		this.hra = hra;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
