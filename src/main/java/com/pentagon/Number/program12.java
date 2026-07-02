//Find ASCII value of a digit character
package com.pentagon.Number;

import java.util.Scanner;

public class program12 {

	public static void asciiValue(char ch) {
		int i=ch;
		System.out.println("ASCII value of "+ch+" = "+i);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a character : ");
		char ch=sc.next().charAt(0);
		asciiValue(ch);
		sc.close();
	}
}
