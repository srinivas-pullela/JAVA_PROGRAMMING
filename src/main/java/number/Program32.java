//Chack a number is Happy number or UnHappy number
package number;

public class Program32 {

	public static int square(int n) {
		int sqr=0;
		int res=0;
		while(n!=0) {
			int ld=n%10;
			sqr=ld*ld;
			res=res+sqr;
			n=n/10;
		}
		return res;
	}
	
	public static boolean isHappy(int n) {
		while(n!=1 && n!=4) {
			n=square(n);
		}
		return n==1;
	}
	
	public static void main(String[] args) {
		System.out.println(isHappy(19));
	}
}
