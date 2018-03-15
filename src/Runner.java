

public class Runner {

	static PersonClass peeps[]; 
	
	public static void main(String args[]) {
		PersonClass p1 = new PersonClass("Godwin", 22, "IT Technician");
		PersonClass p2 = new PersonClass("Abdi", 22, "IT Technician");
		PersonClass p3 = new PersonClass("Julian", 28, "Chef");

		peeps = new PersonClass[3];
		peeps[0] = p1;
		peeps[1] = p2;
		peeps[2] = p3;
		

		for (int i = 0; i < peeps.length; i++) {
			System.out.println(peeps[i]);
		}
		
		System.out.println(search("Julian"));
	}
	
	public static boolean search(String name) {
		for(PersonClass peep : peeps) {
			if(peep.toString().contains("Name: " + name)) {
				return true;
			}
		}
		return false;
	}
}
