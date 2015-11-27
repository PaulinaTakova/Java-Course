import java.util.Scanner;

public class Pow {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		System.out.println("Enter the pow:");
		int m = sc.nextInt();
		int c = 1;
		
		for(int i = 0; i < m; i++){
			c*=n;
		}
		System.out.println("The result is: " + c);
		
		sc.close();
	}

}
