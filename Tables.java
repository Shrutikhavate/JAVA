//tables from 2 to 20
class Tables
{
    public static void main(String[]args)
    {
        int n=2,i;
        while(n<20)
        {
            System.out.println();
            for(i=1;i<=10;i++)
            {
                System.out.println(n+"x"+i+"="+n*i);
            }
            n++;
        }
    }
}
