package recursion1;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a real number x.");
		double x = sc.nextDouble();
		System.out.println("Enter a positive number n for the power of x.");
		int n = sc.nextInt();
		System.out.println("x ^ n = " + result1(x, n));
		System.out.println("x ^ n = " + result2(x, n));
		sc.close();
		
	}
	
	//iteration
	public static double result1(double x, int n) {
		double result = 1;
		for(int i = 0; i < n; i++) {
			result *= x;
		}
		return result;
	}
	
	
	
	//recursion
	public static double result2(double x, int n) {
		if (n == 0)                                    //base case
			return 1;
	else {
			return (x * result2(x, n - 1));
	}
	}
}