package project;

public class LocalGlobal {
	
	String name = "ABC"; //global variables
	int age = 25;

	public static void main(String[] args) {
		
		int i = 10; //local variable
		LocalGlobal obj = new LocalGlobal();
		System.out.println(obj.age);
		obj.sum();
		}
	
	public void sum() {
		int i = 5;
		int a = 20;
		int b = 30;
		System.out.println(age);
		System.out.println(i);
	}

}
