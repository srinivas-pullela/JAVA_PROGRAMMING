package com.pentagon.Number;

import java.util.Scanner;

public class Program02 {
	
	public static void add(int a,int b) {
		System.out.println("Addition : "+(a+b));
	}
	
	public static void sub(int a,int b) {
		System.out.println("Substraction : "+(a-b));
	}
	
	public static void mul(int a,int b) {
		System.out.println("Multiplication : "+(a*b));
	}
	
	public static void div(int a,int b) {
		System.out.println("Division : "+(a/b));
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number1 : ");
		int n1=sc.nextInt();
		System.out.print("Enter number2 : ");
		int n2=sc.nextInt();
		
		add(n1,n2);
		sub(n1,n2);
		mul(n1,n2);
		div(n1,n2);
		
		sc.close();
	}
}
