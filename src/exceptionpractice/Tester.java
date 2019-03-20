package exceptionpractice;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Tester {
	
	final static Logger logger = Logger.getLogger(Tester.class);

	class OutOfStockException extends Exception {
		public OutOfStockException(String name) {
			System.out.println(name);
		}
	}
	public static void main(String[] args) throws OutOfStockException  {
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
		PropertyConfigurator.configure("log4j.properties");
		Product p = new Product(1, "T-Shirt", 3);
		String name = p.getProductName();
		for(int i = 0; i <= 3; i++)
		{
			p.orderProduct(p);
			System.out.println(p.getStock());
			if(p.getStock() == 1)
			{
				logger.info("Only 1 "+name+" left");
			}
			if(p.getStock() < 1)
			{
				logger.info(p.getProductName()+" out of stock.");
				//throw new OutOfStockException(name);			
			}
			
		}
		
	}

}
