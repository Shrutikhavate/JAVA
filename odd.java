package practice;

import java.util.Scanner;

public class odd 
{
	public static int Sum(int n)
	{
		int sum=0;
		while(n>=1)
		{
			if(n%2!=0)
			{
				sum=sum+n;
				n=n-1;
			}
			else
			{
				n=n-1;
				continue;
			}
		}
			
		
		return sum;
	}
	public static void main(String[]args)
	{
		System.out.print("Enter value of n:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=Sum(n);
		System.out.println("Sum of odd numbers till "+n+":"+sum);
	}
}
