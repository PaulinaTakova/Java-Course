
public class Assistant extends Lecturer {
	
	private boolean chiefAssistant;

	public Assistant() {
		
	}

	public Assistant(String name, String lastName, int yearsService, String nameOfUniversity, int MAX_LECTURS_FOR_WEEK, boolean chiefAssistant) {
		super(name, lastName, yearsService, nameOfUniversity, MAX_LECTURS_FOR_WEEK);
		this.chiefAssistant = chiefAssistant;
	}

	public boolean isChiefAssistant() {
		return chiefAssistant;
	}

	public void setChiefAssistant(boolean chiefAssistant) {
		this.chiefAssistant = chiefAssistant;
	}
	
	public void sayNameAndChiefAssistant(){
		System.out.println("The name of assistant: " + getName()+" " + getLastName()+" The assistant is chief: " + isChiefAssistant());
	}
	
	public void writeScientificArticle(){
		System.out.println("Assistent is writing scientific articles.");
	}
	
	@Override
	public void checkHomework() {
		System.out.println("Assistant is checking homeworks.");
		
	}
	
	public void checkExam(){
		System.out.println("Assistant is checking exams.");
	}

}
