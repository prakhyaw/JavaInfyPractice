package collections;

import java.util.ArrayList;

public class Fibonacci {

	public static void main(String[] args) {
		
		int s[] = new int[10];
		s[0] = 0;
		s[1] = 1;
		for(int i = 2; i < s.length; i++)
		{
			s[i] = s[i-1]+s[i-2];
		}
		
		for (int i : s) {
			System.out.println(i);
		}
		

	}

}
