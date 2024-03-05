package strings;

public class stringFunctions
{
    public static void main(String[] args)
    {
        String s1= "Physics Wallah Skills";

        System.out.println(s1.contains((" Walla ")));
        System.out.println(s1.contains((" Wallah ")));

        System.out.println(s1.startsWith("P"));
        System.out.println(s1.startsWith("Phy"));

        System.out.println(s1.endsWith("P"));
        System.out.println(s1.endsWith("lls"));

        System.out.println(s1.toLowerCase());

        String a= "tanmoy";
        System.out.println(a.toUpperCase());

        String x="abc";
        String y="xyz";
        System.out.println(x+y);
        System.out.println(s1.concat(a));


    }
}
