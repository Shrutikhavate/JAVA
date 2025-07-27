package practice;

public class Increment 
{
	public static void main(String[]args)
	{
		int a=10;
		int b=0;
		
		//preincrement
		//hitha pahila increment hote mg assign hote mhnje pahila a will become 11 and then b la assign hoil so output 11 11 asel
		b=++a;
		System.out.println(a);
		System.out.println(b);
		
		/*postincrement  use value and change the value means first b=a and then a++.. so when a is printed it is 11 and b remains 10
		b=a++;
		System.out.println("A:"+a);
		System.out.println("B:"+b)*/
		
		
	}

}





