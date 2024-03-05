package strings;

import java.util.Scanner;

public class inputStringBuilder
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        String s = sc.nextLine();
        StringBuilder s1 = new StringBuilder(s);

        StringBuilder s2 = new StringBuilder(sc.nextLine());

        System.out.println(s1);
        System.out.println(s2);

        s2.setCharAt(1,'y');
        System.out.println(s2);
    }
}
