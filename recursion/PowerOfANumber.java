package recursion;

import java.util.Scanner;

public class PowerOfANumber {
	
	static int power(int num, int pow) {
		if(pow == 0)
			return 1;
		else 
			return num * power(num, pow-1);
	}
	
	public static void main(String[] args) {
		// Input the number
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int pow = sc.nextInt();
		if(num < 0) {
			System.out.println("Number is negative");
		} else {
			System.out.println(power(num, pow));
		}
		sc.close();
	}
/*
 	Time Complexity: O(n)
  	Space Complexity: O(n)
 */
}
