package practice;
import java.util.*;
public class Array2 
{
	public static void main(String[]args)
	{
		int n;
		System.out.print("Enter number of elements:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int arr[]=new int[n];
		System.out.print("Enter elements:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Elements:");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]+" is at index"+i);
		}
	}
}
