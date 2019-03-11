package project;

import java.util.HashSet;
import java.util.Set;

class Sample{  
	
	public static void main(String[] args) 
    {
    Set s = new HashSet();
    s.add(new Long(10));
    s.add(new Integer(10));
    for(Object object : s)
            {
        System.out.println("test - "+object);
    }
}
} 