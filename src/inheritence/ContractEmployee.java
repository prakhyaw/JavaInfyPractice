package inheritence;

public class ContractEmployee extends Employee{
	
	double wage;
	int hours;
	
	public ContractEmployee(int empId, String name, double wage, int hours) {
		super();
		this.wage = wage;
		this.hours = hours;
	}
	
	public void calculateSalary() {
		salary = hours*wage;
		System.out.println(salary);
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
