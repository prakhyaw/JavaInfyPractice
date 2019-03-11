package abstractconcept;
interface A {
	void eval(int x);
}

class B implements A {
	public void eval(int x) {
		if(x==0) throw new RuntimeException();
		System.out.println("Evaluating...");
	}
}

public class Tester {
    public static void main(String[] args) {
    	B obj = new B();
    	obj.eval(0);
	}
}
