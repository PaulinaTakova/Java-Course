import java.util.Arrays;

public class BucketSort {

	public static void main(String[] args) {
		int max = 12;
		int[] arr = {9, 12, 4, 0, 2, 8, 3, 5, 1};
		
		System.out.println("The array befor sort: " + Arrays.toString(arr));
		sort(arr, max);
		System.out.println("The array after sort: " + Arrays.toString(arr));
	}
	
	public static void sort (int[] arr, int max){
		
		int[] bucket = new int[max+1];
		int position = 0;
		
		for (int i = 0; i < bucket.length; i++) {
			bucket[i] = 0;
		}
		
		for (int i = 0; i < arr.length; i++) {
			bucket[arr[i]]++;
		}
		
		for (int i = 0; i < bucket.length; i++) {
			for (int j = 0; j < bucket[i]; j++) {
				arr[position++] = i;
			}
		}
		
	}

}
