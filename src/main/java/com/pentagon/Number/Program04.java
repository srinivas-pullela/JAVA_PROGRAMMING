//Product of a number
package com.pentagon.Number;

import java.util.Scanner;

public class Program04 {

	public static void product(int n) {
		int pro=1;
		for(int i=1;i<=n;i++) {
			pro=pro*i;
		}
		System.out.println("Product : "+pro);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num=sc.nextInt();
		product(num);
		sc.close();
	}
}
