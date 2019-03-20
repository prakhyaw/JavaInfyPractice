package collections;

public class ThirdLargestNumber {

	public static void main(String[] args) {
		
		int a[] = {1,2,5,6,7,2};
		int temp = 0;
		for(int i = 0; i < a.length; i++)
		{
			for(int j = 1; j < a.length - i; j++)
			{
				if(a[j-1] > a[j])
				{
					temp = a[j];
					a[j] = a[j-1];
					a[j-1] = temp;
				}
			}
		}
		
		for (int i : a) {
			System.out.println(i);
		}
		
		int[] temp1 = new int[a.length];  
        int j = 0;  
        for (int i=0; i<a.length-1; i++){  
            if (a[i] != a[i+1]){  
                temp1[j++] = a[i];  
            }  
         }  
        temp1[j++] = a[a.length-1];     
        // Changing original array  
        for (int i=0; i<j; i++){  
            a[i] = temp1[i];  
        }
        
        for (int i=0; i<a.length; i++)  
            System.out.print(a[i]+" ");
			
	}

}
