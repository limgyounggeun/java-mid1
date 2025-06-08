package time;

import java.time.Instant;
import java.time.ZonedDateTime;

public class InstantMain {
    public static void main(String[] args) {
        //생성
        Instant instant = Instant.now();//UTC기준
        System.out.println(instant);

        ZonedDateTime now = ZonedDateTime.now();
        Instant instant1 = Instant.from(now);
        System.out.println(instant1);

        Instant instant2 = Instant.ofEpochSecond(0);
        System.out.println(instant2);

        Instant instant3 = Instant.ofEpochSecond(3600000);
        System.out.println(instant3);

        //조회
        long laterEpochSecond = instant3.getEpochSecond();
        System.out.println(laterEpochSecond);
    }
}
