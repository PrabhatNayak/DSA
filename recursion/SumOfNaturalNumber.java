package recursion;

//Find the sum of the first N natural numbers
import java.util.Scanner;

//sumOfNaturalNo(4) = 4+3+2+1 =10
public class SumOfNaturalNumber {

	static int sumOfNaturalNo(int n) {
		if(n ==0)
			return 0;
		else 
			return n + sumOfNaturalNo(n-1);
	}
	
	public static void main(String[] args) {
		// Input the number
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n < 0) {
			System.out.println("Number is negative");
		} else {
			System.out.println(sumOfNaturalNo(n));
		}
		sc.close();
	}

}
