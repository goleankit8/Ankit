package com.Star;

import java.util.Scanner;

public class F {
	private static Scanner scanner;
public static void main(String[]args) {
			
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Enter n: ");
		
		int n=scanner.nextInt();
		
		         System.out.println("Enter symbol: ");
		
		         
		
		int k = n * 2 - 1;
		         
		for(int i = 1; i <= k; i++)
		{
			
			 for (int j =  1;j <= k; j++)
			 {
				 if( j == i || j == k - i + 1)
				 {
					 System.out.print("*");
				 }
				 System.out.print (" ");
			 }
			 System.out.println (" ");
		}
	}
}


