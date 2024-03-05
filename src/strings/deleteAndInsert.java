package strings;

public class deleteAndInsert
{
    public static void main(String[] args) {
        StringBuilder s=new StringBuilder("abcdef");

        System.out.println(s);
        s.deleteCharAt(3);
        System.out.println(s);

        System.out.println(s.charAt(3));

        s.append("xyz");
        System.out.println(s);

        s.delete(2,6); // delete characters from 2 to 5
        System.out.println(s);


        s.insert(2, 'g');
        System.out.println(s);

        s.insert(2, 67);
        System.out.println(s);

        s.insert(2, true);
        System.out.println(s);

        s.insert(2, "svg");
        System.out.println(s);

        s.reverse();
        System.out.println(s);


    }
}
