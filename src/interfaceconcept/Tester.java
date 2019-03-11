package interfaceconcept;

/*public class Tester {

	public static void main(String[] args) {
		
		Intern i = new Intern(283, 87);
		i.calcPercentage();
		
		Trainee t = new Trainee(370);
		t.calcPercentage();
		
		Trainee t1 = new Trainee(410);
				t1.calcPercentage();

	}

}*/

public class Tester {
    public static void main(String[] args) {
        displayRegistration("Hockey");              // Line 1
        displayRegistration("Kho-Kho",1,2,3);  
    }
    
    public static void displayRegistration(String nameOfSport, int... ids) {
        System.out.print("Registration for " + nameOfSport + ": ");
        for(int i=0; i<ids.length; i++) {
            System.out.print(ids[i] + " ");
        }
        System.out.println();
    }
}
