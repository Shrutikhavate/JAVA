package practice;

public class Pattern8 
{
	public static void main(String[]args)
	{
		int i,j;
		int r=5;
		for(i=1;i<=r;i++)
		{
			for(j=1;j<=i;j++)
			{
				if((i+j)%2==0)
				{
				System.out.print("1 ");
				}
				else
				{
				System.out.print("0 ");
				}
			}
			System.out.println();
		}
	}

}

