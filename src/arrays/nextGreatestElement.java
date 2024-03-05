package arrays;

public class nextGreatestElement
{
    public static void main(String[] args)
    {
        int arr[] = {12,8,41,60,2,49,16,28,21};

        int n=arr.length;

        int ans[]= new int[n];
        ans[n-1] = -1;

        //Method-1 //Brute Force
//        for(int i=0;i<n-1;i++)
//        {
//            int mx= Integer.MIN_VALUE;
//            for(int j=i+1;j<n;j++)
//            {
//                mx = Math.max(mx,arr[j]);
//            }
//            ans[i]=mx;
//        }
//
//        for(int ele:ans)
//        {
//            System.out.print(ele+" ");
//        }


        //Method-2

        int nge = arr[n-1];
        for(int i=n-2;i>=0;i--)
        {
            ans[i]=nge;
            nge = Math.max(nge, arr[i]);
        }

        for(int ele:ans)
        {
            System.out.print(ele+" ");
        }
    }
}
