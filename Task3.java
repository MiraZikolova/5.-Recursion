package recursion1;

import java.util.Scanner;

public class Task3 {
	
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a positive number n for the power of 2.");
		int n = sc.nextInt();
		System.out.println("2 ^ n = " + result1(n));
		System.out.println("2 ^ n = " + result2(n));
		sc.close();
		
	}
	
	//iteration
	public static int result1(int n) {
		int result = 1;
		for(int i = 0; i < n; i++) {
			result *= 2;
		}
		return result;
	}
	
	
	//recursion
	public static int result2(int n) {
		if (n == 0)                    //base case
			return 1;
		else
			return 2 * result2(n - 1);
	}
}