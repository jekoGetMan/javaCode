package HomeWork4.tsk1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Сергей on 20.10.2014.
 * Задание 1.
 * Допустимыми фигурами являются круг Ring, треугольник Triangle, параллелограмм Parallelogram
 * и трапеция Trapezium. В классе допустимых фигур Shape определить операцию сложения,
 * если суммой фигур служит сумма их площадей.
 */
public  class Shape {

    public static void main (String[] args){
//        List<getSquare> shapes = new ArrayList<getSquare>();
//        shapes.add(new Ring(5.7));
//        shapes.add(new Parallelogram(8.7, 2.0));
//        shapes.add(new Triangle (6.8, 10.0));
//        shapes.add(new Trapezium (6.8, 10.0, 15.8));
//
//        double squareSum = sumShapeSquare(shapes);
//
//        System.out.printf("%.2f", squareSum);
        Triangle triangle = new Triangle(6.8, 6.0);
        Trapezium trapezium = new Trapezium(6.8, 10.0, 15.8);
        Parallelogram parallelogram = new Parallelogram(8.7, 2.0);
        Ring ring = new Ring(5.7);

        double squareSum = sumShapeSquare(trapezium.getSquare(), triangle.getSquare(), parallelogram.getSquare(), ring.getSquare());
        double sum = trapezium.getSquare() + triangle.getSquare() + parallelogram.getSquare() + ring.getSquare();
//        System.out.printf("%.2f", squareSum);
//        System.out.println(sum);
    }

    private static double sumShapeSquare(double squareSum) {
        double squareSum = 0.0;
        for(int i = 0; i <= 4; i++)
            squareSum += i;
        return squareSum;
    }

}
