package exceptionpractice;

public class Validator {
	
	public void validate(Applicant applicant) {
		try
		{
			isValidName(applicant.applicantName);
			throw new InvalidNameException();
			isValidAge(applicant.applicantAge);
			isValidPost(applicant.postApplied);
		}
		catch(InvalidNameException e)
		{
			System.out.println("Invalid applicant name");
		}
		catch(InvalidPostException e)
		{
			System.out.println("Invalid post");
		}
		catch(InvalidAgeException e)
		{
			System.out.println("Invalid age exception");
		}
		
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
