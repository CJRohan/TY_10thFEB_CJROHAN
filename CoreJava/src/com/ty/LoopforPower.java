package com.ty;

import java.util.Scanner;

public class LoopforPower
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		int x=scn.nextInt(), y=scn.nextInt();
		double res=1.0;
		for(int i=1; i<=y; i++)
			res*=x;
		System.out.println(res);
		System.out.println(Math.pow(x, y));
		scn.close();
	}
}
