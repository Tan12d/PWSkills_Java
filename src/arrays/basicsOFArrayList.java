package arrays;

import java.util.ArrayList;

public class basicsOFArrayList
{
    public static void main(String[] args)
    {
        int arr[]= new int[5];

        ArrayList<Integer> a=new ArrayList<>(5);

        a.add(0,10); //arr[0]=10
        a.add(1,20);
        a.add(2,30);
        a.add(3,40);
        a.add(4,50);

        for(int i=0;i<a.size();i++)
        {
            System.out.print(a.get(i)+" ");
        }

        System.out.println();

        a.set(2,300); //modify

        System.out.println(a);

        a.add(90);

        System.out.println(a);
    }
}
