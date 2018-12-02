package HomeWork4.tsk1;

public class Trapezium extends Shape implements FigureSquare{
    double trapeziumTopBase;
    double trapeziumDownBase;
    double trapeziumHeight;

    public Trapezium(double trapeziumTopBase, double trapeziumDownBase, double trapeziumHeight) {
        Math.abs(trapeziumTopBase);
        Math.abs(trapeziumDownBase);
        Math.abs(trapeziumHeight);
        this.trapeziumTopBase = trapeziumTopBase;
        this.trapeziumDownBase = trapeziumDownBase;
        this.trapeziumHeight = trapeziumHeight;
    }

    @Override
    public double figureSquare() {
        return (0.5 * (trapeziumTopBase + trapeziumDownBase) * trapeziumHeight);
    }
}