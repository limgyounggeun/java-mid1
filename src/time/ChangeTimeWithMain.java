package time;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class ChangeTimeWithMain {
    public static void main(String[] args) {
        LocalDateTime ld = LocalDateTime.of(2018, 1,1, 13,30,59);
        System.out.println("ld = " + ld);

        System.out.println("ld.with(ChronoField.YEAR, 2020) = " + ld.with(ChronoField.YEAR, 2020));
        System.out.println("ld.withYear(2021) = " + ld.withYear(2021));

        //TemporalAdjuster 사용
        //다음주 금요일
        System.out.println("ld.with(TemporalAdjusters.next(DayOfWeek.FRIDAY)) = " + ld.with(TemporalAdjusters.next(DayOfWeek.FRIDAY)));

        //이번달의 마지막 일요일
        System.out.println("ld.with(TemporalAdjusters.lastDayOfMonth(DayOfWeek.MONDAY)) = " + ld.with(TemporalAdjusters.lastInMonth(DayOfWeek.MONDAY)));

    }
}
