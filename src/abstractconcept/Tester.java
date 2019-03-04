package abstractconcept;

public class Tester {

	public static void main(String[] args) {
		
			GraduateStudent gs = new GraduateStudent("Ajay");
			gs.setTestScore(0, 70);
			gs.setTestScore(1, 69);
			gs.setTestScore(2, 71);
			gs.setTestScore(3, 55);
			gs.generateResult();
			System.out.println("Name  :"+gs.name);
			System.out.println("Result  :"+gs.result);
			
			UndergraduateStudent ugs = new UndergraduateStudent("Mehul");
			ugs.setTestScore(0, 70);
			ugs.setTestScore(1, 69);
			ugs.setTestScore(2, 71);
			ugs.setTestScore(3, 55);
			ugs.generateResult();
			System.out.println("Name  :"+ugs.name);
			System.out.println("Result  :"+ugs.result);
	}

}
