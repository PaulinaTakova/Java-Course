import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number you want to divide:");
		int num = sc.nextInt();
		
		boolean result = num % 35 == 0;
		System.out.println("The result is: " + result);
		

	}

}
