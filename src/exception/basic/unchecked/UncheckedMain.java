package exception.basic.unchecked;

public class UncheckedMain {
    public static void main(String[] args) {
        Service service = new Service();
        service.callThrow();
    }
}
