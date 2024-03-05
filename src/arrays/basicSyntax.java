package arrays;

public class basicSyntax
{
    public static void main(String[] args)
    {
        int[] arr; //declaration
        arr = new int[5]; //memory allocation

        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;

        System.out.println(arr[0]+" ");
        System.out.println(arr[1]+" ");
        System.out.println(arr[2]+" ");
        arr[3] = 45;
        System.out.println(arr[3]+" ");
        arr[4] += 1;
        System.out.println(arr[4]+" ");
    }
}
