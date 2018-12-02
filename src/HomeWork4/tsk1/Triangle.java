package HomeWork4.tsk1;

public class Triangle extends Shape implements FigureSquare{
    double triagleBase;
    double triangleHeight;

    public Triangle(double triagleBase, double triangleHeight) {
        Math.abs(triagleBase);
        Math.abs(triangleHeight);
        this.triagleBase = triagleBase;
        this.triangleHeight = triangleHeight;

    }

    @Override
    public double figureSquare() {
        return (0.5*triagleBase)*triangleHeight;
    }
}