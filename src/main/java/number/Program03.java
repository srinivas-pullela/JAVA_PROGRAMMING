//Sum of Natural numbers
package number;

import java.util.Scanner;

public class Program03 {
	
	public static void sumNaturalNum(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum=sum+i;
		}
		System.out.println("Sum : "+sum);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num=sc.nextInt();
		sumNaturalNum(num);
		sc.close();
	}
}
