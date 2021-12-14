package Lektion10;

public class Magazine1 extends ReadinMatter {
    private int weeknumber;

    public Magazine1(String title, long isbn, int weeknumber) {
        super(title, isbn);
        this.weeknumber = weeknumber;
    }

    @Override
    public String toString() {
        return super.toString() + weeknumber;
    }

    @Override
    public void content() {
        super.content();
        System.out.println("weeknumber " + weeknumber);
    }
}
