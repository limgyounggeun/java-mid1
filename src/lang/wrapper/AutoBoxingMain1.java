package lang.wrapper;

public class AutoBoxingMain1 {
    public static void main(String[] args) {
        //Primitive-> Wrapper
        int value = 7;
        Integer integer = Integer.valueOf(7);
        // Wrapper -> Primitive
        value = integer.intValue();

    }
}
