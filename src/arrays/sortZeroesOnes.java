package arrays;

public class sortZeroesOnes
{
    public static void main(String[] args)
    {
//        int arr[]= {1,1,0,0,1,0,1,1,1,0,1,0};
        int arr[]= {0,0,0,1,1,1};
        int n=arr.length;

//        //Method 1
//        int noOfZeroes=0,noOfOnes=0;
//
//        for(int i=0;i<n;i++)
//        {
//            if(arr[i]==0)
//            {
//                noOfZeroes++;
//            }
//        }
//
//        for(int i=0;i<n;i++)
//        {
//            if(i<noOfZeroes)
//            {
//                arr[i]=0;
//            }
//
//            else
//            {
//                arr[i]=1;
//            }
//        }
//
//        for(int i:arr)
//        {
//            System.out.print(i+" ");
//        }


        //Method 2

        int i=0,j=n-1;

        while(i<j)
        {
            if(arr[i]==0)
            {
                i++;
            }

            else if(arr[j]==1)
            {
                j--;
            }

//            if(i>j)
//            {
//                break;
//            }

            else if(arr[i]==1 && arr[j]==0)
            {
                arr[i]=0;
                arr[j]=1;
                i++;
                j--;
            }

//            if(i==j-1)
//            {
//                break;
//            }
        }

        for(int k:arr)
        {
            System.out.print(k+" ");
        }



    }
}
