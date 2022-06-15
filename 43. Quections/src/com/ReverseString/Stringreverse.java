package com.ReverseString;

public class Stringreverse {
	public static void main(String[] args) {
		
		String str="python is programming language";
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
	}

}
