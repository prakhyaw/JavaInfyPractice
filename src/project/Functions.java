package project;

public class Functions {

	public static void main(String[] args) {
		
			Functions test1 = new Functions();
			test1.test2();
		
		}
	
	public static void test1() {
		System.out.println("1");
	}
	
	public int test2() {
		test1();
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println(c);
		test3(c);
		return c;
	}
	
	public void test3(int c) {
		int d = 40;
		int e = c+d;
		System.out.println(e);
	}

}
