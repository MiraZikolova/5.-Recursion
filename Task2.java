package tailRecursion4;

public class Task2 {
	public static void main(String[] args) {
	   	 System.out.println("Sum is " + xMethod(4));
	}
// to optimize
//	public static int xMethod(int n) {
//	   	 if (n == 1)
//	   		 return 1;
//	   	 else
//	   		 return n + xMethod(n - 1);
//	}
	
//optimized
	public static int xMethod(int n) {
	   	 return xMethod(n, 1);
	}
	
	public static int xMethod(int n, int sum) { // example 4,1 : 3,5 : 2,8 
	   	 if (n == 1)
	   		 return sum;
	   	 else {
	   		 sum += n;                          
	   		 return xMethod(n - 1, sum);        //then 3,5 : 2,8 : 1,10     answer is 10
	   	 }
	}
}