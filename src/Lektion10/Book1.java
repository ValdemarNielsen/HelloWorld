package Lektion10;

public class Book1 extends ReadinMatter {
    private String title;
    private long isbn;
    private String author;

    public Book1(String title, long isbn, String auth) {
        super(title, isbn);
        author = auth;
    }

    public String toString() {

        return title + "\t" + isbn + "\t" + author;
    }

    public void content() {
        System.out.println("Title: " + title);
        System.out.println("ISBN: " + isbn);
        System.out.println("Author: " + author);
    }
}

