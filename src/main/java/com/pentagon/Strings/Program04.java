//print Even indices characters and odd indices characters
package com.pentagon.Strings;

public class Program04 {
	
	public static void evenOddChar(String str) {
		String res="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(i%2==0 && (ch>='a' && ch<='z')) {
				ch-=32;
				res+=ch;
			}else if(i%2!=0 && (ch>='A' && ch<='Z')){
				ch+=32;
				res+=ch;
			}else {
				res+=ch;
			}
		}
		System.out.println(res);
	}
	public static void main(String[] args) {
		String st="@AewS.c5Gj";
		evenOddChar(st);
	}
}
