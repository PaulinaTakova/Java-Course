package Student;

public class Student {
	
	private String name;
	private String lastName;
	private int facNumber;
	private int group;
	
	public Student() {
		super();
	}

	public Student(String name, String lastName, int facNumber, int group) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.facNumber = facNumber;
		this.group = group;
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

	public int getFacNumber() {
		return facNumber;
	}

	public void setFacNumber(int facNumber) {
		this.facNumber = facNumber;
	}

	public int getGroup() {
		return group;
	}

	public void setGroup(int group) {
		this.group = group;
	}
	
	@Override
	public String toString(){
		return String.format("%s %s %d %d", this.name, this.lastName, this.facNumber, this.group);
	}

}
