package methodoverriding;

public class TesterClass {

	public static void main(String[] args) {
		
		Traveller t = new Traveller("Priya", "AQW1344321");
		SeniorTraveller st = new SeniorTraveller("Joey", "PJAMG7755TY", 70);
		Traveller st1 = new SeniorTraveller("Raj", "PJAMG7755TY", 45);
		t.displayDetails();
		st.displayDetails();
		st1.displayDetails();

	}

}
