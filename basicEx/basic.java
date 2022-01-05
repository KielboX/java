public class basic
{
    public static void drawTriangle(int N)
    {
        int temp = 1;
        for(int i = 0; i < N; i++)
        {
            for(int j = 0; j < temp; j++)
            {
                System.out.print("*");
            }
            temp++;
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        drawTriangle(10);
    }
}