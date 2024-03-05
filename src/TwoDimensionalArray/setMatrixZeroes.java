package TwoDimensionalArray;
// LEETCODE -73

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class setMatrixZeroes
{
    //Method-1
//    public static void setZeroes(int[][] arr)
//    {
//        int m=arr.length,n=arr[0].length,target=0;
//
//        int t[];
//
//        if(m==1 && n==1)
//        {
//            t = new int[2];
//        }
//
//        else
//        {
//            t = new int[m*n];
//        }
//
//        int z=0;
//
//        for (int i = 0; i < m; i++)
//        {
//            for (int j = 0; j < n; j++)
//            {
//                if(arr[i][j]==target && z<t.length)
//                {
//                    t[z++]=i;
//                    t[z]=j;
//                }
//                z++;
//            }
//        }
//
//        for(int c=0;c<z;c++)
//        {
//            System.out.print(t[c]+" ");
//        }
//
//        System.out.println();
//
//        for(int k=0;k<z;k+=2)
//        {
//            int x=t[k];
//            int y=t[k+1];
//
//            for(int p=0;p<m;p++)
//            {
//                arr[p][y]=0;
//            }
//
//            for(int q=0;q<n;q++)
//            {
//                arr[x][q]=0;
//            }
//        }
//
//        for(int p=0;p<m;p++)
//        {
//            for(int q=0;q<n;q++)
//            {
//                System.out.print(arr[p][q]+" ");
//            }
//            System.out.println();
//        }
//    }


    //Method-2
//    public static void setZeroes(int arr[][])
//    {
//        int m=arr.length,n=arr[0].length;
//
//        int helper[][] = new int[m][n];
//
//        for(int p=0;p<m;p++)
//        {
//            for (int q = 0; q < n; q++)
//            {
//                helper[p][q]=arr[p][q];
//            }
//        }
//
//        for(int i=0;i<m;i++)
//        {
//            for(int j=0;j<n;j++)
//            {
//                if(helper[i][j]==0)
//                {
//                    //set the ith row and jth col to 0 in arr
//
//                    for(int b=0;b<n;b++)
//                    {
//                        arr[i][b]=0;
//                    }
//
//                    for(int a=0;a<m;a++)
//                    {
//                        arr[a][j]=0;
//                    }
//                }
//            }
//        }
//
//        for(int p=0;p<m;p++)
//        {
//            for(int q=0;q<n;q++)
//            {
//                System.out.print(arr[p][q]+" ");
//            }
//            System.out.println();
//        }
//    }


    //Method-3
//    public static void setZeroes(int arr[][])
//    {
//        int m=arr.length,n=arr[0].length;
//
//        boolean row[]=new boolean[m];
//        boolean col[]=new boolean[n];
//
//        int flag=0;
//
//        //marking particular row and col
//        for(int i=0;i<m;i++)
//        {
//            for(int j=0;j<n;j++)
//            {
//                if(arr[i][j]==0)
//                {
//                    row[i]=true;
//                    col[j]=true;
//                }
//            }
//        }
//
//        //set the 'true' rows to 0
//        for(int i=0;i<m;i++)
//        {
//            if(row[i]) //set ith row to 0
//            {
//                for(int j=0;j<n;j++)
//                {
//                    arr[i][j]=0;
//                }
//            }
//        }
//
//        //set the 'true' cols to 0
//        for(int j=0;j<n;j++)
//        {
//            if(col[j]) //set jth row to 0
//            {
//                for(int i=0;i<m;i++)
//                {
//                    arr[i][j]=0;
//                }
//            }
//        }
//
//        for(int p=0;p<m;p++)
//        {
//            for(int q=0;q<n;q++)
//            {
//                System.out.print(arr[p][q]+" ");
//            }
//            System.out.println();
//        }
//    }


    //Method-4
//    public static void setZeroes(int arr[][])
//    {
//        int m=arr.length,n=arr[0].length;
//
//        boolean zero_r=false,zero_c=false;
//
//        if(m==1 && n==1)
//        {
//            if(arr[0][0]==0)
//            {
//                arr[0][0]=0;
//            }
//        }
//
//        else if(m>1 || n>1)
//        {
//            for(int j=0;j<n;j++)
//            {
//                if(arr[0][j]==0)
//                {
//                    zero_c=true;
//                    break;
//                }
//            }
//
//            for (int i = 0; i < m; i++)
//            {
//                if(arr[i][0]==0)
//                {
//                    zero_r=true;
//                    break;
//                }
//            }
//
//
//            //traverse in the sub-matrix without 0th row & 0th col
//            for(int i=1;i<m;i++)
//            {
//                for(int j=1;j<n;j++)
//                {
//                    if(arr[i][j]==0)
//                    {
//                        arr[i][0]=0;
//                        arr[0][j]=0;
//                    }
//                }
//            }
//
//            for(int i=0;i<m;i++)
//            {
//                for(int j=0;j<n;j++)
//                {
//                    System.out.print(arr[i][j]+" ");
//                }
//                System.out.println();
//            }
//
//            System.out.println();
//
//            //traverse in the 0th row
//            for(int j=1;j<n;j++)
//            {
//                if(arr[0][j]==0) //set jth col to 0
//                {
//                    for(int i=1;i<m;i++)
//                    {
//                        arr[i][j]=0;
//                    }
//                }
//            }
//
//            for(int i=0;i<m;i++)
//            {
//                for(int j=0;j<n;j++)
//                {
//                    System.out.print(arr[i][j]+" ");
//                }
//                System.out.println();
//            }
//
//            System.out.println();
//
//            //traverse in the 0th col
//            for(int i=1;i<m;i++)
//            {
//                if(arr[i][0]==0) //set ith row to 0
//                {
//                    for(int j=1;j<n;j++)
//                    {
//                        arr[i][j]=0;
//                    }
//                }
//            }
//
//            for(int i=0;i<m;i++)
//            {
//                for(int j=0;j<n;j++)
//                {
//                    System.out.print(arr[i][j]+" ");
//                }
//                System.out.println();
//            }
//
//            if(arr[0][0]==0)
//            {
//                for(int i=1;i<m;i++)
//                {
//                    arr[i][0]=0;
//                }
//
//                for(int j=1;j<n;j++)
//                {
//                    arr[0][j]=0;
//                }
//            }
//
//            if(zero_c)
//            {
//                for(int j=0;j<n;j++)
//                {
//                    arr[0][j]=0;
//                }
//            }
//
//            if(zero_r)
//            {
//                for(int i=0;i<m;i++)
//                {
//                    arr[i][0]=0;
//                }
//            }
//
//            for(int i=0;i<m;i++)
//            {
//                for(int j=0;j<n;j++)
//                {
//                    System.out.print(arr[i][j]+" ");
//                }
//                System.out.println();
//            }
//        }
//
//        else if(m==1 && n>1)
//        {
//            for(int j=0;j<n;j++)
//            {
//                arr[0][j]=0;
//            }
//        }
//
//        else if(n==1 && m>1)
//        {
//            for(int i=0;i<m;i++)
//            {
//                arr[i][0]=0;
//            }
//        }
//
//        System.out.println("\n\n");
//
//        for(int i=0;i<m;i++)
//        {
//            for(int j=0;j<n;j++)
//            {
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
//    }

    public static void setZeroes(int arr[][])
    {
        int m=arr.length,n=arr[0].length;

        boolean zerRow=false, zeroCol=false;

        // check the 0th row
        for (int j = 0; j < n; j++)
        {
            if(arr[0][j]==0)
            {
                zerRow=true;
                break;
            }
        }

        //check the 0th col
        for (int i = 0; i < m; i++)
        {
            if(arr[i][0]==0)
            {
                zeroCol=true;
                break;
            }
        }

        //traverse in the sub-matrix without 0th row & 0th col
        for(int i=1;i<m;i++)
        {
            for(int j=1;j<n;j++)
            {
                if(arr[i][j]==0)
                {
                    arr[i][0]=0;
                    arr[0][j]=0;
                }
            }
        }
        //traverse in the 0th row
        for(int j=1;j<n;j++)
        {
            if(arr[0][j]==0) //set jth col to 0
            {
                for(int i=1;i<m;i++)
                {
                    arr[i][j]=0;
                }
            }
        }


        //traverse in the 0th col
        for(int i=1;i<m;i++)
        {
            if(arr[i][0]==0) //set ith row to 0
            {
                for(int j=1;j<n;j++)
                {
                    arr[i][j]=0;
                }
            }
        }

        if(zerRow) //set the 0th row to 0
        {
            for (int j = 0; j < n; j++)
            {
                arr[0][j]=0;
            }
        }

        if(zeroCol)
        {
            for (int i = 0; i < m; i++)
            {
                arr[i][0]=0;
            }
        }

        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
//        int arr[][] = {{0,1,2,8},{5,6,7,0},{12,11,10,13}};

//        int arr[][] = {{0}};

//        int arr[][] = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};

        int arr[][]={{1,2,2,11,21},{3,0,24,21,9},{6,10,7,0,-8},{0,4,19,3,99}};
        setZeroes(arr);
    }
}
