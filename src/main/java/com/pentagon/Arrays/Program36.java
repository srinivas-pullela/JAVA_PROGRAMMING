//Print elements divisible by given number
package com.pentagon.Arrays;

public class Program36 {
	
	public static void printDivisibleElements(int[] arr, int divisor) {
		System.out.println("Elements divisible by " + divisor + ":");
		for (int num : arr) {
			if (num % divisor == 0) {
				System.out.print(num + " ");
			}
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int[] arr = {10, 15, 20, 25, 30, 35, 40};
		int divisor = 3;
		printDivisibleElements(arr, divisor);
	}
}
