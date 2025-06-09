package nested.anonymous.ex;

import java.util.Random;

public class Ex1RefMainV4 {
    public static void hello(Process p){
        System.out.println("프로그램 시작");
        // 코드 조각 시작
        p.run();
        // 코드 조각 종료
        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {

        hello(()->{
                // 코드 조각 시작
                int i = new Random().nextInt(6) + 1;
                System.out.println("[Rf] 주사위 값 : " + i);
                // 코드 조각 종료
            });
        hello(()->{
                // 코드 조각 시작
                for(int i =1; i<4; i++){
                    System.out.println("[Rf]i = "+i);
                }
            });
    }
}
