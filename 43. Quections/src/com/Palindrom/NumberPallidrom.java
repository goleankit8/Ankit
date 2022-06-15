package com.Palindrom;

public class NumberPallidrom {
	public static void main(String[] args) {
		
	int n=161;
	int kk=n;
	int rev=0;
	while(n>0)
	{
		rev=rev*10+n%10;
		n=n/10;
	}
	if(kk==rev)
	{
		System.out.println("Number is Palindrom ");
	}
	else
	{
		System.out.println("not palindrome");
	}
	}

}
