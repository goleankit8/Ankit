package com.ArryaelementFromUSer;

import java.util.Scanner;

public class A2B {
	public static void main(String[] args) {
		
	
		//for the String array
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter the total no of array");
		int no=sc1.nextInt();
		

		String array1[]=new String [no];
		
		for(int i=0;i<no;i++)
		{
			System.out.println("Enter first value in thes string");
			array1[i]=sc1.next();
		}
		sc1.close();
		
		System.out.println("printing the element in array");
		for(int i=0;i<array1.length;i++)
		{
			System.out.println(array1[i]);
		}
	}

}
