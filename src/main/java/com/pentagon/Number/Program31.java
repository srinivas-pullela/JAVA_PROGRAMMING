//The sum of (Squares of digits) of a number
package com.pentagon.Number;

public class Program31 {

	public static void square(int n) {
		int sqr=0;
		int res=0;
		while(n!=0) {
			int ld=n%10;
			sqr=ld*ld;
			res=res+sqr;
			n=n/10;
		}
		System.out.println(res);
	}
	public static void main(String[] args) {
		square(12);
	}
}
