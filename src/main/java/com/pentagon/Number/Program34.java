//print all the prime-factors of a given number
package com.pentagon.Number;

public class Program34 {
	
	public static void printPrimeFactors(int num) {
		System.out.print("Prime factors of " + num + " are: ");
		for (int i = 2; i <= num; i++) {
			while (num % i == 0) {
				System.out.print(i + " ");
				num /= i;
			}
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int number = 28;
		printPrimeFactors(number);
	}
}
