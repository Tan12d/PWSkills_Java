package TwoDimensionalArray;

import java.util.Scanner;

public class Search2DMatrix
{
    public static boolean searchMatrix(int[][] arr, int target)
    {
        int m=arr.length,n=arr[0].length;

        //starting from top-right corner
        int i=0,j=n-1;

        while(i<m && j>=0)
        {
            if(arr[i][j]==target) return true;

            else if(arr[i][j]>target) //left
            {
                j--;
            }

            else // bottom
            {
                i++;
            }
        }

        return false;

        //starting from left-bottom corner
        // int i=m-1,j=0;

        // while(i>=0 && j<n)
        // {
        //     if(arr[i][j]==target) return true;

        //     else if(arr[i][j]<target) //right
        //     {
        //         j++;
        //     }

        //     else //top
        //     {
        //         i--;
        //     }
        // }

        // return false;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        int arr[][] = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};

        int target = sc.nextInt();
        boolean res = searchMatrix(arr,target);

        System.out.println(res);
    }
}
