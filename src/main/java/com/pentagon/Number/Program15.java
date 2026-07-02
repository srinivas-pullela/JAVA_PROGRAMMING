//Find the place value of each digit
package com.pentagon.Number;

import java.util.Scanner;

public class Program15 {

	public static void placeValuesOfDigits(int n) {
		int place=1;
		while(n!=0) {
			int ld=n%10;
			System.out.println(ld+" is in "+place);
			place*=10;
			n=n/10;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n=sc.nextInt();
		placeValuesOfDigits(n);
		sc.close();
	}
}
