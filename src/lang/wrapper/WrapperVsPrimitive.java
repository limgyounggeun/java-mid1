package lang.wrapper;

public class WrapperVsPrimitive {
    public static void main(String[] args) {
        int iterations = 1_000_000_000;
        long startTime, endTime;

        // 기본형 long 사용
        long sumPrimitive = 0;
        startTime = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            sumPrimitive += i;
        }
        endTime = System.nanoTime();
        System.out.println("sumPrimitive : " + sumPrimitive);
        System.out.println("기본자료형 long 실행 시간: " + ((endTime - startTime) / 1_000_000_000.0) + "초");

        // 래퍼 클래스 Long 사용
        Long sumWrapper = Long.valueOf(0);
        startTime = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            sumWrapper += i;
        }
        endTime = System.nanoTime();
        System.out.println("sumWrapper : " + sumWrapper);
        System.out.println("래퍼자료형 Long 실행 시간: " + ((endTime - startTime) / 1_000_000_000.0) + "초");
    }
}
