public class PersonClass {

	public int age;
	public String name;
	public String job;

	public PersonClass(String name, int age, String job) {
		this.age = age;
		this.name = name;
		this.job = job;
	}

	public String toString() {
		return "Name: " + name + "  Age: " + age + "  Job: " + job;
	}

	
	}

