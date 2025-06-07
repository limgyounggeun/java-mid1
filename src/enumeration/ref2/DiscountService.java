package enumeration.ref2;


import static enumeration.ref2.Grade.*;

public class DiscountService {
    public int discount(Grade classGrade, int price) {
        int discount = classGrade.getDiscountPercent();
        return price * discount / 100;
    }

}
