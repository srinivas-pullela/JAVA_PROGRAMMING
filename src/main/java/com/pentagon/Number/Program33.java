//Check the given number is bouncy number or not
package com.pentagon.Number;

public class Program33 {

	public static boolean isBouncy(int n) {
		int ld=n%10;
		n/=10;
		boolean isIncreasing = false;
		boolean isDecreasing = false;
		while(n!=0) {
			int currentLast = n%10;
			if(currentLast<ld) {
				isIncreasing = true;
			}else {
				isDecreasing = true;
			}
			if(isIncreasing && isDecreasing) {
				return true;
			}
			ld=currentLast;
			n/=10;
		}
		return false;
	}
	public static void main(String[] args) {
		
	}
}
