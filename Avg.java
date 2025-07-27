package practice;
import java.util.*;
public class Avg 
{
	public static float Average(int a,int b,int c)
	{
		float avg=0;
		avg=(a+b+c)/3.0f;
		return avg;
	}
	public static void main(String[]args)
	{
		System.out.println("Enter 3 numbers:");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		float avg=Average(a,b,c);
		System.out.println("Avg:"+avg);
		
	}

}
