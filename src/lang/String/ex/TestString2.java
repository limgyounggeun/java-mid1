package lang.String.ex;

public class TestString2 {
    public static void main(String[] args) {
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";

        int count = 0;
        int index = str.indexOf(key);
        while (index >= 0) {
            index = str.indexOf(key, index + 1);
            count++;
        }
        System.out.println(count);

        String original = "      Hello World";
        System.out.println(original.trim());
        System.out.println(original.replace("World", "Java"));
        String email = "choho4843@naver.com";
        String[] parts = email.split("@");
        String idPart = parts[0];
        String domain = parts[1];
        System.out.println(idPart);
        System.out.println(domain);

        String fruit = "apple,banana,mango";
        String[] fruits = fruit.split(",");
        for (String s : fruits) {
            System.out.println(s);
        }
        System.out.println(String.join("->", fruits));

        String s = "Hello Java!";
        System.out.println(new StringBuilder(s).reverse());
    }
}
