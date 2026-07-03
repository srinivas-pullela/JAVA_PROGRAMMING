//Product of all elements
package com.pentagon.Arrays;

public class Program37 {

	public static int productOfAllElements(int arr[]) {
		int product=1;
		for(int i=0;i<arr.length;i++) {
			product*=arr[i];
		}
		return product;
	}
	
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		System.out.println("Product of all elements is "+productOfAllElements(a));
	}
}
