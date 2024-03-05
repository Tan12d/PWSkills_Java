package arrays;

public class mergeTwoSortedArrays
{
    public static void main(String[] args)
    {
        int a[] = {11,33,42,62};
        int b[] = {26,54,69,81,99,100};

        int c[] = new int[a.length+b.length];
        int i=0,j=0,k=0;

        //merging
        while(i<a.length && j<b.length)
        {
            if(a[i]<=b[j])
            {
                c[k]=a[i];
                i++;
            }

            else
            {
                c[k]=b[j];
                j++;
            }

            k++;
        }

        if(i==a.length)
        {
            while(j<b.length)
            {
                c[k]=b[j];
                k++;
                j++;
            }
        }

        if(j==b.length)
        {
            while(i<a.length)
            {
                c[k]=a[i];
                k++;
                i++;
            }
        }

        for(int p:c)
        {
            System.out.print(p+" ");
        }

    }
}
