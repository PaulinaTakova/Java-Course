
public class SchoolTeacher extends Teacher {
	
	private String[] listOfClass = new String[5];

	public SchoolTeacher() {
		
	}
		

	public SchoolTeacher(String name, String lastName, int yearsService, String subject, String[] listOfClass) {
		super(name, lastName, yearsService, subject);
		this.listOfClass = listOfClass;
	}

	public String[] getListOfClass() {
		return listOfClass;
	}


	public void setListOfClass(String[] listOfClass) {
		this.listOfClass = listOfClass;
	}
	
	public void nameOfClasses(){
		System.out.println("The classes of school teacher are: " + getListOfClass());
	}
	
	public void entertainChildren(){
		System.out.println("School teacher is entertaining children.");
	}
	
	

}
