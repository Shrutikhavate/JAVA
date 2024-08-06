public class App5
{
    public static void main(String[]args)
    {
        int i=1,no;
        no=(int)(Math.random()*100);  //use to select any random number
        System.out.println("Table\n");
        for(i=1;i<=10;i++)
        {
                System.out.println(" "+(no*i));
                
        }
    }
}
