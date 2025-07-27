package practice;
import java.util.*;

public class SelectionSort 
{
    public static int[] Sort(int a[], int n)
    {
        for (int i = 0; i < n - 1; i++)
        {
            int min = i;
            for (int j = i + 1; j < n; j++)
            {
                if (a[j] < a[min])
                {
                    min = j;
                }
            }
            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
        return a;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements:");
        int n = sc.nextInt();

        int a[] = new int[n];
        System.out.println("Enter Elements:");
        for (int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }

        a = Sort(a, n);

        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++)
        {
            System.out.print(a[i] + " ");
        }
    }
}
