package exceptionpractice;

import exceptionpractice.Validator1.InvalidAgeException;
import exceptionpractice.Validator1.InvalidNameException;
import exceptionpractice.Validator1.InvalidPostException;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Applicant app = new Applicant();
		app.applicantName = "XYZ";
		app.applicantAge = 2;
		app.postApplied = "Assistant";
		
		Validator1 v = new Validator1();
		try {
			v.validate(app);
		} catch (InvalidNameException | InvalidAgeException | InvalidPostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Employee e = new Employee();
		e.monthlySalary = 15000;
		e.age = 53;
		e.calculateYearlySalary();
		
		Validator v = new Validator();
		v.v*/
		
		Product p = new Product(1, "T-Shirt", 3);
		p.orderProduct(p);

	}

}
