package arrays;

import java.util.Scanner;

public class initialiseArray
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        int[] arr = {10,20,30,40,50};

        int n=arr.length;
        for(int i =0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
