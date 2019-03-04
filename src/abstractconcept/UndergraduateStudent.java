package abstractconcept;

public class UndergraduateStudent extends Student{
		
	public UndergraduateStudent(String name) {
		super(name);
		this.name = name;
	}


	public void generateResult() {
			
		int avgmarks = 0;
			if(avgmarks >= 60)
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
