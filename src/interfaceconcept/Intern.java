package interfaceconcept;

public class Intern implements Student{
	
	int marksSecured;
	int projectMarks;
	
	public Intern(int marksSecured, int projectMarks) {
		this.marksSecured = marksSecured;
		this.projectMarks = projectMarks;
	}
	
	public void calcPercentage() {
		int totalMarks = marksSecured + projectMarks;
		if(totalMarks < TOTAL_MAXIMUM_MARKS)
		{
			float percentage = ((float)totalMarks*100/TOTAL_MAXIMUM_MARKS);
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

	public int getProjectMarks() {
		return projectMarks;
	}

	public void setProjectMarks(int projectMarks) {
		this.projectMarks = projectMarks;
	}

	public static void main(String[] args) {
	

	}

}
