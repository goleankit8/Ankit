package com.ArryaelementFromUSer;

public class Primeno {
	public static void main(String[] args) {
		
	int n=13;
	int temp=0;
	for(int i=2;i<n;i++)
	{
		if(n%i==0)
		{
			temp++;
		}
	}
		if(temp==0)
		{
			System.out.println(n+"  is a prime no.");
		}
		else
		{
		System.out.println("not prime");
		}
	}
	
}
