package practice;
import java.util.*;
public class Twod 
{
	public static void main(String[]args)
	{
		int n,m;
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
	}
}
