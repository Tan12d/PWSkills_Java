package pattern_printing.compositePattern;

import java.util.Scanner;

public class starPyramidMethodTwo
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();

        int nsp=m-1;
        int nst=1;

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= nsp; j++) {
                System.out.print(" "+" ");
            }

            for (int j = 1; j <=nst; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
            nsp--;
            nst+=2;
        }
    }
}
