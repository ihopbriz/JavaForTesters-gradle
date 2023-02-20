package a_introduction;

public class Task2 {
    public static void main(String[] args) {
        int magic = 2147483647;
        int spell = magic + 1;
        System.out.println(magic);
        System.out.println("Magic plus one " + spell);

        int minusMagic = -2147483648;
        int trick = minusMagic - 1;
        System.out.println("minusMagic minus one " + trick);

        boolean check = magic == trick;
        boolean checkTwo = spell == minusMagic;
        System.out.println(check);
        System.out.println(checkTwo);
    }
}
