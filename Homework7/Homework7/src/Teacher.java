
public class Teacher extends Person {
	
	private String subject;
	
	public Teacher(){
		
	}

	public Teacher(String name, String lastName, int yearsService, String subject) {
		super(name, lastName, yearsService);
		this.subject = subject;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public void checkHomework() {
		System.out.println("Teacher is checking homeworks.");
		
	}

	@Override
	public void sayGoodMorning() {
		System.out.println("Teacher say good morning!");
		
	}
	
	public void sayGoodbye(){
		System.out.println("Teacher say googbye!");
	}

}
