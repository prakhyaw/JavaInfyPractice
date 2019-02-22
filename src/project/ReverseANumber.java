package project;

public class ReverseANumber {

	public static void main(String[] args) {
		
		int num = 999999998;
		int revnum = 0;
		
		do
		{
			revnum = revnum*10;
			revnum = revnum + num%10;
			num/=10;			
		} while (num != 0);
		
		System.out.println(revnum);
		
		for(; num!=0; num /=10 )
		{
			revnum = revnum*10;
			revnum = revnum + num%10;
		}
		System.out.println(revnum);
	}

}
