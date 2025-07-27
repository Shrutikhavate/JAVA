package practice;
import java.util.*;
public class Button 
{
	public static void main(String[]args)
	{
		int button;
		Scanner sc=new Scanner(System.in);
		System.out.println("PRESS 0 TO EXIT");
		
		while(true)
		{
		System.out.print("Enter button number :");
		button=sc.nextInt();
		
		if(button==0)
		{
			System.out.println("Terminated");
			break;
		}
		switch(button)
		{
		case 1:
			System.out.println("Hello");
			break;
		case 2:
			System.out.println("Namaste");
			break;
		case 3:
			System.out.println("Bonjour");
			break;
		default:
			System.out.println("Invalid button");
			break;
		}
		
		}
	}
}
