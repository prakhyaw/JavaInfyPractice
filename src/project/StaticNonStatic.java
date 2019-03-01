package project;

import java.awt.SecondaryLoop;

public class StaticNonStatic {
	
	String name = "ABC"; //non static global variable
	static int age = 25; //static global variable

	public static void main(String[] args) {
		
		sum();
		System.out.println(age);
		StaticNonStatic obj = new StaticNonStatic();
		System.out.println(obj.name);
		obj.sum();
		System.out.println(obj.age);
		StaticNonStatic.sum();

	}
	
	public void sendMail() {
		System.out.println("Send Mail");
		System.out.println(name);
		System.out.println(age);
		sum();
	}
	
	public static void sum() {
		System.out.println("Sum method");
		StaticNonStatic obj = new StaticNonStatic();
		obj.sendMail();
	}

}
