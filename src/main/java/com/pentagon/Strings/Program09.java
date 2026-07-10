//Write a program to remove starting and ending spaces from a given not middle
package com.pentagon.Strings;

public class Program09 {
	
	//"  Abc   Xyz  "->"Abc Xyx"
	//Using trim method
	public static void removeFirstLastSpaces(String str) {
		String res = str.trim();
		System.out.println(res);
	}
	
	//Without using trim method
	public static void removeFirstLastSpaces1(String str) {
		//___ABC__CDE___
		//-->        <--
		int i=0,j=str.length();
		while(i<=j) {
			if(str.charAt(i)!=' ') {
				i++;
			}
		}
		
		while(j>=i) {
			if(str.charAt(i)!=' ') {
				j--;
			}
		}
		
		String res="";
		for(int x=i;x<=j;x++) {
			res+=str.charAt(x);
		}
		
		System.out.println(res);
	}
	public static void main(String[] args) {
		removeFirstLastSpaces("  Abc   Xyz  ");
	}
}
