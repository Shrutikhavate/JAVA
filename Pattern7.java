package practice;

public class Pattern7 
{
	public static void main(String[]args)
	{
		int i,j;
		int z=1;
		int r=5;
		for(i=0;i<r;i++)
		{
			for(j=1;j<=r;j++)
			{
				if(j<=i+1)
				{
					System.out.print(z+" ");
					z++;
				}
			}
			System.out.println();
		}
	}
}
