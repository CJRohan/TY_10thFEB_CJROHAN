package com.ty;

import java.util.Scanner;

public class SumofEvenNumbersInRange
{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		int s = scn.nextInt(), e=scn.nextInt(), sum=0;
		if (s % 2 == 1)
			s++;
		while (s <= e) {
			sum += s;
			s+= 2;
		}
		System.out.println(sum);
		scn.close();
	}
}
