package lang.immutable.ex;

public class ImmutableMyDateMain {
    public static void main(String[] args) {
        ImmutableMyDate date = new ImmutableMyDate(2015, 1, 1);
        System.out.println(date);
        ImmutableMyDate date1 = date.withYear(2016);
        System.out.println(date1);
    }
}
