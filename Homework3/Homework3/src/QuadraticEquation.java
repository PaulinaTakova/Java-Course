import java.util.Scanner;

public class QuadraticEquation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the coefficient a:");
		int a = sc.nextInt();
		System.out.println("Enter the coefficient b:");
		int b = sc.nextInt();
		System.out.println("Enter the coefficient c:");
		int c = sc.nextInt();
		
		double D = Math.sqrt((b*b)-(4*a*c));
		
		if(D > 0){
			double x1 =(-b + D)/2*a;
			double x2 = (-b - D)/2*a;
			System.out.println("x1 = " + x1 +" "+ "x2 = "+ x2);
		}else if(D == 0){
			double x1 = (-b)/2*a;
			System.out.println("x1 = x2 = " + x1);
		}else{
			System.out.println("No real roots.");
		}
		
		sc.close();
	}

}
