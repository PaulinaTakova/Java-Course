package Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		HashMap<String, Student> students = new HashMap<>();
		Scanner input = new Scanner(System.in);
		
		for (int i = 1; i <= 3 ; i++) {
			Student st = new Student();
			System.out.printf("First name:");
			String name = input.next();
			st.setName(name);
			System.out.print("Last name: ");
			String lastName = input.next();
			st.setLastName(lastName);
			System.out.print("Number: ");
			int number = input.nextInt();
			st.setNumber(number);
			
			HashMap<String, ArrayList<Double>> marksOnSubj = new HashMap<String, ArrayList<Double>>();
			
			for (int j = 1; j<= 5; j++) {
				ArrayList<Double> grades = new ArrayList<Double>();
				System.out.println("Enter name of subject");
				String subj = input.next();
				System.out.print("Enter three grades: ");
				double first = input.nextDouble();
				grades.add(first);
				double second = input.nextDouble();
				grades.add(second);
				double third = input.nextDouble();
				grades.add(third);
				marksOnSubj.put(subj, grades);
				st.setSubject(marksOnSubj);
				
			}
			students.put(name, st);
		
		}
		
		System.out.println(students);
		System.out.println("Calculate average mark on subject:");
		System.out.print("Enter the first name of a student: ");
		String name = input.next();
		System.out.println("Enter subject:");
		String sub = input.next();
		if (students.containsKey(name)) {
			System.out.printf("The average mark of %s on %s is: %f \n", name, sub,
					Student.calculateAverageMark(sub));
		}
		
		System.out.println("Add mark on subject:");
		System.out.print("Enter the first name of a student: ");
		String name1 = input.next();
		System.out.println("Enter subject:");
		String subject1 = input.next();
		if (students.containsKey(name1)) {
			System.out.print("Enter the mark: ");
			double mark = input.nextDouble();
			Student newSt = students.get(name1);
			newSt.addSubjectMark(subject1, mark);
		}
		System.out.println(students);
		input.close();
	}
		
	

}
