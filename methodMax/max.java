public class max 
{
    public static int isMax(int[] m)
    {
        int max = 0;
        for(int i = 0; i < 7; i++)
        {
             if (max < m [i])
                {
                    max = m[i];
                }

        }
        return max;
    }   
    public static void main(String[] args)
    {
        int[] num = new int[]{9, 2, 15, 2, 22, 10, 6};
        System.out.println(isMax(num));
    }
}
