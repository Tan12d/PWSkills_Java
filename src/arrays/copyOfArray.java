package arrays;
import java.util.Arrays;

public class copyOfArray
{
    public static void main(String[] args) {
        int[] arr = {30, 10, 40, 23, 89, 34};

        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println();

        /*
        int nums[]=arr; //shallow copy

        nums[0]=70;

        System.out.println(arr[0]);
        for(int i:nums)
        {
            System.out.print(i+" ");
        }

         */

        int nums1[] = Arrays.copyOf(arr,arr.length);

        System.out.println();
        for(int i:nums1)
        {
            System.out.print(i+" ");
        }

        nums1[0]=77;
        System.out.println("\n"+arr[0]);
    }
}
