package com.ty.stringsco;

public class Anagrams {

	public Anagrams() {
		// TODO Auto-generated constructor stub
	}
	
	public static boolean anagram(String s1, String s2)
	{
		if(s1.length()!=s2.length()) return false;
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		while(s1.length()!=0)
		{
			String s=String.valueOf(s1.charAt(0));
			s1=s1.replace(s,"");
			s2=s2.replace(s,"");
			if(s1.length()!=s2.length())
				return false;
		}
		return true;
	}
	
	public static void main(String[] args)
	{
		java.util.Scanner scn= new java.util.Scanner(System.in);
		String s1=scn.nextLine(), s2=scn.nextLine();
		//System.out.println(s1.charAt(0));
		//System.out.println("s1.charAt(0)");
		if(anagram(s1,s2))
			System.out.println("Anagram!");
		else
			System.out.println("Not an anagram!");
		scn.close();
	}

}
