//Find square and cube of a number
package com.pentagon.Number;

import java.util.Scanner;

public class Program10 {

	public static int square(int num) {
		return num*num;
	}
	
	public static int cube(int num) {
		return num*num*num;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n=sc.nextInt();
		System.out.println(square(n));
		System.out.println(cube(n));
		sc.close();
	}
}
