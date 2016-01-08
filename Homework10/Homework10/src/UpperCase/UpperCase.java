package UpperCase;

import java.util.Scanner;

public class UpperCase {

	public static void main(String[] args) {
		
		System.out.println("Enter a word: ");
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		System.out.println("Enter a sentence: ");
		String sentence = sc.nextLine();
		
		String upper = word.toUpperCase();
		
		String newSen = sentence.replace(word, upper);
		
		System.out.println(newSen);
		
		sc.close();

	}

}
