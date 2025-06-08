package time.ex;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class TestBetween {
    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2023, 7,28);
        LocalDate end = LocalDate.now();
        Period period = Period.between(start, end);
        long between = ChronoUnit.DAYS.between(start, end);
        System.out.println("시작 날짜 " +  start);
        System.out.println("마지막 날짜 " +  end);
        System.out.println("남은 기간" +  +period.getYears() + " 년 " + period.getMonths()+ "월" + period.getDays() + "일");
        System.out.println(between + "일 남음");

    }
}
