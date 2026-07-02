//Reverse a number
package com.pentagon.Number;

import java.util.Scanner;

public class Program13 {

	public static int reverseNumber(int num) {
		int rev=0;
		while(num!=0) {
			int ld=num%10;
			rev=(rev*10)+ld;
			num=num/10;
		}
		return rev;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n=sc.nextInt();
		System.out.println("Reverse a number is "+reverseNumber(n));
		sc.close();
	}
}
