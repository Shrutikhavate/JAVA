package practice;

public class Pattern10 
{
	public static void main(String[]args)
	{
		int r=5;
		int n=r*2;
		int i,j;
		for(i=0;i<r;i++)
		{
			for(j=0;j<n;j++)
			{
				if(j>=r-i && j<=n-i-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
