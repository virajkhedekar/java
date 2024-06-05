package xavier;
import java.util.Scanner;
public class SecondHighest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create an array of the specified size
        int[] array = new int[size];

        // Take input for the array elements from the user
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Find the second highest value in the array
        int secondHighest = findSecondHighest(array);

        // Print the second highest value
        System.out.println("The second highest value in the array is: " + secondHighest);

        scanner.close();
    }

    public static int findSecondHighest(int[] array) {
        if (array.length < 2) {
            System.out.println("Array should contain at least two elements.");
            return Integer.MIN_VALUE;
        }

        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int num : array) {
            if (num > highest) {
                secondHighest = highest;
                highest = num;
            } else if (num > secondHighest && num != highest) {
                secondHighest = num;
            }
        }

        if (secondHighest == Integer.MIN_VALUE) {
            System.out.println("There is no second highest number in the array.");
            return Integer.MIN_VALUE;
        }

        return secondHighest;
    }


}
