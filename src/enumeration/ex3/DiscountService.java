package enumeration.ex3;


import static enumeration.ex3.Grade.*;

public class DiscountService {
    public int discount(Grade classGrade, int price) {
        int discount = 0;
        if (classGrade == BASIC) {
            discount = 10;
        }else if (classGrade == GOLD) {
            discount = 20;
        }else if (classGrade == DIAMOND) {
            discount = 30;
        }else{
            System.out.println("할인X");
        }
        return price * discount / 100;
    }

}
