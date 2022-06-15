package com.ReverseString;

public class Reverse_String_By_Split_method {
	
	public static void main(String[] args) {
		String str="JAva programming";
		String rev=" ";
		String[] arr=str.split("");
		for(int i=0; i<arr.length;i++)
		{
			String word= arr[i];
			String temp=" ";
			for(int j=word.length()-1;j>=0;j--)
			{
				temp=temp+word.charAt(j);
			}
					rev=rev+temp+"";
		}
		System.out.println(rev);
		}
	}
