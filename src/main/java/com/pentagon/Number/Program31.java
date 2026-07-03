//The sum of (Squares of digits) of a number
package com.pentagon.Number;

public class Program31 {

	public static int sumOfSquaresOfDigits(int num) {
		int sum = 0;
		while (num > 0) {
			int digit = num % 10;
			sum += digit * digit;
			num /= 10;
		}
		return sum;
	}
	public static void main(String[] args) {
		int number = 123;
		int result = sumOfSquaresOfDigits(number);
		System.out.println("The sum of squares of digits of " + number + " is: " + result);
	}
}
