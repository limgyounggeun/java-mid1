package lang.String.chaining;

public class MethodChainingMain3 {
    public static void main(String[] args) {
        ValueAdder valueAdder = new ValueAdder();
        int rs =valueAdder.add(1).add(2).add(3).getValue();
        System.out.println(rs);
    }
}
