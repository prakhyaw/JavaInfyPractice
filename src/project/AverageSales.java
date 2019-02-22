package project;

public class AverageSales {

	public static void main(String[] args) {
		
		int sum = 0; 
		int count = 0;
		int[] sales = {6,9,7,10,11,9,7,12,14,15,13,11};
		
		for(int i = 0; i < sales.length; i++)
		{
			sum = sum + sales[i];
		}
		
		System.out.println(sum);
		float average = (float)sum / sales.length;
		System.out.println(average);
		for (int i : sales) {
			if(i > average)
			{
				count++;
				break;
			}			
		}
		System.out.println("No of months more than average: "+count);
		
	}

}
