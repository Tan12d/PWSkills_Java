package pattern_printing.triangles;

import java.util.Scanner;

public class starTriangleHorizontallyFlipped
{
    public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);

            int m= sc.nextInt();

            for(int i=1;i<=m;i++)
            {
                for(int j=1;j<=m+1-i;j++)
                {
                    System.out.print("*"+" ");
                }
                System.out.println();
            }

        }


}
