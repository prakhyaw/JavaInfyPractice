package collections;

public class BubbleSort {

	public static void main(String[] args) {
		
		int a[] = {18,9,33,4,84,32};
		int temp = 0;
		
		for(int i = 0; i<a.length; i++)
		{
			for(int j = 1; j < a.length- i; j++)
			if(a[j-1] > a[j])
			{
				temp = a[j-1];
				a[j-1] = a[j];
				a[j] = temp;
			}
		}
		 for(int i=0; i < a.length; i++){  
             System.out.print(a[i] + " ");  
     }

	}

}
