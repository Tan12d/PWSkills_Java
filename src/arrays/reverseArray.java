package arrays;

public class reverseArray
{
    public static void main(String[] args)
    {
        int[] arr = {30, 10, 40, 23, 89};

        for(int i:arr)
        {
            System.out.print(i+" ");
        }

        System.out.println();

        for(int i=0,j=arr.length-1;i<arr.length && j>=0;i++,j--)
        {
            if(i>j)
            {
                break;
            }

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

//        for(int i=0;i<arr.length/2;i++)
//        {
//            int temp=arr[i];
//            arr[i]=arr[arr.length-1-i];
//            arr[arr.length-1-i]=temp;
//        }
//
//        for(int i:arr)
//        {
//            System.out.print(i+" ");
//        }
    }
}
