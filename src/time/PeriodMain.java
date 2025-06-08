package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class PeriodMain {
    public static void main(String[] args) {
        //생성
        Period period = Period.ofDays(10);
        System.out.println(period);

        //계산에 사용
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime localDateTime1 = localDateTime.plusDays(10);
        System.out.println(localDateTime);
        System.out.println(localDateTime1);

        //기간의 차이
        LocalDate start = LocalDate.of(2025,01,23);
        LocalDate end = LocalDate.now();
        period = Period.between(start, end);
        System.out.println(period);
        System.out.println(period.getMonths() + ""+ period.getDays());
    }
}
