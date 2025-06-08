package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingMain1 {
    public static void main(String[] args) {
        //포매팅 날자를 문자로
        LocalDate localDate = LocalDate.of(2021, 5, 23);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
        String format = localDate.format(formatter);
        System.out.println("포멧"+format);
        //파싱 문자를 날자로
        String input = "2030년 05월 23일";
        System.out.println("LocalDate.parse(input, formatter) = " + LocalDate.parse(input, formatter));
    }
}
