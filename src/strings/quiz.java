package strings;

public class quiz
{
    public static void main(String[] args) {
        String str1 = "hello";

        String str2 = "hello";

        boolean result = (str1 == str2);
        System.out.println(result);

        String str = "fd";

        str = str.intern();

        System.out.println(str);
    }
}
