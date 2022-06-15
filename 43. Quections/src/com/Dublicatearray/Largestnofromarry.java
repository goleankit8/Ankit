package com.Dublicatearray;

public class Largestnofromarry {
	public static void main(String[] args) {
		
		int[] ayy= {20,65,84,95,2,54};
		int max=ayy[0];
		for(int i=0;i<ayy.length;i++)
		{
			if(max<ayy[i])
			{
				max=ayy[i];
			}
		}
		System.out.println(max);
	}

}
