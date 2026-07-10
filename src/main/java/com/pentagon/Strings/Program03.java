//Count spaces in a string for example sr in iv as
package com.pentagon.Strings;

public class Program03 {

	public static void countSpaces(String str) {
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				count++;
			}
		}
		System.out.println(count);
	}
	public static void main(String[] args) {
		String str="Sr in iv as";
		countSpaces(str);
	}
}
