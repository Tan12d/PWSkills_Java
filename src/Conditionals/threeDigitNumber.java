package Conditionals;

import java.util.Scanner;

public class threeDigitNumber
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        if(n>99 && n<1000)
        {
            System.out.println("Yes, it's a three digit number");
        }

        else
        {
            System.out.println("No, it's not a 3-digit number");
        }
    }
}
