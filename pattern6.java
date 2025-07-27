package practice;

public class pattern6 
{
	public static void main(String[]args)
	{
		int r=5;
		int i,j;
		for(i=0;i<r;i++)
		{
			for(j=1;j<=r;j++)
			{
				if(j<=r-i)
				{
					System.out.print(j+" ");
				}
			}
			System.out.println();
		}
	}
}
