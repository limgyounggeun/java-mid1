package time.ex;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Formatter;

public class test1 {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.of(2024, 1, 1, 0, 0, 0);
        System.out.println("기존 시각 : " + ldt);
        LocalDateTime after = ldt.plusYears(1).plusMonths(2).plusDays(3).plusHours(4);
        System.out.println("1년 2개월 3일 4시간 후 시각 : " + after);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일  HH시 mm분 ss초 ");
        String format = after.format(dateTimeFormatter);
        System.out.println(format);


        LocalDate localDate = LocalDate.of(2024, 1, 1);
        for(int i = 0; i < 5; i++){
            localDate= localDate.plusDays(14);
//            localDate= localDate.plus(2*i, ChronoUnit.WEEKS);
            System.out.println(localDate);
        }

        for(int i = 0; i < 5; i++){
            localDate= localDate.plus(2*i, ChronoUnit.WEEKS);
            System.out.println(localDate);
        }
    }
}
