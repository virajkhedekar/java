package xavier;
import java.util.Scanner;
public class RemoveVowels {


	    public static void main(String[] args) {
	        // Create a Scanner object to read input
	        Scanner scanner = new Scanner(System.in);

	        // Prompt the user to enter a string
	        System.out.print("Enter a word or a string: ");
	        String input = scanner.nextLine();

	        // Remove vowels from the input string
	        String result = removeVowels(input);

	        // Display the new string after removing vowels
	        System.out.println("String after removing vowels: " + result);

	        // Close the scanner
	        scanner.close();
	    }

	    // Function to remove vowels from a string
	    public static String removeVowels(String str) {
	        // Define a string containing all vowels
	        String vowels = "aeiouAEIOU";

	        // Create a StringBuilder object to store the result
	        StringBuilder result = new StringBuilder();

	        // Iterate through each character of the input string
	        for (int i = 0; i < str.length(); i++) {
	            // Check if the current character is not a vowel
	            if (vowels.indexOf(str.charAt(i)) == -1) {
	                // Append the non-vowel character to the result
	                result.append(str.charAt(i));
	            }
	        }

	        // Convert StringBuilder to String and return
	        return result.toString();
	    }
	

}
