package xavier;
import java.util.*;
public class ReverseSentence {


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Accept the sentence
	        System.out.print("Enter a sentence: ");
	        String sentence = scanner.nextLine();

	        // Reverse the sentence
	        String reversedSentence = reverseSentence(sentence);

	        // Output the reversed sentence
	        System.out.println("Reversed sentence: " + reversedSentence);

	        scanner.close();
	    }

	    public static String reverseSentence(String sentence) {
	        // Split the sentence into words
	        String[] words = sentence.split("\\s+");
	        StringBuilder reversedSentence = new StringBuilder();

	        // Start building the reversed sentence by iterating through words in reverse order
	        for (int i = words.length - 1; i >= 0; i--) {
	            // Append each word followed by a space
	            reversedSentence.append(words[i]).append(" ");
	        }

	        // Remove the trailing space and return the reversed sentence
	        return reversedSentence.toString().trim();
	    }
	}
