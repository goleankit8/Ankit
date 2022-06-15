package com.Dublicatearray;

public class DUblicateStri {
	public static void main(String[] args) {
		
		String[] arr= {"abc","java","abc","mayur"};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int h=i+1;h<arr.length;h++)
			{
				if(arr[i].equals(arr[h]))
				{
					System.out.println(arr[i]);
				}
			}
		}
	}

}
