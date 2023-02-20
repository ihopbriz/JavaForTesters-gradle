package a_introduction;

public class Task10 {
    public static void main(String[] args) {
        String title = "Treasure Island";
        String author ="Robert Louis Stevenson";
        String illustrator ="Pirate Drawer-Bloke";

        String fullBook = bookDetails(title,author,illustrator);
        System.out.println(fullBook);

    }


    public static String bookDetails(String title, String author, String illustrator) {
        String bookStuff = title + ", written by " + author + " was illustrated by " + illustrator;
        return bookStuff;
    }

}
