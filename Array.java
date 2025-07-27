package practice;
import java.util.*;
public class Array 
{
	public static void main(String[]args)
	{
		int n=0;
		System.out.print("Enter number of elements:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int mrk[]=new int[n];
		System.out.print("Enter elements:");
		for(int i=0;i<n;i++)
		{
			mrk[i]=sc.nextInt();
		}
		System.out.println("Elements:");
		for(int i=0;i<n;i++)
		{
			System.out.print(mrk[i]+" ");
		}
		sc.close();
	}

}
