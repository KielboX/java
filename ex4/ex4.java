public class ex4 
{
    public static void windowPosSum(int[] a, int n)
    {
        for(int i = 0; i < a.length; i++)
        {
            if(a[i] < 0)        //se è negativo salta un ciclo
                continue;
            if(i == a.length() - 1)  //se è arrivato all'ultimo 
                break;             //ferma il ciclo

            for(int j = 1; j <= n; j++)
            {
                if( (i + j) > a.length - 1)    //se finiscono i numeri da 
                {                   //sommare salta un ciclo
                    continue;
                }
                a[i] = a[i] + a[i + j];
            }
        }
    }
    public static void main(String[] args) 
    {
        int[] a = {1, 2, -3, 4, 5, 4};
        int n = 3;
        windowPosSum(a, n);

        System.out.println(java.util.Arrays.toString(a));
    }
}
