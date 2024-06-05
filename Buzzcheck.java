package xavier;
import java.util.Scanner;
public class Buzzcheck {


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number to check if it's a buzz number: ");
	        int number = scanner.nextInt();

	        if (isBuzzNumber(number)) {
	            System.out.println(number + " is a buzz number.");
	        } else {
	            System.out.println(number + " is not a buzz number.");
	        }

	        scanner.close();
	    }

	    // Function to check if a number is a buzz number
	    public static boolean isBuzzNumber(int number) {
	        // Check if the number ends with 7 and is divisible by 7
	        return number % 10 == 7 && number % 7 == 0;
	    }
	}



