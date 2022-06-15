package com.Dublicatearray;

public class A7Arraydublicate {
	public static void main(String[] args) {
		
		int[] arr= {20,65,68,80,100,65,20};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int f=i+1;f<arr.length;f++)
			{
				if(arr[i]==arr[f])
				{
					System.out.println(arr[f]);
				}
			}
		}
	}

}
