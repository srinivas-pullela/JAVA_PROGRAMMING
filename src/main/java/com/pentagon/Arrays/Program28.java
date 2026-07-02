//Remove duplicate elements from an array
package com.pentagon.Arrays;

public class Program28 {

	public static void removeDuplicate(int arr[]) {
		int n = arr.length;
		int[] temp = new int[n];
		int j = 0;
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				temp[j++] = arr[i]; // if the current element is not equal to the next element, store it in temp
			}
		}
		temp[j++] = arr[n - 1]; // store the last element in temp
		for (int i = 0; i < j; i++) {
			System.out.print(temp[i] + " ");
		}
	}
	public static void main(String[] args) {
		int a[] = { 1, 2, 2, 3, 4, 4, 5 };
		removeDuplicate(a);
	}
}
