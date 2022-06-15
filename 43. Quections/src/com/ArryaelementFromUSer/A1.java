package com.ArryaelementFromUSer;


import java.util.Scanner;

public class A1 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the total no fo Elemnet in the array ");
		
		int limit=sc.nextInt();
		int array[]=new int [limit];
		
		//for number array;
		
		for(int i=0;i<limit;i++)
		{
			System.out.println("Enter the elemrnt");
			array[i]=sc.nextInt();
		}
		sc.close();
		System.out.println("printing the element in array");
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		
	}

}
