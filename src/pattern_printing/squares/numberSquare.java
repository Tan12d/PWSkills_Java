package pattern_printing.squares;

import java.util.Scanner;

public class numberSquare
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        int m= sc.nextInt();

        for(int i=1;i<=m;i++)
        {
            for(int j=1;j<=m;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}
