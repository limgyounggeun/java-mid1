package lang.String;

public class StringConcatMain {
    public static void main(String[] args) {
        String a = "hello";
        String b = " Java";

        String result = a.concat(b);
        String result2 = a+b;
        System.out.println(result);
        System.out.println(result2);
    }
}
