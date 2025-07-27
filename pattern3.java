package practice;

public class pattern3 
{
	public static void main(String[]args)
	{
		int r=10;
		int i,j;
		for(i=0;i<r;i++)
		{
			for(j=0;j<(r-i);j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
