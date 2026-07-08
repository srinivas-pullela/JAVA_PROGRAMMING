//Segregate all even numbers on left side and odd numbers on right side of the array
package com.pentagon.Arrays;

public class Program44 {

	//for example, if the input array is {1, 2, 3, 4, 5, 6, 7, 8}, then the output should be {2, 4, 6, 8, 1, 3, 5, 7}
	public static void segregateEvenAndOdd(int arr[]) {
		int left = 0;
		int right = arr.length - 1;
		while (left < right) {
			while (arr[left] % 2 == 0 && left < right) {
				left++;
			}
			while (arr[right] % 2 != 0 && left < right) {
				right--;
			}
			if (left < right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
		}
	}
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		segregateEvenAndOdd(a);
		System.out.print("Array after segregating even and odd numbers: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
