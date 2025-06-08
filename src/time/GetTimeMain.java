package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class GetTimeMain {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2030, 1, 1, 13, 30,27);
        System.out.println(localDateTime.getYear());
        System.out.println(localDateTime.getMonthValue());
        System.out.println(localDateTime.getDayOfMonth());
        System.out.println(localDateTime.getHour());
        System.out.println(localDateTime.getMinute());
        System.out.println(localDateTime.getSecond());
        System.out.println(localDateTime.getNano());
        System.out.println("localDateTime.get(ChronoField.YEAR) = " + localDateTime.get(ChronoField.YEAR));
        System.out.println("localDateTime.get(ChronoField.MONTH_OF_YEAR) = " + localDateTime.get(ChronoField.MONTH_OF_YEAR));
        System.out.println("localDateTime.get(ChronoField.DAY_OF_MONTH) = " + localDateTime.get(ChronoField.DAY_OF_MONTH));
        System.out.println("localDateTime.get(ChronoField.HOUR_OF_DAY) = " + localDateTime.get(ChronoField.HOUR_OF_DAY));
        System.out.println("localDateTime.get(ChronoField.SECOND_OF_MINUTE) = " + localDateTime.get(ChronoField.SECOND_OF_MINUTE));

    }
}
