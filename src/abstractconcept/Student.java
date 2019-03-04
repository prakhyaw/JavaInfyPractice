package abstractconcept;

import java.util.List;

public abstract class Student {
	
	String name;
	int[] test;
	String result;
	
	public Student(String name) {
		this.name = name;
	}
	
	abstract void generateResult();
	
	public void setTestScore(int testNumber, int testScore) {
		
		for(int i = 0; i < 4; i++)
		{
			i = testNumber;
			test[i] = testScore;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[] getTest() {
		return test;
	}

	public void setTest(int[] test) {
		this.test = test;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public static void main(String[] args) {		

	}

}
