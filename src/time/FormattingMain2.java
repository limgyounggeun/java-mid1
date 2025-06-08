package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingMain2 {
    public static void main(String[] args) {
        //포메팅 : 날짜와 시간을 문자로
        LocalDateTime localDate = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String format = localDate.format(formatter);
        System.out.println(localDate);
        System.out.println(format);

        //파싱 문자를 날짜와 시간으로
        System.out.println(LocalDateTime.parse(format, formatter));
    }
}
