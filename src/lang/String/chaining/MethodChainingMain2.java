package lang.String.chaining;

public class MethodChainingMain2 {
    public static void main(String[] args) {
        ValueAdder valueAdder = new ValueAdder();
        ValueAdder adder1 = valueAdder.add(1);
        ValueAdder adder2 = valueAdder.add(2);
        ValueAdder adder3 = valueAdder.add(3);
        int rs = valueAdder.getValue();
        System.out.println("결과 : "+rs);
        System.out.println("addr1 결과 : "+ adder1.getValue());
        System.out.println("addr2 결과 : "+ adder2.getValue());
        System.out.println("addr3 결과 : "+ adder3.getValue());
    }
}
