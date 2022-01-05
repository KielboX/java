public class fib 
{
    public static int doFib(int n, int k, int f0, int f1)
    {
        for(int i = 0; i <=n; i++)
        {
            k = f1;
            f1 = f0 + f1;
            f0 = k;
        }  
        return f1;
    }
    public static void main(String[] args) 
    {
        int n, k, f0, f1;
      System.out.println(doFib(6, 0, 0, 1));
    }
}
