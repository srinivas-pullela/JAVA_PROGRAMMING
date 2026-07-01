//Check whether a number is strong/factorian/krishnamurty number
package number;

public class Program22 {

	public static int countDigits(int num) {
		int count=0;
		while(num!=0) {
			count++;
			num=num/10;
		}
		return count;
	}
	
	public static void strongNumber(int n) {
		int n1=n;
		int count=countDigits(n);
		int res=1;
		int sum=0;
		while(n!=0) {
			int ld=n%10;
			for(int i=1;i<=count;i++) {
				res*=ld;
			}
			System.out.println(res);
			sum+=res;
			n/=10;
		}
		if(sum==n1) {
			System.out.println("Strong number");
		}else {
			System.out.println("Not a strong number");
		}
	}
	
	public static void main(String[] args) {
		strongNumber(145);
	}
}
