import java.util.Scanner;

public class AmountOfInt {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first nubmer:");
		int a = sc.nextInt();
		System.out.println("Enter the second number:");
		int b = sc.nextInt();
		System.out.println("Enter the third number:");
		int c = sc.nextInt();
		System.out.println("Enter the fourth number:");
		int d = sc.nextInt();
		
		System.out.println("The amount of the four number is: " + (a+b+c+d));
	}

}
