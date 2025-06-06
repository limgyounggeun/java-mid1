package lang.String.method;

public class StringComparisonMain {
    public static void main(String[] args) {
        String str1 = "Hello, Java!"; //대문자 일부 있음
        String str2 = "hello, java!"; //대문자 없음 모두 소문자
        String str3 = "Hello, world!";

        System.out.println("str1 equals str2 : " + str1.equals(str2));
        System.out.println("str2 equals str3 : " + str1.equalsIgnoreCase(str2));

        System.out.println("b compareTo a : " + "b".compareTo("a"));
        System.out.println("가 compareTo 나 : " + "가".compareTo("나")); //유니코드로 계산됨 그러므로 차이가 크게 나옴
        char a = '가';
        char b = '나';
        System.out.println((int)a);
        System.out.println((int)b);
        System.out.println(str1.compareToIgnoreCase(str2));

        System.out.println("str1 starts with hello : " + str1.startsWith("Hello"));
        System.out.println("str2 end with Java! : " + str1.endsWith("Java!"));
    }
}
