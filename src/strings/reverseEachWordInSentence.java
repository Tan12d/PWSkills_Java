package strings;

import java.util.Scanner;

public class reverseEachWordInSentence
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        StringBuilder sb=new StringBuilder(sc.nextLine());
        int n=sb.length();
        //METHOD-1
        int i=0,j=0;

        while(j<n)
        {
            if(sb.charAt(j)!=' ') j++;

            else{
                reverse(sb,i,j-1);
                i= j+1;
                j=i;
            }
        }
        reverse(sb,i,j-1); // for last word reverse

        System.out.println(sb);


        //Method-2

//        String str = "I AM TANMOY DAS";
//        System.out.println(str);
//        String[] s1 = str.split(" ");
//        StringBuilder s2 = new StringBuilder();
//
//        for(String i:s1)
//        {
//            StringBuilder t = new StringBuilder(i);
//            s2.append(t.reverse());
//            s2.append(" ");
//        }
//
//        System.out.println(s2);
    }

    public static void reverse(StringBuilder sb, int i, int j)
    {
        while(i<=j)
        {
            char temp = sb.charAt(i);
            sb.setCharAt(i,sb.charAt(j));
            sb.setCharAt(j,temp);

            i++;
            j--;
        }
    }
}
