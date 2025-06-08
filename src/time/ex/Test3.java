package time.ex;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("연도를 입력하세요");
        int year = sc.nextInt();
        System.out.println("월을 입력하세요");
        int month = sc.nextInt();

        printCalender(year, month);

    }
    public static void printCalender(int Year, int month){
        LocalDate firstDayOfMonth = LocalDate.of(Year, month, 1);
        LocalDate firstDayOfNextMonth = firstDayOfMonth.plusMonths(1);

        //월요일 = 1 일요릴 7
        int offsetWeekDays = firstDayOfMonth.getDayOfWeek().getValue() % 7;
        System.out.println("Su Mo To We Th Fr Sa");
        for(int i = 0; i < offsetWeekDays; i++){
            System.out.print("   ");
        }
        LocalDate dayIterator = firstDayOfMonth;
        while(dayIterator.isBefore(firstDayOfNextMonth)){
            System.out.printf("%2d ",dayIterator.getDayOfMonth());
            if(dayIterator.getDayOfWeek() == DayOfWeek.SATURDAY){
                System.out.println();
            }
            dayIterator = dayIterator.plusDays(1);
        }
    }
}
