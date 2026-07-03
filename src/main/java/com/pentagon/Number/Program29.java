//SPY Number
package com.pentagon.Number;

public class Program29 {

	//Logic example: 123 => 1+2+3=6 and 1*2*3=6 => sum=product => SPY Number
	public static boolean isSpyNumber(int num) {
		int sum = 0;
		int product = 1;

		while (num > 0) {
			int digit = num % 10;
			sum += digit;
			product *= digit;
			num /= 10;
		}

		return sum == product;
	}
	
	
	public static void main(String[] args) {
		int number = 123;
		if (isSpyNumber(number)) {
			System.out.println(number + " is a Spy number.");
		} else {
			System.out.println(number + " is not a Spy number.");
		}
	}
}
