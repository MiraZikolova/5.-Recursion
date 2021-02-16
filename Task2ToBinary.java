package recursionApplication2;

import java.util.Scanner;

public class Task2ToBinary {

	public static void main(String[] args) {
		System.out.println("Enter a number.");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		System.out.println(dec2Bin(n));
		
	}
	
	public static String dec2Bin (int value) {
		if(value == 1)                 //base case
			return "1";
		else 
			return dec2Bin(value / 2) + value % 2;  //iskame purvoto chislo da bude poslednoto presmetnato
													//vtoroto chislo avtomatichno se prevrushta v string
	}
}