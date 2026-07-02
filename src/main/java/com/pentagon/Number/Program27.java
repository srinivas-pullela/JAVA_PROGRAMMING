//Automorphic number
package com.pentagon.Number;

public class Program27 {

	public static void isAutomorphicNum(int n) {
		int sqr=n*n;
		int count=0;
		
		while(n!=0) {
			int ld=n%10;
			count++;
			n=n/10;
		}
		
		int last = sqr%100;
		System.out.println(last);
		if(sqr==0) {
			System.out.println("Automorphic number");
		}else {
			System.out.println("Is not automorphic number");
		}
	}
	public static void main(String[] args) {
		isAutomorphicNum(25);
	}
}
