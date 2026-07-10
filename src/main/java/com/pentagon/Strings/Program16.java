//Write a Java Program to remove the first occurrence of a specified character from a string
package com.pentagon.Strings;

public class Program16 {
	
	public static void rem1stOcc(String str,char target) {
		String res="";
		boolean vis = false;
		for(char ch:str.toCharArray()) {
			System.out.println(ch);
		}
		
	}
	public static void main(String[] args) {
		rem1stOcc("Srinivas", 'i');
	}
}
