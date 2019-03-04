package methodoverriding;

public class Traveller {
	
	String name;
	String id;
	double fare;
	
	public Traveller(String name, String id) {
		this.id = id;
		this.name = name;
	}
	
	public void calculateFare() {
		double baseFare = 2000;
		double serviceTax = 11.36;
		fare = baseFare + baseFare*serviceTax/100;
		System.out.println(fare);
	}
	
	public void displayDetails() {
		calculateFare();
		System.out.println("Traveller Details");
		System.out.println("********************");
		System.out.println("Traveller name: "+name);
		System.out.println("Traveller id: "+id);
		System.out.println("Cost of travel: "+fare);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getFare() {
		return fare;
	}

	public void setFare(double fare) {
		this.fare = fare;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
