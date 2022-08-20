package recursion;

// Write a program to find the factorial of a number using recursion.
import java.util.Scanner;

public class FactorialOfANumber {

	static int factorial (int n) {
		if(n==0) {
			return 1;
		} else {
			// recursive call
			return n * factorial(n-1);
		}
	}
	
	
	public static void main(String[] args) {
		// Input the number
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n < 0) {
			System.out.println("Number is negative");
		} else {
			System.out.println(factorial(n));
		}
		sc.close();
	}
	
	/*
    	Time complexity : O(n)
    	Space complexity : O(n)
	*/
}
