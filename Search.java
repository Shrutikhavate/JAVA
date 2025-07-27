package practice;
import java.util.*;
public class Search 
{
		public static void main(String[]args)
		{
			int n,val=0,i;
			System.out.print("Enter number of elements:");
			Scanner sc=new Scanner(System.in);
			n=sc.nextInt();
			int arr[]=new int[n];
			System.out.print("Enter elements:");
			for(i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
			}
			System.out.println("Elements:");
			for(i=0;i<n;i++)
			{
				System.out.println(arr[i]);
			}
			while(true)
			{
			System.out.println("Enter value you want to search:");
			val=sc.nextInt();
			if(val==-1)
			{
				System.out.println("Exited");
				break;
			}
			boolean found=false;
			for(i=0;i<n;i++)
			{
				if(val==arr[i])
				{
					System.out.println("Element "+val+" Found at "+ i +" index");
					found=true;
					break;
					
				}

			}
			if(!found)
			{
				System.out.println("Not found");
			}
			}
				
		}
}
