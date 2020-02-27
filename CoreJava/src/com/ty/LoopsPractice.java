package com.ty;
import java.util.Scanner;

public class LoopsPractice 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt(), i=0;
		if(n%2==0) i=-1;
		while(i++<n)
			System.out.println(i++);
		scn.close();
	}
}
