package xavier;
import java.util.Scanner;
public class WordCounts {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Accept the word and the sentence
	        System.out.print("Enter a word: ");
	        String word = scanner.nextLine().toUpperCase(); // Convert to uppercase for case-insensitive comparison
	        System.out.print("Enter a sentence: ");
	        String sentence = scanner.nextLine().toUpperCase(); // Convert to uppercase for case-insensitive comparison

	        // Find the number of times the word appears in the sentence
	        int count = countOccurrences(word, sentence);
	        System.out.println("Number of times '" + word + "' is present in the sentence: " + count);

	        scanner.close();
	    }

	    public static int countOccurrences(String word, String sentence) {
	        int count = 0;
	        int index = sentence.indexOf(word); // Find the first occurrence of the word in the sentence

	        // If the word is found, keep searching for further occurrences until none are found
	        while (index != -1) {
	            count++;
	            // Move the index to the next position after the last occurrence
	            index = sentence.indexOf(word, index + 1);
	        }

	        return count;
	    }
	}


