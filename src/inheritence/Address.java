package inheritence;

public class Address {
	
	String firstLine;
	String secondLine;
	String city;
	String state;
	int pinCode;
	
	public Address(String firstLine,String secondLine,String city,String state,int pinCode) {
		this.firstLine = firstLine;
		this.secondLine = secondLine;
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
	}

	public String getFirstLine() {
		return firstLine;
	}

	public String getSecondLine() {
		return secondLine;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public int getPinCode() {
		return pinCode;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
