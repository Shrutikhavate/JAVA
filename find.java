package practice;
import java.util.*;
public class find
{
	public static void main(String[]args)
	{
		int n,m;
		int val;
		boolean found=false;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rows:");
		n=sc.nextInt();
		System.out.println("Enter columns:");
		m=sc.nextInt();
		int arr[][]=new int[n][m];
		System.out.println("Enter elemnts:");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Elements:");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Enter value you want to Search:");
		val=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(arr[i][j]==val)
				{
					System.out.println("Element found at " + i+","+j+" index");
					found=true;
					break;
				}
			}
		}
		if(!found)
		{
			System.out.println("Element not found");
		}
	}
}
