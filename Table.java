class Table
{
    public static void main(String[]args)
    {
       int randomNum=(int)(Math.random()*101);
       System.out.println(randomNum+"Table:");
       for(int i=1;i<=10;i++)
       {
           System.out.println(randomNum+"x"+i+"="+randomNum*i);
       }
    }
}
