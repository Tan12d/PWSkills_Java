package strings;

public class maxValue
{
    public static void main(String[] args)
    {
        String arr[]={"4556554654636364363634", "0000000000004334", "746745", "56354" , "0025"};

//        int max = Integer.parseInt(arr[0]);
//
//        for(int i=1;i< arr.length;i++)
//        {
//            int n=Integer.parseInt(arr[i]);
//            max  =  Math.max(max,n);
//        }
//
//        System.out.println(max);

        String maxS = arr[0];

        for(int i=1;i< arr.length;i++)
        {
            maxS = max(maxS, arr[i]);
        }

        System.out.println(maxS);
    }

    public static String max(String s, String t)
    {
        String a = purify(s), b = purify(t);

        if(a.length()>b.length()) return s;

        if(a.length()<b.length()) return t;

        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)!=b.charAt(i))
            {
                if(a.charAt(i)>b.charAt(i)) return s;

                else return t;
            }
        }

        if(s.length()>=t.length()) return s;
        else return t;
    }

    public static String purify(String s)
    {
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=0) return s.substring(i);
        }

        return s;
    }
}
