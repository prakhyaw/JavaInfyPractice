package project;

public class CallByValueAndReference {

	public static void main(String[] args) {
		CallByValueAndReference obj = new CallByValueAndReference();
		obj.test(10, 20);
	}
	
	public int test(int a, int b) {
		int c = a + b;
		return c;
		
	}

}
