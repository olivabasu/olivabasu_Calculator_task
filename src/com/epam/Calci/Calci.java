package com.epam.Calci;

import java.util.*;

public class Calci
{
	public static double CalApp(int mycase,double a,double b)
	{
		
		if(mycase<1||mycase>4)
			return 0;
		else
		{
			double arr[]= {(a+b),(a-b),(a*b),(a/b)};
			return arr[mycase-1];
		}
		
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values that you wish to operate on.");
		double a=sc.nextInt();
		double b=sc.nextInt();
		System.out.println("Press 1 for Additon\nPress 2 for Subtraction\nPress 3 for Multiplication\nPress 4 for Division(1st number divided by 2nd number)");
		int mycase=sc.nextInt();
		double r=CalApp(mycase,a,b);
		if(r==0)
			System.out.println("Invalid.");
		else
			System.out.println("Result after operation is:"+r);
	}
}
	

	


