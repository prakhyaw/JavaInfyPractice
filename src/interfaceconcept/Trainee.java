package interfaceconcept;

public class Trainee implements Student {
	
	int marksSecured;

	public Trainee(int marksSecured) {
		this.marksSecured = marksSecured;
	}
	
	public void calcPercentage() {
		if(marksSecured < TOTAL_MAXIMUM_MARKS)
		{
			double percentage = ((double)marksSecured*100/TOTAL_MAXIMUM_MARKS);
			System.out.println("The total aggregate percentage secured by the trainee is "+percentage);
		}
		else
		{
			System.out.println("Please enter the correct marks");
		}
	}
	
	public int getMarksSecured() {
		return marksSecured;
	}

	public void setMarksSecured(int marksSecured) {
		this.marksSecured = marksSecured;
	}

	public static void main(String[] args) {
		

	}

}
