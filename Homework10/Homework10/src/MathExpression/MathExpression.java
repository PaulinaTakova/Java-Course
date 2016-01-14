package MathExpression;

import java.util.Scanner;

public class MathExpression {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a math expression:");
		String exp = sc.nextLine();
		int counter = 0;
		
		for (int i = 0; i < exp.length(); i++) {
			Character ch = exp.charAt(i);
			
			if(ch.equals('(')){
				counter++;
			} else if(ch.equals(')')){
				counter--;
			} 
			
		}
		
		if(counter == 0){
			System.out.println("The expression is correct.");
		} else if(counter < 0){
			System.out.println("The expression is wrong.");
			System.exit(0);
		}
		
		sc.close();

	}

}
