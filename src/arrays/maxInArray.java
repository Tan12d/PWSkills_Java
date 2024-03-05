package arrays;

public class maxInArray
{
    public static void main(String[] args)
    {
        int arr[] = {23,5,78,76,31,75};

//        int mx=arr[0];

        int mx=Integer.MIN_VALUE;

        for(int i=1;i<arr.length;i++)
        {
//            if(mx<arr[i])
//            {
//                mx=arr[i];
//            }

            mx=Math.max(mx,arr[i]);
        }

        System.out.println(mx);
    }
}
