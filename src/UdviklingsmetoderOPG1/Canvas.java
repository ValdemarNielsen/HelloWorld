package UdviklingsmetoderOPG1;

public class Canvas {
    public static void main(String[] args) {
        // Cirkel
        Circle C1 = new Circle(5);
        System.out.println(C1.getArea());
        //Rektangel
        Rectangle R1 = new Rectangle(210, 2);
        System.out.println(R1.getArea());
        // Firkant
        Square SQ1 = new Square(6);
        System.out.println(SQ1.getArea());

    }
}
