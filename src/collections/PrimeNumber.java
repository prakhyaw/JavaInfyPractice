package collections;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int n = 11;
		boolean flag = true;
		int m = n/2;
		
		if(n == 0 || n == 1)
		{
			System.out.println(n+ " is not a prime number");
		}
		else
		{
			for(int i = 2; i< m; i++)
			{
				if(n%i == 0)
				{
					System.out.println(n+ " is not a prime number");
					flag = false;
					break;
				}
			
			}
		}
		if(flag == true)
			System.out.println(n+ " is a prime number");

	}

}
