
public class Lecturer extends Person {
	
	private String nameOfUniversity;
	private final int MAX_LECTURS_FOR_WEEK = 10;
	
	public Lecturer() {
		
	}

	public Lecturer(String name, String lastName, int yearsService, String nameOfUniversity, int MAX_LECTURS_FOR_WEEK) {
		super(name, lastName, yearsService);
		this.nameOfUniversity = nameOfUniversity;
	}

	public String getNameOfUniversity() {
		return nameOfUniversity;
	}

	public void setNameOfUniversity(String nameOfUniversity) {
		this.nameOfUniversity = nameOfUniversity;
	}

	public int getMAX_LECTURS_FOR_WEEK() {
		return MAX_LECTURS_FOR_WEEK;
	}

	@Override
	public void checkHomework() {
		System.out.println("Lecturer is checking homeworks.");
		
	}

	@Override
	public void sayGoodMorning() {
		System.out.println("Lecturer say good morning!");
		
	}
	
	public void conductExercises(){
		System.out.println("Lecturer is conducting exercise.");
	}
	
	public void conductExercises(int num){
		System.out.println("Lecturer is conducting exercise. The number of exercise: " + num);
	}
	
	public void conductExercises(int num, int hour){
		System.out.println("Lecturer is conducting exercise. The number of exercise: " + num + " Time for the exercise: " + hour);
	}

}
