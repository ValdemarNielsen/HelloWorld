package UdviklingsmetoderOPG1;

public class Circle extends Shape{
    private float radius;

// laver constructor:
    public Circle(float radius) {
        this.radius = radius;
    }

    @Override
    public float getArea() {

        return radius*radius*PI;
    }
}
