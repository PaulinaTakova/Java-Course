
public class Professor extends Lecturer {
	
	private String title;

	public Professor() {
		
	}

	public Professor(String name, String lastName, int yearsService, String nameOfUniversity, int MAX_LECTURS_FOR_WEEK, String title) {
		super(name, lastName, yearsService, nameOfUniversity, MAX_LECTURS_FOR_WEEK);
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public void sayTitleAndYaersService(){
		System.out.println("The title of professor is: " + getTitle() + " Years service: " + getYearsService());
	}
	
	@Override
	public void checkHomework() {
		System.out.println("Professor is checking homeworks.");
		
	}
	
	public void conductExam(){
		System.out.println("Professor is conducting exam.");
	}

}