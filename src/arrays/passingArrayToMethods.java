package arrays;

public class passingArrayToMethods
{
    public static void main(String[] args)
    {
//        int x=5;
//        System.out.println(x);
//        change(x);
//        System.out.println(x);

        int[] arr = {10,20,30,40};
        System.out.println(arr[0]);
        change(arr);
        System.out.println(arr[0]);
    }

    public static void change(int x[])
    {
        x[0]=1000;
    }
}
