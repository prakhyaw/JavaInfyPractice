package project;

public class CourseRegistration {
	
	String studentName;
	static int registrationId = 5000;
	float qualifyingMarks;
	double courseFee;
	int courseId;
	boolean hostelRequired;
	
	public boolean validateMarks() {
		boolean qualified; 
		if(qualifyingMarks >= 65 && qualifyingMarks <= 100) {
			 qualified = true;
			// System.out.println("Student is qualified for admission");
			 validateCourseId();
		 }
		else
		{
			qualified = false;
			System.out.println("Marks is less than "+(int)qualifyingMarks+". You are not eligible for admission");
		}
		return qualified;
	}
	
	public boolean validateCourseId() {
		boolean validCourseId;
		if(courseId >= 1001 && courseId <= 1005)
		{
			validCourseId = true;
			//System.out.println("Valid course id");
			calculateCourseFee();
		}
		else
		{
			validCourseId = false;
			System.out.println("Invalid course ID. Please try again");
		}
		return validCourseId;
	}
	
	public void calculateCourseFee() {
		int discount;
		if(qualifyingMarks >= 65 && qualifyingMarks <= 69) {
			discount = 5;
		}
		else if(qualifyingMarks >= 70 && qualifyingMarks <= 84)
		{
			discount = 10;
		}
		else discount = 15;
		
		switch(courseId)
		{
		case 1001: courseFee = 55000;
		break;
		
		case 1002: courseFee = 35675;
		break;
		
		case 1003: courseFee = 28300;
		break;
		
		case 1004: courseFee = 22350;
		break;
		
		case 1005: courseFee = 115000;
		break;
		}
		
		double totalCourseFee = courseFee - (courseFee*discount/100);
		registrationId++;
		System.out.println("Student Name : "+studentName);
		System.out.println("Course ID : "+courseId);
		System.out.println("Qualifying Exam marks : "+qualifyingMarks);
		System.out.println("Student's Registration ID : "+registrationId);
		System.out.println("Total Course Fee : "+totalCourseFee);
		System.out.println("Hostel Required :"+hostelRequired);
	}

	
	
	public String getStudentName() {
		return studentName;
	}



	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}



	public int getRegistrationId() {
		return registrationId;
	}



	public void setRegistrationId(int registrationId) {
		this.registrationId = registrationId;
	}



	public float getQualifyingMarks() {
		return qualifyingMarks;
	}



	public void setQualifyingMarks(float qualifyingMarks) {
		this.qualifyingMarks = qualifyingMarks;
	}



	public double getCourseFee() {
		return courseFee;
	}



	public void setCourseFee(double courseFee) {
		this.courseFee = courseFee;
	}



	public int getCourseId() {
		return courseId;
	}



	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}



	public boolean isHostelRequired() {
		return hostelRequired;
	}



	public void setHostelRequired(boolean hostelRequired) {
		this.hostelRequired = hostelRequired;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CourseRegistration obj = new CourseRegistration();
		obj.studentName = "Peter";
		obj.qualifyingMarks = 80;
		obj.courseId = 1005;
		obj.hostelRequired = false;
		obj.validateMarks();
		
		CourseRegistration obj1 = new CourseRegistration();
		obj1.studentName = "Peter";
		obj1.qualifyingMarks = 80;
		obj1.courseId = 1005;
		obj1.hostelRequired = false;
		obj1.validateMarks();
	}

}
