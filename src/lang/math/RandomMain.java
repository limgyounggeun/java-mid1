package lang.math;

import java.util.Random;

public class RandomMain {
    public static void main(String[] args) {

        //Random random = new Random();
        Random random = new Random(1); //seed가 같으면 Random의 결과가 같다.

        int randomInt = random.nextInt();
        System.out.println(randomInt);

        double randomDouble = random.nextDouble();
        System.out.println(randomDouble);

        boolean randomBoolean = random.nextBoolean();
        System.out.println(randomBoolean);

        //범위 조회
        int randomRange = random.nextInt(10); // 0~9까지 출력
        System.out.println(randomRange);

        int i = random.nextInt(45) + 1; // 1~ 10까지 출력
        System.out.println(i);
    }
}
