package lang.wrapper;

public class AutoBoxingMain2 {
    public static void main(String[] args) {
        //Primitive-> Wrapper
        int value = 7;
        Integer integer =value; //오토박싱
        // Wrapper -> Primitive
        value = integer; //오토언박싱
        
    }
}
