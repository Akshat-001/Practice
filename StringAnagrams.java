package com;

import java.util.Scanner;

public class StringAnagrams
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int ct=0;
		System.out.println("Enter first string");
		String s1=sc.next();
		System.out.println("Enter second string");
		String s2=sc.next();
		char arr1[]=s1.toCharArray();
		char arr2[]=s2.toCharArray();
		if(arr1.length==arr2.length)
		{
			for(int i=0;i<arr1.length;i++)
			{
				for(int j=0;j<arr2.length;j++)
				{
					if(arr1[i]==arr2[j])
					{
						arr2[j]='@';
						break;
					}
				}
			}
			for(int i=0;i<arr2.length;i++)
			{
				if(arr2[i]=='@')
					ct++;
			}
			if(ct==arr1.length)
				System.out.println("Anagarms");
			else
				System.out.println("Not Anagrams");
		}
		else
		{
			System.out.println("Not Anagrams");
		}
	}
}
