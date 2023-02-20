package a_introduction;

public class Task8 {
    public static void main(String[] args) {

        int price = 5  ;
        double discount = 0.5;

        double yourprice = calculatePrice(price,discount);
        System.out.println("Discounted price is £" + yourprice);
        }


        public static double calculatePrice(int price, double discount) {

        return price - discount;
        }
    }

