package com.ArrayAccending;

import java.util.Arrays;

public class Arraydecending {
	public static void main(String[] args) {
			
			int[] arr= {12,45,89,47,-12,-58,99,115};
			
			for(int i=0;i<arr.length;i++)
			{
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[i]<arr[j])
					{
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
			System.out.println(Arrays.toString(arr));
		}
	}
