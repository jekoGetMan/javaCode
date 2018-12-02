package HomeWork4.tsk1;

public class Parallelogram extends Shape implements getSquare{
    double parallelogramBase;
    double parallelogramHeight;

    public Parallelogram(double parallelogramBase, double parallelogramHeight) {
        this.parallelogramBase = parallelogramBase;
        this.parallelogramHeight = parallelogramHeight;
    }

    @Override
    public double getSquare() {
        return parallelogramBase * parallelogramHeight;
    }
}