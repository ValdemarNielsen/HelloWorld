package Lektion5;

public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public boolean equals(Point x) {
        if (this.x == x.x && this.y == x.y) {
            return true;
        }
        else{
            return false;
        }

    }
}
