import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first side:");
		int a = sc.nextInt();
		System.out.println("Enter the second side:");
		int b = sc.nextInt();
		System.out.println("Enter the third side:");
		int c = sc.nextInt();
		
		if( c < (a+b) && b < (a+c) && a < (b+c)){
			System.out.println("Possible.");
		}else{
			System.out.println("Impossible.");
		}
		
		sc.close();
	}

}
