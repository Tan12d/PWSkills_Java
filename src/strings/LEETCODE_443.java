package strings;

public class LEETCODE_443
{
    public static void main(String[] args)
    {
        char []chars = {'a','a','b','b','c','c','c'};

        int res= compress(chars);
        System.out.println(res);
    }

//    //METHOD-1
//    public static int compress(char[] a)
//    {
//        String ans = "";
//
//        int i=0,j=0;
//
//        while(j<a.length)
//        {
//            if(a[i]==a[j]) j++;
//
//            else
//            {
//                ans+=a[i];
//                int len = j-i;
//
//                if(len>1) ans+=len;
//                i=j;
//            }
//        }
//
//        ans += a[i];
//        int len = j-i;
//
//        if(len>1) ans+=len;
//
//        for (int k = 0; k < ans.length(); k++) {
//            a[k]=ans.charAt(k);
//        }
//
//        System.out.println(ans);
//
//        return ans.length();
//    }


    //METHOD-2
//    public int compress(char[] chars)
//    {
//        if(chars.length==1)
//            return 1;
//
//        else
//        {
//            int c1=0;
//
//            String t="";
//
//            for(int i=0;i<chars.length;i++)
//            {
//                c1=0;
//                for(int j=i;j<chars.length;j++)
//                {
//                    if(chars[i]==chars[j])
//                        c1++;
//
//                    else
//                        break;
//                }
//
//                if(i==0 )
//                {
//                    t+=chars[i];
//
//                    if(c1!=1)
//                    {
//                        t+=c1;
//                    }
//                }
//
//                else
//                {
//                    if(chars[i]!=chars[i-1])
//                    {
//                        t+=chars[i];
//
//                        if(c1!=1)
//                            t+=+c1;
//                    }
//                }
//            }
//
//            int j=0;
//
//            Arrays.fill(chars, '\0');
//
//            for(int i=0;i<chars.length && j<t.length();i++,j++)
//            {
//                chars[i]=(t.charAt(j));
//            }
//
//            return t.length();
//        }
//    }

    //METHOD-3
    public static int compress(char[] a)
    {
        StringBuilder ans = new StringBuilder("");

        int i=0,j=0;

        while(j<a.length)
        {
            if(a[i]==a[j]) j++;

            else
            {
                ans.append(a[i]);
                int len = j-i;

                if(len>1) ans.append(len);
                i=j;
            }
        }

        ans.append(a[i]);
        int len = j-i;

        if(len>1) ans.append(len);

        for (int k = 0; k < ans.length(); k++) {
            a[k]=ans.charAt(k);
        }

        System.out.println(ans);

        return ans.length();
    }
}
