
public class Policeman extends Employee {
	
	private String rank;

	public Policeman(int workHoursPerMonth, int salary, String rank) {
		super(workHoursPerMonth, salary);
		this.rank = rank;
	
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}
	
	public void printPoliceman(){
		System.out.println("Work hours for month: " + getWorkHoursPerMonth() + " Salary: " + getSalary() + " Rank: " + getRank());
	}

}
