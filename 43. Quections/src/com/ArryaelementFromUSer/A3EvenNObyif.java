package com.ArryaelementFromUSer;

import java.util.Scanner;

public class A3EvenNObyif {
	public static void main(String[] args) {
	//	int n=20;
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter no");
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
		if(i%2!=0)
		{
			System.out.println(i);
		}
		else
		{
			System.out.println("odd");
		}
		}
	}
}