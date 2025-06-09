package nested.inner;

public class InnerOuterMain {
    public static void main(String[] args) {
        InnerOuter outer = new InnerOuter();
        InnerOuter outer1 = new InnerOuter();
        InnerOuter.Inner inner = outer1.new Inner();
        inner.print();

        System.out.println("innerClass = " + inner.getClass());
    }
}
