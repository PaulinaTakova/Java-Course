import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		
		int[] arr = {9, 12, 4, 0, 2, 8, 3, 5, 1};
		int low = 0;
		int high = arr.length-1;
		
		System.out.println("The array befor sort: " + Arrays.toString(arr));
		quickSort(arr, low, high);
		System.out.println("The array after sort: " + Arrays.toString(arr));

	}

	private static void quickSort(int[] arr, int low, int high) {
		
		int middle = low + (high - low)/2;
		int pivot = arr[middle];
		
		int i = low; 
		int j = high;
		while (i <= j) {
			while (arr[i] < pivot) {
				i++;
			}
 
			while (arr[j] > pivot) {
				j--;
			}
 
			if (i <= j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
		
		if (low < j)
			quickSort(arr, low, j);
 
		if (high > i)
			quickSort(arr, i, high);
		
	}

}
