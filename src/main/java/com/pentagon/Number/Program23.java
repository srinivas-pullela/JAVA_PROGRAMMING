//Factors of a number
package com.pentagon.Number;

public class Program23 {
	
	public static void factorsOfNum(int num) {
		for(int i=1;i<=num/2;i++) {
			if(num%i==0) System.out.println(i);
		}
		System.out.println(num);
	}
	public static void main(String[] args) {
		factorsOfNum(18);
	}
}
