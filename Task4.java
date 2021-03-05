package tailRecursion4;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 2, 3, 4, 5};
		System.out.println("The average is " + findTheAverage(array));
	}
	
	public static double findTheAverage(int[] array) {
		return findTheAverage(array,array.length, 0) / array.length;     //the sum is 0, because we assume the array is empty
		//the final answer is 15/5 = 3
	}
	
	public static double findTheAverage(int[] array,int length, double sum) {  //example 1,2,3,4,5 , 5 , 0 : 1,2,3,4 , 4 , 5 : 1,2,3 , 3 , 9 : 1,2 , 2 , 12 : 1 , 1 , 14 : empty , 0 , 15
		if(length == 0) {
			return sum;
		}
		sum += array[length - 1];
		return findTheAverage(array, length - 1 , sum);    //then 1,2,3,4 , 4 , 5 : 1,2,3 , 3 , 9 : 1,2 , 2 , 12 : 1 , 1 , 14 : empty , 0 , 15
	}
	// we found the sum, and now we are going back to line 11 and divide the sum (15) by the number of participating integers.
}