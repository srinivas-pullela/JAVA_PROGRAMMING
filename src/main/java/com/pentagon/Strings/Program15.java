//Write a Java Program to remove specific character from a string (remove all occurrence)
package com.pentagon.Strings;

public class Program15 {

	public static void remAllOcc(String str,char target) {
		String res="";
		for(char ch:str.toCharArray()) {
			if(ch!=target) {
				res+=ch;
			}
		}
		System.out.println(res);
	}
	public static void main(String[] args) {
		remAllOcc("Srinivas", 's');
	}
}
