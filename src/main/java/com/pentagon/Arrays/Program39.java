//Replace odd elements with their cubes
package com.pentagon.Arrays;

public class Program39 {

	public static void replaceOddElementsWithCube(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				arr[i] = arr[i] * arr[i] * arr[i];
			}
		}
	}
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5 };
		replaceOddElementsWithCube(a);
		System.out.print("Array after replacing odd elements with their cubes: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
