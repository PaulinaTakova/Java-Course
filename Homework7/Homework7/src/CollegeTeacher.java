
public class CollegeTeacher extends Teacher {
	
	private String infoAboutCollege;

	public CollegeTeacher() {
		
	}

	public CollegeTeacher(String name, String lastName, int yearsService, String subject, String infoAboutCollege) {
		super(name, lastName, yearsService, subject);
		this.infoAboutCollege = infoAboutCollege;
	}

	public String getInfoAboutCollege() {
		return infoAboutCollege;
	}

	public void setInfoAboutCollege(String infoAboutCollege) {
		this.infoAboutCollege = infoAboutCollege;
	}

}
