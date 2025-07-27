package practice;
import java.util.*;
public class Recursion 
{
	public static void printNum(int n)
	{
		if(n>10)
			return;
		else
		{
			System.out.print(n+" ");
			printNum(n+1);
		}
	}
	public static void main(String[]args)
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter value of n:");
		n=sc.nextInt();
		
		printNum(n);
	}
}
