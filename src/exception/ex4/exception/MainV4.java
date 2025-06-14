package exception.ex4.exception;


import java.util.Scanner;

public class MainV4 {
    public static void main(String[] args) throws NetworkClientExceptionV4 {
        NetworkServiceV4 service = new NetworkServiceV4();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("전송할 문자 : ");
            String input = scanner.nextLine();
            if(input.equals("exit")) {
                break;
            }try{
                service.sendMessage(input);
            }catch (Exception e) {
                exceptionHandler(e);
            }
            System.out.println();
        }
        System.out.println("프로그램을 정상  종료 합니다.");
    }
    //공통예외처리
    private static void exceptionHandler(Exception e) {
        //공통 처리 로직
        System.out.println("사용자 메시지 : 죄송합니다. 알수 없는 문제가 발생했습니다.");
        System.out.println("=개발자용 디버깅 메시지=");
        e.printStackTrace(System.out);
        //e.printStackTrace

        //필요하면 예외별로 별도의 추가 처리 가능
        if(e instanceof SendExceptionV4 sendEx) {
            System.out.println("[전송 오류] 전송 데이터 : " + sendEx.getSedData());
        }
    }
}
