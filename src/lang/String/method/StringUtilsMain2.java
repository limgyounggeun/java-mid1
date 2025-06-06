package lang.String.method;

public class StringUtilsMain2 {
    public static void main(String[] args) {

        int num = 100;
        boolean  bool = true;
        String str = "Hello, Java!";

        //format메서드
        String format1 = String.format("%d, %s, %b", num, str, bool);
        System.out.println(format1);

        String format2 = String.format("%.2f", 10.7878);
        System.out.println(format2);

        System.out.printf("%.2f", 10.7878);
    }
}
