package stringspractice;

public class PalindromeString {

	public static void main(String[] args) {
		
		String s = "jatin";
		String t = "";
		char ch[] = s.toCharArray();
		int l = s.length();
		for(int i = l-1; i >= 0; i--)
		{
			t = t+ch[i];
		}
		if(s.equalsIgnoreCase(t))
		{
			System.out.println(true);
		}
		else
			System.out.println(false);
	}

}
