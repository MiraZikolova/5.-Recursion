package recursionApplication2;

import java.util.Scanner;

public class Task1OddEven {

	public static void main(String[] args) {
		
		System.out.println("Enter a number (greater than or equal to 0).");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		if (n >= 0) {
			System.out.println(oddNumber(n)?"odd":"even"); //true:false
			System.out.println(evenNumber(n)?"even":"odd"); //true:false
		}
	}
	

	public static boolean evenNumber(int n) {
		if(n == 0)                  //base case
			return true;
		else if (n == 1)            //base case
			return false;
		else
			return evenNumber(n - 2);
	}
	public static boolean oddNumber(int n) {
		if(n == 0)
			return false;
		else if (n == 1)
			return true;
		else
			return oddNumber(n - 2);
	}
	
}
