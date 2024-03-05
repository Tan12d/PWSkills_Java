package TwoDimensionalArray;

//LEETCODE 54
public class spiralForm
{
    private static void print(int [][]arr)
    {
        int m= arr.length,n=arr[0].length;

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
//        int arr[][] = {
//                        {1,2,3,4,5},
//                        {6,7,8,9,10},
//                        {11,12,13,14,15},
//                        {16,17,18,19,20},
//                        {21,22,23,24,25},
//                        {26,27,28,29,30}
//                      };

//        int arr[][] = {
//                {1,2,3,4,5},
//                {6,7,8,9,10},
//                {11,12,13,14,15}
//        };

        int arr[][] = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16},
                {17,18,19,20}
        };

        int m= arr.length,n=arr[0].length;

        print(arr);

        System.out.println();

        int min_r=0, max_r= m-1, min_c=0, max_c = n-1;

        while(min_r<=max_r && min_c<=max_c)
        {
            //left to right
            for(int i=min_c;i<=max_c;i++)
            {
                System.out.print(arr[min_r][i]+" ");
            }

            min_r++;

            //top to bottom
            for(int i=min_r;i<=max_r;i++)
            {
                System.out.print(arr[i][max_c]+" ");
            }

            max_c--;

            //right to left
            if(min_r<=max_r)
            {
                for (int i = max_c; i >= min_c; i--)
                {
                    System.out.print(arr[max_r][i]+" ");
                }
            }

            max_r--;

            //bottom to top
            if(min_c<=max_c)
            {
                for (int i = max_r; i >= min_r ; i--)
                {
                    System.out.print(arr[i][min_c]+" ");
                }
            }

            min_c++;
        }



//        while(min_r<=max_r && min_c<=max_c)
//        {
//            //left to right
//            for(int i=min_c;i<=max_c;i++)
//            {
//                System.out.print(arr[min_r][i]+" ");
//            }
//
//            min_r++;
//
//            //top to bottom
//            if(min_r>max_r || min_c>max_c) break;
//
//            for(int i=min_r;i<=max_r;i++)
//            {
//                System.out.print(arr[i][max_c]+" ");
//            }
//
//            max_c--;
//
//            //right to left
//            if(min_r>max_r || min_c>max_c) break;
//
//            if(min_r<=max_r)
//            {
//                for (int i = max_c; i >= min_c; i--)
//                {
//                    System.out.print(arr[max_r][i]+" ");
//                }
//            }
//
//            max_r--;
//
//            //bottom to top
//            if(min_r>max_r || min_c>max_c) break;
//
//            if(min_c<=max_c)
//            {
//                for (int i = max_r; i >= min_r ; i--)
//                {
//                    System.out.print(arr[i][min_c]+" ");
//                }
//            }
//
//            min_c++;
//        }
    }
}
