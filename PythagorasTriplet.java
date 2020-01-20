package com;

import java.util.Scanner;

public class PythagorasTriplet
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[]=new int [5];
		int f=0;
		System.out.println("Enter 5 numbers");
		for(int i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<5;i++)
		{
			for(int j=i+1;j<5;j++)
			{
				for(int k=j+1;k<5;k++)
				{
					if(arr[i]*arr[i]==(arr[j]*arr[j]+arr[k]*arr[k]))
					{
						f=1;
					}
				}
			}
		}
		if(f==1)
			System.out.println("Pythagoran Triplet");
		else
			System.out.println("Not Pythagoran Triplet");
	}
}
