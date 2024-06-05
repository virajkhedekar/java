package xavier;


import java.util.Arrays;
import java.util.Scanner;

public class StringArraySorter {


	    public static void main(String[] args) {
	        // Create a Scanner object to read input
	        Scanner scanner = new Scanner(System.in);

	        // Prompt the user to enter the number of strings
	        System.out.print("Enter the number of strings: ");
	        int numStrings = scanner.nextInt();
	        scanner.nextLine(); // Consume newline

	        // Create an array to store the strings
	        String[] stringArray = new String[numStrings];

	        // Prompt the user to enter the strings
	        System.out.println("Enter the strings:");
	        for (int i = 0; i < numStrings; i++) {
	            stringArray[i] = scanner.nextLine();
	        }

	        // Sort the array in ascending order
	        Arrays.sort(stringArray);

	        // Print the sorted array
	        System.out.println("Sorted array:");
	        for (String str : stringArray) {
	            System.out.println(str);
	        }

	        // Close the scanner
	        scanner.close();
	    }
	}
