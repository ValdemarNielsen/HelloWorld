package UdviklingsmetoderOPG1;

public class Rectangle extends Shape{
    private float sidelength;
    private float sidelength2;

    public Rectangle(float length, float length2) {
        this.sidelength2 = length2;
        this.sidelength = length;
    }
    @Override
    public float getArea(){
        return sidelength*sidelength2;
    }
}