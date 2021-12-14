package Lektion10;

import java.security.PublicKey;

public class ReadinMatter {
    private String title;
    private long isbn;

    public ReadinMatter(String title, long isbn) {
        this.isbn = isbn;
        this.title = title;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "title= " + title + '\'' +
                "isbn= " + isbn;
    }

    public void content() {
        System.out.println("Title: " + title);
        System.out.println("ISBN: " + isbn);
    }
}
