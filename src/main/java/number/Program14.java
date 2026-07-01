//Find the sum of alternative digits of a number
package number;

import java.util.Scanner;

public class Program14 {
	
	public static int alternativeNumber(int num) {
		int sum=0;
		while(num!=0) {
			int ld=num%10;
			sum=sum+ld;
			num=num/10;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n=sc.nextInt();
		System.out.println("Alternative digits of a number  is "+ alternativeNumber(n));
		sc.close();
	}

}
