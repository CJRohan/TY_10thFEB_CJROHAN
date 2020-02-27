package com.ty;

import java.util.Scanner;

public class FibonacciSeries 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int a=0, b=1, c=1;
		if(n>1)
			System.out.print(0+" "+1);
		else
			System.out.println(0);
		for(int i=0; i<n-2; i++)
		{
			System.out.print(" "+c);
			a=b;
			b=c;
			c=a+b;
		}
		scn.close();
	}
}
