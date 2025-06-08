package time.ex;

import java.time.*;
import java.time.temporal.TemporalAdjusters;

public class Test2 {
    public static void main(String[] args) {
        int year = 2020;
        int month = 12;
        LocalDate date = LocalDate.of(year, month, 1);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        DayOfWeek with = date.with(TemporalAdjusters.lastDayOfMonth()).getDayOfWeek();
        System.out.println(dayOfWeek);
        System.out.println(with);

        ZonedDateTime seoul = ZonedDateTime.of(LocalDateTime.of(2024, 1, 1, 0, 0), ZoneId.of("Asia/Seoul"));
        System.out.println("서울 시간 : " + seoul);
        ZonedDateTime london = seoul.withZoneSameInstant(ZoneId.of("Europe/London"));
        System.out.println("런선 시간 : " + london);
        ZonedDateTime usa = seoul.withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println("뉴욕 시간 : " + usa);
    }
}
