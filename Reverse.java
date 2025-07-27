package practice;
import java.util.*;
public class Reverse 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String input=sc.nextLine();
		StringBuilder sb=new StringBuilder(input);
		StringBuilder reversed = new StringBuilder();
		 for (int i = sb.length() - 1; i >= 0; i--) 
		 {
	           reversed.append(sb.charAt(i)); // Add each character to reversed
	     }
	     // Print the reversed string
	     System.out.println("Reversed String: " +reversed);

		
	}
}
