package exception.ex3.exception;

public class SendExceptionV3 extends NetworkClientExceptionV3 {

    private final String sedData;

    public SendExceptionV3(String sedData, String message) {
        super(message);
        this.sedData = sedData;
    }

    public String getSedData() {
        return sedData;
    }
}
