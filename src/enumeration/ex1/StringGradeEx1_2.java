package enumeration.ex1;


public class StringGradeEx1_2 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
        //존재하지 않는 등급
        int vip = discountService.discount("VIP", price);
        System.out.println(vip);
    }
}
