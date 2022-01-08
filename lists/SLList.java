public class SLList
{

    public static class IntNode 
    {
        public int item;
        public IntNode next;

        public IntNode(int i, IntNode n) 
        {
            item = i;
            next = n;
        }
    }
    
    private IntNode first;
    private static int size;

    public SLList()
    {
        first = null;
        size = 0;
    }

    public SLList(int x) 
    {
        first = new IntNode(x, null);
        size = 1;
    }

    public void addFirst(int x)
    {
        first = new IntNode(x, first);
        size++;
    }
    
    public void addLast(int x)
    {
        IntNode p = first;
        size++;

        //check if list is empty, then add new node
        if(p == null)
        {
            p = new IntNode(x, null);
        }
        else
        {
            while(p.next != null)
            {
                p = p.next;
            }
            p.next = new IntNode(x, null);
        }
     
    }

    public int size() 
    {
        return size;
    }

    /* Adding the variable size to the class means you don't need
       these method anymore

    public int size(int x)
    {
        int totalSize = 0;
        IntNode p = first;

        if(p.next == null)
        {
            return 1;
        }

        while(p.next != null)
        {
            totalSize++;
            p = p.next;
        }
        return totalSize;
    }
    */

    /* Recursive Method
    private static int size(IntNode p) 
    {
        if (p.next == null) {
        return 1;
    }

        return 1 + size(p.next);
    }

    public int size() 
    {
        return size(first);
    }
    */

    public int getFirst()
    {
        return first.item;
    }
}
