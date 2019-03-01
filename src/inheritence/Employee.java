package inheritence;

public class Employee {
	
	int empId;
	String name;
	double salary;	

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	public double getSalary() {
		return salary;
	}



	public void setSalary(double salary) {
		this.salary = salary;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PermanentEmployee pe = new PermanentEmployee(101, "Anil", 10000, 1500, 3);
		pe.calculateSalary();
		
		ContractEmployee ce = new ContractEmployee(102, "Ankit", 500, 10);
		ce.calculateSalary();
	}

}
