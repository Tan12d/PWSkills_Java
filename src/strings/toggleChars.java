package strings;

import java.util.Scanner;

public class toggleChars
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);

        StringBuilder s2 = new StringBuilder(sc.nextLine());

        System.out.println(s2);

        int n=s2.length();

        for(int i=0;i<n;i++)
        {
            char ch = s2.charAt(i);
            int ascii = (int)ch;

            if(ascii>=65 && ascii<=90)
            {
                s2.setCharAt(i, (char)(ch+32));
            }

            else if(ascii>=97 && ascii<=122)
            {
                s2.setCharAt(i,(char)(ch-32));
            }
        }

        System.out.println(s2);
    }
}
