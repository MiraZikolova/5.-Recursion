package recursion1;

public class Task2 {
	
	public static void main(String[] args) {
	   	 xMethod(1234567);
	   	 System.out.println();
	   	 yMethod(1234567);
	}
	
	//recursion
	public static void xMethod(int n) {
	   	 if (n > 0) {                     //base case
	   		 System.out.print(n % 10);
	   		 xMethod(n / 10);
	   	 }
	 }
	
	//iteration
	public static void yMethod(int n) {
		while(n > 0) {
			System.out.print(n % 10);
			n /= 10;
		}
	}

}