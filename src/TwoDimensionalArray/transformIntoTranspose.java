package TwoDimensionalArray;

public class transformIntoTranspose
{
    private static void print(int [][]arr)
    {
        int m= arr.length,n=arr[0].length;

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};

        print(arr);
        int m= arr.length,n=arr[0].length;

        System.out.println();

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<i;j++)
            {
                int t=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=t;
            }
        }

        print(arr);
    }
}
