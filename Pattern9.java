package practice;

public class Pattern9 
{
	public static void main(String[] args)
	{
		int r = 5;
		int n = r * 2;

		// Upper half
		for(int i = 0; i <r; i++)
		{
			for(int j = 0; j < n; j++)
			{
				if(j <= i || j >= n - i - 1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}

		// Lower half
		for(int i = r - 1; i >= 0; i--)
		{
			for(int j = 0; j < n; j++)
			{
				if(j <= i || j >= n - i - 1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
