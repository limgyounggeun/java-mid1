    package lang.String.equals;

public class StringEqualsMain2 {
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println("메서드 호출 비교 1 " + equals(str1, str2));

        String str3 = "hello";
        String str4 = "hello";

        System.out.println("메서드 호출 비교 2 " + equals(str3, str4));
    }
    public static boolean equals(String str1, String str2) {
       // return str1 == str2; 문자열비교는 항상 .equals 로 해야함 동일성 비교 X 동등성 비교해야한다
        return str1.equals(str2);
    }
}
