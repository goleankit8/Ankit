package com.ReverseArray;

import java.util.Arrays;

public class ReverseArrayy {
	public static void main(String[] args) {
		int[] arr= {115, 99, 89, 47, 45, 12, -12, -58};
		
		for(int i=0;i<arr.length/2;i++)
		{
			int temp=arr[arr.length-i-1];
			arr[arr.length-i-1]=arr[i];
			arr[i]=temp;
		}
		System.out.println(Arrays.toString(arr));
	}

}
