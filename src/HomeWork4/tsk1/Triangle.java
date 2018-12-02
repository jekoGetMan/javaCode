package HomeWork4.tsk1;

public class Triangle extends Shape implements getSquare {
    double triagleBase;
    double triangleHeight;

    public Triangle(double triagle_base, double triangle_height) {
        Math.abs(triagle_base);
        Math.abs(triangle_height);
        this.triagleBase = triagle_base;
        this.triangleHeight = triangle_height;

    }

    @Override
    public double getSquare() {
        return (0.5*triagle_base)*triangle_height;
    }
}