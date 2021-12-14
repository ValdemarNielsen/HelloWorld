package UdviklingsmetoderOPG1;

public class Square extends Shape{
    private float sidelength;

    public Square(float length) {
        this.sidelength = length;
    }
@Override
    public float getArea(){
        return sidelength*sidelength;
}
}

