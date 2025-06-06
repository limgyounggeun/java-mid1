package lang.ex;

import java.util.Random;

public class WrapperTest2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] lottoNumbers = new int[6];
        int cnt = 0;

        while (cnt < 6) {
            int number = rand.nextInt(45) + 1;
            boolean isDuplicate = false;

            // 중복 검사
            for (int i = 0; i < cnt; i++) {
                if (lottoNumbers[i] == number) {
                    isDuplicate = true;
                    break;
                }
            }

            // 중복이 아니면 배열에 추가
            if (!isDuplicate) {
                lottoNumbers[cnt] = number;
                cnt++;
            }
        }

        // 결과 출력
        for (int num : lottoNumbers) {
            System.out.print(num + " ");
        }
    }
}
