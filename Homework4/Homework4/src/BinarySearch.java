import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		
		int[] arr = {15, 6, 17, 20, 3, 8, 9, 16, 4};
		int low = 0;
		int high = arr.length;
		int middle = (low + high)/2;
		
		Arrays.sort(arr);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number you want to found:");
		int key = sc.nextInt();
		
		while(arr[middle]!=key){
			if(arr[middle] > key){
				middle = (low + middle)/2;
			}else if(arr[middle] < key){
				middle = (middle+high)/2;
			}
		}
		System.out.println("The number is at index: " + middle);
		
		sc.close();
	}

}
