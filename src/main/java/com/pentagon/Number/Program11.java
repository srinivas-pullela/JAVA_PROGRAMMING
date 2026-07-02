//check if a number is divisible by 5 and 11
package com.pentagon.Number;

import java.util.Scanner;

public class Program11 {

	public static boolean divFiveAndEleven(int num) {
		if(num%5==0 && num%11==0) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n=sc.nextInt();
		System.out.println(divFiveAndEleven(n)?"Divisible by 5 and 11":"Not Divisible by 5 and 11");
		sc.close();
	}
}
