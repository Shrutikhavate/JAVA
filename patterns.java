package practice;
import java.util.*;
public class patterns 
{
	public static void main(String[]args)
	{
		int r,c;
		int i,j=0;
		System.out.println("Enter rows and columns");
		Scanner sc=new Scanner(System.in);
		r=sc.nextInt();
		c=sc.nextInt();
		
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				if(i==0||i==r-1||j==0||j==c-1)
				{
				System.out.print("*");
				}
				else
				System.out.print(" ");
			}
			System.out.println();
		}
		
	}
}
