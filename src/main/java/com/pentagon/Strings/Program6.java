//Replace a space with a given character
package com.pentagon.Strings;

public class Program6 {
	public static void replaceSpace(String str,char ch) {
		String res="";
		for(int i=0;i<str.length();i++) {
			char chr=str.charAt(i);
			if(chr==' ') {
				res+=ch;
			}else {
				res+=chr;
			}
		}
		System.out.println(res);
	}
	public static void main(String[] args) {
		String str="Sr in iv as";
		char ch = '@';
		replaceSpace(str, ch);
	}
}
