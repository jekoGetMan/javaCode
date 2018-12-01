package HomeWork4.tsk1;

public class Triangle extends Shape implements getSquare {
    double side, height;

    public Triangle(double side, double height) {
        this.side = side;
        this.height = height;
    }

    @Override
    public double getSquare() {
        return side*height/2.0;
    }
}