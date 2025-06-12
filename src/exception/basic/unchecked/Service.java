package exception.basic.unchecked;

public class Service {
    Client client = new Client();

    public void callCatch(){
        try{
            client.call();
        }catch(MyUncheckedException e){
            //예외처리 로직
            System.out.println("예외처리, msg "+e.getMessage());
        }
        System.out.println("정상로직");
    }

    public void callThrow(){
        client.call();
    }
}
