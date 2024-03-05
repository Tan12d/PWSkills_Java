package TwoDimensionalArray;

import java.util.ArrayList;
import java.util.List;

public class matrixMultiplication
{
    public static void printarr(int a[][])
    {
        int m=a.length,n=a[0].length;

        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        int a[][]={{1,2,1},{2,1,2}};
        int b[][]={{1,0,1,2},{2,1,0,0},{0,3,1,1}};

        printarr(a);

        System.out.println();

        printarr(b);

        System.out.println();

        if(a[0].length!=b.length)
        {
            System.out.println("Multiplication not Possible");
        }

        else
        {
            int m=a.length,n=b[0].length;

            int c[][]=new int[m][n];

            for (int i = 0; i < m; i++)
            {
                for (int j = 0; j < n; j++)
                {
                    // c[i][j] = a[i][0] * b[0][j] + a[i][1] * b[1][j] + a[i][2] * b[2][j]
                    for (int k = 0; k < a[0].length; k++)
                    {
                        c[i][j] += a[i][k] * b[k][j];
                    }
                }
            }

            printarr(c);

        }
    }
}
