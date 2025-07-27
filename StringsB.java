package practice;

public class StringsB 
{
	public static void main(String[]args)
	{
		StringBuilder sb=new StringBuilder("Shruti");
		System.out.println(sb);
		
		//insert
		sb.insert(0,"S");
		System.out.println(sb);
		
		//char at
		System.out.println(sb.charAt(3));
		
		//delete
		System.out.println(sb.delete(0, 2));
		
	}

}
