package xavier;

public class FizzBuzz {

	    public static void main(String[] args) {
	        for (int i = 1; i <= 50; i++) {
	        	
	            if (i % 4 == 0 && i % 5 == 0) {
	                System.out.println("FizzBuzz");
	                
	            } else if (i % 4 == 0) {
	                System.out.println("Fizz");
	                
	            } else if (i % 5 == 0) {
	                System.out.println("Buzz");
	                
	            } else {
	                System.out.println(i);
	            }
	        }
	    }
	}


