package recursionApplication2;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
				System.out.print("Enter a key: ");
				Scanner input = new Scanner(System.in);
				int key = input.nextInt();
				int index = binarySearch(arr, key);
				System.out.println(index);
			}

	/** Use binary search to find the key in the list */

	public static int binarySearch(int[] list, int key) {
		int low = 0;
		int high = list.length - 1;
		while (high >= low) {
			int mid = (low + high) / 2;
			if (key < list[mid])
				high = mid - 1;
			else if (key == list[mid])
				return mid;
			else
				low = mid + 1;
		}
		return -1; // Now high < low, key not found
	}

	public static int recursiveBinarySearch(int[] list, int key) {
		int low = 0;
		int high = list.length - 1;
		return recursiveBinarySearch(list, key, low, high);
	}

	private static int recursiveBinarySearch(int[] list, int key, int low, int high) {
		if (low > high) // The list has been exhausted without a match
			return -1;
		int mid = (low + high) / 2;
		if (key < list[mid])
			return recursiveBinarySearch(list, key, low, mid - 1);
		else if (key == list[mid])
			return mid;
		else
			return recursiveBinarySearch(list, key, mid + 1, high);
	}
}