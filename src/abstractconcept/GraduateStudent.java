package abstractconcept;

public class GraduateStudent extends Student{
		
	public GraduateStudent(String name) {
		super(name);
		this.name = name;
	}


	public void generateResult() {
		int avgmarks = 0;
		
		if(avgmarks >= 70)
		{
			result = "Pass";
		}
		else
		{
			result = "Fail";
		}
			
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
