package association;

public class InterestCalculator {
	
	int timeInYears;
	float rateOfInterest;
	
	public InterestCalculator(int timeInYears, float rateOfInterest) {
		this.timeInYears = timeInYears;
		this.rateOfInterest = rateOfInterest;
	}
	
	public float calculateInterest(float principal) {
		float simpleInterest = (principal*rateOfInterest*timeInYears)/100;
		return simpleInterest;
	}

	public int getTimeInYears() {
		return timeInYears;
	}

	public void setTimeInYears(int timeInYears) {
		this.timeInYears = timeInYears;
	}

	public float getRateOfInterest() {
		return rateOfInterest;
	}

	public void setRateOfInterest(float rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
