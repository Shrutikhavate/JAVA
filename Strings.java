package practice;
import java.util.*;
public class Strings 
{
	public static void main(String[]args)
	{
		String a,b;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter string 1:");
		a=sc.nextLine();
		System.out.print("Enter string 2:");
		b=sc.nextLine();
		
		//Concatenation
		String c= a+" "+b;
		System.out.println("String after concatenation:" + c);
		
		//length
		System.out.println("Length of string:"+c.length());
		
		//charAt
		for(int i=0;i<c.length();i++)
		{
			System.out.println("Char at "+i+" "+ c.charAt(i));
		}
		
		/*Comparison
		 s1>s2
		 s1==s2
		 s1<s2
		 */
		if(a.compareTo(b)==0)
		{
			System.out.println("Strings are equal");
		}
		else
		{
			System.out.println("Strings are not equal");
		}
	}
}
