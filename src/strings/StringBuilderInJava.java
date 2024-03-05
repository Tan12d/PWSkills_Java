package strings;

public class StringBuilderInJava
{
    public static void main(String[] args)
    {
        String s = new String("Raghav");
        StringBuilder sb = new StringBuilder("Raghav");

        System.out.println(sb.length());
        System.out.println(sb.capacity()); // 16(default) + s.length()

        StringBuilder x = new StringBuilder();
        System.out.println(x);
        System.out.println(x.length());

        StringBuilder x1 = new StringBuilder("");
        System.out.println(x1);
        System.out.println(x1.length());

        StringBuilder x2 = new StringBuilder(10);
        System.out.println(x2);
        System.out.println(x2.length());
        System.out.println(x2.capacity());

        String s1 = "abc";
        StringBuilder sb1 = new StringBuilder(s1);

        System.out.println(sb1.length());
        System.out.println(sb1.capacity());

        String s2 = "";
        StringBuilder sb2 = new StringBuilder(s2);
        StringBuilder sb3 = new StringBuilder();
        System.out.println(sb2.capacity()); //default value
        System.out.println(sb3.capacity());
    }
}
