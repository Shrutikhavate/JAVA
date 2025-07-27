package practice;
import java.util.*;
public class Function1 
{
	public static int Sum(int a,int b)
	{
		int sum=0;
		sum=a+b;
		return sum;
	}
	public static void main(String[]args)
	{
		System.out.print("Enter numbers:");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int sum=Sum(a,b);
		System.out.println("Sum:"+sum);
	
	}
}
