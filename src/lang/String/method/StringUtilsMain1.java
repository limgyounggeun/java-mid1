package lang.String.method;

public class StringUtilsMain1 {
    public static void main(String[] args) {
        int num = 100;
        boolean  bool = true;
        Object obj = new Object();
        String str = "Hello, Java!";

        //valueOf 메서드
        String numString = String.valueOf(num);
        System.out.println(numString);
        String boolString = String.valueOf(bool);
        System.out.println(boolString);
        String objString = String.valueOf(obj);
        System.out.println(objString);

        //문자 + x -> 문자
        String str2 = ""+num;
        System.out.println(str2);

        //toCharArray메서드
        char[] strArray = str.toCharArray();
        for (char c : strArray) {
            System.out.print(c);
        }
    }
}
