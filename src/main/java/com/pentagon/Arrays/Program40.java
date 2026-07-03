//Move all zeroes to the end of an array
package com.pentagon.Arrays;

public class Program40 {

	//Move all zeroes to the end of an array without using extra array
	public static void moveAllZeroesToEnd(int arr[]) {
		int count = 0; // Count of non-zero elements
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arr[count++] = arr[i]; // Move non-zero element to the front
			}
		}
		while (count < arr.length) {  
			arr[count++] = 0; // Fill remaining positions with zeroes
		}
	}
	
	//using extra array
	public static void moveAllZeroesToEndExtraArray(int arr[]) {
		int[] result = new int[arr.length];
		int count = 0; // Count of non-zero elements
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				result[count++] = arr[i]; // Move non-zero element to the front
			}
		}
		while (count < arr.length) {  
			result[count++] = 0; // Fill remaining positions with zeroes
		}
		for (int i = 0; i < arr.length; i++) {
			arr[i] = result[i]; // Copy result back to original array
		}
	}
	
	public static void main(String[] args) {
		int a[] = { 1, 0, 2, 0, 3, 0, 4, 0, 5 };
		moveAllZeroesToEnd(a);
		System.out.print("Array after moving all zeroes to the end: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		moveAllZeroesToEndExtraArray(a);
		System.out.print("\nArray after moving all zeroes to the end using extra array: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
