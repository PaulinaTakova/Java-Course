import java.util.Scanner;

public class TheBiggestNum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int max = 0;
		int min = 1000;
		
		for(int i = 0; i<5; i++){
			System.out.println("Enter a number:");
			int a = sc.nextInt();
			if(a > max){
				 max = a;
			}
			if(a < min ){
				min = a;
			}
		}
		
		System.out.println("The biggest number is: " + max);
		System.out.println("The smallest number is: " + min);
		sc.close();
	}

}
