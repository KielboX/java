public class sort 
{
        public static void selSort(String[] x, int start)
        {

            if(start == x.length)
            {
                return;
            }

            //find smallest
            int smallestIndex = findSmallest(x, start);
            //move it to the front
            swap(x, start, smallestIndex);
            //selection sort the rest
            selSort(x, start + 1);

        }
        
        public static int findSmallest(String[] x, int start) {
            int smallestIndex = start;
            for (int i = start; i < x.length; i += 1) {
                int cmp = x[i].compareTo(x[smallestIndex]);
                if (cmp < 0) {
                    smallestIndex = i;
                }
            }
            return smallestIndex;
        }

        public static void swap(String[] x, int a, int b)
        {
            String temp = x[a];
            x[a] = x[b];
            x[b] = temp;
        }

        
}
