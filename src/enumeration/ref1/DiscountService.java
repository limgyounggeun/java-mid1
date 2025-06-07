package enumeration.ref1;



public class DiscountService {
    public int discount(ClassGrade classGrade, int price) {
        int discount = classGrade.getDiscountPercent();
        return price * discount / 100;
    }

}
