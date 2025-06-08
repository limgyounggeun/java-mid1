package time;

import java.time.LocalTime;

public class LocalTimeMain {
    public static void main(String[] args) {
        LocalTime nowTime = LocalTime.now();
        LocalTime localTime = LocalTime.of(9, 10, 30);
        System.out.println(nowTime);
        System.out.println(localTime);

        //계산(불변)
        LocalTime ofTimePlus = localTime.plusSeconds(30);
        System.out.println("지정 시간+30s = " + ofTimePlus);
    }
}
