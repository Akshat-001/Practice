package com;

import java.util.*;

public class SentenceReverse
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.next();
		String arr[]=s.split("\\.");
		for(int i=arr.length-1;i>0;i--)
		{
			System.out.print(arr[i]+".");
		}
		System.out.print(arr[0]);
	}
}
