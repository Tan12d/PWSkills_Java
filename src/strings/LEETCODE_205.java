package strings;

public class LEETCODE_205
{
    public static void main(String[] args)
    {
        String s ="race";
        String t = "mood";

        boolean res = isIsomprphic(s,t);

        System.out.println(res);
    }

    //Method-1
    public static boolean isIsomprphic(String s, String t)
    {
        char[] a = new char[128];

        for(int i=0;i<s.length();i++)
        {
            char ch =s.charAt(i);
            char dh = t.charAt(i);

            int idx  =(int)ch;

            if(a[idx]=='\0') a[idx] = dh;

            else
            {
                if(a[idx]!=dh)
                {
                    return false;
                }
            }
        }

        for(int i=0;i<a.length;i++)
        {
            a[i]='\0';
        }

        for(int i=0;i<s.length();i++)
        {
            char ch = t.charAt(i);
            char dh = s.charAt(i);

            int idx  =(int)ch;

            if(a[idx]=='\0') a[idx] = dh;

            else
            {
                if(a[idx]!=dh)
                {
                    return false;
                }
            }
        }

        return true;
    }

    //Method-2
//    public boolean isIsomorphic(String s, String t)
//    {
//        if(s.length()==t.length())
//        {
//            String x="",x1="",y="",y1="",z="";
//
//            HashMap<Character,Character> h=new HashMap<Character,Character>();
//
//            LinkedHashSet<Character> h1=new LinkedHashSet<Character>();
//            LinkedHashSet<Character> h2=new LinkedHashSet<Character>();
//
//            for(int i=0;i<s.length();i++)
//            {
//                h1.add(s.charAt(i));
//                h2.add(t.charAt(i));
//            }
//
//            if(h1.size()==h2.size())
//            {
//                x=h1.toString();
//                y=h2.toString();
//
//                x1+=x.charAt(1);
//                y1+=y.charAt(1);
//
//                for(int i=4;i<x.length() ;i+=3)
//                {
//                    x1+=x.charAt(i);
//                    y1+=y.charAt(i);
//                }
//
//                for(int i=0;i<x1.length();i++)
//                {
//                    h.put(x1.charAt(i),y1.charAt(i));
//                }
//
//                x="";
//
//                for(int i=0;i<s.length();i++)
//                {
//                    x+=(h.get(s.charAt(i)));
//                }
//
//                if(t.compareTo(x)==0)
//                    return true;
//            }
//        }
//
//        return false;
//    }
}
