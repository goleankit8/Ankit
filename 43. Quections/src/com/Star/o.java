package com.Star;

import java.util.Scanner;

public class o {
private static Scanner sc;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);	
		
		System.out.print("Please Enter X Pattern Rows = ");
		int rows = sc.nextInt();	
		
		System.out.println("---- Printing X Pattern of Stars ------");
		
		int k = rows * 2 - 1;	
		
		for (int i = 1 ; i <= k; i++ ) 
		{
			for (int j = 1 ; j <= k; j++ ) 
			{
				if(j == i || j == k - i + 1) 
				{
					System.out.print("*");
				}
			System.out.print(" ");
		}
		System.out.println();
		}
	}
}


