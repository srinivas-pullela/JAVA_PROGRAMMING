//Print unique elements in an array
package com.pentagon.Arrays;

public class Program29 {

	public static void printUniqueElements(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			boolean isUnique = true;
			for(int j=0;j<arr.length;j++) {
				if(i!=j && arr[i]==arr[j]) { // check if the current element is equal to any other element in the array
					isUnique = false;
					break;
				}
			}
			if(isUnique) {
				System.out.print(arr[i]+" ");
			}
		}
	}
	public static void main(String[] args) {
		int a[]= {1,2,3,2,4,5,1};
		printUniqueElements(a);
	}
}
