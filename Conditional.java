package practice;
import java.util.*;
public class Conditional 
{
	public static void main(String[]args)
	{
	int age;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter your age:");
	age=sc.nextInt();
	if(age>=18)
	{
		System.out.println("Eligible to vote");
	}
	else
	{
		System.out.println("Sorry try after few more years");
	}
	}
	
}
