package collections;

import java.util.ArrayList;

public class Student {
	
	int rollNo;
	String name;
	int age;
	
	Student(int rollNo, String name,int age)
	{
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) {
		Student s1 = new Student(101,"A", 20);
		Student s2 = new Student(102,"B", 21);
		Student s3 = new Student(103,"C", 22);
		
		ArrayList<Student> ar = new ArrayList<Student>();
		ar.add(s1);
		ar.add(s2);
		ar.add(s3);
		for (Student student : ar) {
			System.out.println(student.age);
		}
	}

}
