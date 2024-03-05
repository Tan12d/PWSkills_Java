package Conditionals;

import java.util.Scanner;

public class calculatorIfElse
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter 1st number: ");
        int a=sc.nextInt();

        System.out.println("Enter the operator: ");
        char op=sc.next().charAt(0);

        System.out.println("Enter 2nd number: ");
        int b=sc.nextInt();

        if(op== '+') System.out.println(a+b);

        if(op== '-') System.out.println(a-b);

        if(op== '*') System.out.println(a*b);

        if(op== '/') System.out.println(a/b);

    }
}
