package Lektion5;

public class MainPoint {
    public static void main(String[] args) {
        Point p1 = new Point(2,3);
        Point p2 = new Point(7,5);
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        p1.equals(p2);
        System.out.println(p1.equals(p2));
    }




}
