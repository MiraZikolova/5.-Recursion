package recursionApplication2;

import java.util.Scanner;

public class Task3Hanoi {
	private static int num = 0;    //prawim promenliva,koqto pri vsyako premestvane na disk, uwelichawa stoinostta si
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of disks: ");
		int n = input.nextInt();
		// Find the solution recursively
		System.out.println("The moves are:");
		moveDisks(n, 'A', 'B', 'C');
		System.out.println("The number of moves is " + num);
	}

	/**
	 * The method for finding the solution to move n disks from fromTower to toTower
	 * with auxTower
	 */
	public static void moveDisks(int n, char fromTower, char toTower, char auxTower) {
		if (n == 1) // Stopping condition
			moveDisk(n, fromTower, toTower);
		else {
			moveDisks(n - 1, fromTower, auxTower, toTower);
			moveDisk(n, fromTower, toTower);
			moveDisks(n - 1, auxTower, toTower, fromTower);
		}
	}
	//za da izbegnem povtoreniq
	private static void moveDisk(int n, char fromTower, char toTower) {
		System.out.println("Move disk " + n + " from "+ fromTower + " to " + toTower);
		num++;
	}
}