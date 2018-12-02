package HomeWork4.tsk1;

public class Parallelogram extends Shape implements FigureSquare{
    double parallelogramBase;
    double parallelogramHeight;

    public Parallelogram(double parallelogramBase, double parallelogramHeight) {
        Math.abs(parallelogramBase);
        Math.abs(parallelogramHeight);
        this.parallelogramBase = parallelogramBase;
        this.parallelogramHeight = parallelogramHeight;
    }

    @Override
    public double figureSquare() {
        return parallelogramBase * parallelogramHeight;
    }
}