package practice;

public class pattern4 
{
		public static void main(String[]args)
		{
			int r=10;
			int i,j;
			for(i=0;i<r;i++)
			{
				for(j=0;j<r;j++)
				{
					if(j<(r-i-1))
					{
						System.out.print(" ");
					}
					else
					{
						System.out.print("*");
					}
				}
				System.out.println();
			}
		}
}


