package lang.String.builder;

public class StringBuilderMain1_1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("a");
        sb.append("b");
        sb.append("c");
        sb.append("d");
        System.out.println(sb);
        sb.insert(1,"java");
        System.out.println(sb);
        sb.delete(1,5);
        System.out.println(sb);
        System.out.println(sb.reverse());
        String string = sb.toString();
        System.out.println(string);
    }
}
