import java.util.Scanner;

public class SymmetricArray {

	public static void main(String[] args) {
		int[] arr = new int[10];
		boolean a = false;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 10 numbers for array:");
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < arr.length/2; i++) {
			if(arr[i] == arr[arr.length-1-i]){
				 a = true;
			}else if(arr[i] != arr[arr.length-1-i]){
				 a = false;
			}
			
		}
		System.out.println(a);
		sc.close();
	}

}
