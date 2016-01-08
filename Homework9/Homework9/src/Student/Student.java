package Student;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {
	
	private String name;
	private String lastName;
	private int number;
	private static HashMap<String, ArrayList<Double>> subject = new HashMap<String, ArrayList<Double>>();
	
	public Student() {
		super();
	}

	public Student(String name, String lastName, int number, HashMap<String, ArrayList<Double>> subject) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.number = number;
		Student.subject = subject;
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

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public HashMap<String, ArrayList<Double>> getSubject() {
		return subject;
	}

	public void setSubject(HashMap<String, ArrayList<Double>> subject) {
		Student.subject = subject;
	}
	
	public void addSubjectMark(String sub, double mark){
		if(subject.containsKey(sub)){
			subject.get(sub).add(mark);
		}
	}
	
	public static double calculateAverageMark(String sub){
		int count = 0;
		double sum = 0;
		double average = 0;
		ArrayList<Double> grades = subject.get(sub);
		
		if(subject.containsKey(sub)){
			while(count != grades.size()) {
				sum += grades.get(count);
				count++;
			}
			average = sum / grades.size();
		}
		
		return average;
	}
	
	public String toString(){
		return this.name + " " + this.lastName + " " + this.number + " " + Student.subject;
	}

}
