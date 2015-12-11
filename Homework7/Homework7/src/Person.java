
public abstract class Person {
	
	private String name;
	private String lastName;
	private int yearsService;
	
	private static int count = 0;
	
	public Person(){
		
	}
	
	public Person(String name, String lastName, int yearsService) {
		this.name = name;
		this.lastName = lastName;
		this.yearsService = yearsService;
		count++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getYearsService() {
		return yearsService;
	}

	public void setYearsService(int yearsService) {
		if(yearsService > 0){
		this.yearsService = yearsService;
		}
	}
	
	public abstract void checkHomework();
	
	public abstract void sayGoodMorning();

	public static int getCount() {
		return count;
	}


}
