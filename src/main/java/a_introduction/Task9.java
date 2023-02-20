package a_introduction;

public class Task9 {
    public static void main(String[] args) {
        double a = 0.6;
        double b = 0.5;
        double c = 0.9;

        double lowest = minFrom(a,b,c);
        System.out.println("The lowest number is "+ lowest);


    }

    public static double minFrom(double a, double b, double c) {
        double smallest;

        System.out.println("A is " + a + ", B is " + b + ", C is " + c);

        if (a <= b && a <= c) {
            smallest = a;
        } else if (b <= c && b <= a) {
            smallest = b;
        } else {
            smallest = c;
        }

        return smallest;
    }


}
