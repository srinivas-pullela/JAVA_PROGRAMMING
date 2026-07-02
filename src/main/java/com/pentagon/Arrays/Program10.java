//Find the sum of all elements
package com.pentagon.Arrays;

public class Program10 {

	public static void sumOfElementsInArray(int a[]) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		System.out.println("Sum of Array is "+sum);
	}
	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
		sumOfElementsInArray(a);
	}
}
