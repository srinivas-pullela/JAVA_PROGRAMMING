//Neon number: 9->9^2=81
package com.pentagon.Number;

public class Program26 {

	public static boolean isNeon(int num) {
		int square = num * num;
		int sumOfDigits = 0;
		while (square > 0) {
			sumOfDigits += square % 10;
			square /= 10;
		}
		return sumOfDigits == num;
	}
	public static void main(String[] args) {
	   int number = 9;
	   if (isNeon(number)) {
		   System.out.println(number + " is a Neon number.");
	   } else {
		   System.out.println(number + " is not a Neon number.");
	   }
		
	}
}
