import java.util.Scanner;

public class Fibonacci {
	 public static int fibonaccii(int n) {
	        // Complete the function.
	        if (n <= 1) 
	            return n;
	        return fibonaccii(n - 1) 
	            + fibonaccii(n - 2); 
	        
	    }

	    

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int n = scanner.nextInt();
	        scanner.close();
	        System.out.println(fibonaccii(n));
	    }

}
