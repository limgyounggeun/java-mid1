package lang.wrapper;

public class MyInteger {
    private final int value;
    public MyInteger(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
    public int compareTo(int x) {
        if(value > x){
            return 1;
        }else if(value < x){
            return -1;
        }else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
