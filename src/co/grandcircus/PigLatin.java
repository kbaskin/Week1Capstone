package co.grandcircus;

import java.util.Scanner;

public class PigLatin {
	public static void main(String[] args) {

		// task - translate from English to Pig Latin
		// ex. hello world = ellohay orldway

		// extended challenge - keep case of the word, whether upper case, title case or
		// lower case
		// allow punctuation in the input string
		// translate words with contractions ex. can't become an'tcay
		// *****don't translate words with numbers or symbols
		// check that user has actually entered text before translating
		// take in a line, instead of a single word and find the pig latin for each word
		// in the line

		System.out.println("Welcome to the Pig Latin Translator!");
		System.out.println();

		Scanner scan = new Scanner(System.in);
		String userInput;
		String cont = "";
		String[] words;

		do {
			System.out.println("Enter a line to be translated: "); // prompt user for a word
			userInput = scan.nextLine(); // .toLowerCase();
			words = userInput.split(" ");
			
			
			for (String word : words) { // word : words
				if (word.startsWith("a") || word.startsWith("e") || word.startsWith("i") || word.startsWith("o")
						|| word.startsWith("u")) {
					// if (isVowel(userInput.charAt(0))) {
					System.out.print(word + "way "); // if word starts with a vowel, just add "way" onto the ending
				} else {
					System.out.print(word.substring(1) + word.substring(0, 1) + "ay ");
					// if word starts with consonant, move all of the consonants that appear
					// before the first vowel to the end of the word, then add "ay" to the end of
					// the word (y is a consonant)
				}
			}

			System.out.println("\nTranslate another line? (y/n): "); // asks user if he or she wants to translate
																		// another word - loop
			cont = scan.nextLine();

		} while ((cont.equalsIgnoreCase("y")) || (cont.equalsIgnoreCase("yes")));

		System.out.println("I hope you had some fun!");
		scan.close();
	}

//	private static boolean isVowel(char v) {
//		return v == 'a' || v == 'e' || v == 'i' || v == 'o' || v == 'u';
//	}
//
//	private static int findFirstVowel(String str) {
//		for (int i = 0; i < str.length(); i++) {
//			if (isVowel(str.charAt(i))) {
//				return i;
//			}
//		}
//		return -1;
//	}


}

