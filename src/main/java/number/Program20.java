//Check if all digits of a number are even
package number;

public class Program20 {

	public static void isAllEven(int n) {
		while(n!=0) {
			int ld=n%10;
			if(ld%2 !=0) {
				System.out.println("Digits are not Even");
				return;
			}
			n/=10;
		}
		System.out.println("Digits are Odd");
	}
	public static void main(String[] args) {
		isAllEven(84);
	}
}
