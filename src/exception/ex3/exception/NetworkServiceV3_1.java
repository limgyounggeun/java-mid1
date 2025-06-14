package exception.ex3.exception;



public class NetworkServiceV3_1 {
    public void sendMessage(String data){
        String address = "http://example.com";
        NetworkClientV3 client = new NetworkClientV3(address);
        client.initError(data); // 추가

        try {
            client.connect();
            client.send(data);
        } catch (SendExceptionV3 e) {
            System.out.println("[전송 오류] 주소 :" + e.getSedData() +  ",메시지: " + e.getMessage());
        } catch (ConnectExceptionV3 e) {
            System.out.println("[연결 오류]주소 : " + e.getAddress() + ", 메시지 : " + e.getMessage());
        } finally {
            client.disconnect();
        }
    }
}
