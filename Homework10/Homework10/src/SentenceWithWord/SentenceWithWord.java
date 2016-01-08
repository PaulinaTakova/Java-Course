package SentenceWithWord;

import java.util.Scanner;

public class SentenceWithWord {

	public static void main(String[] args) {
		
		System.out.println("Enter a text:");
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		System.out.println("Enter a word:");
		String word = sc.nextLine();
		
		String[] sentence = text.split(".");
		
		for (int i = 0; i < sentence.length; i++) {
			if(sentence[i].contains(word)){
				System.out.print(sentence[i]);
			}
			
		}
		
		sc.close();

	}

}
