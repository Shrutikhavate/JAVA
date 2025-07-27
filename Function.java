package practice;
import java.util.*;
public class Function 
{
	public static void printNm(String nm)
	{
		System.out.println(nm);
		return;
	}
	public static void main(String[]args)
	{
		System.out.println("Enter name:");
		Scanner sc=new Scanner(System.in);
		String nm=sc.nextLine();
		printNm(nm);
		
	}

}
