package arrays;

import java.util.ArrayList;

public class ArrayLIstAdd
{
    public static void main(String[] args)
    {
        ArrayList<Integer> a = new ArrayList<>(5);

        System.out.println(a+" "+a.size());
        a.add(40);
        System.out.println(a+" "+a.size());
        a.add(50);
        System.out.println(a+" "+a.size());
        a.add(100);
        System.out.println(a+" "+a.size());
        a.add(22);
        System.out.println(a+" "+a.size());

        a.remove(1); //index
        System.out.println(a+" "+a.size());
    }
}
