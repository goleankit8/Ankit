package com.Palindrom;

public class PalindromeString {
	public static void main(String[] args) {
		String str="madam";
		String hh=str;
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		if(hh.equals(rev))
		{
			System.out.println("String is palindrome");
			
		}
		else
		{
			System.out.println("String is not palindrome");
		}
	}

}
