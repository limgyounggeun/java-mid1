package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime ofDt = LocalDateTime.of(2013, 11, 21, 23, 59);
        System.out.println("현재 날짜 시간 = " + now);
        System.out.println("지정 날짜 시간 = " + ofDt);

        //날짜와 시간 분리
        LocalTime localTime = ofDt.toLocalTime();
        LocalDate localDate = ofDt.toLocalDate();
        System.out.println("시간만 " + ofDt.toLocalTime());
        System.out.println("날짜만만 " + ofDt.toLocalDate());

        //날짜와 시간 합체
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        System.out.println("합체 " + localDateTime);

        //계산(불변_
        LocalDateTime ofDateTime = ofDt.plusDays(10);
        System.out.println(ofDateTime);
        System.out.println(ofDateTime.plusYears(1));

        //비교
        System.out.println("현재 날짜시간이 지정 날짜시간보다 이전인가? " +ofDt.isBefore(now));
        System.out.println("현재 날짜시간이 지정 날짜시간보다 이후인가? " +ofDt.isAfter(now));
        System.out.println("현재 날짜시간이 지정 날짜시간과 같은가? " +ofDt.isEqual(now));

        LocalDateTime signUp = LocalDateTime.of(2026, 11, 21, 23, 59);
        System.out.println(signUp.isAfter(ofDt));


    }
}
