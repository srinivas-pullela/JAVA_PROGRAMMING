//Sum of digits of a number
package com.pentagon.Number;

import java.util.Scanner;

public class Program07 {

	public static int sumDigits(int n) {
		if(n==0) {
			System.out.println("Number can not be ZERO");
			System.exit(0);
		}
		
		int sum=0;
		while(n!=0) {
			int ld=n%10;
			sum=sum+ld;
			n=n/10;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n=sc.nextInt();
		System.out.println("Sum of Digits is "+sumDigits(n));
		sc.close();
	}
}
