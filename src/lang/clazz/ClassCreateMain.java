package lang.clazz;

public class ClassCreateMain {
    public static void main(String[] args) throws Exception {
        Class<?> helloClass = Hello.class;
        Hello hello = (Hello) helloClass.getDeclaredConstructor().newInstance();
        String rs = hello.Hello();
        System.out.println(rs);
    }
}
