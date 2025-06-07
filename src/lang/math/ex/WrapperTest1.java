package lang.math.ex;

public class WrapperTest1 {
    public static void main(String[] args) {
        String str1 = "10";
        String str2 = "20";

        int a = Integer.parseInt(str1);
        int b = Integer.parseInt(str2);
        System.out.println(a + b);

        String[] arr = {"1.5", "2.5", "3.5"};
        double sume = 0;
        for(String s : arr) {
            sume += Double.parseDouble(s);
        }
        System.out.println(sume);

        String str = "100";

        int integer1 = Integer.parseInt(str);
        Integer integer2 = Integer.valueOf(integer1);
        int integer3 = integer2.intValue();
        System.out.println(integer1);
        System.out.println(integer2);
        System.out.println(integer3);
    }
}
