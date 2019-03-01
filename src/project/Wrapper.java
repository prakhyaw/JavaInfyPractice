package project;

public class Wrapper {

	public static void main(String[] args) {
		
		String x = "100";
		System.out.println(x+20);
		
		int i = Integer.parseInt(x);		
		System.out.println(i+20);
		
		String y = "12.33";
		double d = Double.parseDouble(y);
		System.out.println(d+10);
		
		int j = (int)Double.parseDouble(y);
		System.out.println(j);
	}

}
