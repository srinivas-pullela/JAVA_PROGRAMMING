//Count digits in a number
package number;

import java.util.Scanner;

public class Program06 {
	public static int countDigits(int n) {
		if(n==0) {
			System.out.println("Number can not be ZERO");
			System.exit(0);
		}
		
		int count=0;
		while(n!=0) {
			count++;
			n=n/10;
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n=sc.nextInt();
		System.out.println("Number digits is "+countDigits(n));
		sc.close();
	}
}
