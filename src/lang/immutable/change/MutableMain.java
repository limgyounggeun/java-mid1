package lang.immutable.change;

public class MutableMain {
    public static void main(String[] args) {
        MutableObj m = new MutableObj(10 );
        m.add(10);
        System.out.println("m.getValue() :"+ m.getValue());
    }
}
