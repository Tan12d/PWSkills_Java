package arrays;
import java.util.Arrays;

public class builtInMethods
{
    public static void main(String[] args)
    {
        int[] arr={30,10,40,23,89,34};

        for(int i:arr)
        {
            System.out.print(i+" ");
        }

        Arrays.sort(arr);
        System.out.println();

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
