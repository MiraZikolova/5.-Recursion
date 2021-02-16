package recursion1;

public class Task1 {
	
	
	public static void main(String[] args) {
	   	 System.out.println("Sum is " + xMethod(10));
	   	 System.out.println("Sum is " + yMethod(10));
	}
	//recursion
	 public static int xMethod(int n) {
	   	 if (n == 1)
	   		 return 1;    //base case
	   	 else
	   		 return n + xMethod(n - 1);
	}
	
	//iteration
	public static int yMethod(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
	   	 return sum;
	}

}