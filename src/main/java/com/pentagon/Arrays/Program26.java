//Count frequency of a given element in an array
package com.pentagon.Arrays;

public class Program26 {

	public static void countFrequency(int arr[], int x) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==x) {
				count++;
			}
		}
		System.out.println("Frequency of "+x+" is "+count);
	}
	public static void main(String[] args) {
		int a[]= {1,5,2,4,3,5,5};
		int x=5;
		countFrequency(a,x);
	}
}
