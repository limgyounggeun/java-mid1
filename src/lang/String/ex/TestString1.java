package lang.String.ex;

public class TestString1 {
    public static void main(String[] args) {
        String url = "https://www.example.com";
        System.out.println("result = " + url.startsWith("https"));

        String[] arr = {"hello", "java", "jvm", "spring", "jpa"};
        int sum = 0;
        for(String s : arr) {
            System.out.println(s+ " : " + s.length());
            sum += s.length();
        }
        System.out.println("sum = " + sum);

        String str = "hello.txt";
        int start = str.indexOf(".txt");
        System.out.println("index = " + start);
        String fileName = str.substring(0,start);
        String fileExt = str.substring(start);
        System.out.println("fileName = " + fileName);
        System.out.println("fileExt = " + fileExt);

        String str1 = "hello.txt";
        String ext = ".txt";
        int a = str1.indexOf(ext);
        System.out.println(a);

        fileName = str.substring(0,str.indexOf(ext));
        System.out.println("fileName = " + fileName);
        System.out.println("fileExt = " + fileExt);
    }
}
