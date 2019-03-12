package exceptionpractice;

import org.junit.Test;

import exceptionpractice.Validator.InvalidAgeException;
import exceptionpractice.Validator.InvalidNameException;

public class EmployeeTest {
	
	Employee e = new Employee();
	Validator v = new Validator();
	
	@Test
	public void calculateYearlySalaryValidTest() {
		e.monthlySalary = 15000;
		e.age = 53;
		e.calculateYearlySalary();
	}
	
	@Test
	public void validateInvalidNametest() throws InvalidNameException, InvalidAgeException {
		e.name = "John";
		e.age = 38;
		e.monthlySalary = 20000;
		try
		{
			v.validate(e);
		}
		catch (Exception e) {
			e.getMessage();
		}
	}
	
	@Test
	public void validateInvalidAgeTest() throws InvalidNameException, InvalidAgeException
	{
		e.name = "Yuvraj Singh";
		e.age = 12;
		e.monthlySalary = 20000;
		try
		{
			v.validate(e);
		}
		catch (Exception e) {
			e.getMessage();
		}
	}
	
	@Test
	public void isValidNameInvalidNametest() {
		if(v.isValidName("John"))
		{
			System.out.println("true");
		}
		else
			System.out.println("false");
	}

}
