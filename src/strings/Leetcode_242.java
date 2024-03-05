package strings;

import java.util.Arrays;

public class Leetcode_242
{
    public static void main(String[] args) {
        String s="anagram";
        String t="nagaram";

        boolean res = isAnagram(s,t);

        System.out.println(res);
    }

    public static boolean isAnagram(String s,String t){
        if(s.length()!=t.length()) return false;

        char a[] = s.toCharArray();
        char b[] = t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        for(int i=0;i<a.length;i++)
        {
            if(a[i]!=b[i]) return false;
        }

        return true;
    }
}
