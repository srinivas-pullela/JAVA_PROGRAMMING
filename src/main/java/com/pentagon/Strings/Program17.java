//Write a Java Program to replace a given character with another specified character
package com.pentagon.Strings;

public class Program17 {
	public static void replaceOldWithNew(String str, char target,char ele) {
		String res="";
		for(char ch : str.toCharArray()) {
			if(ch==target) {
				res+=ele;
			}else {
				res+=ch;
			}
		}
		System.out.println(res);
	}
	public static void main(String[] args) {
		replaceOldWithNew("abcda", 'a', '$');
	}
}
