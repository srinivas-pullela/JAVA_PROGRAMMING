//Neon number: 9->9^2=81
package com.pentagon.Number;

public class Program26 {

	public static void is(int n) {
		int sqr=n*n;
		int sum=0;
		while(sqr!=0) {
			int ld=n%10;
			sum+=ld;
			sqr/=10;
		}
	}
	public static void main(String[] args) {
	
	}
}
