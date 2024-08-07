

class Prime
{
    public static void main(String[]args)
    {
       int n=1,i;
       String str="Prime Numbers";
       while(n<100)
       {
           for(i=2;i<n;i++)
           {
               if(n%i==0)
               {
                   break;
               }
            }
               if(i==n)
               {
                  str=str+" "+n;
                   
               }
               n++;
            }
            System.out.println(str);
       
       
    }
}
