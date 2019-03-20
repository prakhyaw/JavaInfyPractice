package stringspractice;

public class Capitalize {

	public static void main(String[] args) {
		String s = "this is javatpoint";
		System.out.println(s.toUpperCase());
		
		String[] a = s.split(" ");
		String s1 = a[0];
		String s2 = a[1];
		String s3 = a[2];
		s1 = s1.substring(0, 1).toUpperCase() + s1.substring(1);
		s2 = s2.substring(0, 1).toUpperCase() + s2.substring(1);
		s3 = s3.substring(0, 1).toUpperCase() + s3.substring(1);
		System.out.println(s1 + s2 + s3);

	}

}
