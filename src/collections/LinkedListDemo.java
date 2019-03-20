package collections;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
		ll.add(100);
		ll.add(200);
		ll.add(300);
		ll.add(400);
		ll.addFirst(10);
		ll.addLast(20);
		
		ll.removeLast();
		
		System.out.println(ll.size());
		for (Object object : ll) {
			System.out.println(object);
		}
		
		LinkedList ll1 = new LinkedList();
		System.out.println(ll1.peek());
		
		/*
		 * ll.remove(ll.get(2)); System.out.println("after removing");
		 * System.out.println(ll.size()); for (Object object : ll) {
		 * System.out.println(object); }
		 */
		
		
	}

}
