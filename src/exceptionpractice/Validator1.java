package exceptionpractice;

public class Validator1 {
	
	class InvalidNameException extends Exception{
		public InvalidNameException(String name) {
			System.out.println("Invalid name");
		}
	}
	
	class InvalidAgeException extends Exception{
		public InvalidAgeException(int age) {
			System.out.println("Invalid age exception");
		}
	}	
	class InvalidPostException extends Exception{
		public InvalidPostException(String post) {
			System.out.println("Invalid post");
		}
	}
	
	public void validate(Applicant applicant) throws InvalidNameException, InvalidAgeException, InvalidPostException {
		if(isValidName(applicant.applicantName) == false)
		{
			throw new InvalidNameException(applicant.applicantName);
		}
		else if(isValidAge(applicant.applicantAge) == false)
		{
			throw new InvalidAgeException(applicant.applicantAge);
		}
		
		else if(isValidPost(applicant.postApplied) == false)
		{
			throw new InvalidPostException(applicant.postApplied);
		}
		
		else
			System.out.println("All the values are valid");
		
	}
	
	public boolean isValidName(String name) {
		if(name != null && !name.isEmpty())
		{
			return true;
		}
		else
			return false;
	}
	
	public boolean isValidPost(String post) {
		if(post == "Probationary Officer" || post == "Assistant" || post == "Special Cadre Officer")
		{
			return true;
		}
		else
			return false;
	}
	
	public boolean isValidAge(int age) {
		if(age > 18 && age < 35)
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
