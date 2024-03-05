package arrays;
// Dutch Flag Algorithm
public class sortZeroesOnesTwos
{
    public static void main(String[] args) {
        int arr[]={2,0,2,1,1,0};
//        int n=arr.length;

        //Method-1
//        int zero=0,one=0,two=0;
//
//
//        for(int i=0;i<n;i++)
//        {
//            if(arr[i]==0) zero++;
//            if(arr[i]==1) one++;
//        }
//
//        for(int i=0;i<n;i++)
//        {
//            if(i<zero)
//                arr[i]=0;
//
//            else if(i<(zero+one))
//                arr[i]=1;
//
//            else
//                arr[i]=2;
//
//        }
//
//        for(int i:arr)
//        {
//            System.out.print(i+" ");
//        }



        //Method-2
        int n= arr.length-1;
        int low = 0;
        int high = n;
        int mid = 0;

        while(mid<=high)
        {
            if(arr[mid]==0)
            {
                int t=arr[low];
                arr[low]=arr[mid];
                arr[mid]=t;

                low++;
                mid++;
            }

            else if(arr[mid]==1)
            {
                mid++;
            }

            else if(arr[mid]==2)
            {
                int t=arr[mid];
                arr[mid]=arr[high];
                arr[high]=t;

                high--;
            }
        }

        for(int i:arr)
        {
            System.out.print(i+" ");
        }






























        
    }
}
