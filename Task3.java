package tailRecursion4;

public class Task3 {
	
	public static void main(String[] args) {
		System.out.println(powRecursive(2, 3));
	}
// to optimize
//	public static int powRecursive( int x, int n ) {
//	   	 if (n == 0) {
//	   		 return 1;
//	   	 }
//	   	 
//	   	 return x * powRecursive(x, n - 1 );
//	}
	
	//optimized
	public static int powRecursive( int x, int n ) {
	   	 return powRecursive(x, n, 1);
	}
	
	public static int powRecursive( int x, int n, int result ) {    // example 2,3,1 : 2,1,8
	   	 if (n == 0) {
	   		 return result;
	   	 }
	   	 result *= x;
	   	 return powRecursive(x, n - 1, result);                     // then 2,2,2 : 2,1,8    answer is 8
	}

}