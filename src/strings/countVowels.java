package strings;

import java.util.Scanner;

public class countVowels
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");

        String s=sc.nextLine();
        int n=s.length();
        int count = 0;

        for (int i = 0; i < n; i++)
        {
            char ch=s.charAt(i);

            if(isVowel(ch)) count++;
        }

        System.out.println("Count = "+count);
    }

    public static boolean isVowel(char c)
    {
        if(c=='a' || c=='A') return true;
        if(c=='e' || c=='E') return true;
        if(c=='i' || c=='I') return true;
        if(c=='o' || c=='O') return true;
        if(c=='u' || c=='U') return true;

        return false;
    }
}
