package practice;

import java.util.Scanner;

public class Factorial 
{
	public static int Fact(int a)
	{
		int fact=1;
		while(a>=1)
		{
			fact=fact*a;
			a=a-1;
		}
	
		return fact;
	}
	public static void main(String[]args)
	{
		System.out.print("Enter number:");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if (a < 0) 
		{
		    System.out.println("Factorial is not defined for negative numbers.");
		    return;
		}

		int fact=Fact(a);
		System.out.println("Factorial:"+fact);
	}

}
