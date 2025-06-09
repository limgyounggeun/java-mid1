package nested.nested.test;

public class AnonymousMain {
    public static void main(String[] args) {
        Hello h = new Hello() {
            @Override
            public void hello() {
                System.out.println("hello");
            }
        };
        h.hello();
    }
}
