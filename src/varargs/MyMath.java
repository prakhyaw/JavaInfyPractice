package varargs;

public class MyMath {
	
	public double mean(int... x) {
		double sum = 0; 
		for(int i = 0; i < x.length; i++)
		{
			sum = sum + x[i];
		}
		double mean = sum/x.length;
		return mean;
	}
	
	public double deviation(int... x) {
		double sum = 0;
		double mean = mean(x);
		for(int i = 0; i < x.length; i++)
		{
			sum = sum + (x[i]-mean)*(x[i]-mean);
		}
		double stdeviation = Math.sqrt(sum/x.length);
		System.out.println(stdeviation);
		return stdeviation;
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyMath mm = new MyMath();
		mm.deviation(2, 4, 5, 7, 6);
	}

}
