import java.util.Scanner;

public class Factorial2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter N:");
		int n = sc.nextInt();
		System.out.println("Enter K:");
		int k = sc.nextInt();
		int factorial = 1;
		int factorial2 = 1;
		int factorial3 = 1;

		for (int i = 1; i <= n; i++) {
			factorial *= i;
		}
		for (int j = 1; j <= k; j++) {
			factorial2 *= j;
		}
		for(int m = 1; m<=(n-k); m++){
			factorial3 *= m;
		}
		
		int result = (factorial*factorial2)/factorial3;
		System.out.println("The result of N!*K!/(N-K)!: " + result);
		
		sc.close();
	}

}
