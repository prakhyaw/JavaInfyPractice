package exceptionpractice;

public class Validator {
	class InvalidNameException extends Exception{
		public InvalidNameException(String name) {
			System.out.println("Invalid employee name");
		}
	}
	
	class InvalidAgeException extends Exception{
		public InvalidAgeException(int age) {
			System.out.println("Invalid employee age");
		}
	}	
	
	public void validate(Employee employee) throws InvalidNameException, InvalidAgeException
	{
		if(isValidName(employee.name) == false)
		{
			throw new InvalidNameException(employee.name);
		}
		else if(isValidAge(employee.age) == false)
		{
			throw new InvalidAgeException(employee.age);
		}
		else
			System.out.println("All the values are valid.");
	}
	
	public boolean isValidName(String name) {
		if(name.length() > 8)
		{
			return true;
		}
		else
			return false;
	}
	
	public boolean isValidAge(int age) {
		if(age > 18 && age < 60)
		{
			return true;
		}
		else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
