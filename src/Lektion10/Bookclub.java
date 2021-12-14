package Lektion10;

public class Bookclub {
    public static void main(String[] args) {
        // for at printe i loop:   for (int i = 0; i < 10; i++) {

        Book1 ref0 = new Book1("Great Eskimo Vocabulary Hoax",
                812345678, "Pullum, Geoffrey");
        Magazine1 ref1 = new Magazine1("ACM Crossroads", 678078979, 23);
        ref0.content();
        System.out.println();
        ref1.content();
        System.out.println();
        // for loop  }
    }
}