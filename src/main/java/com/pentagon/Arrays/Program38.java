//Replace even elements with square
package com.pentagon.Arrays;

public class Program38 {

	public static void replaceEvenElementsWithSquare(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				arr[i] = arr[i] * arr[i];
			}
		}
	}
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5 };
		replaceEvenElementsWithSquare(a);
		System.out.print("Array after replacing even elements with their squares: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
