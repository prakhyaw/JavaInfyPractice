package project;

public class LuckyNumber {

	public static void main(String[] args) {
		
		int num = 1234567890;
		String[] num1 = Integer.toString(num).split("");
		//String num1 = Integer.toString(num);
		int sum = 0;
		for(int i = 1; i < num1.length; i = i+2)
		{
			//output.push(+sNumber.charAt(i));
			System.out.println(num1[i]);
			int a = Integer.parseInt(num1[i]);
			sum = sum +(a*a);
		}
		System.out.println(sum);
	}
}
