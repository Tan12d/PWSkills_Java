package Loops_Assignment_Questions;

public class rough
{
    public static void main(String[] args) {

        int n=5;

        int res = fib(n-1);

        System.out.println(res);


    }

    public static int fib(int n)
    {
        if(n==0 || n==1) {
            return n;
        }

        else
        {
            return fib(n-1)+fib(n-2);
        }
    }
}
