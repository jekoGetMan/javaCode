package HomeWork4.tsk1;

/*
Задание 4.
        Допустимыми фигурами являются круг Ring, треугольник Triangle,
        параллелограмм Parallelogram и трапеция Trapezium. В классе допустимых
        фигур Shape определить операцию сложения, если суммой фигур служит
        сумма их площадей.
// Static square+=…
*/

public abstract class Shape{

    abstract double figureSquare();

    static double halfSum(Shape shape1, Shape shape2) {
        return (shape1.figureSquare() + shape2.figureSquare());
    }

    public static void main (String[] args){

        //Declaration of objects
        Ring ring = new Ring(3.2);
        Trapezium trapezium = new Trapezium(4.3, 12.0, 12.3);
        Parallelogram parallelogram = new Parallelogram(9.7, 3.1);
        Triangle triangle = new Triangle(5.4, 7.0);

        //1 case
        System.out.println("half of the sum is:\t " + halfSum(trapezium, triangle));
        System.out.println("half of the sum is:\t " + halfSum(ring, parallelogram));

        double wholeSum = trapezium.figureSquare() + triangle.figureSquare() + parallelogram.figureSquare() + ring.figureSquare();
        //2 case
        System.out.println("The whole sum is:\t" + wholeSum);
    }
}
