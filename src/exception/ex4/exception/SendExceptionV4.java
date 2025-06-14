package exception.ex4.exception;


public class SendExceptionV4 extends NetworkClientExceptionV4 {

    private final String sedData;

    public SendExceptionV4(String sedData, String message) {
        super(message);
        this.sedData = sedData;
    }

    public String getSedData() {
        return sedData;
    }
}
