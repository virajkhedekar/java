package xavier;
import java.util.Scanner;
public class Initials {



	    public static void main(String[] args) {
	        // Create a Scanner object to read input
	        Scanner scanner = new Scanner(System.in);

	        // Prompt the user to enter a name containing three words
	        System.out.print("Enter a name containing three words: ");
	        String name = scanner.nextLine();

	        // Display only the initials of the name
	        String initials = getInitials(name);
	        System.out.println("Initials: " + initials);

	        // Close the scanner
	        scanner.close();
	    }

	    // Function to get initials from a name containing three words
	    public static String getInitials(String name) {
	        // Split the name into words using whitespace as delimiter
	        String[] words = name.split("\\s+");

	        // Create a StringBuilder object to store the initials
	        StringBuilder initials = new StringBuilder();

	        // Iterate through each word and append its first letter to initials
	        for (String word : words) {
	            if (!word.isEmpty()) {
	                initials.append(word.charAt(0));
	            }
	        }

	        // Convert StringBuilder to String and return
	        return initials.toString();
	    }
	

}
