package TwoDimensionalArray;

// LEETCODE 118

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalTriangle
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        int n= sc.nextInt();

        List<List<Integer>> v = new ArrayList<>(n);

//        for(int i=0;i<n;i++)
//        {
//            v.add(new ArrayList<>(i+1));
//        }

//        int val=0;
//
//        for(int i=0;i<n;i++)
//        {
//            for(int j=0;j<=i;j++)
//            {
//                if(j==0 || j==i)
//                {
//                    v.get(i).add(1);
//                }
//
//                else
//                {
//                    val = v.get(i-1).get(j-1) + v.get(i-1).get(j);
//                    v.get(i).add(val);
//                }
//            }
//        }
//
//        for(int i=0;i<n;i++)
//        {
//            for(int j=0;j<v.get(i).size();j++)
//            {
//                System.out.print(v.get(i).get(j)+" ");
//            }
//            System.out.println();
//        }

//        for(int i=0;i<n;i++)
//        {
//            List<Integer> a=new ArrayList<>();
//            for(int j=0;j<=i;j++)
//            {
//                a.add(1);
//            }
//            v.add(a);
//        }
//
//        for(int i=2;i<n;i++)
//        {
//            for(int j=1;j<=i-1;j++) {
//                v.get(i).set(j, v.get(i - 1).get(j - 1) + v.get(i - 1).get(j));
//            }
//        }
//
//        for(int i=0;i<n;i++)
//        {
//            for(int j=0;j<v.get(i).size();j++)
//            {
//                System.out.print(v.get(i).get(j)+" ");
//            }
//            System.out.println();
//        }


        for(int i=0;i<n;i++)
        {
            List<Integer> a=new ArrayList<>();
            for(int j=0;j<=i;j++)
            {
                if(j==0 || j==i)
                {
                    a.add(1);
                }

                else
                {
                    a.add(v.get(i-1).get(j-1) + v.get(i-1).get(j));
                }
            }
            v.add(a);
        }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<v.get(i).size();j++)
            {
                System.out.print(v.get(i).get(j)+" ");
            }
            System.out.println();
        }

    }
}
