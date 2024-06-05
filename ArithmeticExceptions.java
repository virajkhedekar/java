package xavier;

public class ArithmeticExceptions {

	    public static void main(String[] args) {
	        try {
	            int numerator = 10;
	            int denominator = 0;
	            int result = numerator / denominator;  // This line will throw ArithmeticException
	            System.out.println("Result: " + result);
	        } catch (ArithmeticException e) {
	            System.out.println("ArithmeticException caught: Division by zero is not allowed.");
	        }
	    }
	}
