package xavier;
import java.util.Scanner;

public class LongestWords {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input sentence
	        System.out.println("Enter a sentence:");
	        String sentence = scanner.nextLine();

	        // Split the sentence into words
	        String[] words = sentence.split("\\s+");

	        // Initialize variables to store the longest word and its length
	        String longestWord = "";
	        int maxLength = 0;

	        // Iterate through the words to find the longest one
	        for (String word : words) {
	            // Remove any punctuation marks
	            word = word.replaceAll("[^a-zA-Z]", "");

	            // Check if the current word is longer than the previous longest word
	            if (word.length() > maxLength) {
	                maxLength = word.length();
	                longestWord = word;
	            }
	        }

	        // Output the longest word
	        System.out.println("The longest word is: " + longestWord);
	        System.out.println("Length of the longest word is: " + maxLength);

	        scanner.close();
	    
	    }            

}
