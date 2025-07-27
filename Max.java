package practice;
import java.util.*;
public class Max 
{
	public static int Max(int a,int b)
	{
		int max=a;
		if(max<b)
		{
			max=b;
		}
		return max;
	}
	public static void main(String[]args)
	{
		System.out.println("Enter two numbers:");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		int max=Max(a,b);
		System.out.println("Max:"+max);
	}
}
