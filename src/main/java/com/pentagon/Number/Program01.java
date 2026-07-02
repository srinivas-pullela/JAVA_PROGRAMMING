package com.pentagon.Number;

import java.util.Scanner;

public class Program01 {
	
	public static void naturalNumbers(int n) {
		for(int i=1;i<=n;i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n=sc.nextInt();
		naturalNumbers(n);
		sc.close();
	}
}
