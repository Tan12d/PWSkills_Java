package pattern_printing.compositePattern;

import java.util.Scanner;

public class numberSpiral
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();

        for (int i = 1; i <= 2*m-1; i++)
        {
            for (int j = 1; j <= 2*m-1; j++)
            {
                int a=i,b=j;

                if(i>m)
                    a=2*m-i;
                if(j>m)
                    b=2*m-j;

                System.out.print(m+1-Math.min(a,b)+ " ");
            }

            System.out.println();
        }
    }
}
