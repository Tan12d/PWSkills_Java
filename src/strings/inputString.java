package strings;

import java.util.Scanner;

public class inputString
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your name: ");

//        String s = sc.next();
        String s = sc.nextLine();

        System.out.print("Hi ");
        System.out.println(s);
    }
}
