package stringspractice;

public class ReverseEachWord {

	public static void main(String[] args) {
		String s = "this is javatpoint";
		String a[] = s.split(" ");
		
		StringBuilder s1 = new StringBuilder(a[0]);
		s1.reverse();
		
		StringBuilder s2 = new StringBuilder(a[1]);
		s2.reverse();
		
		StringBuilder s3 = new StringBuilder(a[2]);
		s3.reverse();
		
		System.out.println(s1 + " "+s2+" "+s3);
		

	}

}
