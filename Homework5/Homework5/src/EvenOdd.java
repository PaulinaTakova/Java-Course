import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		
		evenOrOdd(num);
		
		sc.close();

	}
	
	public static void evenOrOdd(int a){
		
		if(a%2 == 0){
			System.out.println("The number is even.");
		}else{
			System.out.println("The number is odd.");
		}
	}

}
