//Check if array contains a given element(Linear search)
package com.pentagon.Arrays;

public class Program19 {

	public static void checkArrayElement(int arr[],int ele) {
		boolean found=false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==ele) {
				found=true;
				break;
			}
		}
		System.out.println(found?"Element is Found":"Element is not found");
	}
	public static void main(String[] args) {
		int a[]= {1,7,2,6,3};
		checkArrayElement(a, 7);
	}
}
