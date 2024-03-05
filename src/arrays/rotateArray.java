package arrays;

import java.util.Random;
import java.util.Scanner;

public class rotateArray
{
    public static void main(String[] args) {

        int arr[] = {21,34,54,76,8};

        for(int i:arr)
        {
            System.out.print(i+" ");
        }

        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of steps: ");
        int k=sc.nextInt();

        rotate(arr,k);
    }

    public static void rotate(int arr[],int k)
    {
        int n=arr.length;

        k = k%n;
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);

        for(int i:arr)
        {
            System.out.print(i+" ");
        }
    }

    public static void reverse(int arr[],int i, int j)
    {
        while(i<=j)
        {
            int temp = arr[i];
            arr[i]= arr[j];
            arr[j]=temp;

            i++;
            j--;
        }
    }
}
