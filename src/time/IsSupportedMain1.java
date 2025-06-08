package time;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class IsSupportedMain1 {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        //DATE이기 때문에 년월일만 있음 -> 초를 꺼낼수 없다.
        //System.out.println("ld.get(ChronoField.SECOND_OF_MINUTE) = " + ld.get(ChronoField.SECOND_OF_MINUTE));
    }
}
