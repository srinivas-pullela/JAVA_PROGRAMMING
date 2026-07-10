//WAP of container
package com.pentagon.Strings;

public class Program05 {

	public static boolean contains(String str,char ch) {
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==ch) {
				return true;
			} 
		}
		return false;
	}
	public static void main(String[] args) {
		String str = "Srinivas#";
		char ch='S';
		System.out.println(contains(str, ch));
	}
}
