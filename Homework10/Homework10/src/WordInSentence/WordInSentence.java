package WordInSentence;

import java.util.Scanner;

public class WordInSentence {

	public static void main(String[] args) {
		
		System.out.println("Enter a sentence:");
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();
		System.out.println("Enter a word:");
		String word = sc.nextLine();
		
		String[] words = sentence.split(" ");
		
		int count = 0;
		for (int i = 0; i < words.length; i++) {
			if(words[i].equals(word)){
				count++;
			}
		}
		
		System.out.printf("Word %s in sentence: %d times.", word, count);
		
		sc.close();

	}

}
