package pattern_printing.specialPatterns;

import java.util.Scanner;

public class starTriangleFlipped
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();


        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= m; j++) {
                if(i+j>m)
                {
                    System.out.print("*"+" ");
                }
                else
                {
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }
    }
}
