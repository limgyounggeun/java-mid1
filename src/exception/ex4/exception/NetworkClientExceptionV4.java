package exception.ex4.exception;

public class NetworkClientExceptionV4 extends RuntimeException {

    private String errorCode;

    public NetworkClientExceptionV4(String message) {
        super(message);
    }
}
