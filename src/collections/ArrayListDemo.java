package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
	
		ArrayList ar = new ArrayList(2);
		ar.add("one");
		ar.add("two");
		ar.add("three");
		ar.add("four");
		
		System.out.println(ar.size());
		
		//ar.remove(0);
		//System.out.println(ar.size());
		//System.out.println(ar.get(0));
		
		//ar.add("two");
		
	//	System.out.println(ar.indexOf("two"));
		
	/*	ArrayList ar1  = new ArrayList();
		ar1.add("one");
		ar1.add("two");
		ar1.add("three");
		ar1.add("four");*/
		
	//	System.out.println(ar.lastIndexOf("two"));
	//	ar.sort(null);
		//ar.trimToSize();
		ar.add("five");
		
		Iterator itr = ar.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		for (Object object : ar) {
			System.out.println(object);
		}
		
		
			
		
	}

}
