package exceptionpractice;

public class Employee {
	
	String name;
	double monthlySalary;
	Integer age;
	
	public double calculateYearlySalary() {
		double yearlySalary = 0;
		if(age > 18 && age <= 50)
		{
			yearlySalary = (monthlySalary + 0.08*monthlySalary)*12;
			System.out.println(yearlySalary);
		}
		if(age > 50 && age < 60)
		{
			yearlySalary = (monthlySalary + 0.09*monthlySalary)*12;
			System.out.println(yearlySalary);
		}
		return yearlySalary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMonthlySalary() {
		return monthlySalary;
	}
	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}

}
