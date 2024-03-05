package arrays;

public class sumOfArray
{
    public static void main(String[] args)
    {
        int arr[] = {23,5,78,76,31,75};

        int sum=0;

        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }

        System.out.println(sum);
    }
}
