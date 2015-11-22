import java.util.Scanner;

public class TriangleFace {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the side of the triangle:");
		int a = sc.nextInt();
		System.out.println("Enter the height of the triangle:");
		int b = sc.nextInt();
		
		System.out.println("The face of the triangle is: " + (a*b)/2);
	}

}
