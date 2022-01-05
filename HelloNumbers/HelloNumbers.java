public class HelloNumbers
{
    public static void main (String[] args)
    {
        int x = 0;
        int temp = 1;
        while (x <= 45)
        {
            System.out.println(x);
            x = x + temp;
            temp++;
            
        }
    }
}