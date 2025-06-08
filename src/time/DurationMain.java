package time;

import java.time.Duration;
import java.time.LocalTime;

public class DurationMain {
    public static void main(String[] args) {
        Duration duration = Duration.ofMinutes(30);
        System.out.println(duration);
        LocalTime localTime = LocalTime.of(1, 0);
        System.out.println(localTime);
        LocalTime plus = localTime.plus(duration);
        System.out.println(plus);

        //시간 차이
        LocalTime start = localTime.of(9,0);
        LocalTime end = localTime.of(10,0);
        Duration between = duration.between(start, end);
        System.out.println(between);
    }
}
