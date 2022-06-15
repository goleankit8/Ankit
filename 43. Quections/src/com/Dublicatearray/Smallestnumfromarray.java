package com.Dublicatearray;

public class Smallestnumfromarray {
	public static void main(String[] args) {
		
		int[] ayy= {20,65,84,95,2,54};
		int min=ayy[0];
		for(int i=0;i<ayy.length;i++)
		{
			if(min>ayy[i])
			{
				min=ayy[i];
			}
		}
		System.out.println(min);
	}

}
