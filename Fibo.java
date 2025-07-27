package practice;

import java.util.Scanner;

public class Fibo
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many Fibonacci numbers to print: ");
        int n = sc.nextInt();

        int a = 0, b = 1;
        for(int i = 1; i <= n; i++)
        {
            System.out.println(a);
            int sum = a + b;
            a = b;
            b = sum;
        }

        sc.close();
    }
}
