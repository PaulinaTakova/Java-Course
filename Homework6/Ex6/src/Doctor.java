
public class Doctor extends Employee {
	
	private int dailyDuty;
	private int nightDuty;

	public Doctor(int workHoursPerMonth, int salary, int dailyDuty, int nightDuty) {
		super(workHoursPerMonth, salary);
		this.dailyDuty = dailyDuty;
		this.nightDuty = nightDuty;
	}

	public int getDailyDuty() {
		return dailyDuty;
	}

	public void setDailyDuty(int dailyDuty) {
		this.dailyDuty = dailyDuty;
	}

	public int getNightDuty() {
		return nightDuty;
	}

	public void setNightDuty(int nightDuty) {
		this.nightDuty = nightDuty;
	}
	
	public void printDoctor(){
		System.out.println("Work hours for month: " + getWorkHoursPerMonth() + " Salary: " + getSalary() + " Daily duty: " + getDailyDuty() + " Night duty: " + getNightDuty());
	}

}
