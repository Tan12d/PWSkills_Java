package TwoDimensionalArray;

public class rowWiseAndColumnWisePrinting
{
    public static void main(String[] args)
    {
        int arr[][] = {{1,2},{3,4},{5,6}};

        int m=arr.length,n=arr[0].length;

        //row-wise
//        for(int i=0;i<m;i++)
//        {
//            for(int j=0;j<n;j++)
//            {
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
//
//        //column-wise
//        for(int i=0;i<n;i++)
//        {
//            for(int j=0;j<m;j++)
//            {
//                System.out.print(arr[j][i]+" ");
//            }
//            System.out.println();
//        }

        int transpose[][] = new int[n][m];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                transpose[i][j] = arr[j][i];
            }
            System.out.println();
        }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }


    }
}
