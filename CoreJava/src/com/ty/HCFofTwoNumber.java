package com.ty;

import java.util.Scanner;

public class HCFofTwoNumber 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		int a=scn.nextInt(), b=scn.nextInt();
		int hcf=1;
		int min=a, max=b;
		if(b<a) 
		{
			max=a;
			min=b;
		}
		for(int i=1; i*i<=min; i++)
		{
			if(min%i==0)
			{
				if(max%(min/i)==0)
				{
					hcf=min/i;
					break;
				}
				else if(max%i==0)
					hcf=i;
			}
		}
		System.out.println(hcf);
		scn.close();
	}
}
