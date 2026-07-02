//Count elements in an array
package com.pentagon.Arrays;

public class Program13 {

	public static int countElements(int arr[]) {
		return arr.length;
	}
	public static void main(String[] args) {
		int a[]= {1,5,2,4,3};
		System.out.println("Count of elements in the array is "+countElements(a));
	}
}
