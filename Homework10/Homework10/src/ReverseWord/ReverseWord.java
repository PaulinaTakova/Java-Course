package ReverseWord;

import java.util.Scanner;

public class ReverseWord {

	public static void main(String[] args) {
		
		System.out.println("Enter a word: ");
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		
		for (int i = word.length()-1; i >= 0; i--) {
			System.out.print(word.charAt(i));
		}
		
		sc.close();
	}

}
