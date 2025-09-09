package String;

public class Strbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");
        System.out.println(sb);

        // inserting
        // sb.insert(0, 'S');
        // System.out.println(sb);

        sb.insert(4, 'o');
        System.out.println(sb);

        // deleting
        // sb.delete(0, 1);
        // System.out.println(sb);

        sb.delete(4, 5);
        System.out.println(sb);

        // reverse
        sb.reverse();
        System.out.println(sb);

        StringBuilder cb = new StringBuilder("h");
        cb.append("e");
        cb.append("l");
        cb.append("l");
        cb.append("o");
        System.out.println(cb);

    }

}
