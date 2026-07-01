//Factorial of a number
package number;

public class Program21 {

	public static void factorial(int num) {
		int res=1;
		for(int i=2;i<=num;i++) {
			res*=i;
		}
		System.out.println(res);
	}
	public static void main(String[] args) {
		factorial(5);
	}
}
