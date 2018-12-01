package HomeWork4.tsk1;

public class Trapezium extends Shape implements getSquare {
    double baseTop, baseBottom, height;

    public Trapezium(double baseTop, double baseBottom, double height) {
        this.baseTop = baseTop;
        this.baseBottom = baseBottom;
        this.height = height;
    }

    @Override
    public double getSquare() {
        return (baseBottom + baseTop) * height / 2.0;
    }
}