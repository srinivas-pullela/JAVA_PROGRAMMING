//Strictly increasing and decreasing
package com.pentagon.Number;

public class Program25 {
	
	public static boolean isIncreasing(int n) {
		int max=10;
		while(n!=0) {
			int ld=n%10;
			if(max>ld) {
				max=ld;
			}
			else return false;
			n=n/10;
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println(isIncreasing(123));
	}
}
