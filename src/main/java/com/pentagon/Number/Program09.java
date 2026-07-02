//Swap numbers using single statement
package com.pentagon.Number;

import java.util.Scanner;

public class Program09 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number1 :");
		int a=sc.nextInt();
		System.out.print("Enter a number :");
		int b=sc.nextInt();
		
		a=(a+b)-(b=a);
		//a=(a+b)-(b-a);
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		sc.close();
	}
}
