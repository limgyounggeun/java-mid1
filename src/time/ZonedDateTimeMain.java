package time;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeMain {
    public static void main(String[] args) {
        ZonedDateTime nowZdt = ZonedDateTime.now();
        System.out.println(nowZdt);

        LocalDateTime localDateTime = LocalDateTime.of(2030,1,1,1,30);
        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, ZoneId.of("Asia/Seoul"));
        System.out.println(zonedDateTime);

        ZonedDateTime utc = nowZdt.withZoneSameInstant(ZoneId.of("UTC"));
        System.out.println(utc);
    }
}
