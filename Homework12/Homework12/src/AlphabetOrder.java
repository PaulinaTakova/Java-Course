import java.util.Arrays;
import java.util.Scanner;

public class AlphabetOrder {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String sentence = sc.nextLine();
		
		String[] word = sentence.split(" ");
		
		Arrays.sort(word);
		System.out.println("Sorted words:" + Arrays.toString(word));
		
		sc.close();

	}

}
