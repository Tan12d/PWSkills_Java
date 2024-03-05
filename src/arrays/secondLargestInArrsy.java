package arrays;

public class secondLargestInArrsy
{
    public static void main(String[] args)
    {
        int arr[] = {23,5,78,76,31,75};

        int mx=Integer.MIN_VALUE;

        for(int i=1;i<arr.length;i++)
        {
            mx=Math.max(mx,arr[i]);
        }

        int smx=Integer.MIN_VALUE;

        for(int i=1;i<arr.length;i++)
        {
//            if(arr[i]!=mx)
//            {
//                smx=Math.max(smx,arr[i]);
//            }

            if(arr[i]>smx && arr[i]!=mx)
            {
                smx =arr[i];
            }
        }

        System.out.println(mx);
        System.out.println(smx);
    }
}
