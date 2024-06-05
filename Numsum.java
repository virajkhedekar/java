package xavier;
import java.util.Scanner;
public class Numsum {


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        int twoDigitSum = 0;
	        int threeDigitSum = 0;

	        System.out.println("Enter 10 integers:");

	        for (int i = 0; i < 10; i++) {
	            int num = scanner.nextInt();
	            if (num >= 10 && num <= 99) {
	                twoDigitSum += num;
	            } else if (num >= 100 && num <= 999) {
	                threeDigitSum += num;
	            }
	        }

	        System.out.println("Sum of two-digit numbers: " + twoDigitSum);
	        System.out.println("Sum of three-digit numbers: " + threeDigitSum);

	        scanner.close();
	    }
	

}
