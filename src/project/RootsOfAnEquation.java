package project;

public class RootsOfAnEquation {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 4;
		int c = 6;
		
		int discriminant = (b*b)-(4*a*c);
		
		if(discriminant == 0)
		{
			System.out.println("Both the roots are same. The root is -2.0");
		}
		else if(discriminant > 0)
		{
			System.out.println("two unequal real roots. The roots are -2.0 and -0.5");
		}
		else
		{
			System.out.println("the equation does not have real roots");
		}
		

	}

}
